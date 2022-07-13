package com.yu.structure.composite;

/**
 * @author yuchangying
 * @date 2022-05-23 17:12:57
 * 组合模式
 */
public class Client {


    public static void main(String[] args) {
        Bags bigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods sp;

        //第一个袋子
        smallWhiteBag = new Bags("白色小袋子");
        sp = new Goods("瓜子",10.0f,1);
        smallWhiteBag.add(sp);
        sp = new Goods("花生",15f,1);
        smallWhiteBag.add(sp);

        //第二个袋子
        smallRedBag = new Bags("红色小袋子");
        sp = new Goods("茶叶",500f,1);
        smallRedBag.add(sp);
        sp = new Goods("烟", 1000f,1);
        smallRedBag.add(sp);

        //第三个袋子
        mediumBag = new Bags("中号袋子");
        sp = new Goods("茅台酒",3000f,2);
        mediumBag.add(sp);

        //第四个袋子
        bigBag = new Bags("大号袋子");
        sp = new Goods("平底锅",200f,1);
        bigBag.add(sp);

        //小袋子放入大袋子中
        bigBag.add(smallWhiteBag);
        bigBag.add(smallRedBag);
        bigBag.add(mediumBag);

        //展示商品
        float zj = bigBag.calculation();
        System.out.println("总价：" + zj);
        bigBag.show();
    }
}
