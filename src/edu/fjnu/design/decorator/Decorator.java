package edu.fjnu.design.decorator;

import java.util.Map;

/**
 * Created by huang on 2016/8/12.
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("begin decorating");
        sourceable.method();
        System.out.println("end decorating");
    }
}
