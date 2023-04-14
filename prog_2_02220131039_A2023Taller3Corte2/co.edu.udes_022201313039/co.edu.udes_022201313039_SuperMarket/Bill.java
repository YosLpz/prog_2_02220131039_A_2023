public class Bill {

    String date;
    String time;
    int total;
    String customer;
    String product;
    int quantity;

    public Bill(String date, String time, int total, String customer, String product, int quantity) {
        
        this.date = date;
        this.time = time;
        this.total = total;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;

    }
                public void setDate(String date){
                    this.date = date;
                }
                public String getdate(){
                    return date;
                }

                public void setTime(String time){
                    this.time = time;
                }
                public String gettime(){
                    return time;
                }

                public void setTotal(int total){
                    this.total = total;
                }
                public int gettotal(){
                    return total;
                }

                public void setCustomer(String customer){
                    this.customer = customer;
                }
                public String getcustomer(){
                    return customer;
                }

     
                public void setProduct(String product){
                    this.product = product;
                }
                public String getproduct(){
                    return product;
                }

                public void setQuantity(int quantity){
                    this.quantity = quantity;
                }
                public int getquantity(){
                    return quantity;
                }
                
    
}
