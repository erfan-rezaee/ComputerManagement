package Computer.model;

import Computer.components.CPU;
import Computer.components.RAM;
import Computer.components.Storage;

import java.net.ServerSocket;

public class Computer {

    private final CPU cpu;
    private final RAM ram;
    private final Storage storage;

    public Computer(CPU cpu, RAM ram, Storage storage){
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void start(){
        System.out.println("========== Computer Starting ==========");
        System.out.println();
        ram.load();
        System.out.println();
        storage.read();
        System.out.println();
        cpu.process();
        System.out.println("Computer Started Successfully!");
        System.out.println();
    }

    public void showSpecifications(){

        System.out.println("========== Specifications ==========");
        System.out.println("CPU: " + cpu.getBrand());
        System.out.println("RAM: " + ram.getCapacity()+ "GB" + " " + ram.getType());
        System.out.println("Storage: " + storage.getCapacity() + "GB" + " " + storage.getType());

    }
}
