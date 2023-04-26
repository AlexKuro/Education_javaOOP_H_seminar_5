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

}
