# Calificada3-Grupo1

## Integrantes

-Jimenez Joel

-Vasquez Diego

-Hammer Franklin

-Berrospi Abraham


# Modulo 1
##Pregunta 1

![imagen](src/images/preg1.jpeg)

Demostracion sin SRP  
Nombre del empleado: Abejita,Jessica  
Este empleado tiene 7.5 años de experiencia.  
El ID del empleado es: J189  
Este empleado es un empleado senior  

----

Nombre del empleado: Smart,Chalito  
Este empleado tiene 3.2 años de experiencia.  
El ID del empleado es: C876  
Este empleado es un empleado junior  
  
Process finished with exit code 0  

##Pregunta 2
##Pregunta 3
##Pregunta 4

# Modulo 2
## Pregunta 5

Como podemos observar en el enunciado, para el método displayResult() nos muestra los detalles necesarios para un estudiante (nombre, número de registro, calificaciones), sin embargo en la clase estudiante, podemos ver el método sobrescrito toString() el cual nos muestra detalles del estudiante, lo cual no sería óptimo, por lo tanto sería innecesario implementar dicho método en la clase estudiante.
Ahora para el método evaluateDistintion() observamos que en la clase DistintionDecider tenemos una lista de String para los departamentos( Ciencias de la Computación, Física, Historia, Ingles), ahora si se desearía añadir este método a la clase estudiante, se debería definir también estas listas, sin embargo hacer esta operación en cada llamado generaría la creación de un lista nueva. 


## Pregunta 6
## Pregunta 7
## Pregunta 8
## Pregunta 9
## Pregunta 10
## Pregunta 11

# Modulo 3
## Pregunta 12
## Pregunta 13
## Pregunta 14
## Pregunta 15
## Pregunta 16
## Pregunta 17
## Pregunta 18

# Modulo 4
## Pregunta 19
### Clases base vs interfaces:
Un tipo de interfaz es una descripción parcial de un valor, potencialmente compatible con muchos tipos de objetos. Utilice clases base en lugar de interfaces siempre que sea posible. Desde una perspectiva de control de versiones, las clases son más flexibles que las interfaces. Con una clase, puede enviar la versión 1.0 y luego en la versión 2.0 agregar un nuevo método a la clase. Mientras el método no sea abstracto, las clases derivadas existentes seguirán funcionando sin cambios.
Según el alcance de la estructura de código, se implementa unas algunas líneas dentro de cada una de las clases con el fin de imprimir el tipo de faz
`package NoSolid.ISP;


interface  Fax {
    void typeFax();
}
class LanFax implements Fax {
    public void typeFax() {
        System.out.println("Impresora de marca LanFax");
    }
}
class EFax implements Fax {
    public void typeFax() {
        System.out.println("impresora de marca EFax");
    }
}
`

## Pregunta 20
Dado que las interfaces no admiten la herencia de implementación, el patrón que se aplica a las clases no se aplica a las interfaces. Agregar un método a una interfaz equivale a agregar un método abstracto a una clase base; cualquier clase que implemente la interfaz se interrumpirá porque la clase no implementa el nuevo método.
![imagen](https://user-images.githubusercontent.com/79879867/179441022-fb50dcbc-33ce-4804-b798-dde97f11486d.png)
![imagen](https://user-images.githubusercontent.com/79879867/179441053-32a5c59c-032e-4af6-b856-26811f4b58f2.png)


Al realizar algún cambio a la clase  ImpresoraAvanzada este provocara que cambiemos el código de la interfaz Impresora, al realizar esto cambios esto afectara a la clase ImpresoraBasica.


## Pregunta 21
Se muestra las dos clases de impresoras:
![imagen](https://user-images.githubusercontent.com/79879867/179441090-411a7871-b72c-43e1-ae1a-d17afb1148ae.png)
Del algoritmo podemos notar que la implementación de las dos clases contienes dos métodos heredados de la interfaz Impresora, pero al considerar las diferentes características según la calidad y precio de las impresoras se diferencias en su funcionalidad.
En una impresora básica no se puede enviar fax como es en el caso de una impresora avanzada, por tanto el método sendFax de la clase ImpresoraBasica se envía una excepción. Lo que permite que el código cambie cada vez que se ejecute pero la función del código  no cambia en lo absoluto.
Una solución simple seria implementar una tercera interfaz con un método el cual esté especificado la característica que hace que sea diferente una de otro fax. Para que sea llamado cuando sea necesario, por decir cuando una impresora tenga la funcionalidad de enviar  se llama a la interfaz que contenga  ese método, y cuando no simplemente no se llama a esa interfaz


## Pregunta 22
`package NoSolid.ISP;

interface Impresora {
    void printDocument();

    void sendFax();

}
`

Como se menciona anteriormente implícitamente esta forma de código no es la última debido a que si se tiene objetos  con diferentes métodos que son atributo propio este se vea afectado al tener la necesidad de implementar un método el cual no tenga esta característica 
## Pregunta 23
Resultados de test
![imagen](https://user-images.githubusercontent.com/79879867/179441182-466e5fd2-9f02-4ca8-9166-a61e09a79130.png)
Líneas de código

Como se mencionó en la pregunta 22 una de las formas más viables es implementar un segundo interfaz y separar  más el código  con el fin de evitar la necesidad de llamar un método que no tiene la impresora.


## Pregunta 24


![imagen](https://user-images.githubusercontent.com/79879867/179445024-64c07e17-aaa9-473f-ad83-a1bc9f21c953.png)
![imagen](https://user-images.githubusercontent.com/79879867/179445033-e268b435-86b1-4c98-997c-e0ef618e549b.png)

Forma 2:
Se crea una lista de tipo impresora en cual guardara los métodos de cada una de la impresoras  y mediante una un recorro  la lista  e imprimo la función imprimir.

![imagen](https://user-images.githubusercontent.com/79879867/179445057-fa267626-d6ca-4766-ba58-cfe977b6c381.png)


## Pregunta 25

![imagen](https://user-images.githubusercontent.com/79879867/179445068-16508eec-55c7-4ac5-b6d6-62248ec3a160.png)

## Pregunta 26

![imagen](https://user-images.githubusercontent.com/79879867/179445078-4b6749a5-bf1e-4725-afa0-7de0969eeefc.png)

## Pregunta 27

![imagen](https://user-images.githubusercontent.com/79879867/179445088-3ddf5b79-a8c1-43a9-864d-dbf40550b5bf.png)

## Pregunta 28
Un método predeterminado  nos permite definir una implementación predeterminada para un método interfaz. Básicamente es proporcionar un medio por el cual las interfaces pudieran expandirse sin romper el código que existe.

## Pregunta 29
Un método predeterminado de la interfaz se define de forma similar a la forma en que una clase define un método. La principal diferencia es que la declaración está precedida por la palabra clave default. Por ejemplo, considere esta interfaz simple
```
public interface MiInterfaz {
    //Esto es una declaración normal de un método
    //Esto no define la implementación de default
    int getUsuario();
    //Esto es un método default
    default int getAdmin(){
        return 1;
    }
}

```
Si una clase implementadora no proporciona su propia implementación, se utiliza el valor predeterminado
## Pregunta 30

Si des comentamos la siguiente línea y  comentamos la excepción en la clase básica nos daría como resultado.
```
package NoSolid.ISP;
class ImpresoraBasica implements Impresora {
    @Override
    public void printDocument() {
        System.out.println("La impresora imprime un documento.");
        System.out.println("===================");
    }
    @Override
    public void sendFax() {
        //throw new UnsupportedOperationException();
    }
}


```

```
class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin ISP");
        Impresora impresora = new ImpresoraAvanzada();
        Fax fax_avanzada = new LanFax();
        impresora.printDocument();
        impresora.sendFax();
        fax_avanzada.typeFax();
        impresora = new ImpresoraBasica();
        Fax fax_basica = new EFax();
        impresora.printDocument();
        fax_basica.typeFax();
        impresora.sendFax();// Lanza un error
    }
}


```
![imagen](https://user-images.githubusercontent.com/79879867/179444952-4e0212df-7c37-4856-808b-2490f1c7ee98.png)


 Si recordamos una excepción es un evento, que ocurre durante la ejecución de un programa, que interrumpe el flujo normal de las instrucciones del programa.
 
 
# Modulo 5
## Pregunta 31: Muestra la salida y explica los resultados en función de los métodos entregados
En el código que se nos indica tenemos los siguientes códigos, donde el cliente usa la interfaz de usuario y guarda un
dato
Clase Cliente

![imagen](src/images/preg31_client.png)
Clase OracleDatabase
![imagen](src/images/preg31_db.png)
Clase InterfazUsuario
![imagen](src/images/preg31_userInterface.png)
dando finalmente la siguiente salida
![imagen](src/images/preg31_output.png)
Lo que ha hecho el código por el lado del cliente es que el cliente inicializa la interfaz de usuario
y solicita que se guarde una ID de un empleado. Ahora, internamente cuando se instanció la clase interfaz de usuario en
su constructor alberga la instrucción de inicializar una db, es por ello que cuando el cliente solicita guardar esta id
a través de la interfaz (usando el método SaveEmployeeID de la interfaz), dicha interfaz hace que la base de datos
inicie el proceso de guardado (es decir, el método de la interfaz a su vez llama al método SaveEmployeeInDatabase de 
la instancia de la bd), que para este caso solo hace una impresión de consola de la id que se le pasó.
## Pregunta 32
## Pregunta 33
## Pregunta 34
## Pregunta 35
## Pregunta 36




Pregunta 1
Pregunta 2
Pregunta 3
