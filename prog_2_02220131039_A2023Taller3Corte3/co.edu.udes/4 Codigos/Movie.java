package CuartoCodigos;

public class Movie {
    
    String name;
    int year;
    String genre;
    String duration;
    String director;
    String actor;
    String language;


    public Movie(String name, String language, String genre, String duration, String director, String actor, int year) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
        this.actor = actor;
        this.language = language;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
  
    public void setYear(int year){
        this.year = year;
    }
    public int getyear(){
        return year;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getgenre(){
        return genre;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getduration(){
        return duration;
    }

    public void setDirector(String director){
        this.director = director;
    }
    public String getdirector(){
        return director;
    }



    public void setLanguage(String language){
        this.language = language;
    }  
    public String getlanguage(){
        return language;
    }


    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getactor() {
        return actor;
    }

@Override
    public String toString(){
        return "Nombre: " + name + " Año: " + year + " Genero: " + genre + " Duracion: " + duration + " Director: " + director + " Actor: " + actor + " Idioma: " + language;
    }


}
