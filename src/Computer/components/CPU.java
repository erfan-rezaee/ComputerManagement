package Computer.components;

public class CPU {

    private final String brand;
    private final int cores;
    private final double frequency;

    public CPU(String brand, int cores, double frequency){

       if (brand == null || brand.isBlank()){
           throw new IllegalArgumentException("Brand cannot be empty!");
       }

        if (cores <= 0) {
            throw new IllegalArgumentException("Cores must be positive");
        }

        if (frequency <= 0) {
            throw new IllegalArgumentException("Frequency must be positive");
        }

        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getBrand(){
        return brand;
    }

    public int getCores(){
        return cores;
    }

    public double getFrequency(){
        return frequency;
    }

    public void process(){

        System.out.println("Processing with CPU...");
        System.out.println("CPU Brand: " + brand);
        System.out.println("CPU Cores: " + cores);
        System.out.println("CPU Frequency: " + frequency + "GHz");
        System.out.println();
    }
}
