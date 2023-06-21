import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;

/**
 * JUnit test fixture for {@code NaturalNumber}'s constructors and kernel
 * methods.
 *
 * @author Rohan Patel, Zack Zhu
 *
 */
public abstract class NaturalNumberTest {

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new number
     * @ensures constructorTest = 0
     */
    protected abstract NaturalNumber constructorTest();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorTest = i
     */
    protected abstract NaturalNumber constructorTest(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorTest)
     */
    protected abstract NaturalNumber constructorTest(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorTest = n
     */
    protected abstract NaturalNumber constructorTest(NaturalNumber n);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @return the new number
     * @ensures constructorRef = 0
     */
    protected abstract NaturalNumber constructorRef();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorRef = i
     */
    protected abstract NaturalNumber constructorRef(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorRef)
     */
    protected abstract NaturalNumber constructorRef(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorRef = n
     */
    protected abstract NaturalNumber constructorRef(NaturalNumber n);

    @Test
    public void emptyConstructorTest() {
        NaturalNumber test = this.constructorTest();
        NaturalNumber ref = this.constructorRef();
        assertEquals(ref, test);
    }

    /*
     * int constructor tests
     */

    @Test
    public void intConstructorTest1() {
        int n = 0;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void intConstructorTest2() {
        int n = 1;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void intConstructorTest3() {
        int n = 2;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void intConstructorTest4() {
        int n = 10;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void intConstructorTest5() {
        int n = 101;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void intConstructorTest6() {
        int n = 10100;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    /*
     * String constructor tests.
     */

    @Test
    public void stringConstructorTest1() {
        String n = "0";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void stringConstructorTest2() {
        String n = "1";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void stringConstructorTest3() {
        String n = "2";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void stringConstructorTest4() {
        String n = "10";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void stringConstructorTest5() {
        String n = "101";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void stringConstructorTest6() {
        String n = "10100";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void stringConstructorTest7() {
        String n = "2147483648"; // 0x7fffffff + 1.
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    /*
     * NaturalNumber constructor tests.
     */

    @Test
    public void nNConstructorTest1() {
        NaturalNumber n = this.constructorRef(0);
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void nNConstructorTest2() {
        NaturalNumber n = this.constructorRef(1);
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void nNConstructorTest3() {
        NaturalNumber n = this.constructorRef(2);
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void nNConstructorTest4() {
        NaturalNumber n = this.constructorRef(10);
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void nNConstructorTest5() {
        NaturalNumber n = this.constructorRef(101);
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void nNConstructorTest6() {
        NaturalNumber n = this.constructorRef(10100);
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    @Test
    public void nNConstructorTest7() {
        NaturalNumber n = this.constructorRef("2147483648");
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        assertEquals(ref, test);
    }

    /*
     * divideBy10 tests.
     *
     * {@code out = naturalNumber.divideBy10()}
     */

    @Test
    public void divideBy10Test1() {
        String n = "0";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    @Test
    public void divideBy10Test2() {
        String n = "1";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    @Test
    public void divideBy10Test3() {
        String n = "2";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    @Test
    public void divideBy10Test4() {
        String n = "11";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    @Test
    public void divideBy10Test5() {
        String n = "100";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    @Test
    public void divideBy10Test6() {
        String n = "105";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    @Test
    public void divideBy10Test7() {
        String n = "2147483648";
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        int outT = test.divideBy10();
        int outR = ref.divideBy10();
        assertEquals(ref, test);
        assertEquals(outR, outT);
    }

    /*
     * multiplyBy10 tests.
     *
     * {@code naturalNumber.multiplyBy10(x)}
     */

    @Test
    public void multiplyBy10Test1() {
        String n = "0";
        int x = 0;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test2() {
        String n = "0";
        int x = 1;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test3() {
        String n = "0";
        int x = 9;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test4() {
        String n = "1";
        int x = 0;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test5() {
        String n = "1";
        int x = 1;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test6() {
        String n = "1";
        int x = 9;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test7() {
        String n = "10";
        int x = 0;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test8() {
        String n = "10";
        int x = 1;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test9() {
        String n = "10";
        int x = 9;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test10() {
        String n = "2147483648";
        int x = 0;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test11() {
        String n = "2147483648";
        int x = 1;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test12() {
        String n = "2147483648";
        int x = 9;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    @Test
    public void multiplyBy10Test13() {
        String n = "5";
        int x = 5;
        NaturalNumber test = this.constructorTest(n);
        NaturalNumber ref = this.constructorRef(n);
        test.multiplyBy10(x);
        ref.multiplyBy10(x);
        assertEquals(ref, test);
    }

    /*
     * isZero tests.
     *
     * {@code isTrue = naturalNumber.isZero()}
     */

    @Test
    public void isZeroTest1() {
        String n = "0";
        NaturalNumber test = this.constructorTest(n);
        boolean isTrue = test.isZero();
        assertTrue(isTrue);
    }

    /*
     * Not sure whether the following is needed: using different constructor to
     * initialize the instance.
     */
    @Test
    public void isZeroTest2() {
        int n = 0;
        NaturalNumber test = this.constructorTest(n);
        boolean isTrue = test.isZero();
        assertTrue(isTrue);
    }

    @Test
    public void isZeroTest3() {
        NaturalNumber test = this.constructorTest();
        boolean isTrue = test.isZero();
        assertTrue(isTrue);
    }

    @Test
    public void isZeroTest4() {
        String n = "1";
        NaturalNumber test = this.constructorTest(n);
        boolean isTrue = test.isZero();
        assertFalse(isTrue);
    }

    @Test
    public void isZeroTest5() {
        String n = "10";
        NaturalNumber test = this.constructorTest(n);
        boolean isTrue = test.isZero();
        assertFalse(isTrue);
    }

    @Test
    public void isZeroTest6() {
        String n = "101";
        NaturalNumber test = this.constructorTest(n);
        boolean isTrue = test.isZero();
        assertFalse(isTrue);
    }

    @Test
    public void isZeroTest7() {
        String n = "2147483648";
        NaturalNumber test = this.constructorTest(n);
        boolean isTrue = test.isZero();
        assertFalse(isTrue);
    }

}
