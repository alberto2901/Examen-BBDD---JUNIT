/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.javafx.image.impl.ByteBgraPre.ToByteBgraConv.instance;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Alberto
 */
public class PedidosDaoTest {
    
    public PedidosDaoTest() {
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

    @Test
    public void testGetConexion() {
        PedidosDao instance = new PedidosDao();
        Connection result = instance.getConexion();
        Connection expResult = null;
        assertNotEquals(expResult,result);
    }

    @Test
    public void testRead() {
        PedidosDao instance = new PedidosDao();
        System.out.println("\n---------------");
        System.out.println("Test de Read");
        System.out.println("---------------");
        Pedido expResult = instance.read(11071);
        Pedido result = instance.read(11071);
        
        assertEquals(result.getId(),expResult.getId());
        assertEquals(result.getCliente_id(),expResult.getCliente_id());
        assertEquals(result.getEmpleado_id(),expResult.getEmpleado_id());
        
        Pedido expResult_1 = null;
        Pedido result_1 = instance.read(11000071);
        assertEquals(expResult_1,result_1);
    }

    @Test
    public void testInsert() {
        PedidosDao instance = new PedidosDao();
        System.out.println("\n---------------");
        System.out.println("Test de Insert");
        System.out.println("---------------");
        Date dato_1 = new Date(1996-07-11);
        Date dato_2 = new Date(1996-07-13);
        Date dato_3 = new Date(1996-07-17);
        BigDecimal bd = new BigDecimal(1555.669);
        
        Pedido pedido1 = new Pedido(12097, 5, 9, dato_1, dato_2, dato_3, 2, bd, "test", "test", "test", "test", "test", "test");
        Integer expResult1 = null;
        Integer result = instance.insert(pedido1);
        assertNotEquals(expResult1,result);
        instance.delete(result);
        
        Pedido pedido2 = new Pedido(16477, 5, 9, dato_1, dato_2, dato_3, 20,bd, "test", "test", "test", "test", "test", "test");
        Integer expResult2 = null;
        Integer result2 = instance.insert(pedido2);
        assertEquals(expResult2,result2);
    }
    
    @Test
    public void testUpdate() {
        PedidosDao instance = new PedidosDao();
        System.out.println("\n---------------");
        System.out.println("Test de Update");
        System.out.println("---------------");
        Date dato_1 = new Date(1996-07-11);
        Date dato_2 = new Date(1996-07-13);
        Date dato_3 = new Date(1996-07-17);
        BigDecimal bd = new BigDecimal(1555.669);
        
        Pedido pedido = new Pedido(12097, 5, 9, dato_1, dato_2, dato_3,2,bd, "test", "test", "test", "test", "test", "test");
        Integer resultins = instance.insert(pedido);
        Integer expResult = 1;
        
        Pedido pedidoact = new Pedido(resultins, 5, 9, dato_1, dato_2, dato_3,2,bd, "test", "test", "test", "test", "test", "test");
        Integer result = instance.update(pedidoact);
        assertEquals(expResult,result);
        
        Pedido pedidoerror = new Pedido(resultins, 5, 9, dato_1, dato_2, dato_3,20,bd, "test", "test", "test", "test", "test", "test");
        result = instance.update(pedidoerror);
        assertNotEquals(expResult,result);
        
        instance.delete(resultins);
    }

    @Test
    public void testDelete() {
        PedidosDao instance = new PedidosDao();
        System.out.println("\n---------------");
        System.out.println("Test de Delete");
        System.out.println("---------------");
        Date dato_1 = new Date(1996-07-11);
        Date dato_2 = new Date(1996-07-13);
        Date dato_3 = new Date(1996-07-17);
        BigDecimal bd = new BigDecimal(1555.669);
        
        Pedido pedido = new Pedido(12097, 5, 9, dato_1, dato_2, dato_3,2,bd, "test", "test", "test", "test", "test", "test");
        Integer resultins = instance.insert(pedido);
        Integer expResult = 1;
        Integer result = instance.delete(resultins);
        assertEquals(expResult,result);
        
        expResult = 0;
        Integer resulterror = instance.delete(10257);
        assertEquals(expResult,resulterror);
    }

    @Test
    public void testListar() {
        PedidosDao instance = new PedidosDao();
        System.out.println("\n---------------");
        System.out.println("Test de Listar");
        System.out.println("---------------");
        Integer pos = 1;
        
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(pos);
        assertNotEquals(expResult,result);
    }

}
