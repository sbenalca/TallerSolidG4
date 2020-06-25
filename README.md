# TallerSolidG4

Principios Solid Violentados:

S – Single Responsibility Principle (SRP)

    En las clases Helado y Pastel existn 2 métodos llamados: calcularPrecioFinal() y  showPrecioFinal()
    Ambos métodos son similares para ambas clases y no estan ligados al objetivo principal de las clases, el cual es servir de modelo para el proceso de administrar los postres pedidos. 

S – Single Responsibility Principle (SRP)

    ¿Es necesaria la clase OperacionesAderezo?
    Tanto Pastel como Helado, pueden añadirse aderezos a los mismos, por lo que no
    es necesario tener metodos duplicados que pueden hacer la misma función
    para cada postre.

S- Single Responsability Principle (SRP)

En el literal 3 se puede concluir utilizamos el principio de SIngle responsability, 
debido a que creamos una nueva clase para que desarrolle
una única responsabilidad en este caso sería el manejo de los precios
