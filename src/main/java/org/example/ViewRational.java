package org.example;

public class ViewRational implements ViewInterface{
    public Integer interface_3_1() {
            Integer n;
            System.out.println("\n\t-  Рациональные числа - ");
            System.out.println("\tСложение  - - - - - - - - нажмите '1'");
            System.out.println("\tВычитание - - - - - - - - нажмите '2'");
            System.out.println("\tУмножение - - - - - - - - нажмите '3'");
            System.out.println("\tДеление - - - - - - - - - нажмите '4'");
            System.out.println("\tВыход в главное меню  - - нажмите '8'");
            System.out.println("\tВыход из программы  - - - нажмите '9'");
            System.out.print("\nВведите число -> ");
            n = iScanner.nextInt();
            return n;
        }
}
