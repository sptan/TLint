package com.gzsll.hupu.view;

/**
 * Created by sll on 2015/3/7.
 */
public interface ContentView extends BaseView {


    void renderContent(String url, int page, int totalPage);



    void reply(String title);

    void pm(String author);

    void onError(String error);

    void onEmpty();


}