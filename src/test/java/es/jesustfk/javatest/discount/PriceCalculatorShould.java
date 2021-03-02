package es.jesustfk.javatest.discount;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    PriceCalculator calculator;

    @Before
    public void setUp(){
        calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_prices() {
//        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_sum_of_prices() {
//        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.3);
        calculator.addPrice(16.2);
        assertThat(calculator.getTotal(), is(26.5));
    }

    @Test
    public void apply_discount_to_prices() {
//        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(34.5);
        calculator.addPrice(65.5);
        calculator.setDiscount(25);
        assertThat(calculator.getTotalDiscount(), is(75.0));
    }
}