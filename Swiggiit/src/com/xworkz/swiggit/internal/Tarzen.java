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
    @Override
    public int hashCode() {
        return 112;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tarzen) {
            Tarzen tarzen1 = this;
            Tarzen tarzen2 = (Tarzen) obj;


            if (tarzen1.tarzenMovieHitOrFlop.equals(tarzen2.tarzenMovieHitOrFlop) &&
                    tarzen1.noOfTimesMovieWatched == tarzen2.noOfTimesMovieWatched) {
                return true;
            }
        }
        return false;
    }
}
