package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class App implements ViewInterface {
    private Boolean flag;
    private Boolean fl1 = true;


    public static void Start() {
        logCalc.log();
        logCalc.setLogger("Запуск программы 'КАЛЬКУЛЯТОР'.");
        do {
            view.interface_0();
            choice.choice_1(view.interface_1());
        } while (app.end());
    }

    Boolean end() {
        return getFlag();
    }

    public void endProg() {
        System.out.print("Завершение программы 'КАЛЬКУЛЯТОР'.\n\n");
        logCalc.setLogger("Завершение программы 'КАЛЬКУЛЯТОР'.");
        intScanner.close();
        stringScanner.close();
        setFlag(false);
        setFl1(false);
    }


}
