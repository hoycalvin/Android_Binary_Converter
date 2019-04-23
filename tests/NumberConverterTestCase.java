package calvinh.a3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Calvinh on 3/30/2017.
 */

public class NumberConverterTestCase {
    @Test
    public void binToBin() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.binToBin("1"), "1");  //"1"
        assertEquals(test.binToBin("0"), "0");  //"0"
        assertEquals(test.binToBin("10"), "10"); //"10"
        assertEquals(test.binToBin("12"), "ERROR"); //"ERROR"
        assertEquals(test.binToBin("1210"), "ERROR"); //"ERROR"
        assertEquals(test.binToBin("10s1"), "ERROR"); //"ERROR"
        assertEquals(test.binToBin("s10"), "ERROR"); // "ERROR"
        assertEquals(test.binToBin("1s0"), "ERROR"); //"ERROR"
    }

    @Test
    public void decToBin() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.decToBin("21"), "10101");   //"10101"
        assertEquals(test.decToBin("0"), "0");      //"1"
        assertEquals(test.decToBin("1"), "1");     //"1"
        assertEquals(test.decToBin("21a"), "ERROR");  //"ERROR"
        assertEquals(test.decToBin("2a1"), "ERROR");  //"ERROR"
        assertEquals(test.decToBin("a21"), "ERROR");  //"ERROR"
        assertEquals(test.decToBin("210"), "11010010");  //"11010010"
    }

    @Test
    public void hexToBin() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.hexToBin("a"), "1010");  // "1010"
        assertEquals(test.hexToBin("0"), "0");  // "0"
        assertEquals(test.hexToBin("face"), "1111101011001110"); //"1111101011001110"
        assertEquals(test.hexToBin("facg"), "ERROR");  // "ERROR"
        assertEquals(test.hexToBin("gfac"), "ERROR");  // "ERROR"
        assertEquals(test.hexToBin("fgac"), "ERROR");  // "ERROR"
        assertEquals(test.hexToBin("12af"), "1001010101111");  // "1001010101111"
        assertEquals(test.hexToBin("1af2"), "1101011110010");  // "1101011110010"
        assertEquals(test.hexToBin("af12"), "1010111100010010");  // "1010111100010010"
        assertEquals(test.hexToBin("a12f"), "1010000100101111");  // "1010000100101111"
        assertEquals(test.hexToBin("1ga2"), "ERROR");  // "ERROR"
        assertEquals(test.hexToBin("g1a2"), "ERROR");  // "ERROR"
        assertEquals(test.hexToBin("1a2g"), "ERROR");  // "ERROR"
    }

    @Test
    public void binToDec() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.binToDec("0"), "0"); // "0"
        assertEquals(test.binToDec("1"), "1"); // "1"
        assertEquals(test.binToDec("10110"), "22"); // "22"
        assertEquals(test.binToDec("101a"), "ERROR"); // "ERROR"
        assertEquals(test.binToDec("10a110"), "ERROR"); // "ERROR"
        assertEquals(test.binToDec("10110a"), "ERROR"); // "ERROR"
        assertEquals(test.binToDec("a10110"), "ERROR"); // "ERROR"
        assertEquals(test.binToDec("101210"), "ERROR"); // "ERROR"
        assertEquals(test.binToDec("10111000101011011"), "94555"); // "94555"
    }

    @Test
    public void decToDec() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.decToDec("0"), "0");  //"0"
        assertEquals(test.decToDec("1"), "1"); //"1"
        assertEquals(test.decToDec("1213"), "1213");   //"1213"
        assertEquals(test.decToDec("12a13"), "ERROR");  //"ERROR"
        assertEquals(test.decToDec("a1213"), "ERROR");  //"ERROR"
        assertEquals(test.decToDec("1213a"), "ERROR");  //"ERROR"
        assertEquals(test.decToDec("a"), "ERROR");   //"ERROR"
        assertEquals(test.decToDec("face"), "ERROR");  //"ERROR"
        assertEquals(test.decToDec("100101010"), "100101010"); //"100101010"
    }

    @Test
    public void hexToDec() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.hexToDec("0"),"0");  // "0"
        assertEquals(test.hexToDec("a"), "10");  // "10"
        assertEquals(test.hexToDec("a3"), "163");   // "163"
        assertEquals(test.hexToDec("face"), "64206"); // "64206"
        assertEquals(test.hexToDec("a4a"), "2634");  // "2634"
        assertEquals(test.hexToDec("aza"), "ERROR");  // "ERROR"
        assertEquals(test.hexToDec("zaa"), "ERROR");  // "ERROR"
        assertEquals(test.hexToDec("aaz"), "ERROR");  // "ERROR"
    }

    @Test
    public void decToHex() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.decToHex("0"), "0");   //"0"
        assertEquals(test.decToHex("1"), "1");   //"1"
        assertEquals(test.decToHex("61"), "3d");  // "3d"
        assertEquals(test.decToHex("61g"), "ERROR"); //"ERROR"
        assertEquals(test.decToHex("61a"), "ERROR"); //"ERROR"
        assertEquals(test.decToHex("6a6"), "ERROR"); //"ERROR"
        assertEquals(test.decToHex("610"), "262");  // "262"
    }

    @Test
    public void binToHex() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.binToHex("0"), "0"); //"0"
        assertEquals(test.binToHex("1"), "1"); //"1"
        assertEquals(test.binToHex("10101011"), "ab"); //"ab"
        assertEquals(test.binToHex("1010a1011"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("a10101011"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("10101011a"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("1010g1011"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("g10101011"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("10101011g"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("10102011"), "ERROR");  //"ERROR"
        assertEquals(test.binToHex("210101011"), "ERROR"); //"ERROR"
        assertEquals(test.binToHex("101010112"), "ERROR"); //"ERROR"
    }

    @Test
    public void hexToHex() throws Exception {
        NumberConverter test = new NumberConverter();

        assertEquals(test.hexToHex("0"), "0");  //"0"
        assertEquals(test.hexToHex("1"), "1");  //"1"
        assertEquals(test.hexToHex("face"), "face"); //"face"
        assertEquals(test.hexToHex("12ce"), "12ce"); //"12ce"
        assertEquals(test.hexToHex("ce12"), "ce12"); //"ce12"
        assertEquals(test.hexToHex("c12e"), "c12e"); //"c12e"
        assertEquals(test.hexToHex("fgac"), "ERROR"); //"ERROR"
        assertEquals(test.hexToHex("gfac"), "ERROR"); //"ERROR"
        assertEquals(test.hexToHex("facg"), "ERROR"); //"ERROR"
        assertEquals(test.hexToHex("1g2c"), "ERROR"); //"ERROR"
        assertEquals(test.hexToHex("g12c"), "ERROR"); //"ERROR"
        assertEquals(test.hexToHex("12gc"), "ERROR"); //"ERROR"
    }
}
