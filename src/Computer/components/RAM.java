package Computer.components;

public class RAM {

    private final int capacity;
    private final String type;

    public RAM(int capacity, String type){

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("RAM type cannot be empty");
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

    public void load(){

        System.out.println("Loading RAM...");
        System.out.println("RAM Capacity: " + capacity + "GB");
        System.out.println("RAM Type: " + type);
    }
}
