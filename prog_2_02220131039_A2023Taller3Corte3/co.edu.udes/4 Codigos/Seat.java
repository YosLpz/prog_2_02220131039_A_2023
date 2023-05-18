package CuartoCodigos;

public class Seat{

    int number;
    int room;
    String type;
    int price;

    public Seat(int number, int room, String type, int price){
        this.number = number;
        this.room = room;
        this.type = type;
        this.price = price;

        
    }


    public void setNumber(int number){
        this.number = number;
    }
    public int getnumber(){
        return number;
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

    public void setRoom(int room) {
        this.room = room;
    }
    public int getroom() {
        return room;
    }

    @Override
    public String toString(){
        return "Numero de la sala: " + room + " Numero del asiento: " + number + " Tipo de asiento: " + type + " Precio del asiento: " + price;
    }
    


}
