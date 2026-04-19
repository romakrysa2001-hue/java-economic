package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- WERSJA PROCEDURALNA ---");
        String companyName = "BlueSoft";
        double revenue   = 40000;
        double salaries  = 22000;
        double rent      = 5000;
        double tools     = 3000;
        double marketing = 2000; // Zadanie 1

        double totalCost = salaries + rent + tools + marketing;
        double profit    = revenue - totalCost;
        boolean isLoss   = profit < 0; // Zadanie 2

        System.out.println("Company: "    + companyName);
        System.out.println("Revenue: "    + revenue);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Profit: "     + profit);
        System.out.println("Is loss: "    + isLoss);
        System.out.println();

        System.out.println("--- WERSJA KLASOWA ---");

        // Zadanie 3: dwie firmy
        Company bluesoft = new Company("BlueSoft", 40000, 22000, 5000, 3000, 2000);
        Company startupX = new Company("StartupX", 25000, 18000, 3000, 1000, 500);

        bluesoft.printSummary(); // Zadanie 5
        System.out.println();
        startupX.printSummary(); // Zadanie 5

        //Porównanie firm
        System.out.println();
        System.out.println("--- POROWNANIE FIRM ---"); // Zadanie 3
        System.out.println(bluesoft.getName() + " profit: " + bluesoft.calculateProfit());
        System.out.println(startupX.getName() + " profit: " + startupX.calculateProfit());

        if (bluesoft.calculateProfit() > startupX.calculateProfit()) {
            System.out.println("Bardziej zyskowna firma: " + bluesoft.getName());
        } else if (startupX.calculateProfit() > bluesoft.calculateProfit()) {
            System.out.println("Bardziej zyskowna firma: " + startupX.getName());
        } else {
            System.out.println("Obie firmy maja taki sam zysk!");
        }
    }
}
