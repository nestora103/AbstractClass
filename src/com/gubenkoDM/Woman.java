package com.gubenkoDM;

/**
 * Created by Nestor on 15.03.2017.
 */
public class Woman extends Human {
    @Override
    public void go() {
        System.out.println("Я женщина и я иду!");
    }

    @Override
    public void stop() {
        System.out.println("Я женщина и я стою!");
    }

}
