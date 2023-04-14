
public class Product{

    String name;
    int price;
    String description;
    String type;
    String brand;
    int quantity;

    public Product(String name, int price, String description, String type, String brand, int quantity){
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
        this.brand = brand;
        this.quantity = quantity;
        
    }

            public void setName(String name){
                this.name = name;
            }
            public String getname(){
                return name;
            }

            public void setPrice(int price){
                this.price = price;
            }
            public int getprice(){
                return price;
            }

            public void setDescription(String description){
                this.description = description;
            }
            public String getdescription(){
                return description;
            }
            
            public void setType(String type){
                this.type = type;
            }
            public String gettype(){
                return type;
            }

            public void setBrand(String brand){
                this.brand = brand;
            }
            public String getbrand(){
                return brand;
            }

            public void setQuantity(int quantity){
                this.quantity = quantity;
            }
            public int getquantity(){
                return quantity;
            }
            

        }


    

    

