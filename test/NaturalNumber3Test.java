import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;

/**
 * Customized JUnit test fixture for {@code NaturalNumber3}.
 */
public class NaturalNumber3Test extends NaturalNumberTest {

    @Override
    protected final NaturalNumber constructorTest() {
        // implemented by Rohan 30/05
        return new NaturalNumber3();
    }

    @Override
    protected final NaturalNumber constructorTest(int i) {
        // implemented by Rohan 30/05
        return new NaturalNumber3(i);
    }

    @Override
    protected final NaturalNumber constructorTest(String s) {
        // implemented by Rohan 30/05
        return new NaturalNumber3(s);
    }

    @Override
    protected final NaturalNumber constructorTest(NaturalNumber n) {
        // implemented by Rohan 30/05
        return new NaturalNumber3(n);
    }

    @Override
    protected final NaturalNumber constructorRef() {
        // implemented by Rohan 30/05
        return new NaturalNumber1L();
    }

    @Override
    protected final NaturalNumber constructorRef(int i) {
        // implemented by Rohan 30/05
        return new NaturalNumber1L(i);
    }

    @Override
    protected final NaturalNumber constructorRef(String s) {
        // implemented by Rohan 30/05
        return new NaturalNumber1L(s);
    }

    @Override
    protected final NaturalNumber constructorRef(NaturalNumber n) {
        // implemented by Rohan 30/05
        return new NaturalNumber1L(n);
    }

}
