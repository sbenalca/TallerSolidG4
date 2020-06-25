# TallerSolidG4

Principios Solid Violentados:

S – Open - Close (SRP)

    En el literal 1 En las clases Helado y Pastel existn 2 métodos llamados: calcularPrecioFinal() y  showPrecioFinal()
    Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre
    Con esta nueva clase llamada Postre esta queda cerrada para su modificación pero abierta a extensión por parte de sus clases hijas Helado y Postre 

S – Single Responsibility Principle (SRP)

    ¿Es necesaria la clase OperacionesAderezo?
    Tanto Pastel como Helado, pueden añadirse aderezos a los mismos, por lo que no
    es necesario tener metodos duplicados que pueden hacer la misma función
    para cada postre.

S- Single Responsability Principle (SRP)

En el literal 3 se puede concluir utilizamos el principio de SIngle responsability, 
debido a que creamos una nueva clase para que desarrolle
una única responsabilidad en este caso sería el manejo de los precios
