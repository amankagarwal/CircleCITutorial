import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleCITest {

    @Test
    void testGetNum() throws Exception {
        CircleCI ci = new CircleCI(5);
        assertEquals(5, ci.getNum());
    }
}