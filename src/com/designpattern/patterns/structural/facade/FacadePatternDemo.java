package com.designpattern.patterns.structural.facade;

public class FacadePatternDemo {
  public static void run() {
    DVDPlayer dvdPlayer = new DVDPlayer();
    Projector projector = new Projector();
    SoundSystem soundSystem = new SoundSystem();
    Lights lights = new Lights();

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

    homeTheater.watchMovie("Inception");
    homeTheater.endMovie();
  }
}