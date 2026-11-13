package Computer.components;

public class Storage {

    private final int capacity;
    private final String type;

    public Storage(int capacity, String type){

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Storage type cannot be empty");
        }

        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void read(){

        System.out.println("Reading Storage...");
        System.out.println("Storage Capacity: " + capacity + "GB");
        System.out.println("Storage Type: " + type);
    }
}
