
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diseno Xtrmo
 */
public class UserInterface {

    private Scanner scanner;
    private Passenger passenger;
    private Seat seat;
    private Plane plane;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;

    }

    public void start() {
        System.out.println("Filas:");
        int rows = Integer.valueOf(scanner.nextLine());
        while (rows > 20) {
            System.out.println("Maximo hasta 20 filas, ingrese otro valor: ");
            rows = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Columnas:");
        int cols = Integer.valueOf(scanner.nextLine());

        while (cols > 8) {
            System.out.println("Maximo hasta 8 columnas, ingrese otro valor");
            cols = Integer.valueOf(scanner.nextLine());
        }
        Plane plane = new Plane(rows, cols);
        System.out.println(plane);
        System.out.println("1. Ingresar pasajero ");
        System.out.println("2. Consultar asiento ");
        System.out.println("3. Consultar pasajero ");
        int option = Integer.valueOf(scanner.nextLine());
        if (option == 1) {
            System.out.print("Ingrese nombre del pasajero: ");
            String name = scanner.nextLine();
            System.out.print("Ingrese apellido: ");
            String lastname = scanner.nextLine();
            Passenger newPassenger = new Passenger(name, lastname);
            System.out.print("Fila: ");
            int row = Integer.valueOf(scanner.nextLine());
            System.out.println("Columna: ");
            String col = scanner.nextLine();

            
            Seat newSeat = new Seat(row, col, newPassenger);
            
            if (!newSeat.isFree()) {
                System.out.println("Asiento no disponible, escoja otro: ");

            }
            plane.add(newSeat);
        } else if (option == 2) {
            System.out.print("Ingrese fila: ");
            int fil = Integer.valueOf(scanner.nextLine());
            System.out.println("Ingrese columna: ");
            String colum = scanner.nextLine();
            Seat seat = new Seat(fil, colum);
            System.out.println(seat);

        } else if (option == 3) {
            System.out.println("Ingrese nombre del pasajero: ");
            String searchedname = scanner.nextLine();
            System.out.println("Ingrese apellido del pasajero: ");
            String searchedlastname = scanner.nextLine();
            Passenger searchedpassenger = new Passenger(searchedname, searchedlastname);
            Seat st= new Seat(searchedpassenger);
            System.out.println(searchedpassenger);

        }

    }
}
