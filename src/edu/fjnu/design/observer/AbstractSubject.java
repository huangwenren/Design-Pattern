package edu.fjnu.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2016/8/12.
 */
public abstract class AbstractSubject implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
