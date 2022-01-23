import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        printAlfavit();
        namberChek();
        namberChekMod();
        int[] myArray = {1, 2, 3, 4, 5};
        average(myArray);
        max(myArray);
        workClok();
        outType();
    }

    private static void printAlfavit() {
        for (char i = 'a'; i < 'z'; i++) {
            System.out.println(i);
        }

    }

    private static void namberChek() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        if (in.hasNextInt()) {
            int number = in.nextInt();
            if (number % 2 == 0) {
                System.out.println("Вы ввели четное число " + number);
            } else {
                System.out.println("Вы ввели не четное число " + number);
            }
        } else {
            System.out.println("Это не то число");
        }
    }

    private static void namberChekMod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        double[] nums = new double[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = in.nextDouble();
        }
        double namberMax = Math.abs(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= namberMax) {
                namberMax = Math.abs(nums[i]);
            }
        }
        System.out.println("Максимальное значение " + namberMax);
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Среднее значение массива " + sum / array.length);
        return sum / array.length;
    }

    public static int max(int[] array) {
        int numMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= numMax) {
                numMax = array[i];
            }
        }
        System.out.println("Макимальное значение массива " + numMax);
        return numMax;

    }
    private static void workClok() {
    Random   random =new Random();
    int numsecond = random.nextInt(28800)+1;
        System.out.println("Чсло секунд " + numsecond);
        double chas =numsecond/3600;
        int chas1=  (int) chas;
        System.out.println("Полных часов "+chas1);

    }
    private static void outType() {
        System.out.println("\t\tbyte\tshort\tchar\tint \tlong\tfloat\tdouble\tboolean ");
        System.out.println("byte\t т\t\t не\t\t я\t\t не\t\t не\t\t не\t\t не \t\tх" );
        System.out.println("short\t не\t\t т\t\t я\t\t не\t\t не\t\t не\t\t не \t\tх");
        System.out.println("char\t я\t\t я\t\t т\t\t не\t\t не\t\t не\t\t не \t\tх");
        System.out.println("int\t\t я\t\t я\t\t я\t\t т\t\t не\t\t не\t\t не \t\tх");
        System.out.println("long\t я\t\t я\t\t я\t\t я\t\t т\t\t не\t\t не \t\tх");
        System.out.println("float\t я\t\t я\t\t я\t\t я\t\t я\t\t т\t\t не \t\tх");
        System.out.println("double\t я\t\t я\t\t я\t\t я\t\t я\t\t я\t\t т \t\t    х");
        System.out.println("boolean  х\t\t х\t\t х\t\t х\t\t х\t\t х\t\t х \t\t    т");

    }
}