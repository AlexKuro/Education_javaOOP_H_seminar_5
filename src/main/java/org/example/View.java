package org.example;


import org.jetbrains.annotations.NotNull;

public class View implements ViewInterface {

    ViewModel viewModel = new ViewModel();

    public void interface_0() {
        System.out.print("\033[H\033[2J"); // очистка консоли
        System.out.println("\n- ---- - К А Л Ь К У Л Я Т О Р - ---- -");
    }

    public Integer interface_1() {
        calculator.setFlag(true);
        Integer n;
        System.out.println("\n\t- Главное меню - ");
        System.out.println("\tПростой калькулятор - - - нажмите '1'");
        System.out.println("\tНепростой калькулятор - - нажмите '2'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        System.out.print("\nВведите число -> ");
        n = intScanner.nextInt();
        return n;
    }

    public Integer interface_2() {
        calculator.setFlag(true);
        Integer n;
        System.out.println("\n\t- Простой калькулятор - ");
        System.out.println("\tСложение  - - - - - - - - нажмите '1'");
        System.out.println("\tВычитание - - - - - - - - нажмите '2'");
        System.out.println("\tУмножение - - - - - - - - нажмите '3'");
        System.out.println("\tДеление - - - - - - - - - нажмите '4'");
        System.out.println("\tБинарный перевод  - - - - нажмите '5'");
        System.out.println("\tВыход в главное меню  - - нажмите '8'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        System.out.print("\nВведите число -> ");
        n = intScanner.nextInt();
        return n;
    }

    public Integer interface_3() {
        calculator.setFlag(true);
        Integer n;
        System.out.println("\n\t- Непростой калькулятор - ");
        System.out.println("\tРациональные числа  - - - нажмите '1'");
        System.out.println("\tКомплексные числа - - - - нажмите '2'");
        System.out.println("\tВыход в главное меню  - - нажмите '8'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        System.out.print("\nВведите число -> ");
        n = intScanner.nextInt();
        return n;
    }


    public void choice_1(@NotNull Integer n) {
        switch (n) {
            case 1:
                choice_2(interface_2());
                break;
            case 2:
                choice_3(interface_3());
                rationalNum.setFlRn(true);
                break;
            case 9:
                endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_2(@NotNull Integer n) {
        switch (n) {
            case 1, 2, 3, 4:
                viewModel.model_1(n);
                break;
            case 5:
                System.out.print("- Бинарный перевод -\n");
                System.out.println("\tЧИСЛО тип Integer - - - - нажмите '1'");
                System.out.println("\tЧИСЛО тип Double  - - - - нажмите '2'");
                System.out.println("\tСИМВОЛ тип String - - - - нажмите '3'");
                System.out.print("Введите число -> ");
                n = intScanner.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Введите ЧИСЛО тип Integer -> ");
                        Object q = intScanner.nextInt();
                        String st = "Бинарный перевод: " + q + " --> " + calculator.binObg(q);
                        System.out.println(st);
                        logCalc.setLogger(st);
                        break;
                    case 2:
                        System.out.print("Введите ЧИСЛО тип Double -> ");
                        q = intScanner.nextDouble();
                        st = "Бинарный перевод: " + q + " --> " + calculator.binObg(q);
                        System.out.println(st);
                        logCalc.setLogger(st);
                        break;
                    case 3:
                        System.out.print("Введите СИМВОЛ тип String -> ");
                        q = intScanner.next();
                        st = "Бинарный перевод: " + q + " --> " + calculator.binObg(q);
                        System.out.println(st);
                        logCalc.setLogger(st);
                        break;
                    default:
                        System.out.print("Формат ввода неверный!\n");
                        break;
                }
                break;
            case 8:
                choice_1(interface_1());
                break;
            case 9:
                endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_3(@NotNull Integer n) {
        switch (n) {
            case 1:
                choice_3_1(viewRational.interface_3_1());
                break;
            case 2:
                choice_3_2(viewcomplNum.interface_3_2());
                break;
            case 8:
                choice_1(interface_1());
                break;
            case 9:
                endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_3_1(@NotNull Integer n) {
        switch (n) {
            case 1, 2, 3, 4:
                viewModel.model_2(n);
                break;
            case 8:
                choice_1(interface_1());
                break;
            case 9:
                endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_3_2(@NotNull Integer n) {
        switch (n) {
            case 1, 2, 3, 4:
                viewModel.model_3(n);
                break;
            case 8:
                choice_1(interface_1());
                break;
            case 9:
                endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public Boolean end() {
        return calculator.getFlag();
    }

    public void endProg(){
        System.out.print("Завершение программы 'КАЛЬКУЛЯТОР'.\n\n");
        intScanner.close();
        stringScanner.close();
        calculator.setFlag(false);
        logCalc.setLogger("Завершение программы 'КАЛЬКУЛЯТОР'.");
    }
}
