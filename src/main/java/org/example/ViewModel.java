package org.example;

import org.jetbrains.annotations.NotNull;

public class ViewModel implements ViewInterface {

    public void model_1(Integer n) {
        System.out.print(viewSign.HeadingPrint(n) + "\n");
        System.out.println("Формат записи: 0,2 или 2");
        System.out.print("Введите первое число -> ");
        Double a = intScanner.nextDouble();
        calculator.setNum1(a);
        System.out.print("Введите второе число -> ");
        Double b = intScanner.nextDouble();
        calculator.setNum2(b);
        resultCalc(n);
        System.out.println(numConvPrint(viewSign.SignPrint(n)));
    }

    public void model_2(Integer n) {
        System.out.print(viewSign.HeadingPrint(n) + "\n");
        System.out.println("Формат записи: 1 1/2, 1/2, 1/1, 2");
        System.out.print("Введите первое число -> ");
        String a = stringScanner.nextLine();
        if (a.length() > 1 ) {
            rationalNum.setNum_st1(a);
        }else {
            a += "/" + "1";
            rationalNum.setNum_st1(a);
        }
        rationalNum.setNum_st1(a);
        System.out.print("Введите второе число -> ");
        String b = stringScanner.nextLine();
        if (b.length() > 1 ) {
            rationalNum.setNum_st2(b);
        }else {
            b += "/" + "1";
            rationalNum.setNum_st2(b);
        }
        resultCalcRN(n);
        System.out.println(numConvPrintRN(viewSign.SignPrint(n)));
    }

    public void model_3(Integer n) {
        System.out.print(viewSign.HeadingPrint(n) + "\n");
        System.out.println("Формат записи: 4+3i или 3i-4");
        System.out.print("Введите первое число -> ");
        String a = stringScanner.nextLine();
        complexNum.setFunction_1(a);

        rationalNum.setNum_st1(a);
        System.out.print("Введите второе число -> ");
        String b = stringScanner.nextLine();
        complexNum.setFunction_2(b);

        resultCalcCN(n);
        System.out.println(numConvPrintCN(viewSign.SignPrint(n)));
    }

    void resultCalc(Integer n) {
        if (n == 1) calculator.sum();
        if (n == 2) calculator.subtraction();
        if (n == 3) calculator.multiplications();
        if (n == 4) calculator.division();
    }

    void resultCalcRN(Integer n) {
        if (n == 1) rationalNum.sum();
        if (n == 2) rationalNum.subtraction();
        if (n == 3) rationalNum.multiplications();
        if (n == 4) rationalNum.division();
    }

    void resultCalcCN(Integer n) {
        if (n == 1) complexNum.sum();
        if (n == 2) complexNum.subtraction();
        if (n == 3) complexNum.multiplications();
        if (n == 4) complexNum.division();
    }

    String numConvPrint(String sign) {
        String st = "";
        StringBuilder st_a = new StringBuilder();
        StringBuilder st_b = new StringBuilder();
        StringBuilder st_r = new StringBuilder();
        StringBuilder st_d = new StringBuilder();
        Boolean fl_a;
        Boolean fl_b;
        st_a.append(calculator.getNum1().doubleValue());
        int s = st_a.indexOf(".");
        if (st_a.charAt(s + 1) == '0' & st_a.length() - 1 == s + 1) {
            fl_a = true;
        } else {
            fl_a = false;
        }
        st_a.delete(s, st_a.length());

        st_b.append(calculator.getNum2().doubleValue());
        s = st_b.indexOf(".");
        if (st_b.charAt(s + 1) == '0' & st_b.length() - 1 == s + 1) {
            fl_b = true;
        } else {
            fl_b = false;
        }
        Boolean fl = fl_a & fl_b;

        st_b.delete(s, st_b.length());

        st_r.append(calculator.getResult());
        s = st_r.indexOf(".");
        st_r.delete(s, st_r.length());

        st_d.append(calculator.getResult());
        s = st_d.indexOf(".");
        if (st_d.charAt(s + 1) == '0' & st_d.length() - 1 == s + 1) {
            st_d.delete(s, st_d.length());
        }

        if (fl) {
            if (sign.equals("Сложение чисел:")) {
                st = sign + "  " + st_a + " + " + st_b + " = " + st_r;
            } else if (sign.equals("Вычитание чисел:")) {
                st = sign + "  " + st_a + " - " + st_b + " = " + st_r;
            } else if (sign.equals("Умножение чисел:")) {
                st = sign + "  " + st_a + " * " + st_b + " = " + st_r;
            } else if (sign.equals("Деление чисел:")) {
                st = sign + "  " + st_a + " / " + st_b + " = " + st_d;
            }
        } else {
            if (sign.equals("Сложение чисел:")) {
                st = sign
                        + "  "
                        + calculator.getNum1()
                        + " "
                        + " + "
                        + calculator.getNum2()
                        + " = "
                        + calculator.getResult();
            } else if (sign.equals("Вычитание чисел:")) {
                st = sign
                        + "  "
                        + calculator.getNum1()
                        + " "
                        + " - "
                        + calculator.getNum2()
                        + " = "
                        + calculator.getResult();
            } else if (sign.equals("Умножение чисел:")) {
                st = sign
                        + "  "
                        + calculator.getNum1()
                        + " "
                        + " * "
                        + calculator.getNum2()
                        + " = "
                        + calculator.getResult();
            } else if (sign.equals("Деление чисел:")) {
                st = sign
                        + "  "
                        + calculator.getNum1()
                        + " "
                        + " / "
                        + calculator.getNum2()
                        + " = "
                        + calculator.getResult();
            }
        }
        logCalc.setLogger(st);
        return st;
    }

    String numConvPrintRN(@NotNull String sign) {
        String st = "";
        if (sign.equals("Сложение чисел:")) {
            st = sign
                    + "  "
                    + rationalNum.getNum_st1()
                    + " "
                    + " + "
                    + rationalNum.getNum_st2()
                    + " = "
                    + rationalNum.getResultRN();
        } else if (sign.equals("Вычитание чисел:")) {
            st = sign
                    + "  "
                    + rationalNum.getNum_st1()
                    + " "
                    + " - "
                    + rationalNum.getNum_st2()
                    + " = "
                    + rationalNum.getResultRN();
        } else if (sign.equals("Умножение чисел:")) {
            st = sign
                    + "  "
                    + rationalNum.getNum_st1()
                    + " "
                    + " * "
                    + rationalNum.getNum_st2()
                    + " = "
                    + rationalNum.getResultRN();
        } else if (sign.equals("Деление чисел:")) {
            st = sign
                    + "  "
                    + rationalNum.getNum_st1()
                    + " "
                    + " / "
                    + rationalNum.getNum_st2()
                    + " = "
                    + rationalNum.getResultRN();;
        }
        logCalc.setLogger(st);
        return st;
    }

    String numConvPrintCN(@NotNull String sign) {
        String st = "";
        if (sign.equals("Сложение чисел:")) {
            st = sign
                    + "  ("
                    + complexNum.getFunction_1()
                    + ") "
                    + " + ("
                    + complexNum.getFunction_2()
                    + ") = "
                    + complexNum.getResultCN();
        } else if (sign.equals("Вычитание чисел:")) {
            st = sign
                    + "  ("
                    + complexNum.getFunction_1()
                    + ") "
                    + " - ("
                    + complexNum.getFunction_2()
                    + ") = "
                    + complexNum.getResultCN();
        } else if (sign.equals("Умножение чисел:")) {
            st = sign
                    + "  ("
                    + complexNum.getFunction_1()
                    + ") "
                    + " * ("
                    + complexNum.getFunction_2()
                    + ") = "
                    + complexNum.getResultCN();
        } else if (sign.equals("Деление чисел:")) {
            st = sign
                    + "  ("
                    + complexNum.getFunction_1()
                    + ") "
                    + " / ("
                    + complexNum.getFunction_2()
                    + ") = "
                    + complexNum.getResultCN();
        }
        logCalc.setLogger(st);
        return st;
    }
}
