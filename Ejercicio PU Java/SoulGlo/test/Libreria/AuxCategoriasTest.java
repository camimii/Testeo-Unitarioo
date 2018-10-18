/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila
 */
public class AuxCategoriasTest {
    
    public AuxCategoriasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Agregar method, of class AuxCategorias.
     */
    @Test
    public void testAgregar_Categoria() {
    /** La prueba falla porque el arraylist DatosCategorias no ha sido inicializado,
        además está declarado como private y no se puede acceder para evaluarlo.**/
    
        
        AuxCategorias instance = new AuxCategorias();
        Categoria nueva = new Categoria(1234, "Carla", "Descripción");
        instance.Agregar(nueva);
        int esperado = 1;
    /**
     * Correccion: agregar metodo getDatosCategorias();
     */
        //Assert
        assertEquals(esperado,instance.DatosCategorias.size() );  
    }

    /**
     * Test of Agregar method, of class AuxCategorias.
     */
    @Test
    public void testAgregar_3args() {
        
       /** La prueba falla porque el arraylist DatosCategorias no ha sido inicializado,
        además está declarado como private y no se puede acceder para evaluarlo.**/
        
        //Arrange
        int esperado = 1;
        //Act
        AuxCategorias instance = new AuxCategorias();
        instance.Agregar(1234,"Carla", "Descripción");
        int res = instance.DatosCategorias.size();
        //Assert
        assertEquals(esperado,res );
    }
    /**
     * Test of Eliminar method, of class AuxCategorias.
     */
    @Test
    public void testEliminar() {
       /** La prueba falla porque el arraylist DatosCategorias no ha sido inicializado,
        además está declarado como private y no se puede acceder para evaluarlo.**/
    }

    /**
     * Test of Modificar method, of class AuxCategorias.
     */
    @Test
    public void testModificar_Categoria() {
        /** La prueba falla porque el arraylist DatosCategorias no ha sido inicializado,
        además está declarado como private y no se puede acceder para evaluarlo.**/
    }

    /**
     * Test of Modificar method, of class AuxCategorias.
     */
    @Test
    public void testModificar_3args() {
        /** La prueba falla porque el arraylist DatosCategorias no ha sido inicializado,
        además está declarado como private y no se puede acceder para evaluarlo.**/
    }
    
}
