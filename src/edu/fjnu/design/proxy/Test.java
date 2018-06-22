package edu.fjnu.design.proxy;

/**
 * Created by huang on 2016/8/12.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
