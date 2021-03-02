package es.jesustfk.javatest.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumeralShould {

    @Test
    public void number_is_1_then_I() {
        assertThat(RomanNumeral.arabicToRoman(1), is("I"));
    }

    @Test
    public void number_is_2_then_II() {
        assertThat(RomanNumeral.arabicToRoman(2), is("II"));
    }

    @Test
    public void number_is_3_then_III() {
        assertThat(RomanNumeral.arabicToRoman(3), is("III"));
    }

    @Test
    public void number_is_5_then_V() {
        assertThat(RomanNumeral.arabicToRoman(5), is("V"));
    }

    @Test
    public void number_is_6_then_VI() {
        assertThat(RomanNumeral.arabicToRoman(6), is("VI"));
    }

    @Test
    public void number_is_7_then_VII() {
        assertThat(RomanNumeral.arabicToRoman(7), is("VII"));
    }

    @Test
    public void number_is_10_then_X() {
        assertThat(RomanNumeral.arabicToRoman(10), is("X"));
    }

    @Test
    public void number_is_11_then_XI() {
        assertThat(RomanNumeral.arabicToRoman(11), is("XI"));
    }

    @Test
    public void number_is_15_then_XV() {
        assertThat(RomanNumeral.arabicToRoman(15), is("XV"));
    }

    @Test
    public void number_is_16_then_XVI() {
        assertThat(RomanNumeral.arabicToRoman(16), is("XVI"));
    }

    @Test
    public void number_is_50_then_L() {
        assertThat(RomanNumeral.arabicToRoman(50), is("L"));
    }

    @Test
    public void number_is_51_then_LI() {
        assertThat(RomanNumeral.arabicToRoman(51), is("LI"));
    }

    @Test
    public void number_is_55_then_LV() {
        assertThat(RomanNumeral.arabicToRoman(55), is("LV"));
    }

    @Test
    public void number_is_56_then_LVI() {
        assertThat(RomanNumeral.arabicToRoman(56), is("LVI"));
    }

    @Test
    public void number_is_60_then_LX() {
        assertThat(RomanNumeral.arabicToRoman(60), is("LX"));
    }

    @Test
    public void number_is_70_then_LXX() {
        assertThat(RomanNumeral.arabicToRoman(70), is("LXX"));
    }

    @Test
    public void number_is_80_then_LXXX() {
        assertThat(RomanNumeral.arabicToRoman(80), is("LXXX"));
    }

    @Test
    public void number_is_81_then_LXXXI() {
        assertThat(RomanNumeral.arabicToRoman(81), is("LXXXI"));
    }

    @Test
    public void number_is_85_then_LXXXV() {
        assertThat(RomanNumeral.arabicToRoman(85), is("LXXXV"));
    }

    @Test
    public void number_is_86_then_LXXXVI() {
        assertThat(RomanNumeral.arabicToRoman(86), is("LXXXVI"));
    }

    @Test
    public void number_is_126_then_CXXVI() {
        assertThat(RomanNumeral.arabicToRoman(126), is("CXXVI"));
    }

    @Test
    public void number_is_2507_then_MMDVII() {
        assertThat(RomanNumeral.arabicToRoman(2507), is("MMDVII"));
    }

    @Test
    public void number_is_4_then_IV() {
        assertThat(RomanNumeral.arabicToRoman(4), is("IV"));
    }

    @Test
    public void number_is_9_then_IX() {
        assertThat(RomanNumeral.arabicToRoman(9), is("IX"));
    }

    @Test
    public void number_is_14_then_XIV() {
        assertThat(RomanNumeral.arabicToRoman(14), is("XIV"));
    }

    @Test
    public void number_is_24_then_XXIV() {
        assertThat(RomanNumeral.arabicToRoman(24), is("XXIV"));
    }

    @Test
    public void number_is_40_then_XL() {
        assertThat(RomanNumeral.arabicToRoman(40), is("XL"));
    }

    @Test
    public void number_is_49_then_XLIX() {
        assertThat(RomanNumeral.arabicToRoman(49), is("XLIX"));
    }

    @Test
    public void number_is_90_then_XC() {
        assertThat(RomanNumeral.arabicToRoman(90), is("XC"));
    }

    @Test
    public void number_is_99_then_XCIX() {
        assertThat(RomanNumeral.arabicToRoman(99), is("XCIX"));
    }

    @Test
    public void number_is_400_then_CD() {
        assertThat(RomanNumeral.arabicToRoman(400), is("CD"));
    }

    @Test
    public void number_is_900_then_CM() {
        assertThat(RomanNumeral.arabicToRoman(900), is("CM"));
    }
}