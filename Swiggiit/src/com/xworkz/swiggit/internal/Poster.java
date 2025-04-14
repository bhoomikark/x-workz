package com.xworkz.swiggit.internal;

public class Poster {
    private int numberOfPoster;
    private String posterType;
    private String posterName;

    public Poster(int numberOfPoster, String posterType, String posterName) {
        this.numberOfPoster = numberOfPoster;
        this.posterType = posterType;
        this.posterName = posterName;
        System.out.println("32. Running Poster Constructor");
    }

    @Override
    public String toString() {
        return "Number of Posters: " + numberOfPoster + ", Poster Type: " + posterType +
                ", Poster Name: " + posterName;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 909;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Poster) {
            Poster otherPoster = (Poster) obj;
            return this.numberOfPoster == otherPoster.numberOfPoster &&
                    this.posterType.equals(otherPoster.posterType) &&
                    this.posterName.equals(otherPoster.posterName);
        }
        return false;
    }
}
