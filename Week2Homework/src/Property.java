public abstract class Property {
    private String title;
    private double price;
    private int size;
    private int roomCount;
    private int hallCount;

   public Property(){
        this("nameless",0,0,0,0);
    }
    public Property(String title, double price, int size, int roomCount, int hallCount){
        this.title = title;

        if(price >= 0)
            this.price = price;
        else
            this.price = 0;

        if(size >= 0)
            this.size = size;
        else
           this.size = 0;

        if(roomCount >= 0)
            this.roomCount = roomCount;
        else
            this.roomCount = 0;

        if(hallCount >= 0)
            this.hallCount = hallCount;
        else
            this.hallCount = 0;
    }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public int getRoomCount() { return roomCount; }
    public void setRoomCount(int roomCount) { this.roomCount = roomCount; }

    public int getHallCount() { return hallCount; }
    public void setHallCount(int hallCount) { this.hallCount = hallCount; }

    @Override
    public String toString(){
        return this.title;
    }
}
