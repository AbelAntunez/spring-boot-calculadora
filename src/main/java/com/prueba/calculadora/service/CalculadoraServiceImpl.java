package com.prueba.calculadora.service;

import com.prueba.calculadora.utils.OperacionEnum;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

  @Override
  public BigDecimal calcula(BigDecimal primerNumero, BigDecimal segundoNumero, String operacion) {

    OperacionEnum operacionEnum = OperacionEnum.parseOperacion(operacion);

    switch (operacionEnum) {
      case SUMAR:
        return primerNumero.add(segundoNumero);
      case RESTAR:
        return primerNumero.subtract(segundoNumero);

      default:
        throw new RuntimeException(String.format("Operación %s no soportada", operacion));

    }

  }
}
