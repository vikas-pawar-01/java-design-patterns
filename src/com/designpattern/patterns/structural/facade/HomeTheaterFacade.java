package com.designpattern.patterns.structural.facade;

public class HomeTheaterFacade {
  private DVDPlayer dvdPlayer;
  private Projector projector;
  private SoundSystem soundSystem;
  private Lights lights;

  public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
    this.soundSystem = soundSystem;
    this.lights = lights;
  }

  public void watchMovie(String movie) {
    System.out.println("Setting up the home theater to watch a movie...");
    lights.dim();
    projector.on();
    projector.setInput("DVD");
    soundSystem.on();
    soundSystem.setVolume(10);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }

  public void endMovie() {
    System.out.println("Shutting down the home theater...");
    dvdPlayer.off();
    projector.off();
    soundSystem.off();
    lights.on();
  }
}