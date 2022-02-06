package by.tms.model;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setProcessor("Intel Core 5");
        computer.setRam(16);
        computer.setHdd(500);
        computer.setResurs(10);

        computer.printSpecifications();
        while (true) {
            computer.onComputer();
            if (computer.isBurned()) {
                break;
            }
            computer.offComputer();
        }

    }
}
