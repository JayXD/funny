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
        System.out.println("HEAT INDEX->参数是" + computeHeatIndex(floatList.get(0), floatList.get(1)));
    }

    public void resign(Subject subject) {
        subject.assignObservers(this);
    }

    @Override
    public void update(Subject subject, Object obj) {
        this.subject = subject;
        display(obj);
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
