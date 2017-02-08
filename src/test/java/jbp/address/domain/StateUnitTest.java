package jbp.address.domain;

import jbp.address.domain.State;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Silver on 26.1.2017..
 */
public class StateUnitTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getState()  {
        State state = new State();
        state.setShortName("HR");
        state.setName("Hrvatska");

        if (!state.getState().equals("HR Hrvatska")) {
            throw new IllegalStateException("Nije to ta država");
        }
    }

    @After
    public void tearDown() throws Exception {

    }

}