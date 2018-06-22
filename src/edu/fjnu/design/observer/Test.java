package edu.fjnu.design.observer;

/**
 * Created by huang on 2016/8/12.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new MySubject();

        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
