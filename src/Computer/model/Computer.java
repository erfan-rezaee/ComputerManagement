package Computer.model;

import Computer.components.CPU;
import Computer.components.RAM;
import Computer.components.Storage;

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
        ram.load();
        System.out.println();
        storage.read();
        System.out.println();
        cpu.process();
        System.out.println("Computer Started Successfully!");
        System.out.println();
    }

    public void showSpecifications(){

        System.out.println("CPU: " + cpu.brand);
        System.out.println("RAM: " + ram.capacity+ "GB" + " " + ram.type);
        System.out.println("Storage: " + storage.capacity + "GB" + " " + storage.type);

    }
}
