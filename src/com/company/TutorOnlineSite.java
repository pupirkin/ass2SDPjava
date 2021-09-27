package com.company;

import java.util.ArrayList;
import java.util.List;


public class TutorOnlineSite implements Observed{

    List<String> freeWindows = new ArrayList<>();

    List<Observer> Tutor = new ArrayList<>();

    public void addWindow(String window){
        this.freeWindows.add(window);
        notifyObservers();
    }

    public void removeWindow(String window){
        this.freeWindows.remove(window);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.Tutor.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.Tutor.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: Tutor){
            observer.eventHandling(this.freeWindows);
        }
    }
}
