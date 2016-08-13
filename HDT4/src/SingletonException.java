/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Juan Andrés García, carné 15046
* Calculadora.java
* Esta clase crea un nuevo tipo de excepcion que hereda a RuntimeException.
* Se usa para advertir al usuario de que ya se ha instanciado un objeto con anterioridad.
*/
 public class SingletonException extends RuntimeException{

 public SingletonException(){
    super();
 }

 public SingletonException(String s){
    super(s);
 }
}

