package com.company;

public class WindowSearch {
    public static void main(String[] args){
        TutorOnlineSite tutorSite = new TutorOnlineSite();

        tutorSite.addWindow("First free learning window");
        tutorSite.addWindow("Second free learning window");

        Observer firstSubcriber = new Tutor("Altair Alimzhanov");
        Observer secondSubcriber = new Tutor("Umma Turman");

        tutorSite.addObserver(firstSubcriber);
        tutorSite.addObserver(secondSubcriber);

        tutorSite.addWindow("Third free learning window");

    }
}
