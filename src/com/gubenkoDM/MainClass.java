package com.gubenkoDM;

/**
 * Created by Nestor on 15.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        //мы не можем создать объект анонимного класса
//        Human hm=new Human();
//        hm.go();
//        hm.stop();

        Man man=new Man();
        man.greet();
        man.go();
        man.stop();

        //вызовется метод предка
        Human hm=new Man();
        Human.greet2();
        hm.greet();
        hm.stop();

        Woman woman=new Woman();
        woman.greet();
        woman.go();
        woman.stop();

        HumanB hc=new HumanB();
        hc.go();

        //Aclass a=new Aclass();
        AclassSon as=new AclassSon();
        System.out.println(as.toString());
        //as.hello();

    }
}
