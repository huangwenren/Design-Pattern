package edu.fjnu.design.observer;

/**
 * Created by huang on 2016/8/12.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received");
    }
}