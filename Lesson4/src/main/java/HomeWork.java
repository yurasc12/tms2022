import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        nameDay();
        System.out.println("Амеб " + countAmeba());
        countCifra(-111);
        printArray();
        System.out.println(operation(-10));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        countDevs(1);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
        zodiak(25,3);
        zodiak(20,3);
        zodiak(22,5);
        zodiak(25,12);
    }

    public static void nameDay() {
        Random random = new Random();
        int numday = random.nextInt(6) + 1;
        switch (numday) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6, 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Не верный параметр");
        }
    }

    public static int countAmeba() {
        int count = 1;
        for (int i = 0; i < 24; i += 3) {
            count = count * 2;
        }
        return count;
    }
    public static void countCifra(int nums) {
        String с = String.valueOf(nums); //число в строку
        String rezult = "";
        int x = 0;
        if (nums > 0) {
            x = с.length();
            rezult = " положительное ";
        } else {
            x = с.length() - 1;
            rezult = " отрицательное ";
        }
        System.out.println(" число " + nums + rezult + "и содержит " + x + " цифры");
    }

    public static void zodiak(int day, int month) {
        switch (month) {
            case 1:
                if (day < 20) {
                    System.out.println("Козерог");
                    break;
                } else {
                    System.out.println("Водолей");
                    break;
                }
            case 2:
                if (day >= 20) {
                    System.out.println("Рыба");
                    break;
                } else {
                    System.out.println("Водолей");
                    break;
                }
            case 3:
                if (day >= 21) {
                    System.out.println("Овен");
                    break;
                } else {
                    System.out.println("Рыба");
                    break;
                }
            case 4:
                if (day < 21) {
                    System.out.println("Овен");
                    break;
                } else {
                    System.out.println("Телец");
                    break;
                }
            case 5:
                if (day < 21) {
                    System.out.println("Телец");
                    break;
                } else {
                    System.out.println("Близнец");
                    break;
                }
            case 6:
                if (day > 22) {
                    System.out.println("Рак");
                    break;
                } else {
                    System.out.println("Близнец");
                    break;
                }
            case 7:
                if (day < 22) {
                    System.out.println("Рак");
                    break;
                } else {
                    System.out.println("Лев");
                    break;
                }
            case 8:
                if (day > 22) {
                    System.out.println("Дева");
                    break;
                } else {
                    System.out.println("Лев");
                    break;
                }
            case 9:
                if (day > 24) {
                    System.out.println("Весы");
                    break;
                } else {
                    System.out.println("Дева");
                    break;
                }
            case 10:
                if (day < 23) {
                    System.out.println("Весы");
                    break;
                } else {
                    System.out.println("Скорпион");
                    break;
                }
            case 11:
                if (day > 23) {
                    System.out.println("Стрелец");
                    break;
                } else {
                    System.out.println("Скорпион");
                    break;
                }
            case 12:
                if (day < 22) {
                    System.out.println("Стрелец");
                    break;
                } else {
                    System.out.println("Козерог");
                    break;
                }

        }

    }

    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числo:");
        int nums=0;
        while (true) {
            if (scanner.hasNext()) {
                nums = scanner.nextInt();
                if (nums > 0) {
                    break;
                } else {
                    System.out.println("Введите положительное числo:");
                }
            }
        }
        int[] mas=new int[nums];
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i]= rnd.nextInt();
        }
        System.out.println(Arrays.toString(mas));
    }

    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else {
            if (number < 0) {
                number -= 2;
            } else {
                number = 10;

            }
        }
        return number;
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if ((ints[i] % 2) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void countDevs(int count) {

        String rezult = " программист";
        if (count >= 11 && count <= 14) {
            rezult = " программистов";
        } else {
            int ost = count % 10;
            switch (ost) {
                case 1:
                    rezult = " программист";
                    break;
                case 2,3,4:
                    rezult = " программиста";
                    break;
                default:
                    rezult = " программистов";
                                }

        }
        System.out.println(count+rezult);
    }

    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else {
            if (number % 3 == 0) {
                System.out.println("foo");
            } else {
                if (number % 5 == 0) {
                    System.out.println("bar");
                }
            }
        }

    }

    public static void printPrimeNumbers() {
        String rezult = "";
        boolean flag = false;
        for (int i = 0; i < 1000; i++) {
            if (checkNumer(i)) {
                rezult = rezult + i + " ";
            }
        }
        System.out.println(rezult);

    }
    public static boolean checkNumer(int nums) {
        boolean rez = true;
        for (int i = 2; i < nums/2; i++) {
            if (nums % i == 0) {
                rez =false;
            }
        }
        return  rez;
    }
}



