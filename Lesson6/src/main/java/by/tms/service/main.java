package by.tms.service;

import by.tms.model.Computer;

public class main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setProcessor("Intel Core 7");
        computer.setRam(8);
        computer.outSpecifications();

        Computer computer1 = new Computer("AMD", 16, 1000, 10);
        computer1.outSpecifications();
        computer1.onComputer();
        computer1.offComputer();
    }
}
