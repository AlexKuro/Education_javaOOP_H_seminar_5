package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplexNumbers implements CalcInterface {
    private String function_1;
    private String function_2;
    private String funcDiv1;
    private String funcDiv2;
    private String funcDiv3;
    private String resultCN;

    int joinOperationsIndex(String function) {
        StringBuilder num1 = new StringBuilder();
        num1.append(function);
        int[] s = new int[4];
        int s1 = 0;
        s[0] = num1.indexOf("+");
        s[1] = num1.indexOf("-");
        s[2] = num1.indexOf("*");
        s[3] = num1.indexOf("/");
        for (int i = 0; i < s.length; i++) {
            if (s[i] != -1) {
                s1 = s[i];
            }
        }
        return s1;
    }

    int joinOperations(String function) {
        StringBuilder num1 = new StringBuilder();
        num1.append(function);
        int[] s = new int[4];
        int s1 = 0;
        s[0] = num1.indexOf("+");
        s[1] = num1.indexOf("-");
        s[2] = num1.indexOf("*");
        s[3] = num1.indexOf("/");
        for (int i = 0; i < s.length; i++) {
            if (s[i] != -1) {
                if (i == 0) {
                    s1 = 1;
                }
                if (i == 1) {
                    s1 = -1;
                }
            }
        }
        return s1;
    }

    int[] joinFunction(String funct) {
        int s = joinOperationsIndex(funct);
        int sn = joinOperations(funct);
        int[] resfun = new int[2];
        StringBuilder num = new StringBuilder();
        num.append(funct);
        int si = 0;
        si = num.indexOf("i");
        String str_n = "";
        String str_i = "";

        if (si > s) {
            for (int i = s + 1; i < si; i++) {
                str_i += num.charAt(i);
            }
            if (str_i.equals("")) str_i = "1";
            for (int i = 0; i < s; i++) {
                str_n += num.charAt(i);
            }
            resfun[0] = Integer.parseInt(str_n.toString());
            resfun[1] = Integer.parseInt(str_i.toString()) * sn;
        } else {
            for (int i = s + 1; i < num.length(); i++) {
                str_n += num.charAt(i);
            }
            for (int i = 0; i < s - 1; i++) {
                str_i += num.charAt(i);
            }
            if (str_i.equals("")) str_i = "1";
            resfun[0] = Integer.parseInt(str_n.toString()) * sn;
            resfun[1] = Integer.parseInt(str_i.toString());
        }
        return resfun;
    }

    @Override
    public void sum() {
        int[] f1 = joinFunction(function_1);
        int[] f2 = joinFunction(function_2);
        Integer resF1 = f1[0] + f2[0];
        Integer resF2 = f1[1] + f2[1];

        resultCN = resF1.toString();
        if (resF2 < 0) resultCN += " - ";
        else resultCN += " + ";
        if (Math.abs(resF2) != 1) resultCN += resF2 + "i";
        else resultCN += "i";

    }

    @Override
    public void subtraction() {
        int[] f1 = joinFunction(function_1);
        int[] f2 = joinFunction(function_2);
        Integer resF1 = f1[0] - f2[0];
        Integer resF2 = f1[1] - f2[1];

        resultCN = resF1.toString();
        if (resF2 < 0) resultCN += " - ";
        else resultCN += " + ";
        if (Math.abs(resF2) != 1) resultCN += resF2 + "i";
        else resultCN += "i";

    }

    @Override
    public void multiplications() {
        int[] f1 = joinFunction(function_1);
        int[] f2 = joinFunction(function_2);

        Integer r1 = f1[0] * f2[0];
        Integer r2 = f1[0] * f2[1];
        Integer r3 = f1[1] * f2[0];
        Integer r4 = f1[1] * f2[1];

        String str = "";
        str = r1.toString();

        if (r2 > 0) str += " + " + r2.toString() + "i";
        else str += " - " + Math.abs(r2) + "i";

        if (r3 > 0) str += " + " + r3.toString() + "i";
        else str += " - " + Math.abs(r3) + "i";

        if (r4 > 0) str += " + " + r4.toString() + "i^2";
        else str += " - " + Math.abs(r4) + "i^2";
        funcDiv1 = str;
        str += " = ";

        str += r1.toString();
        funcDiv2 = r1.toString();

        Integer r2_3 = r2 + r3;

        String str_r3 = "";
        if (r2_3 > 0 & r2_3 != 1) str_r3 = " + " + r2_3.toString() + "i";
        else if (r2_3 > 0 & r2_3 == 1) str_r3 = " + " + "i";
        else if (r2_3 < 0 & r2_3 != 1) str_r3 = " - " + "i";
        else if (r2_3 == 0) str_r3 = "";
        else str_r3 = " - " + Math.abs(r2_3) + "i";

        str += str_r3;
        funcDiv2 += str_r3;

        r4 *= -1;
        Integer r1_4 = r1 + r4;

        if (r4 > 0) {
            str += " + " + r4.toString();
            funcDiv2 += " + " + r4.toString();
        }
        else {
            str += " - " + Math.abs(r4);
            funcDiv2 += " - " + Math.abs(r4);
        }

        str += " = ";

        str += r1_4 + str_r3;
        funcDiv3 = r1_4 + str_r3;

        resultCN = str;
    }

    @Override
    public void division() {
        String funcD1 = function_1;
        String funcD2 = function_2;
        function_2 = function_1;
        multiplications();
        String a1 = funcDiv1;
        String b1 = funcDiv2;
        String c1 = funcDiv3;
        function_2 = funcD2;
        multiplications();
        String a2 = funcDiv1;
        String b2 = funcDiv2;
        String c2 = funcDiv3;

        resultCN = "("+ funcD1 + ")" + " * " + "("+ funcD1 + ")" + " / ";
        resultCN += "("+ funcD2 + ")" + " * " + "("+ funcD1 + ")" + " = ";
        resultCN += "\n\t\t" + " = " + a1 + " / " + a2;
        resultCN += " = ";
        resultCN += b1 + " / " + b2;
        resultCN += " = ";
        resultCN += c1 + " / " + c2;

    }
}
