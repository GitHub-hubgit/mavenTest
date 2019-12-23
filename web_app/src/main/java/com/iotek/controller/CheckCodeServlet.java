package com.iotek.controller;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @Author: 邪灵
 * @Date: 2019/12/20 21:31
 * @Description: ${description}
 * @Since: 1.0
 */
@WebServlet("/CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置页面不缓存
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        //设置验证码大小
        int width = 85;
        int height = 40;
        //创建新的图片
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //创建画图工具
        Graphics graphics = image.createGraphics();
        //设置颜色，填充矩形
        graphics.setColor(getColor());
        graphics.fillRect(0,0,width,height);
        //画边框
        graphics.setColor(getColor());
        graphics.drawRect(0,0,width-1,height-1);
        //设置文字，颜色，画文字
        String string = null;
        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            //生成随机字符
            char str = (char) (random.nextInt(26)+'a');
            graphics.setColor(getColor());
            int y = random.nextInt(10)+28;
            graphics.setFont(new Font("MS UI Gothic",Font.ITALIC,30));
            graphics.drawString(str+"",13*i,y);
            string+=str;
        }
        //设置干扰线
        for (int i = 0; i < 10; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            graphics.setColor(getColor());
            graphics.drawLine(x1,y1,x2,y2);
        }
        //生成图片
        graphics.dispose();
        request.setAttribute("imgcodvalue",string);
        ImageIO.write(image,"JPEG",response.getOutputStream());//输出图形到页面
    }
    private static Color getColor(){
        Random random = new Random();
        return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
