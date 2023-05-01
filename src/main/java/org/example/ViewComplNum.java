package org.example;

public class ViewComplNum implements ViewInterface{

    public Integer interface_3_2() {
        Integer n;
        System.out.println("\n\t-  Комплексные числа - ");
        System.out.println("\tСложение  - - - - - - - - нажмите '1'");
        System.out.println("\tВычитание - - - - - - - - нажмите '2'");
        System.out.println("\tУмножение - - - - - - - - нажмите '3'");
        System.out.println("\tДеление - - - - - - - - - нажмите '4'");
        System.out.println("\tВыход в главное меню  - - нажмите '8'");
        System.out.println("\tВыход из программы  - - - нажмите '9'");
        System.out.print("\nВведите число -> ");
        n = intScanner.nextInt();
        return n;
    }
}
