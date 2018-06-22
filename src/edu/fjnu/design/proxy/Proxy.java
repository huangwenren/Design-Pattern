package edu.fjnu.design.proxy;

/**
 * Created by huang on 2016/8/12.
 */
public class Proxy implements Sourceable {
    private Sourceable sourceable;

    public Proxy() {
        this.sourceable = new Source();
    }

    @Override
    public void method() {
        System.out.println("begin");
        sourceable.method();
        System.out.println("end");
    }
}
