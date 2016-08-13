/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Juan Andrés García, carné 15046
* main.java
* Esta clase utiliza un objeto tipo calculadora y permite al usuario decidir entre usar un vector o lista para implementarla.
* La lista puede subdividirse entre simplemente encadenada, doblemente encadenada o circular.
*/
public class ListFactory {
    
    public AbstractList getList(int i){
        
        if (i==1){
            return new SinglyLinkedList();
        }
        
        if(i==2){
            return new DoublyLinkedList();
        }
        else{
            return new CircularList();
        }
    }
}
