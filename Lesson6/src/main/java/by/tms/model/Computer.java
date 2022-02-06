package by.tms.model;

import java.util.Random;
import java.util.Scanner;

/**
 * в папке src/main/java создать пакет by.tms.model
 * в пакете создать класс Computer
 * 1) класс Computer будет содержать следующие поля:
 * - процессор
 * - оперативка
 * - жесткий диск
 * - ресурс полных циклов работы (включился выключился это один цикл)
 * <p>
 * 2) класс Computer будет содержать следующие методы:
 * - метод описание(вывод всех полей)
 * - метод включить (on())
 * - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
 * на консоль вывести сообщение (Внимание! Введите 0 или 1)
 * создать экземпляр класса Random, который будет генерировать число 0 или 1.
 * если введенное вами число совпадет с рандомным, то компьютер выключается.
 * если введенное вами число не совпадет с рандомным, то компьютер сгорает.
 * - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
 * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
 * ресурса полных циклов работы
 * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
 */
public class Computer {
    private String processor;
    private int ram;
    private int hdd;
    private int resourceCycles;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private boolean burned;

    public Computer(String processor, int ram, int hdd, int resourceCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resourceCycles = resourceCycles;
    }

    public Computer() {
    }

    //изменил название метода
    public void printSpecifications() {
        System.out.println("Модель процессора : " + processor);
        System.out.println("Объем оперативной памяти : " + ram);
        System.out.println("Объем винчестера : " + hdd);
        System.out.println("Рабочий рессурс : " + resourceCycles);

    }

    // изменил метод
    public void onComputer() {
        if (checkAction() && !burned) {
            System.out.println("Компьютер включен !");
        } else {
            System.out.println("Компьютер сгорел !!!!");
            burned = true;
        }

    }

    // изменил метод
    private boolean checkAction() {
        int key = 0;
        do {
            System.out.println("Внимание! Введите 0 или 1");
            if (scanner.hasNext()) {
                key = scanner.nextInt();
            } else {
                scanner.next();
            }
        } while (!(key == 0 || key == 1));

        int rnd = random.nextInt(1) + 1;
        if (rnd == key) {
            return true;
        } else {
            return false;
        }

    }

    public void offComputer() {
        if (burned) {
            System.out.println("Компьютер сгорел !!!!");
        } else {
            if (resourceCycles != 0) {
                resourceCycles--;
                System.out.println("Выключение компьютера !!!!");
            } else {
                burned = true;
            }
        }
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResurs() {
        return resourceCycles;
    }

    public void setResurs(int resourceCycles) {
        this.resourceCycles = resourceCycles;
    }

    public boolean isBurned() {
        return burned;
    }
}
