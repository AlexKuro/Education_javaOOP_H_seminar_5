package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RationalNumbers implements CalcInterface {
    private String num_st1;
    private String num_st2;
    private Boolean flRn;

    private Integer numerator1;
    private Integer numerator2;
    private Integer denominator1;
    private Integer denominator2;
    private String resultRN;

    Integer joinNumerator(String st) {
        // числитель из string
        StringBuilder str = new StringBuilder();
        str.append(st);
        StringBuilder str2 = new StringBuilder();
        str2.append(st);
        int s = str.indexOf(" ");
        Integer num = 0;
        Integer numN = 0;
        Integer numD = joinDenomirator(st);
        Integer result = 0;
        str.delete(0, str.length());
        str.append(str2);
        if (s == -1) {
            int l = str.indexOf("/");
            str.delete(l, str.length());
            numN = Integer.parseInt(str.toString());
            result = numN;
        } else {
            str.delete(s, str.length());
            num = Integer.parseInt(str.toString());

            int ll = str2.indexOf("/");
            str2.delete(ll, str2.length());
            str2.delete(0, s + 1);
            numN = Integer.parseInt(str2.toString());
            result = (num * numD) + numN;
        }
        return result;
    }

    Integer joinDenomirator(String st) {
        // знаменатель из string
        StringBuilder str = new StringBuilder();
        str.append(st);
        int l = str.indexOf("/");
        str.delete(0, l + 1);
        Integer numD = Integer.parseInt(str.toString());
        return numD;
    }

    ArrayList<Integer> primeFactorization(Integer in) {
        //разложение на простые множители
        ArrayList<Integer> n = new ArrayList<>();
        int count = 2;
        for (int i = in; i >= 0; i--) {
            if (in % count == 0) {
                n.add(count);
                in = in / count;
            } else {
                count++;
            }
        }
        return n;
    }

    Integer nod(Integer num1, Integer num2) {
        //Наибольший общий делитель НОД
        Integer in1 = Math.abs(num1);
        Integer in2 = Math.abs(num2);

        int numNod = 1;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.addAll(primeFactorization(in1));
        b.addAll(primeFactorization(in2));

        if (in1 == 1 | in2 == 1) {
            numNod = 1;
        } else {

            int lenght = 0;
            if (a.get(a.size() - 1) > b.get(b.size() - 1)) {
                lenght = a.get(a.size() - 1) + 1;
            } else {
                lenght = b.get(b.size() - 1) + 1;
            }
            int[] a1 = new int[lenght];
            int[] b1 = new int[lenght];
            int[] c1 = new int[lenght];


            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j <= lenght; j++) {
                    if (a.get(i) == j) {
                        a1[j] += 1;
                    }
                }
            }


            for (int i = 0; i < b.size(); i++) {
                for (int j = 0; j <= lenght; j++) {
                    if (b.get(i) == j) {
                        b1[j] += 1;
                    }
                }
            }


            if (in1 < in2) {
                for (int i = 0; i < lenght; i++) {
                    if (a1[i] > 0 & b1[i] > 0) {
                        if (b1[i] < 2) c1[i] += 1;
                        else c1[i] = a1[i];
                    }
                }
            } else {
                for (int i = 0; i < lenght; i++) {
                    if (b1[i] > 0 & a1[i] > 0) {
                        if (a1[i] < 2) c1[i] += 1;
                        else c1[i] = b1[i];
                    }
                }
            }


            numNod = 1;
            for (int i = 0; i < lenght; i++) {
                if (c1[i] > 0) {
                    numNod *= Math.pow(i, c1[i]);
                }
            }
        }

        return numNod;
    }

    Integer nok(Integer in1, Integer in2) {
        //Наименьшее общее кратное НОК
        int numNok;

        if (in1 == 1 | in2 == 1) {
            if (in1 > in2) numNok = in1;
            else numNok = in2;
        } else {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            a.addAll(primeFactorization(in1));
            b.addAll(primeFactorization(in2));


            int size = 0;
            if (a.get(a.size() - 1) > b.get(b.size() - 1)) {
                size = a.get(a.size() - 1) + 1;
            } else {
                size = b.get(b.size() - 1) + 1;
            }
            int[] a1 = new int[size];
            int[] b1 = new int[size];


            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j <= size; j++) {
                    if (a.get(i) == j) {
                        a1[j] += 1;
                    }
                }
            }

            for (int i = 0; i < b.size(); i++) {
                for (int j = 0; j <= size; j++) {
                    if (b.get(i) == j) {
                        b1[j] += 1;
                    }
                }
            }


            if (in1 < in2) {
                for (int i = 0; i < size; i++) {
                    if (b1[i] < a1[i]) {
                        b1[i] = a1[i];
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    if (a1[i] < b1[i]) {
                        a1[i] = b1[i];
                    }
                }
            }


            numNok = 1;
            if (in1 < in2) {
                for (int i = 0; i < size; i++) {
                    if (b1[i] > 0) {
                        numNok *= Math.pow(i, b1[i]);
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    if (a1[i] > 0) {
                        numNok *= Math.pow(i, a1[i]);
                    }
                }
            }
        }

        return numNok;
    }

    void infoOutputRN(@NotNull Integer res, @NotNull Integer nokInt) {
        resultRN = res.toString() + "/" + nokInt.toString();

        Integer a = res;
        Integer b = nokInt;
        Integer c = nod(a, b);

        if (c > 1) {
            a = a / c;
            b = b / c;
            if (a != b & b != 1) {
                resultRN += " = " + a.toString() + "/" + b.toString();
            } else {
                resultRN += " = " + a.toString();
            }
        } else if (c == 1){
            if (a == b | b == 1) {
                resultRN += " = " + a.toString();
            }
        }
    }

    public void sum() {
        numerator1 = joinNumerator(num_st1);
        denominator1 = joinDenomirator(num_st1);
        numerator2 = joinNumerator(num_st2);
        denominator2 = joinDenomirator(num_st2);
        Integer nokInt = nok(denominator1, denominator2);
        Integer num1 = nokInt / denominator1;
        Integer num2 = nokInt / denominator2;
        num1 = num1 * numerator1;
        num2 = num2 * numerator2;
        Integer res = num1 + num2;
        infoOutputRN(res, nokInt);
    }

    public void subtraction() {
        numerator1 = joinNumerator(num_st1);
        denominator1 = joinDenomirator(num_st1);
        numerator2 = joinNumerator(num_st2);
        denominator2 = joinDenomirator(num_st2);
        Integer nokInt = nok(denominator1, denominator2);
        Integer num1 = nokInt / denominator1;
        Integer num2 = nokInt / denominator2;
        num1 = num1 * numerator1;
        num2 = num2 * numerator2;
        Integer res = num1 - num2;
        infoOutputRN(res, nokInt);
    }

    public void multiplications() {
        numerator1 = joinNumerator(num_st1);
        denominator1 = joinDenomirator(num_st1);
        numerator2 = joinNumerator(num_st2);
        denominator2 = joinDenomirator(num_st2);
        Integer num = nod(numerator1, denominator2);
        Integer num1 = numerator1 / num;
        Integer denum2 = denominator2 / num;

        num = nod(numerator2, denominator1);
        Integer num2 = numerator2 / num;
        Integer denum1 = denominator1 / num;
        Integer resNum = num1 * num2;
        Integer resDenum = denum1 * denum2;
        infoOutputRN(resNum, resDenum);
    }

    public void division() {
        numerator1 = joinNumerator(num_st1);
        denominator1 = joinDenomirator(num_st1);
        numerator2 = joinNumerator(num_st2);
        denominator2 = joinDenomirator(num_st2);

        Integer num = nod(numerator1, numerator2);
        Integer num1 = numerator1 / num;
        Integer denum2 = numerator2 / num;

        num = nod(denominator2, denominator1);
        Integer num2 = denominator2 / num;
        Integer denum1 = denominator1 / num;
        Integer resNum = num1 * num2;
        Integer resDenum = denum1 * denum2;
        infoOutputRN(resNum, resDenum);
    }
}

