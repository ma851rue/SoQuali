import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {

    @Test
    public void testEqualsTrueSameObject() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals(myString);

        //Verify
        assertTrue(stringEquals);

        //Teardown
        myString = null;
    }

    @Test
    public void testEqualsFalseNoInstanceOfMyString() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals(true);

        //Verify
        assertFalse(stringEquals);

        //Teardown
        myString = null;
    }

    @Test
    public void testEqualsFalseSameLength() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals("b");

        //Verify
        assertFalse(stringEquals);

        //Teardown
        myString = null;
    }

    @Test
    public void testEqualsTrueSame() {
        //Setup
        MyString myString = new MyString("aa");
        MyString myString2 = new MyString("aa");

        //Execute
        boolean stringEquals = myString.equals(myString2);

        //Verify
        assertTrue(stringEquals);

        //Teardown
        myString = null;
        myString2 = null;
    }

    @Test
    public void testEqualsFalseDifferentLength() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals("aa");

        //Verify
        assertFalse(stringEquals);

        //Teardown
        myString = null;
    }

}
