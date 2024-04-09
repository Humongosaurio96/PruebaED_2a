package instituto;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getEdad() {
        Persona p = new Persona();
        p.getEdad();
    }

    @Test
    public void testEquals() {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.equals(p2);
    }

    @Test
    public void compareTo() {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.compareTo(p2);
    }
}