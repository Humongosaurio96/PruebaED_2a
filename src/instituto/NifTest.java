package instituto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NifTest {

    @Test
    public void testequals() throws Exception {
        Nif nif=new Nif(12345678);
        Nif nif2=new Nif();
        nif.equals(nif2);
    }
}