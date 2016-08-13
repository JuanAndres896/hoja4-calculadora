/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Juan Andrés García, carné 15046
* ListFactory.java
* Abstract factory que devuelve una AbstractList
* La lista puede subdividirse entre simplemente encadenada, doblemente encadenada o circular.
*/
public class ListFactory {
    
    static boolean instance_flag =false;
    
    public ListFactory() throws SingletonException {
        if (instance_flag){ //Aplicacion del singleton
            throw new SingletonException("Solo se permite crear una lista a la vez");
        }
            else{
                instance_flag = true; //Si ya fue instanciada una calculadora, se cambia la bandera
                System.out.println("Lista creada!");
            }
        
    }
    public AbstractList getList(int i){ //segun el entero que se ingresa, devuelve un tipo de AbstractList
        
        if (i==1){  //Simplemente encadenada
            return new SinglyLinkedList();
        }
        
        if(i==2){   //Doblemente encadenada
            return new DoublyLinkedList();
        }
        else{       //Circular
            return new CircularList();
        }
    }
}
