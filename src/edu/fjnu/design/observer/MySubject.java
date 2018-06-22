package edu.fjnu.design.observer;

/**
 * Created by huang on 2016/8/12.
 */
public class MySubject extends AbstractSubject{
    @Override
    public void operation() {
        System.out.println("update myself!");
        notifyObservers();
    }
}
