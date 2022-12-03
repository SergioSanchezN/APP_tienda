/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inventariotienda;
import java.math.BigDecimal;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class InventarioTienda {
    String prdNmb  = JOptionPane.showInputDialog("Indique el Producto");
    Double prdPrc  = Double.parseDouble(JOptionPane.showInputDialog("Indique el Precio"));
    //Clientes
    Cliente cliente1 = new Cliente("Jorge");
    Cliente cliente2 = new Cliente("Sam");
    Cliente cliente3 = new Cliente("Dana");
    
    //Productos
    Producto producto1 = new Producto("Piña",4000,30);
    Producto producto2 = new Producto("Manzana",1500,12);
    Producto producto3 = new Producto("Tomate",500,20);
       
    //public static Observer o1 = new FacturaObserver();
    public static void main( String args[] ) {
        //Tienda tienda = new Tienda();
        //IHM ihm = new IHM(tienda);
        JOptionPane.showMessageDialog(null, "Simulación de un inventario");
        String prdNmb  = JOptionPane.showInputDialog("Indique el Producto");
        Double prdPrc  = Double.parseDouble(JOptionPane.showInputDialog("Indique el Precio"));
    } 
}

























/*
public static void main(String[] args) {
        /*Declaramos una variable para almacenar la conexión que nos va a
        devolver el método Conexion(). Primero la iniciamos en null.
        Conexion conex=null;

        /*Almacenamos lo que nos devuelve el método Conexion()
        en la variable conex
        conex = new Conexion();

        // Si la variable objeto conex es diferente de nulo
        if(conex != null){
            // Informamos que la conexión es correcta
            System.out.println("Conectado correctamente");
        }else{ // Sino informamos que no nos podemos conectar.
            System.out.println("No has podido conectarte");
        }
    }
*/