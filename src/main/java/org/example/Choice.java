package org.example;


public class Choice implements ViewInterface {

    public void choice_1(Integer n) {
        switch (n) {
            case 1:
                do {
                    view.setFieldNum(1);
                    choice_2(view.interface_main());
                } while (app.getFl1());
                break;
            case 2:
                do {
                    view.setFieldNum(11);
                    choice_3(view.interface_3());
                } while (app.getFl1());
                break;
            case 3:
                do {
                    view.setFieldNum(4);
                    choice_4(view.interface_4());
                } while (app.getFl1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_2(Integer n) {
        switch (n) {
            case 1, 2, 3, 4:
                viewModel.model_1(n);
                break;
            case 8:
                view.setFieldNum(0);
                choice_1(view.interface_1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_3(Integer n) {
        switch (n) {
            case 1:
                do {
                    view.setFieldNum(2);
                    choice_3_1(view.interface_main());
                } while (app.getFl1());
                break;
            case 2:
                do {
                    view.setFieldNum(3);
                    choice_3_2(view.interface_main());
                } while (app.getFl1());
                break;
            case 8:
                view.setFieldNum(0);
                choice_1(view.interface_1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_3_1(Integer n) {
        switch (n) {
            case 1, 2, 3, 4:
                viewModel.model_2(n);
                break;
            case 8:
                view.setFieldNum(0);
                choice_1(view.interface_1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_3_2(Integer n) {
        switch (n) {
            case 1, 2, 3, 4:
                viewModel.model_3(n);
                break;
            case 8:
                view.setFieldNum(0);
                choice_1(view.interface_1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

    public void choice_4(Integer n) {
        switch (n) {
            case 1:
                view.setFieldNum(5);
                viewModel.model_4(n);
                break;
            case 2:
                view.setFieldNum(6);
                viewModel.model_4(n);
                break;
            case 3:
                view.setFieldNum(7);
                viewModel.model_4(n);
                break;
            case 8:
                view.setFieldNum(0);
                choice_1(view.interface_1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }

}
