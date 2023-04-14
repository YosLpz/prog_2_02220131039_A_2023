
public class Ticket {

    int time;
    String movie;
    int room;
    int seat;


    public Ticket( String movie, int time, int room, int seat) {

        this.time = time;
        this.movie = movie;
        this.room = room;
        this.seat = seat;
    }



        public void setTime(int time){
            this.time = time;
        }
        public int gettime(){
            return time;
        }

  


        public void setMovie(String movie){
            this.movie = movie;
        }
        public String getmovie(){
            return movie;
        }

        public void setRoom(int room){
            this.room = room;
        }
        public int getroom(){
            return room;
        }

        public void setSeat(int seat){
            this.seat = seat;
        }
        public int getseat(){
            return seat;
        }

        @Override
        public String toString(){
            return "Pelicula: " + movie + " Hora: " + time + " Sala: " + room + " Asiento: " + seat;
        }

        
        

    }
    


