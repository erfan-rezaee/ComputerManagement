package app;

import Computer.components.CPU;
import Computer.components.RAM;
import Computer.components.Storage;
import Computer.model.Computer;

public class Main {

    public static void main(String[] args){

        CPU cpu = new CPU("Intel Core i5",
                4,
                2.5);

        RAM ram = new RAM(16, "DDR4");

        Storage storage = new Storage(512,"SSD");

        Computer computer = new Computer(cpu, ram, storage);
        computer.start();
        computer.showSpecifications();
    }
}
