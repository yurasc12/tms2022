import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println(summ(15, 2));
        outElrmentsArrayTriangle();
        outoddnumber();
        outElementsArray();
        outArray();
        maxElementChang(new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2});
        checkArray(new int[]{4, 5, 0, 23, 77, 0, 8, 5, 77, 2});
        calculateSumOfDiagonalElements();
        outNewArray();
        printMatrix();
        maxThreeElementsMatrix();
    }


    // умножение через сумму
    private static int summ(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;

    }


    // вывод треугольников
    private static void outElrmentsArrayTriangle() {
        int[][] mas = new int[4][4];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mas[i][j] = rnd.nextInt(20 + 1);
            }
        }
        // исходная матрица

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int a = 0;
            int b = 0;
            switch (i) {
                case 0:
                    a = 3;
                    b = 0;
                    break;
                case 1:
                    a = 2;
                    b = 1;
                    break;
                case 2:
                    a = 1;
                    b = 2;
                    break;
                case 3:
                    a = 0;
                    b = 3;
                    break;
            }
            int[] ms = mas[i];
            printLineMatrix(a, ms);
            System.out.print("     ");
            printLineMatrix1(b, ms);
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int a = 0;
            int b = 0;
            switch (i) {
                case 0:
                    a = 0;
                    b = 3;
                    break;
                case 1:
                    a = 1;
                    b = 2;
                    break;
                case 2:
                    a = 2;
                    b = 1;
                    break;
                case 3:
                    a = 3;
                    b = 0;
                    break;
            }
            int[] ms = mas[i];
            printLineMatrix(a, ms);
            System.out.print("     ");
            printLineMatrix1(b, ms);
            System.out.println();
        }
    }

    private static void printLineMatrix(int a, int[] arr) {
        for (int j = 0; j < 4; j++) {
            if (j < a) {
                System.out.printf("%5c", ' ');
            } else {
                System.out.printf("%5d", arr[j]);
            }
        }
    }

    //вывод массива в прямом и обратном направлении
    private static void outoddnumber() {
        int[] myArray = new int[50];
        int j = 1;

        for (int i = 0; i < 50; i++) {
            myArray[i] = j;
            j += 2;
        }
        //System.out.println(Arrays.toString(myArray));
        String str1 = "";
        for (int i = 0; i < 50; i++) {
            str1 = str1 + myArray[i] + " ";
        }

        System.out.println(str1);
        System.out.println();
        String str = "";
        for (int i = 49; i >= 0; i--) {
            str = str + myArray[i] + " ";
        }
        System.out.println(str);
    }

    private static void printLineMatrix1(int a, int[] arr) {
        for (int j = 0; j < 4; j++) {
            if (j > a) {
                System.out.printf("%5c", ' ');
            } else {
                System.out.printf("%5d", arr[j]);
            }
        }
    }

    // максимальный элемент массива и его номер
    private static void outElementsArray() {
        int[] mas = new int[12];
        Random rnd = new Random();
        for (int i = 0; i < 12; i++) {
            mas[i] = rnd.nextInt(15 + 1);
        }
        System.out.println(Arrays.toString(mas));
        int maxnuber = Integer.MIN_VALUE;
        int indexnumber = 0;
        for (int i = 0; i < 12; i++) {
            if (mas[i] >= maxnuber) {
                maxnuber = mas[i];
                indexnumber = i;
            }
        }
        System.out.println("Максимальный элемент массива " + maxnuber + " его номер " + indexnumber);

    }

    // вывод массива с заменой  элементов
    private static void outArray() {
        int[] mas = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            mas[i] = rnd.nextInt(20 + 1);
        }
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < 20; i += 2) {
            mas[i] = 0;
        }
        System.out.println(Arrays.toString(mas));
    }

    // замена 0 элемента на максимальный и обратно;
    private static void maxElementChang(int[] myArr) {
        if (myArr != null) {
            int maxnuber = Integer.MIN_VALUE;
            int indexnumber = 0;
            for (int i = 0; i < myArr.length; i++) {
                if (myArr[i] >= maxnuber) {
                    maxnuber = myArr[i];
                    indexnumber = i;
                }
            }
            System.out.println(Arrays.toString(myArr));
            int temp = 0;
            if (indexnumber != 0) {
                temp = myArr[0];
                myArr[0] = maxnuber;
                myArr[indexnumber] = temp;
            }
            System.out.println(Arrays.toString(myArr));
        }
    }

    //повторяющиеся элементы
    private static void checkArray(int[] myArr) {
        if (myArr != null) {
            //  int[] mayArr1 = Arrays.copyOf(myArr, myArr.length);
            int elem = 0;
            for (int i = 0; i < myArr.length; i++) {
                elem = myArr[i];
                for (int j = i + 1; j < myArr.length; j++) {
                    if (elem == myArr[j]) {
                        System.out.println("повторяющися элемент " + elem);
                    }
                }
            }

        }
    }

    // сумма элементов по диагонали.
    public static void calculateSumOfDiagonalElements() {
        int[][] mas = new int[5][5];
        Random rnd = new Random();
        int result = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mas[i][j] = rnd.nextInt(21);

            }

        }
        String st = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    result = result + mas[i][j];
                    String ch = (st == "") ? "" : "+";
                    st = st + ch + mas[i][j];
                }
            }

        }

        //System.out.println(Arrays.deepToString(mas));
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println("Сумма элементов по диагонали " + st + "=" + result);
    }

    // транспонировать матрицу
    private static void outNewArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = 0;
        int y = 0;
        while (true) {
            if (scanner.hasNext()) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x > 0 && x == y) {
                    break;
                } else {
                    System.out.println("Введите правильный размер:");
                }
            }
        }
        int[][] mas = new int[x][y];
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = rnd.nextInt(50 + 1);
            }

        }

        System.out.println("--- Исходная матрица ----");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
        int temp = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
            }

        }

        System.out.println();
        System.out.println("--- Измененная  матрица ----");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
    }

    //вывод матрицы в зависимости от деления на 3 и на 7
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = 0;
        int y = 0;
        while (true) {
            if (scanner.hasNext()) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x > 0 && x == y) {
                    break;
                } else {
                    System.out.println("Введите правильный размер:");
                }
            }
        }
        int[][] mas = new int[x][y];
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = rnd.nextInt(101);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i][j] % 3 == 0 && mas[i][j] % 7 != 0) {
                    System.out.printf("%5c", '+');
                } else if (mas[i][j] % 7 == 0 && mas[i][j] % 3 != 0) {
                    System.out.printf("%5c", '-');
                } else if (mas[i][j] % 7 == 0 && mas[i][j] % 3 == 0) {
                    System.out.printf("%5c", '+');
                } else {
                    System.out.printf("%5c", '*');
                }

            }
            System.out.println();
        }

    }

    private static void maxThreeElementsMatrix() {
        int[][] mas = new int[10][10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mas[i][j] = rnd.nextInt(10001);
            }
        }
        System.out.println("--- Полученная матрица ----");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
        int summa = Integer.MIN_VALUE;
        int numberIndexX = 0;
        int numberIndexY = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j + 2 < 10) {
                    if (summa < mas[i][j] + mas[i][j + 1] + mas[i][j + 2]) {
                        summa = mas[i][j] + mas[i][j + 1] + mas[i][j + 2];
                        numberIndexX = i;
                        numberIndexY = j;
                    }

                }

            }

        }
        System.out.println("Сумма тройки " + summa);
        System.out.println("Индекс первого элемента ( " + numberIndexX + " " + numberIndexY + ")");
        System.out.println("Значение первого элемента =" + mas[numberIndexX][numberIndexY]);
    }


}



