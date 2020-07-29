/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diseno Xtrmo
 */
public class Seat {

    private int row;
    private String col;
    private Passenger pass;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;

    }

    public Seat(Passenger  pass) {
        this.pass = pass;

    }
    public Seat(int row, String col, Passenger pass) {
        this.row = row;
        this.col = col;
        this.pass = pass;
    }
    

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Seat)) {
            return false;
        }
        Seat comparedSeat = (Seat) compared;
        if (this.col == comparedSeat.col && this.row == comparedSeat.row) {
            return true;
        }
        return false;
    }

    public boolean isFree() {
        if (pass != null) {
            return false;
        }
        return true;
    }

    public String getCol() {
        return col;
    }

    public Passenger getPass() {
        return pass;
    }

    public int getRow() {
        return row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setPass(Passenger pass) {
        this.pass = pass;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        // Ocupado o 
        if (isFree()) {
            return "Asiento: " + row + col + "Disponible";
        } else {

            return "Siento: " + row + col + "Ocupado por " + pass.getName() + " " + pass.getLastname();
        }
    }

}
