package com.xworkz.swiggit.internal;

public class Tarzen {
    private String tarzenMovieHitOrFlop;
    private boolean isTarzenMovieRealOrNot;
    private int noOfTimesMovieWatched;

    public Tarzen(String tarzenMovieHitOrFlop, boolean isTarzenMovieRealOrNot, int noOfTimesMovieWatched) {
        this.tarzenMovieHitOrFlop = tarzenMovieHitOrFlop;
        this.isTarzenMovieRealOrNot = isTarzenMovieRealOrNot;
        this.noOfTimesMovieWatched = noOfTimesMovieWatched;
        System.out.println("47. Running Tarzen Constructor");
    }

    @Override
    public String toString() {
        return "Movie Hit or Flop: " + tarzenMovieHitOrFlop + ", Is Real: " + isTarzenMovieRealOrNot +
                ", No. of Times Watched: " + noOfTimesMovieWatched;
    }
}
