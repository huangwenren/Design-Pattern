package edu.fjnu.design.observer;

/**
 * Created by huang on 2016/8/12.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received");
    }
}
