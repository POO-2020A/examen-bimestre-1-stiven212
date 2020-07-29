
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diseno Xtrmo
 */
public class Plane {

    private ArrayList<Seat> seats;
    private int rows;
    private int cols;

    public Plane(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
    }

    public void setRows(int Rows) {
        this.rows = Rows;

    }

    public void setCols(int Cols) {
        this.cols = Cols;
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        String plane = "";
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String tabla = "";
        for (int i = 1; i <= this.rows; i++) {
            plane += i;
            for (int j = 0; j < this.cols; j++) {

                if (seats.get(i).getCol().equals(letras[j]) && seats.get(i).getRow() == i) {
                    plane += "X" + " ";
                } else {
                    plane = plane + letras[j] + " ";

                }
            }
            plane = plane + " \n";
        }
        return plane; //To change body of generated methods, choose Tools | Templates.
    }

    void add(Seat seat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
