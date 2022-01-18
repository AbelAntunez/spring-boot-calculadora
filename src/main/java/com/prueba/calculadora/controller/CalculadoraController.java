package com.prueba.calculadora.controller;

import java.math.BigDecimal;
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

  @GetMapping("/calcula")
  public ResponseEntity<?> calcula(@RequestParam(name = "primero") BigDecimal primerNumero,
                                    @RequestParam(name = "segundo") BigDecimal segundoNumero,
                                    @RequestParam() String operacion) {
    return ResponseEntity.ok("1: " + primerNumero + " 2: " + segundoNumero + " operacion: " + operacion);
  }
}
