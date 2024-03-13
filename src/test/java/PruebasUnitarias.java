/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static com.mycompany.puk.PUK.dia_laboral;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carlo
 */
public class PruebasUnitarias {
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void prueba_LUNES() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("LUNES"), false);
    }
    
    @Test
    public void prueba_lunes() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Lunes"), true);
    }
    
    @Test
    public void prueba_MARTES() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("MARTES"), false);
    }
    
    @Test
    public void prueba_Martes() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Martes"), true);
    }

   @Test
    public void prueba_MIERCOLES() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("MIERCOLES"), false);
    }
       @Test
    public void prueba_Miercoles() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Miercoles"), true);
    }
       @Test
    public void prueba_JUEVES() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("JUEVES"), false);
    }
       @Test
    public void prueba_Jueves() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Jueves"), true);
    }
       @Test
    public void prueba_VIERNES() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("VIERNES"), false);
    }
       @Test
    public void prueba_Viernes() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Viernes"), true);
    }
       @Test
    public void prueba_SABADO() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("SABADO"), false);
    }
       @Test
    public void prueba_Sabado() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Sabado"), false);
    }
       @Test
    public void prueba_DOMINGO() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("DOMINGO"), false);
    }
       @Test
    public void prueba_Domingo() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("Domingo"), false);
    }
        @Test
    public void prueba_AMNISTIA() 
    {
        // assertEquals(parametro1, parametro2);
        // PARAMETRO1 debe coincidir con PARAMETRO2
        assertEquals(dia_laboral("AMNISTIA"), false);
    }
    
}