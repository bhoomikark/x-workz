package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.exhibition.ArtExhibition;
import com.xworkz.hierarchical.internal.exhibition.FoodExhibition;

public class ExhibitionRunner {
    public static void main(String[] args) {
        FoodExhibition food = new FoodExhibition();
        food.announce();
        food.displayFood();

        ArtExhibition art = new ArtExhibition();
        art.announce();
        art.displayArt();
    }
}
