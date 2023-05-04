package org.example;

import java.util.Scanner;

public interface ViewInterface {
    App app = new App();
    Scanner intScanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    ViewModel viewModel = new ViewModel();
    ViewSign viewSign = new ViewSign();
    RationalNumbers rationalNum = new RationalNumbers();
    ComplexNumbers complexNum = new ComplexNumbers();
    View view = new View();
    Choice choice = new Choice();
    Log logCalc = new Log();
    BinCalc binCalc = new BinCalc();
    Scann scann = new Scann();

}