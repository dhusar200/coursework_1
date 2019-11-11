import org.junit.BeforeClass;
import org.junit.Test;

public class Dec2HexTest {

    static Dec2Hex tester;

    @BeforeClass
    public static void testSetup() {
        tester = new Dec2Hex();
    }

    @Test
        public void positiveNumber(){
        String[] array = new String[]{"100"};
        tester.main(array);
    }

    @Test
    public void negativeNumber(){
        String[] array = {"-200"};
        tester.main(array);
    }

    @Test
    public void numerousInputs(){
        String[] array = {"-200", "100", "Test", ""};
        tester.main(array);
    }

    @Test
    public void emptyinput(){
        String[] array = new String[]{""};
        tester.main(array);
    }

    @Test
    public void stringInput(){
        String[] array = new String[]{" Test"};
        tester.main(array);
    }
}