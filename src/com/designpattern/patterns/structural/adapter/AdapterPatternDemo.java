package com.designpattern.patterns.structural.adapter;

public class AdapterPatternDemo {
  public static void run() {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3", "song.mp3");
    audioPlayer.play("mp4", "video.mp4");
    audioPlayer.play("vlc", "movie.vlc");
    audioPlayer.play("avi", "unsupported.avi");
  }
}