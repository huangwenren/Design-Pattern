package edu.fjnu.design.chain;

/**
 * Created by huang on 2016/8/12.
 */
public class Test {
    public static void main(String[] args) {
        MyHandler myHandler1 = new MyHandler("handler1");
        MyHandler myHandler2 = new MyHandler("handler2");
        MyHandler myHandler3 = new MyHandler("handler3");
        MyHandler myHandler4 = new MyHandler("handler4");

        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);
        myHandler3.setHandler(myHandler4);

        myHandler1.operator();

    }
}
