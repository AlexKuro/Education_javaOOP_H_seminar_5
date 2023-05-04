package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class View implements ViewInterface{

    private Integer fieldNum = 0;

    public void interface_0() {
        System.out.print("\033[H\033[2J"); // очистка консоли
        System.out.println("\n- ---- - К А Л Ь К У Л Я Т О Р - ---- -");
    }

    public Integer interface_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tПростой калькулятор - - - нажмите '1'");
        System.out.println("\tНепростой калькулятор - - нажмите '2'");
        System.out.println("\tБинарный перевод  - - - - нажмите '3'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        return scann.scan_1();
    }

    public Integer interface_4() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tЧИСЛО тип Integer - - - - нажмите '1'");
        System.out.println("\tЧИСЛО тип Double  - - - - нажмите '2'");
        System.out.println("\tСИМВОЛ тип String - - - - нажмите '3'");
        System.out.println("\tВыход в главное меню  - - нажмите '8'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        return scann.scan_1();
    }



    public Integer interface_3() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tРациональные числа  - - - нажмите '1'");
        System.out.println("\tКомплексные числа - - - - нажмите '2'");
        System.out.println("\tВыход в главное меню  - - нажмите '8'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        return scann.scan_1();
    }

    public Integer interface_main() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tСложение  - - - - - - - - нажмите '1'");
        System.out.println("\tВычитание - - - - - - - - нажмите '2'");
        System.out.println("\tУмножение - - - - - - - - нажмите '3'");
        System.out.println("\tДеление - - - - - - - - - нажмите '4'");
        System.out.println("\tВыход в главное меню  - - нажмите '8'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        return scann.scan_1();
    }
}
