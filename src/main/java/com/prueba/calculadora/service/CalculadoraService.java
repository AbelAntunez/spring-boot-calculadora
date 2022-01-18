package com.prueba.calculadora.service;

import java.math.BigDecimal;

public interface CalculadoraService {

  /***
   * Método que calcula, dados dos números y una operación,
   * su resultado.
   *
   * @param primerNumero
   * @param segundoNumero
   * @param operacion
   * @return El resultado de la operación
   */
  BigDecimal calcula(BigDecimal primerNumero, BigDecimal segundoNumero, String operacion);
}
