package edu.fjnu.design.proxy;

/**
 * Created by huang on 2016/8/12.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("original method");
    }
}
