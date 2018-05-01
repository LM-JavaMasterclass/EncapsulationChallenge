package com.lm;

public class Main {
	// Created by Laura Macia: April 2018
// Udemy Complete Java Masterclass with Tim Buchalka
// Answer to Challenge: Encapsulation


	// Create a class and demonstate proper encapsulation techniques
	// the class will be called Printer
	// It will simulate a real Computer Printer
	// It should have fields for the toner Level, number of pages printed, and
	// also whether its a duplex printer (capable of printing on both sides of the paper).
	// Add methods to fill up the toner (up to a maximum of 100%), another method to
	// simulate printing a page (which should increase the number of pages printed).
	// Decide on the scope, whether to use constructors, and anything else you think is needed.

    public static void main(String[] args) {
	 Printer printer = new Printer(15, true);

	 printer.printPages(15);
	 printer.printPages(0);
	 printer.printPages(-4);

	 printer.addToner(50);
    }
}
