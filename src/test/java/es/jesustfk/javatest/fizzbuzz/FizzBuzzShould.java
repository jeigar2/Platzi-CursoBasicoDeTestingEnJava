package es.jesustfk.javatest.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void number_divisible_by_3_then_Fizz() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void number_divisible_by_5_then_Buzz() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void number_divisible_by_3_and_divisible_by_5_then_FizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void number_is_not_divisible_by_3_and_is_not_divisible_by_5_then_itself() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));
    }
}