
# **TallerSolidG4**

## **Principios Solid Violentados:**

## **Literal 1: S – Single Responsibility and Open Close Principles  (SRP y OCP)**

- En las clases `Helado` y `Pastel` existen dos métodos, `calcularPrecioFinal()` y  `showPrecioFinal()`, estos métodos tienen mucha similitud. 

- Se debería crear una clase padre llamada `Postre`, `Helado` y `Pastel` heredarian de esta nueva clase. 

- La nueva clase quedaria cerrada a modificación, pero abierta a extensión por parte de sus clases hijas Helado y Postre.

## **Literal 2: S – Single Responsibility Principle (SRP)**

¿Es necesaria la clase `OperacionesAderezo`?
Tanto `Pastel` como `Helado`, pueden añadirse aderezos a si mismos, por lo que no
es necesario tener metodos duplicados que realizen la misma función en cada postre por separado.

## **Literal 3: S- Single Responsability Principle (SRP)**

En el literal 3 se puede concluir utilizamos el principio de SIngle responsability, 
debido a que creamos una nueva clase para que desarrolle
una única responsabilidad en este caso sería el manejo de los precios.

## **Literal 4: Open-Close Principle (OCP)**

Enum Adicionales.Aderezo es muy estático, para obtener un nuevo aderezo debo modificar el enum para colocar un nombre, pero al convertirlo a clase abstracta con un método para setear el nombre y el `toString()`, se permite extender a los aderezos que se desea.

## **Literal 5: Princio de sustitución de Liskov (LSP)**

Al utilizar el método `usarPastel` de la clase `LecheDeslactosada`.
Cuando se cambia el tipo de leche se produce una excepción, esta indica que un 
pastel no se puede hacer con leche deslactosada, un error inesperado 
para una instancia de clase que implementa la interfaz `LecheEntera`. Deberiamos
poder sustituir el objeto `LecheDeslactosada` por uno de tipo `LecheEntera` y esperar un comportamiento libre de errores, para lograr este comportamiento modificamos el método
`usarPastel` y eliminamos dicha excepción, la sustituimos por el mensaje **"No se puede usar leche deslactosada en un pastel. Usando leche entera!"**.
