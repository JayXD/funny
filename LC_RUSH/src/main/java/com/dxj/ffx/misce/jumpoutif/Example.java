package com.dxj.ffx.misce.jumpoutif;

public class Example {


    public void method1(String a) {
        if (1 == 1) {
            System.out.println(1);
            if ("jumpOut".equals(a)) {
                System.out.println("we need jump out if,not process System.out.println(2),how to do it ?");
                System.out.println("it is difficult,only if you put it into else like method 2");
            }
            System.out.println(2);
        }
    }

    public void method2(String a) {
        if (1 == 1) {
            System.out.println(1);
            if ("jumpOut".equals(a)) {
                System.out.println("we jump");
                System.out.println("but we need to jump out without another if,wen can do like method3");
            } else {
                System.out.println(2);
            }
        }
    }

    public void method3(String a) {
        if (1 == 1) {
            System.out.println(1);
            System.out.println("do not write it");
//            System.out.println(2);
        }
    }
}
