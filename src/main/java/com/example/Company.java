package com.example;

public class Company {

    private String name;
    private double revenue;
    private double salaries;
    private double rent;
    private double tools;
    private double marketing; // Zadanie 1

    public Company(String name, double revenue, double salaries,
                   double rent, double tools, double marketing) {
        this.name      = name;
        this.revenue   = revenue;
        this.salaries  = salaries;
        this.rent      = rent;
        this.tools     = tools;
        this.marketing = marketing;
    }

    public double calculateTotalCost() {
        return salaries + rent + tools + marketing; // Zadanie 1
    }

    public double calculateProfit() {
        return revenue - calculateTotalCost();
    }

    public boolean isProfitable() {
        return calculateProfit() > 0;
    }

    public boolean isLoss() { // Zadanie 2
        return calculateProfit() < 0;
    }

    public boolean canOperate() {
        return revenue >= calculateTotalCost();
    }

    public void printSummary() { // Zadanie 5
        System.out.println("=== FINANCIAL SUMMARY ===");
        System.out.println("Company:    " + name);
        System.out.println("Revenue:    " + revenue);
        System.out.println("Total cost: " + calculateTotalCost());
        System.out.println("Profit:     " + calculateProfit());
        System.out.println("Profitable: " + isProfitable());
        System.out.println("Loss:       " + isLoss());
        System.out.println("Can operate:" + canOperate());
        System.out.println("=========================");
    }

    public String getName()    { return name; }
    public double getRevenue() { return revenue; }
}
