# Proyecto Spring-Boot Calculadora
Pequeña calculadora como micro-servicio, utilizando Spring-boot y Maven, que pasados dos números, realiza operaciones básicas como sumar y restar.

Comunicación a través de una API REST Ejemplo: ```GET /api/v1/calculadora/calcula?primero=478.5&segundo=200&operacion=sumar```
Integra la librería Tracer proporcionada.

## Pasos a seguir

1. Descargamos el repositorio de GitHub
2. Realizamos una instalación limpia de Maven (mvn clean install)
3. Ejecutamos el JAR de la carpeta /target calculadora-0.0.1-SNAPSHOT

Ahora deberíamos tener nuestra API escuchando en el puerto 3772  -> Base path: (http://localhost:3772/api/v1/calculadora)

También puedes lanzar directamente el jar uber-calculadora-0.0.1-SNAPSHOT, el cual contiene todas las dependencias y actua como "standalone" del proyecto

## API REST
    -> Base path: http://localhost:3772/api/v1/calculadora
    -> Endpoint: /calcula
    -> Parámetros: ?primero=478.5&segundo=200&operacion=sumar
      primero: primer número de la operación
      segundo: segundo número de la operación
      operacion: operacion a realizar (Admite 'sumar', 'restar', '%2B' y '-')
        NOTA: Se usa '%2B' para el símbolo '+' por ser un símbolo reservado
    
Llamada de ejemplo: curl http://localhost:3772/api/v1/calculadora/calcula?primero=478.5&segundo=200&operacion=sumar 

En el propio proyecto tenemos tests unitarios que verifican el correcto funcionamiento del método 'calcula' 
y tenemos también un json con las colecciones de postman para probar el API, estas colecciones cuentan con tests dentro de postman.
