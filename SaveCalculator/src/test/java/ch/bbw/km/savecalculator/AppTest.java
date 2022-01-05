package ch.bbw.km.savecalculator;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 * * @author marco
 *  * @version 05.01.2022
 */
public class AppTest {
    @Test
    public void testSummeZweiPositiveZahlenIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summarize(value1, value2) == 30);
    }
    @Test
    public void testSummeGroesstePositiveZahlUndKleintePositiveZahlIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        assertTrue(testee.summarize(value1, value2) == -2147483648);
    }
    @Test
    public void testSummeGroessteNegativeZahlUndKleinstePositiveZahlIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        assertTrue(testee.summarize(value1, value2) == -2147483647);
    }
    @Test
    public void testSubtraktionZweiPositiveZahlenIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtract(value1, value2) == -10);
    }
    @Test
    public void testSubtraktionGroessteNegativeZahlUndKleinsteNegativeZahlIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = -1;
        assertTrue(testee.subtract(value1, value2) == 2147483647);
    }
    @Test
    public void testSubtraktionGroesstePositiveZahlUndKleinsteNegativeZahlIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        assertTrue(testee.subtract(value1, value2) == -2147483648);
    }
}



//tests to implement
//eine positive + eine positive
//eine negative + eine negative
//eine positive + eine negative
//grösste positive + kleinste positive
//grösste positive + kleinste negative
//grösste negative + kleinste positive
//grösste negative + kleinste negative
