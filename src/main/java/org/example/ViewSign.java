package org.example;

public class ViewSign {

    public String HeadingPrint(Integer n) {
        String s = "";
        if (n == 1) s = "- Сложение -";
        if (n == 2) s = "- Вычитание -";
        if (n == 3) s = "- Умножение -";
        if (n == 4) s = "- Деление -";
        return s;
    }

    public String SignPrint(Integer n) {
        String s = "";
        if (n == 1) s = "Сложение чисел:";
        if (n == 2) s = "Вычитание чисел:";
        if (n == 3) s = "Умножение чисел:";
        if (n == 4) s = "Деление чисел:";
        return s;
    }

    public String SignField(Integer n) {
        String s = "";
        if (n == 0) s = "\n\t- Главное меню - ";
        if (n == 1) s = "\n\t- Простой калькулятор - ";
        if (n == 11) s = "\n\t- Непростой калькулятор - ";
        if (n == 2) s = "\n\t-  Рациональные числа - ";
        if (n == 3) s = "\n\t-  Комплексные числа - ";
        if (n == 4) s = "\n\t-  Бинарный перевод  -";
        if (n == 5) s = "Введите ЧИСЛО тип Integer -> ";
        if (n == 6) s = "Введите ЧИСЛО тип Double -> ";
        if (n == 7) s = "Введите СИМВОЛ тип String -> ";
        return s;
    }


}
