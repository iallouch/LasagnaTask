package com.example;

public class Lasagna {


    // Task 1: Define the expected oven time in minutes
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Calculate the remaining oven time in minutes
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // Task 3: Calculate the preparation time in minutes
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // Task 4: Calculate the total working time in minutes
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }

}
