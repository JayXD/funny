package com.dxj.ffx.refacotr.observer.notes.observers;

public interface Subject {

    void notifyObservers(Object obj);

    void assignObservers(Observer observer);
}
