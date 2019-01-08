import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Glasgow");
        person = new Person();
    }

    @Test
    public void bisIsEmpty() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void addPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers() );
    }

    @Test
    public void cannotAddPassengers(){
        Person person1 = new Person();
        Person person2 = new Person();
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person);
        assertEquals(2, bus.getPassengers() );
    }

    @Test
    public void removePassenger(){
        Person person1 = new Person();
        Person person2 = new Person();
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        assertEquals(person1, bus.removePassenger() );
    }
}
