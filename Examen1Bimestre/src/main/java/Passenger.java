/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diseno Xtrmo
 */
public class Passenger {

    private String name;
    private String lastname;

    public Passenger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {

        return name + " " + lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Passenger)) {
            return false;
        }
        Passenger comparedPassenger = (Passenger) compared;
        if (this.name.equals(comparedPassenger.name) && this.lastname.equals(comparedPassenger.lastname)) {
            return true;
        }
        return false;
    }

}
