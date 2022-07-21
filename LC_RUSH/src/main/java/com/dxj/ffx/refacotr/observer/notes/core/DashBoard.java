package com.dxj.ffx.refacotr.observer.notes.core;

import com.dxj.ffx.refacotr.observer.notes.observers.Observer;
import com.dxj.ffx.refacotr.observer.notes.observers.Subject;

import java.util.List;

public class DashBoard implements Observer {
    public Subject subject;


    public void display(Object obj) {
        @SuppressWarnings("unchecked")
        List<Float> floatList = (List<Float>) obj;
        System.out.println("天气看板->参数是" + floatList);
    }

    @Override
    public void update(Subject subject, Object obj) {
        this.subject = subject;
        display(obj);
    }
}
