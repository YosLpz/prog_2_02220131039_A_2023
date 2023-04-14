public class Customer {

    String name ;
    String lastName ;
    int id ;
    String address ;
    int phone ;
    String email ;

    public Customer(String name, String lastName, int id, String address, int phone, String email){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

        public void setName(String name){
            this.name = name;
        }
        public String getname(){
            return name;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public String getlastName(){
            return lastName;
        }

        public void setId(int id){
            this.id = id;
        }
        public int getid(){
            return id;
        }

        public void setAddress(String address){
            this.address = address;
        }
        public String getaddress(){
            return address;
        }

        public void setPhone(int phone){
            this.phone = phone;
        }
        public int getphone(){
            return phone;
        }

        public void setEmail(String email){
            this.email = email;
        }
        public String getemail(){
            return email;
        }
        


    }

