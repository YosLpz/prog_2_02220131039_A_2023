package CuartoCodigos;

import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = null;
        int moviesAdded = 0;
        Room[] rooms = null;
        int roomsAdded = 0;
        Seat[] seats = null;
        int seatsAdded = 0;
        Ticket[] tickets = null;
        int ticketsAdded = 0;

        int subMenu;
        int menu = showMenu(sc);

        try{
        while(menu != 5) {
            switch (menu) {
                case 1:
                    subMenu = showSubMenu(sc, menu);
                    if(subMenu == 0){ 
                        System.out.println("No hay peliculas registradas");
                        break;
                    }
                    System.out.println("Bienvenido al Sistema de Peliculas");
                    if(movies == null){
                        System.out.println("Digite la cantidad maxima de peliculas que desea agregar.");
                        movies = new Movie[sc.nextInt()];
                    }else{
                        System.out.println("Hay registradas "+moviesAdded +" Peliculas"); 
                    }
                    switch (subMenu) {
                        case 1:
                            if(movies == null || moviesAdded == 0){ 
                                System.out.println("No hay peliculas registradas");
                                break;
                            }
                            else{
                                listado(movies);
                                break;
                            }
                        case 2:
                            movies = addMovie(sc, movies, moviesAdded);
                            moviesAdded++;
                            if(moviesAdded == movies.length){
                                System.out.println("No hay mas espacio para agregar peliculas");
                            
                            listado(movies);
                        showMenu(sc);}
                            break;
                        case 3:
                            showMenu(sc);
                            break;
                    }

                    break;
                case 2:
                    subMenu = showSubMenu(sc, menu);
                    if(subMenu == 0){ 
                        System.out.println("No hay salas registradas");
                        break;
                    }

                    System.out.println("Bienvenido al Sistema de Salas de Cine");
                    if(rooms == null){
                        System.out.println("Digite la cantidad maxima de salas de cine que desea agregar.");
                        rooms = new Room[sc.nextInt()];
                    }else{
                        System.out.println("Hay registradas "+roomsAdded +" Salas de Cine"); // 
                    }
                    switch (subMenu) {
                        case 1:
                            if(rooms == null || roomsAdded == 0){ 
                                System.out.println("No hay salas registradas");
                                break;
                            }
                            else{ 
                                listado(rooms);
                                break;
                            }
                        case 2:
                            rooms = addRoom(sc, rooms, roomsAdded);
                            roomsAdded++;
                            if(roomsAdded == rooms.length){
                                System.out.println("No hay mas espacio para agregar salas de cine");
                            
                            listado(rooms);
                            showMenu(sc);}
                            break;
                        case 3:
                            showMenu(sc);
                            break;

                    }
                    break;
                case 3:
                    subMenu = showSubMenu(sc, menu);
                    if(subMenu == 0){
                        System.out.println("No hay asientos registrados");
                        break;
                    }

                    System.out.println("Bienvenido al Sistema de Asientos");
                    if(seats == null){
                        System.out.println("Digite la cantidad maxima de asientos que desea agregar.");
                        seats = new Seat[sc.nextInt()];
                    }else{
                        System.out.println("Hay registrados "+seatsAdded +" Asientos"); 
                    }
                    switch (subMenu) {
                    case 1:
                    if(seatsAdded == 0){
                        System.out.println("No hay asientos registrados");
                    break;}
                    else{ listado(seats);
                        break;
                        }

                    case 2:
                        seats = addSeat(sc, seats, seatsAdded);
                        seatsAdded++;
                   if(seatsAdded == seats.length){
                            System.out.println("No hay mas espacio para agregar asientos");
                        listado(seats);
                        showMenu(sc);}

                        break;

                    case 3:         
                   showMenu(sc);
                   break;
                }
                break;
            case 4:
                subMenu = showSubMenu(sc, menu);
                if(menu == 0){
                    System.out.println("No hay tiquetes registrados");
                break;}
                System.out.println("Bienvenido al Sistema de Tiquetes");

                if(tickets == null){

                    System.out.println("Digite la cantidad maxima de tiquetes que desea agregar.");
                    tickets = new Ticket[sc.nextInt()];
                }else{
                    System.out.println("Hay registrados "+ticketsAdded +" Tiquetes");
                }
                switch (subMenu) {
                    case 1:
                    if(ticketsAdded == 0){
                        System.out.println("No hay tiquetes registrados");
                    break;}
                    else{ listado(tickets);
                        break;
                        }

                    case 2:

                        tickets = addTicket(sc, tickets, ticketsAdded);
                        ticketsAdded++;
  
                        if(ticketsAdded == tickets.length){
                            System.out.println("No hay mas espacio para agregar tiquetes");
                        listado(tickets);
                        showMenu(sc);
                    }


                        break;
                    case 3:          
            
                   showMenu(sc);
                    break;
                    
                }

        }
    }
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");
    
    main(args);

}

}

    public static int showMenu(Scanner sc) {
        System.out.println("Bienvenido al Sistema");
        System.out.println("Seleccione una menu");
        System.out.println("1. Peliculas");
        System.out.println("2. Sala De Cine");
        System.out.println("3. Asientos");
        System.out.println("4. Tiquetes");
        System.out.println("5. Salir");
       return sc.nextInt();
    }


    private static Seat[] addSeat(Scanner sc, Seat[] seats, int seatsAdded) {

        try{
        System.out.println("Digite el numero de la sala");
        int room = sc.nextInt();
        System.out.println("Digite el numero de asiento");
        int number = sc.nextInt();
        System.out.println("Digite el tipo del asiento");
        String type = sc.next();
        System.out.println("Digite el Precio del asiento");
        int price = sc.nextInt();

        seats[seatsAdded] = new Seat(room, number, type, price);
        return seats;

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        return seats;   
    }
    }

    public static Ticket[] addTicket(Scanner sc, Ticket[] tickets, int ticketsAdded) {

        try{
        System.out.println("Digite el nombre de la pelicula del tiquete");
        String movie= sc.next();
        System.out.println("Digite el numero de la sala");
        int room = sc.nextInt();
        System.out.println("Digite el numero de asiento");
        int seat = sc.nextInt();
        System.out.println("Digite la Hora de la pelicula");
        int time = sc.nextInt();
 
        tickets[ticketsAdded] = new Ticket(movie, room, seat, time);
        return tickets;
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
      return tickets;
    
    }


    }

    public static void listado(Ticket[] tickets) {

        System.out.println("Lista de Tiquetes");

        for(int i = 0; i < tickets.length; i++){
            System.out.println(tickets[i]);
        }
        int contador = 0;
        contador++;

        if(contador == tickets.length){
            showMenu(null);

        }

    }
    





    public static void listado(Seat[] seats) {
        System.out.println("Lista de Asientos");
        for(int i = 0; i < seats.length; i++){
            System.out.println(seats[i]);
        }

    }


    public static Room[] addRoom(Scanner sc, Room[] rooms, int roomsAdded) {

        try{
        System.out.println("Digite el nombre de la sala");
        String nameroom = sc.next();
        System.out.println("Digite la capacidad de las sala");
        int capacity = sc.nextInt();
        System.out.println("Digite el tipo de sala");
        String type = sc.next();
        System.out.println("Digite el valor de la sala");
        int price = sc.nextInt();

        rooms[roomsAdded] = new Room(nameroom, capacity, type, price);

        return rooms;
    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        return rooms;
    
    }
    }

    public static void listado(Room[] rooms) {

        System.out.println("Lista de Salas");
        for(int i = 0; i < rooms.length; i++){
             System.out.println(rooms[i]);
        }

        int contador = 0;
        contador++;

        if(contador == rooms.length){
            showMenu(null);

            
        }
        
    }

    public static Movie[] addMovie(Scanner sc, Movie[] movies, int moviesAdded) {

        try{

        System.out.println("Digite el nombre de la pelicula");
        String name = sc.next();
        System.out.println("Digite la duracion de la pelicula");
        String duration = sc.next();
        System.out.println("Digite el idioma de la pelicula");
        String language = sc.next();
        System.out.println("Digite al director de la pelicula");
        String director = sc.next();
        System.out.println("Digite el actor de la pelicula");
        String actors = sc.next();
        System.out.println("Digite el año de la pelicula");
        int year = sc.nextInt();
        System.out.println("Digite el genero de la pelicula");
        String genre = sc.next();

        movies[moviesAdded] = new Movie(name, duration, genre, language, director, actors, year);
        return movies;

    }
    catch(Exception e){
        System.out.println("Haz cometido un error, vuelve a intentarlo");
        
        return movies;
    
    }

    }

    public static void listado(Movie[] movies) {
        System.out.println("Lista de Peliculas");
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        int contador = 0;
        contador++;

        if(contador == movies.length){
            showMenu(null);
        }
    }

    
    public static int showSubMenu(Scanner sc, int menu) {
        switch (menu) {
            case 1:
                System.out.println("Seleccione una opcion");
                System.out.println("1. Listar Peliculas");
                System.out.println("2. Agregar Peliculas");
                System.out.println("3. Volver al menu principal");
                return sc.nextInt();
            case 2:
                System.out.println("Seleccione una opcion");
                System.out.println("1. Listar Salas");
                System.out.println("2. Agregar Salas");
                System.out.println("3. Volver al menu principal");
                return sc.nextInt();

            case 3:
                System.out.println("Seleccione una opcion");
                System.out.println("1. Listar Asientos");
                System.out.println("2. Agregar Asientos");
                System.out.println("3. Volver al menu principal");
                return sc.nextInt();

            case 4:
                System.out.println("Seleccione una opcion");
                System.out.println("1. Listar Tiquetes");
                System.out.println("2. Agregar Tiquetes");
                System.out.println("3. Volver al menu principal");
                return sc.nextInt();

            case 5:
                System.exit(0);
        }
        return 0;

        
    }


}

    

