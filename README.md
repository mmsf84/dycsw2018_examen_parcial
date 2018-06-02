# Examen Parcial - Diseño y Construcción de Software - Semestre 2018-1 - UNMSM-UPG-FISI

Alumno: Mario Santos Francia

## Teoría (6 puntos)
### Pregunta 1. Explicar:

* Diseño de software.-
Respuesta: 
	Se trata de la arquitectura del software, esta formado por componentes, interfaces ue permiten la comunicacón entre ellos.
	Y un nivel de diseño detalle que permita la construcción.

* Patrón de diseño.-
Respuesta: 
	Es una solución comprobada aplicable a un problema comun, en este caso un problema de construcción de software, 
	con ello se logra aplicar buenas practicas para lograr un mejor rendimiento, bajo acoplamiento y sacar el mejor
	provecho de los lenguajes orientados a objetos. 

* Principios del diseño de software.-
Respuesta:
	Abstracción
	Acoplamiento
	Cohesión
	Encapsulamiento
	Descomposición
	Separación de interese
	Suficiencia

* Síntomas de un diseño pobre.-
Respuesta: 
	Rigidez (cuando es codigo es dificil de cambiar)
	Fragilidad (los cambios en un lugar impactan en varios lugares)
	Inmovilidad (el codigo es dificil de reusar)
	Viscosidad (Es mas facil hacerlo de manera incorrecta)
	Complejidad Innecesaria
	Repetición Innecesaria
	Opacidad (Cuando el codigo es dificil de entender)

* Atributo de calidad.-
Respuesta:
	Los atributos de calidad se refieren a los requerimientos no funcionales que deben cumplirse para lograr agilidad.
	Los atributo de calidad pueden ser disponibilidad, usabilidad, rendimiento, portabilidad, mantenibilidad, etc.

* Drivers arquitecturales.-
Respuesta:
	Proposito de diseño (se define el objetivo, lo que se busca lograr)
	Atributos de Calidad (los requerimientos no funcionales que debe lograrse)
	Funcionalidad Primaria (la funcionalidad principal requerida)
	Condiciones arquitecturales (Concerns, no son requerimientos pero condicionan una propuesta de diseño)
	Restricciones (constraints, pueden ser una tecnologia, una regla de negocio, etc.)

## Práctica (14 puntos)
Para cada pregunta presentar diseño UML y código fuente (agregar a ebautistau@unmsm.edu.pe como colaborador del repositorio github).
Los ejemplos propuestos NO pueden ser los vistos en clases, ni tampoco bajado de la web.

### Pregunta 2. (3 puntos)
- Construya un ejemplo en la que se aplique el principio: "Favorecer la composición de objetos frente a la herencia de clases".

### Pregunta 3. (3 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta3
- Mejorar la implementación de la red social Reddit.
- Soportar la red social Pinterest.
- Usar un contenedor IoC.
- Indicar los patrones y/o principios implementados.

### Pregunta 4. (2 puntos)
- Construya un ejemplo aplicando el patrón notification.

### Pregunta 5. (6 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta5
- Aplicar el patrón Abstract Factory para evitar exponer clases concretas (WhiteFinish, FastProcessor, etc) en el cliente (Client.java).
- El nuevo cliente (Client.java) debe mostrar la misma información.
