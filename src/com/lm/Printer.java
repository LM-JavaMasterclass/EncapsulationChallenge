package com.lm;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1; // indicates an error
        }

        this.isDuplex = isDuplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount <= 100){
                this.tonerLevel = this.tonerLevel + tonerAmount;
                System.out.println("Toner is now " + tonerLevel + "% full");
                return this.tonerLevel;
            } else {
                return -1;
            }

        } else {
            return -1;
        }

    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (pagesToPrint >= 0) {
            if (isDuplex) {
                System.out.println("Printing in duplex mode");
                pagesToPrint = pagesToPrint/2 + pagesToPrint%2; //odd numbers add 1
            }
            System.out.println("Printed a total of " + pagesToPrint + " pages.");
            pagesPrinted += pagesToPrint;
            System.out.println("Total number of pages printed is now: " + pagesPrinted);
            return this.pagesPrinted;
        } else {
            System.out.println(pages + " is not a valid number of pages to print");
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
