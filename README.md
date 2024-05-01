# Centro de Vacunación

* OE3.2. Utilizar la herencia para construir aplicaciones, aprovechando su capacidad de construir nuevas clases basadas en clases  existentes y diseñadas para facilitar la implementación de entidades relacionadas que comparten elementos comunes.
* OE3.3. Emplear el polimorfismo como técnica para enriquecer el comportamiento de las entidades modeladas en una solución, sin agregar complejidad innecesaria y asegurando un acceso intuitivo a sus servicios.
* OE3.4. Diferenciar entre clases abstractas y clases concretas, y utilizar ambos tipos de clases de manera apropiada en soluciones que involucran herencia y polimorfismo.
* OE3.6. Usar constructores para definir escenarios y construir casos de pruebas para validar una solución. 
* OE3.7. Utilizar las palabras reservadas extends, implements, abstract, instanceof y protected, llamados a constructores de las superclases, llamados a métodos de las super clases en la construcción de una solución con herencia y polimorfismo.


## Problema
Un centro de vacunación necesita una aplicación para llevar control de las vacunas, las dosis aplicadas y los pacientes.  El centro de vacunación atiende hasta 600 pacientes y tiene a disposición de estos, unas 20 vacunas diferentes. De cada vacuna se registra la enfermedad que previene, el laboratorio que la produce y la cantidad de dosis que deben aplicarse. En esta actividad solo trabajaremos con los requerimientos relacionados con los pacientes.

Cada que se registra un paciente se pregunta una información general y una específica dependiendo del servicio médico que tienen.  De forma general, los pacientes tienen un nombre, apellido, edad y documento de identidad. Además,  de cada paciente se registra la cantidad de vacunas que va a recibir esa visita.   Todos los pacientes tienen una tarifa de pago básica de $100.000 por cada vacuna que se les aplica.

El centro de vacunación atiende a pacientes particulares, por EPS y por dos entidades de medicina prepagada.
* Los pacientes particulares tienen un teléfono de contacto. Los pacientes particulares deben pagar 10% más de la tarifa básica por cada vacuna que reciban.
* Los pacientes de EPS  tienen el nombre de la eps y el número de la orden de servicio.  Los pacientes de EPS solo pagan el 20% de la tarifa básica por cada vacuna que reciben.
* Todos los pacientes  de medicina prepagada tienen un número de afiliación.  Los pacientes de prepagada pagan el 50% de la tarifa básica y  pueden clasificarse en:
Pacientes de Coomeva.
  * Los pacientes de Coomeva tienen una categoría que puede ser [platino, oro y oro plus]
  * Pacientes de SURA.  Los pacientes de SURA tienen pólizas con un rango de cubrimiento, este rango está definido por medio de  un valor mínimo y valor máximo de la póliza.

## Requerimientos
* R1: Registro de pacientes: la aplicación debe contar con un item en el menú para registrar los pacientes teniendo en cuenta los distintos tipos (pacientes de EPS, particulares, de prepagada (SURA) y  de prepagada (Coomeva)) y la cantidad de vacunas que va a recibir en la visita.
* R2: Mostrar la información de los pacientes registrados: la aplicación debe contar con un item en el menú para mostrar la información de los pacientes, por cada paciente se debe además mostrar el precio que pagó por la visita.
