package org.example;

import java.io.IOException;
import java.util.logging.*;

public class App implements ViewInterface{


    public static void Start() {
        logCalc.log();
        logCalc.setLogger("Запуск программы 'КАЛЬКУЛЯТОР'.");
        do {
            view.interface_0();
            view.choice_1(view.interface_1());
        } while (view.end());
    }


}
