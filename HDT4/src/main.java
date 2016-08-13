/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Juan Andrés García, carné 15046
* main.java
* Esta clase utiliza un objeto tipo calculadora y permite al usuario decidir entre usar un vector o lista para implementarla.
* La lista puede subdividirse entre simplemente encadenada, doblemente encadenada o circular.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

       
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in); /*en la siguiente linea hay que ingresar la dirección completa del archivo de texto*/
        FileReader f = new FileReader("C:\\Users\\Rodrigo\\Documents\\2do ciclo 2016\\ADT\\HDT4\\src\\datos.txt");
        BufferedReader b = new BufferedReader(f);//BufferedReader es un objeto que puede leer archivos de texto y guardarlos en Strings
        String cadena = b.readLine();   //se lee la primera linea del archivo de texto
        int resultado;  
        String op;  //variable que almacena la opcion ingresada por el usuario en los menus
        int opn;    //conversion de op a entero
        
        ListFactory fabrica;    //fabrica que devolvera un tipo de lista
        AbstractList lista;     //lista que se usara en la calculadora
        
        System.out.println("Bienvenido a la calculadora. Elija el numero con la implementacion que desea usar:\n"
                + " 1) Vector\n 2) Lista"); //instrucciones iniciales
        op = teclado.nextLine();    //se lee la opcion ingresada
        while (!op.equals("1") && !op.equals("2")){ //programacion defensiva
            System.out.println("Error, ingrese como opcion 1 o 2:\n"
                    + " 1) Vector\n 2) Lista");
            op = teclado.nextLine();
        }
        
        if (op.equals("1")){    //si se elije el vector, se procede a usar la calculadora con este metodo
            Stack pila = new StackVector<String>();     //se crea un nuevo stackVector
            Calculadora calc = new Calculadora(pila);   //se crea una nueva calculadora
            System.out.println("A continuacion se encuentran los resultados de las operaciones:");
            while (cadena != null){//este while permite operar varias lineas del archivo
                pila.empty();   //se vacia el vector antes de comenzar
                resultado = calc.evaluar(cadena);      //se usa un metodo de la calculadora para realizar la operacion que hay en la linea
                System.out.println(cadena+" = "+resultado);    //se imprime la operacion junto a su resultado
                cadena = b.readLine();  //se lee la linea siguiente
            }
        }
        
        if (op.equals("2")){        //si se elije la lista, ahora se pide que elija cual tipo de lista quiere usar
            System.out.println("\nAhora elija la implementacion que desea usar para la lista:\n"
                    + " 1) Lista simplemente encadenada\n 2) Lista doblemente encadenada\n 3) Lista circular");
            op=teclado.nextLine();
            while (!op.equals("1") && !op.equals("2") && !op.equals("3")){      //programacion defensiva
                System.out.println("Error, ingrese como opcion 1, 2 o 3:\n"
                    + " 1) Lista simplemente encadenada\n 2) Lista doblemente encadenada\n 3) Lista circular");
                op = teclado.nextLine();
            }
            opn = Integer.parseInt(op); //se convierte la opcion ingresada a entero
            fabrica = new ListFactory();//se crea una nueva ListFactoy
            lista = fabrica.getList(opn);//se usa la opcion ingresada como parametro para devolver el tipo de lista deseado
            Calculadora calc = new Calculadora(lista);  //se crea una instancia distinta, ahora se ingresa como parametro una lista
            System.out.println("A continuacion se encuentran los resultados de las operaciones:");
            while (cadena != null){//este while permite operar varias lineas del archivo
                /* Aqui se ingresa el metodo para vaciar la lista:
                lista.empty();   //se vacia el vector antes de comenzar
                */
                resultado = calc.calcular(cadena);      //se usa un metodo de la calculadora para realizar la operacion que hay en la linea
                System.out.println(cadena+" = "+resultado);    //se imprime la operacion junto a su resultado
                cadena = b.readLine();  //se lee la linea siguiente
            }
        }
        
    }
    
}
