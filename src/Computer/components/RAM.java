package Computer.components;

public class RAM {

    public int capacity;
    public String type;

    public RAM(int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    public void load(){

        System.out.println("Loading RAM...");
        System.out.println("RAM Capacity: " + capacity + "GB");
        System.out.println("RAM Type: " + type);
    }
}
