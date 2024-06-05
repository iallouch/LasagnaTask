package com.example;

public class App {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("First lasagna");
        cookLasagna(lasagna, 60, 5);
        System.out.println("\n------------------------\n");
        System.out.println("Second lasagna");
        cookLasagna(lasagna, 10, 2);
    }

    private static void cookLasagna(Lasagna lasagna, int timeInOven, int nbrLayers) {
        System.out.printf("Remaining Time  (%d min in oven): %d min\n", timeInOven, lasagna.remainingMinutesInOven(timeInOven));
        System.out.printf("Preparation Time (%d layers): %d min\n", nbrLayers, lasagna.preparationTimeInMinutes(nbrLayers));
        System.out.printf("Total Time (%d layers, %d min in oven): %d min\n", nbrLayers, timeInOven, lasagna.totalTimeInMinutes(nbrLayers, timeInOven));
    }
}
