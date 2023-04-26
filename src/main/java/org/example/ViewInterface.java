package org.example;

import java.util.Scanner;

public interface ViewInterface {
    Scanner iScanner = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    ViewSign viewSign = new ViewSign();
    RationalNumbers rationalNum = new RationalNumbers();
    ComplexNumbers complexNum = new ComplexNumbers();
    ViewRational viewRational = new ViewRational();
    ViewComplNum viewcomplNum = new ViewComplNum();
    View view = new View();

    Log logCalc = new Log();




}