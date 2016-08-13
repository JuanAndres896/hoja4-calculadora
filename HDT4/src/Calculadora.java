/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Juan Andrés García, carné 15046
* Calculadora.java
* Esta clase usara el vector o la lista para realizar las operaciones post-fix
* Tendra dos formas de ser instanciada, segun el parametro que se le ingrese.
*/
public class Calculadora {
    Stack pila;
    List lista;
    static boolean instance_flag =false;
    /**
     * Este es el constructor, en donde se le asigna un tipo de Stack
     * @param pila Objeto tipo Stack, o sea cualquiera de sus implementaciones
     */
    public Calculadora(Stack pila) throws SingletonException {
        if (instance_flag){ //Aplicacion del singleton
            throw new SingletonException("Solo se permite abrir una calculadora a la vez");
        }
            else{
                instance_flag = true; //Si ya fue instanciada una calculadora, se cambia la bandera
                System.out.println("Calculadora abierta!");
            }
        this.pila = pila;
        
    }
    public Calculadora (List lista) throws SingletonException {
        if (instance_flag){ //Aplicacion del singleton
            throw new SingletonException("Solo se permite abrir una calculadora a la vez");
        }
            else{
                instance_flag = true; //Si ya fue instanciada una calculadora, se cambia la bandera
                System.out.println("Calculadora abierta!");
            }
        this.lista = lista;
    }
    
    /**
     * Este metodo usa el VECTOS para leer las instrucciones y devolver el valor resultante.
     * @param readItem un String en donde recibe toda la cadena de caracteres que esta en archivo.txt para su identificacion como operandos u operaciones
     * @return el resultado de las operaciones dadas en el archivo.txt
     */
    public int evaluar(String readItem){
        String caracter, variableS; //la variable caracter se utiliza para almacenar temporalmente cada caracter de la cadena, variableS se utilizará temporalmente para guardar el resultado de una operacion como un string para ser subido al stack
        int cantidadE = 0; // (recibe el tamaño del stack) Esta variable sera el contador para saber cuantas veces debe hacerce "pop" del stack para obtener los operandos y operarlos
        int variable = 0; // variable estará encargada de tener el resultado total, conforme se vayan realizando las operaciones
        int temp = 0; // temp es una variable temporal que almacenara cada a un operando cada vez que se haga "pop" del stack, luego se operara y se repetira el proceso
        //Este ciclo va a recorrer la cadena para identificar cada caracter y realizar una accion dependiendo de que sea
        for(int i = 0; i < readItem.length(); i++){
            caracter = Character.toString(readItem.charAt(i)); //aqui se obtiene temporalmente cada caracter y se convierte a un String para su manejo
            //Este primer if identifica a los posibles operandos (numeros de 0-9) y los sube al stack
            if(caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9")){
                pila.push(caracter); //se llama al metodo "push" del stack que se esta utilizando y se sube el operando a la pila
            // este if hace la operacion de suma
            }else if(caracter.equals("+")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                //este ciclo interno, va haciando "pop" cantidadE veces para sumar cada operando en el stack con variable (que maneja el resultado)
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp + variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("-")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp - variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("*")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp * variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("/")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop()) / variable;
                }
                variableS = Integer.toString(temp);
                pila.push(variableS);
            }
        }
        return Integer.parseInt((String) pila.pop());
    }
    
    public int calcular(String readItem){
        int resultado = 0;
        /*
        Aqui pone el metodo para hacer los calculos con la lista
        */
        return resultado;
    }
    
}
