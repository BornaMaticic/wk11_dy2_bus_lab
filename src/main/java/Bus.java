import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity = 2;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }

    public int getPassengers(){
       return this.passengers.size();
    }

    public void addPassenger(Person personToAdd){
        if (this.getPassengers() < capacity){
            this.passengers.add(personToAdd);
        }

    }

    public Person removePassenger() {
       return this.passengers.remove(0);
    }

    public void pickUpPassengers(BusStop busStop) {
        Person passenger = busStop.removePersonFromQueue();
        this.addPassenger(passenger);
    }
}
