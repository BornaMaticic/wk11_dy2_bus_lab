import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Leith");
        person = new Person();
    }

    @Test
    public void queueIsEmpty(){
        assertEquals(0, busStop.getPeople());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getPeople());
    }

    @Test
    public void canRemovePersonFromQueue(){
        Person person1 = new Person();
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person1);
        assertEquals(person, busStop.removePersonFromQueue());
    }
}
