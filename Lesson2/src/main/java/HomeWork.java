public class HomeWork {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
       // System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
        boolean flag = true;
        String str = "БРЕСТ";
        //char r = "Y";
        int a = 0b11;
        int b = 0123;
        int c = 125;
        int d = 0x125;
        float e = 126.5f;
        double f = 127.5;
        System.out.println("Логический тип" + flag);
        System.out.println("Строковый тип" + str);
        System.out.println("Число в двоичной системе" + a);
        System.out.println("Число в восьмиричной системе" + b);
        System.out.println("Число в десятичной системе" + c);
        System.out.println("Число в шестнадцатириной системе" + d);
        System.out.println("Тип Float" + e);
        System.out.println("Тип double" + f);

    }

    //        символьный
    public static int sum(int a, int b) {
        if (a+b > 2E31) {
            return 0;
        }else{
            return a+b;
        }
    }


    public static int max(int a, int b) {
        if (a >=b) {
            return a;
        }else{
            return b;
        }
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a*a+b*b);
    }
}


