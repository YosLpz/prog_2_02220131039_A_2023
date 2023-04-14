
public class Room{

    String nameroom;
    int capacity;
    String type;
    int price;
    public Room(String nameroom, int capacity, String type, int price){
        this.nameroom = nameroom;
        this.capacity = capacity;
        this.type = type;
        this.price = price;
        
    }

    public void setnameroom(String nameroom){
        this.nameroom = nameroom;
    }
    public String getnameroom(){
        return nameroom;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getcapacity(){
        return capacity;
    }

    public void setType(String type){
        this.type = type;
    }
    public String gettype(){
        return type;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getprice(){
        return price;
    }
    @Override 
    public String toString(){
        return "Nombre de la sala: " + nameroom + " Capacidad de la sala: " + capacity + " Tipo de sala: " + type + " Precio de la sala: " + price;
    }

}