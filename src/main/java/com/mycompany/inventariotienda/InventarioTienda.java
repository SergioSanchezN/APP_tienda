/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inventariotienda;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class InventarioTienda {
    String prdNmb  = JOptionPane.showInputDialog("Indique el Producto");
    Double prdPrc  = Double.parseDouble(JOptionPane.showInputDialog("Indique el Precio"));
    
    public static void main( String args[] ) {
        Conexion con = new Conexion();
       
    }
    /*
    //public static Observer o1 = new FacturaObserver();
    public static void main( String args[] ) {
        Conexion con = new Conexion();
        
        //Clientes
        List<Cliente> clientes =  new ArrayList<>();
        clientes.add(new Cliente("Jorge"));
        clientes.add(new Cliente("Sam"));
        clientes.add(new Cliente("Dana"));
        
        //Productos
        List<Producto> productos =  new ArrayList<>();
        productos.add(new Producto("Piña",4000,30));
        productos.add(new Producto("Manzana",1500,12));
        productos.add(new Producto("Tomate",500,20));
        
        //Elegir cliente
        JOptionPane.showMessageDialog(null, "Simulación de un inventario tienda");
        int salir = 0;
        while(salir == 0){
            int cliente_nombre  = Integer.parseInt(JOptionPane.showInputDialog(
                    "Indique el cogido del cliente:\n 1.Jorge\n 2.Sam\n 3.Dana"));
            String fecha  = JOptionPane.showInputDialog("Indique la fecha de hoy");
            Factura factura = new Factura(clientes.get(cliente_nombre-1),fecha);
            int facturar = 0;
            while(facturar == 0){
                int id_producto = Integer.parseInt(JOptionPane.showInputDialog(
                        "Indique el Producto:\n 1.Piña\n 2.Manzana\n 3.Tomate"));           
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                        "ingrese la cantidad de " + productos.get(id_producto-1).get_nombre()+
                        "\nque quiere comprar"));            
                factura.añadir_venta(new Venta(productos.get(id_producto-1),cantidad));
                
                JOptionPane.showMessageDialog(null, "total: "+factura.calcular_total());
                
                facturar = Integer.parseInt(JOptionPane.showInputDialog(
                        "Elija una opcion: 0.Agregar mas productos\n 1.Facturar productos")); 
                               
            }
            salir = Integer.parseInt(JOptionPane.showInputDialog(
                        "Elija una opcion:\n 0.Continuar facturando\n 1.Salir de la aplicacion"));
        }
    
        
        //Tienda tienda = new Tienda();
        //IHM ihm = new IHM(tienda);
    } */
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