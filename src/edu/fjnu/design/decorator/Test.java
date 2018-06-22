package edu.fjnu.design.decorator;

/**
 * Created by huang on 2016/8/12.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Decorator decorator = new Decorator(sourceable);
        decorator.method();
    }
}
