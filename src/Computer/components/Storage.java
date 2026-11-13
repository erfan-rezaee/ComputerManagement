package Computer.components;

public class Storage {

    public int capacity;
    public String type;

    public Storage(int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    public void read(){

        System.out.println("Reading Storage...");
        System.out.println("Storage Capacity: " + capacity + "GB");
        System.out.println("Storage Type: " + type);
    }
}
