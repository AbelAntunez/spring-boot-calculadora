package com.prueba.calculadora;

import com.prueba.calculadora.service.CalculadoraService;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraApplicationTests {

  @Autowired
  private CalculadoraService calculadoraService;

  /**
   * Dados 2 valores y el tipo de operación 'sumar'
   * devuelve el resultado de la suma
   */
  @Test
  public void sumaTest() {

    //Given
    BigDecimal primerNumero = BigDecimal.valueOf(12509);
    BigDecimal segundoNumero = BigDecimal.valueOf(909.78);
    String operacion = "sumar";

    //Then
    BigDecimal resultado = calculadoraService.calcula(primerNumero, segundoNumero, operacion);

    //Return
    Assert.assertEquals(BigDecimal.valueOf(13418.78), resultado);
  }

  /**
   * Dados 2 valores y el tipo de operación '+'
   * devuelve el resultado de la suma
   */
  @Test
  public void sumaTestConSigno() {

    //Given
    BigDecimal primerNumero = BigDecimal.valueOf(12509);
    BigDecimal segundoNumero = BigDecimal.valueOf(909.78);
    String operacion = "+";

    //Then
    BigDecimal resultado = calculadoraService.calcula(primerNumero, segundoNumero, operacion);

    //Return
    Assert.assertEquals(BigDecimal.valueOf(13418.78), resultado);
  }

  /**
   * Dados 2 valores y el tipo de operación 'restar'
   * devuelve el resultado de la resta
   */
  @Test
  public void restaTest() {

    //Given
    BigDecimal primerNumero = BigDecimal.valueOf(1490.56);
    BigDecimal segundoNumero = BigDecimal.valueOf(12.90);
    String operacion = "restar";

    //Then
    BigDecimal resultado = calculadoraService.calcula(primerNumero, segundoNumero, operacion);

    //Return
    Assert.assertEquals(BigDecimal.valueOf(1477.66), resultado);
  }

  /**
   * Dados 2 valores y el tipo de operación '-'
   * devuelve el resultado de la resta
   */
  @Test
  public void restaTestConSigno() {

    //Given
    BigDecimal primerNumero = BigDecimal.valueOf(1490.56);
    BigDecimal segundoNumero = BigDecimal.valueOf(12.90);
    String operacion = "-";

    //Then
    BigDecimal resultado = calculadoraService.calcula(primerNumero, segundoNumero, operacion);

    //Return
    Assert.assertEquals(BigDecimal.valueOf(1477.66), resultado);
  }

}
