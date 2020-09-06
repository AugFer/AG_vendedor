# AG_vendedor
El problema del vendedor ambulante (TSP) es uno de los problemas más famosos de optimización. En su forma clásica, el TSP consiste en un conjunto de nodos o ciudades para los cuales se debe construir un recorrido con una distancia mínima. Para un problema con N ciudades, existirán N! posibles soluciones, por lo que los problemas similares a los TSP se clasifican como problemas no polinómicos. Esto significa que el esfuerzo computacional requerido aumenta exponencialmente con el número de ciudades.

Adicionalmente, existen variaciones que afectan a la complejidad del problema, por ejemplo: que la ciudad inicial y final puedan ser la misma o no, la posibilidad de visitar una misma ciudad múltiples veces, la existencia de penalizaciones por realizar ciertas acciones, etc.

Para la realización de este algoritmo, se definieron de las siguientes características y restricciones:
- [x] Algoritmo de minimización: el objetivo es encontrar el recorrido con distancia mínima.
- [x] Se debe poder especificar un costo de recorrido máximo que la solución final debe respetar.
- [x] Se deben poder seleccionar las ciudades de inicio y fin del recorrido.
- [x] La ciudad inicial puede o no ser la misma que la final.
- [x] El sistema debe poder funcionar para cualquier subconjunto de ciudades definidas.

### Instancia
La instancia utilizada para la realización de las pruebas se compone de la tabla de distancias entre ciudades, la tabla de costo de viaje entre ciudades y los parámetros propios del algoritmo genético.
- Las tablas de distancia y costo poseen valores ficticios para validar y verificar el funcionamiento del algoritmo.

### Mejoras posibles
- Que las tablas de distancia y costo se carguen al inicio de la ejecucion a partir de archivos externos faciles de editar.
- Al finalizar la ejecución generar archivo de reporte con resultados finales.
