package com.yu.structure.flyweight;

/**
 * 享元模式
 * 1、抽象的享元角色
 * 2、具体的享元角色
 * 3、不可共享的角色
 * 4、享元工厂类
 *
 * @author yuchangying
 * @date 2022-05-25 17:23:04
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite newsWebSite = webSiteFactory.getWebSiteCategory("新闻");
        newsWebSite.use();

        WebSite blogWebSite = webSiteFactory.getWebSiteCategory("博客");
        blogWebSite.use();

        WebSite weiboWebSite = webSiteFactory.getWebSiteCategory("微博");
        weiboWebSite.use();
    }
}
