package edu.fjnu.design.chain;

/**
 * Created by huang on 2016/8/12.
 */
public class MyHandler extends AbstractHandler implements Handler{
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(this.name);
        if (getHandler() != null){
            getHandler().operator();
        }
    }
}
