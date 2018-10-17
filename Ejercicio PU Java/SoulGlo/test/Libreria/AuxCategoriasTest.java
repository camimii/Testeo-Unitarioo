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
    /**    
        //NO SE PUEDE HACER PORQUE DatosCategorías ESTÁ DECLARADO COMO PRIVADO
    **/   
    }

    /**
     * Test of Agregar method, of class AuxCategorias.
     */
    @Test(expected=NullPointerException.class)
    public void testAgregar_3args() {
        //Arrange
        int idcat = 1234;
        String nom = "Carla";
        String desc = "Descripción";
        
        //Act
        AuxCategorias instance = new AuxCategorias();
        Categoria nueva = new Categoria(idcat, nom, desc);
        ArrayList<Categoria> esperado = new ArrayList<Categoria>();
        esperado.add(nueva);
        int result = instance.Agregar(idcat, nom, desc);
        //Assert
        assertSame(esperado, result);
    }

    /**
     * Test of Eliminar method, of class AuxCategorias.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        int idCat = 0;
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Eliminar(idCat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class AuxCategorias.
     */
    @Test
    public void testModificar_Categoria() {
        System.out.println("Modificar");
        Categoria CatModificada = null;
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Modificar(CatModificada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class AuxCategorias.
     */
    @Test
    public void testModificar_3args() {
        System.out.println("Modificar");
        int idCategoria = 0;
        String nuevoNombre = "";
        String nuevaDescripcion = "";
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Modificar(idCategoria, nuevoNombre, nuevaDescripcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
