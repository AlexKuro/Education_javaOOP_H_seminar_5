package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Scann implements ViewInterface {

    public Integer scan_1() {
        System.out.print("\nВведите число -> ");
        Integer n = intScanner.nextInt();
        return n;
    }

    public Double scan_a() {
        System.out.print("Введите первое число -> ");
        Double a = intScanner.nextDouble();
        return a;
    }

    public Double scan_b() {
        System.out.print("Введите второе число -> ");
        Double b = intScanner.nextDouble();
        return b;
    }

    public String scan_strA() {
        System.out.print("Введите первое число -> ");
        String a = stringScanner.nextLine();
        return a;
    }

    public String scan_strB() {
        System.out.print("Введите второе число -> ");
        String b = stringScanner.nextLine();
        return b;
    }

    public Object scan_odj(Integer n) {
        System.out.print(viewSign.SignField(view.getFieldNum()));
        if (n == 1) return intScanner.nextInt();
        else if (n == 2) return intScanner.nextDouble();
        else return intScanner.next();
    }


}
