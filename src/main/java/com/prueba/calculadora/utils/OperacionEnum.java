package com.prueba.calculadora.utils;

public enum OperacionEnum {
  SUMAR("+"),
  RESTAR("-");

  private static final OperacionEnum[] operaciones = new OperacionEnum[]{SUMAR, RESTAR};

  private String operacion;

  OperacionEnum(String operacion) {
    this.operacion = operacion;
  }

  public String getOperacion() {
    return operacion;
  }

  public static OperacionEnum parseOperacion(String operacion) {

    for (int i = 0; i < operaciones.length; ++i) {
      OperacionEnum op = operaciones[i];
      if (operacion.equalsIgnoreCase(op.name()) ||
          operacion.equalsIgnoreCase(op.getOperacion())) {
        return op;
      }
    }

    throw new RuntimeException(String.format("Operación %s no soportada", operacion));
  }
}
