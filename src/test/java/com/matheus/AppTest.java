package com.matheus;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
     @Test
    public void testFaixaIsento() {
        double renda = 27870.40;
        double imposto = App.CalcularImposto(renda);
        assertEquals(0.0, imposto, 0.01);
    }

    @Test
    public void testFaixa075() {
        double renda = 30000.00;
        double imposto = App.CalcularImposto(renda);
        // (30000 - 27870.40) * 0.075
        double esperado = (30000.00 - 27870.40) * 0.075;
        assertEquals(esperado, imposto, 0.01);
    }

    @Test
    public void testFaixa15() {
        double renda = 40000.00;
        double imposto = App.CalcularImposto(renda);
        double esperado = (40000.00 - 37751.55) * 0.15 +
                          (37751.55 - 27870.40) * 0.075;
        assertEquals(esperado, imposto, 0.01);
    }

    @Test
    public void testFaixa225() {
        double renda = 52000.00;
        double imposto = App.CalcularImposto(renda);
        double esperado = (52000.00 - 50148.25) * 0.225 +
                          (50148.25 - 37751.55) * 0.15 +
                          (37751.55 - 27870.40) * 0.075;
        assertEquals(esperado, imposto, 0.01);
    }

    @Test
    public void testFaixa275() {
        double renda = 70000.00;
        double imposto = App.CalcularImposto(renda);
        double esperado = (70000.00 - 64259.59) * 0.275 +
                          (64259.59 - 50148.25) * 0.225 +
                          (50148.25 - 37751.55) * 0.15 +
                          (37751.55 - 27870.40) * 0.075;
        assertEquals(esperado, imposto, 0.01);
    }
}
