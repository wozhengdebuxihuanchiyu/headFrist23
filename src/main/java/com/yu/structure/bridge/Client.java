package com.yu.structure.bridge;

/**
 * @author yuchangying
 * @date 2022-05-23 17:00:57
 * 桥接模式使用:组要作用是多种方式的不同组合
 */
public class Client {

    public static void main(String[] args) {
        //黑色毛笔
        Black black = new Black();
        Paint paint = new Brush();
        paint.setColor(black);
        paint.draw();
        //灰色毛笔
        Gray gray = new Gray();
        paint.setColor(gray);
        paint.draw();

        //蜡笔画出白色
        White white = new White();
        Paint paint1 = new Crayon();
        paint1.setColor(white);
        paint1.draw();
    }
}
