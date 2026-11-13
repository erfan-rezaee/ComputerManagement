package Computer.components;

public class CPU {

    public String brand;
    public int cores;
    public double frequency;

    public CPU(String brand, int cores, double frequency){
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public void process(){

        System.out.println("Processing with CPU...");
        System.out.println("CPU Brand: " + brand);
        System.out.println("CPU Cores: " + cores);
        System.out.println("CPU Frequency: " + frequency + "GHz");
        System.out.println();
    }
}
