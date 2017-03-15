package com.gubenkoDM;

/**
 * Created by Nestor on 15.03.2017.
 */
public class Man extends Human {
    @Override
    public void go() {
        //super.go();
        System.out.println("Я мужчина и я иду!");
    }

    @Override
    public void stop(){
        System.out.println("Я мужчина и я стою!");
    }
}
