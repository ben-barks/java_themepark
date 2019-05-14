import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    visitors.Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(20, 165, 10.00);
    }

    @Test
    public void hasAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(165, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(10.00, visitor.getMoney(), 0.1);
    }
}
