package com.prueba.calculadora.controller;

import com.prueba.calculadora.service.CalculadoraService;
import io.corp.calculator.TracerImpl;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Entry point de los métodos del API
 * /api/v1/calculadora
 */
@RestController
@RequestMapping("/api/v1/calculadora")
public class CalculadoraController {

  @Autowired
  private CalculadoraService calculadoraService;

  private TracerImpl tracer = new TracerImpl();

  @GetMapping("/calcula")
  public ResponseEntity<?> calcula(@RequestParam(name = "primero") BigDecimal primerNumero,
                                    @RequestParam(name = "segundo") BigDecimal segundoNumero,
                                    @RequestParam() String operacion) {
    BigDecimal result = calculadoraService.calcula(primerNumero, segundoNumero, operacion);
    tracer.trace(result);

    return ResponseEntity.ok(result);
  }
}
