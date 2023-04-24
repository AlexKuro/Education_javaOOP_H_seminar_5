package org.example;

public class MathSign {

    public String HeadingMath(Integer n){
        String s = "";
        if (n == 1) s = "- Сложение -";
        if (n == 2) s = "- Вычитание -";
        if (n == 3) s = "- Умножение -";
        if (n == 4) s = "- Деление -";
        if (n == 5) s = "- Бинарный перевод -";
//
//        switch (n){
//            case 1:
//                s = "- Сложение -";
//                break;
//            case 2:
//                s = "- Вычитание -";
//                break;
//            case 3:
//                s = "- Умножение -";
//                break;
//            case 4:
//                s = "- Деление -";
//                break;
//            case 5:
//                s = "- Бинарный перевод -";
//                break;
//        }
        return s;
    }

}
