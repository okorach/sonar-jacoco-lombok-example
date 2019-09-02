package jacocolomboktest;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PersonTest {


    @Test
    public void verifyAttributes() {
        Person me = new Person();
        me.setAge(49);
        me.setName("Olivier");
        assertThat(49, equalTo(me.getAge()));
        assertThat("Olivier", equalTo(me.getName()));
    }

    @Test
    public void testMajority1() {
        Person youngGuy = new Person();
        youngGuy.setAge(17);
        assertThat(false, equalTo(youngGuy.hasReachedMajority()));
    }

    /*
    @Test
    public void testMajority2() {
        Person oldGuy = new Person();
        oldGuy.setAge(18);
        assertThat(false, equalTo(young_guy.hasReachedMajority()));
    }
    */
}