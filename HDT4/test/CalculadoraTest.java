/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Juan Andrés García, carné 15046
* CalculadoraTest.java
* Pruebas unitarias para las distintas implementaciones de calculadora post-fix
*/

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanAndrés
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of finalize method, of class Calculadora.
     */
   

    /**
     * Test of evaluar method, of class Calculadora.
     */
    @Test
    public void testEvaluar() {
        System.out.println("evaluar");
        String readItem = "0 0 +";
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.evaluar(readItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        String readItem = "0 0 +";
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.calcular(readItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class Calculadora.
     */
    /*@Test
    public void testFinalize() {
        System.out.println("finalize");
        Calculadora instance = new Calculadora();
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
}
