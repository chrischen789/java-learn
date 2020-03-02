package com.chrischen.designpattern.observer.subject;

import com.chrischen.designpattern.observer.ob.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
