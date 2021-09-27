package com.company;

import java.util.List;

public class Tutor implements Observer{
    String name;

    public Tutor(String name){
        this.name = name;
    }

    @Override
    public void eventHandling(List<String> freeWindows){
        System.out.println("Dear tutor " + name + "\nWe have some free windows among groups:\n" + freeWindows + "\n---------------------------------------------------------------\n"   );
    }
}
