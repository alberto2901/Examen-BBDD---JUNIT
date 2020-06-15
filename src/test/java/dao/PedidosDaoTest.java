/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
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
        System.out.println("getConexion");
        PedidosDao instance = new PedidosDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
    }

    @Test
    public void testRead() {
        System.out.println("read");
        Integer idPedido = null;
        PedidosDao instance = new PedidosDao();
        Pedido expResult = null;
        Pedido result = instance.read(idPedido);
        assertEquals(expResult, result);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.insert(pedido);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.update(pedido);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer idPedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.delete(idPedido);
        assertEquals(expResult, result);
    }

    @Test
    public void testListar() {
        System.out.println("listar");
        Integer posicion = null;
        PedidosDao instance = new PedidosDao();
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(posicion);
        assertEquals(expResult, result);
    }
    
}
