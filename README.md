# practicas-curso-java

Proyecto que busca representar una aerolinea.

El paquete raíz es es.indra.aerolinea
### .beans

Repositorio para Interfaces de beans

  *Interfaces*
  * IAerolinea: interfaz que define el comportamiento de la gestión de vuelos.
  
### .beans.impl

Paquete para las implementaciones de interfaces o POJOs

  *Clases*
  
  * Aerolinea: implementación de la interfaz IAerolinea. Da cuerpo a los métodos: .... y las variables:
    + nombre: nombre de la aerolínea.
    + id: identificador de la aerolinea.
    + vuelos[]: array de todos los vuelos disponibles.
  * Vuelo: POJO que representa el vuelo con origen, destino, etc ..
    + origen: origen del vuelo.
    + destino: destino del vuelo.
    + numeroVuelo: string que identifica el vuelo.
    + numeroPasajero: entero para indicar la cantidad de pasajeros.
    + disponible: boolean que indica si el vuelo esta disponible.
  * Persona: clase abstracta para representar a todas las personas del sistema. Contiene:
    + nombre
    + apellido
    + id
    + dni
  * Empleado: clase que hereda de **Persona** y no añade propiedades extra solo sobreescribe el método ***solicitarInformacion()***.
  * Pasajero: clase que hereda de **Persona**.
  
  
  
  
