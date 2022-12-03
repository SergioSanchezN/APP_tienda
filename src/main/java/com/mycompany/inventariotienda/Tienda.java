/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariotienda;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class Tienda {

    //Atributos
    private Conexion conexion;
    private List<Cliente> clientes =  new ArrayList<>();
    private List<Producto> productos =  new ArrayList<>();

    //Constructor
    public Tienda(){
        //Clientes
        Cliente cliente1 = new Cliente("Jorge");
        Cliente cliente2 = new Cliente("Sam");
        Cliente cliente3 = new Cliente("Dana");
        //Productos
        Producto producto1 = new Producto("Piña",4000,30);
        Producto producto2 = new Producto("Manzana",1500,12);
        Producto producto3 = new Producto("Tomate",500,20);

        //Base de datos
        this.conexion = new Conexion();

        //Atributos iniciales
        this.clientes.add(cliente1);
        this.clientes.add(cliente2);
        this.clientes.add(cliente3);  
        this.productos.add(producto1);
        this.productos.add(producto2);
        this.productos.add(producto3);
    }
    
    public List<Cliente> get_clientes(){
        return clientes;
    }
    
    public List<Producto> get_productos(){
        return productos;
    }
    
    //Metodo de compra
    public void crear_factura(String Cliente){
        
    }
    
    //Metodo de recibir pedido
    public void recibir_pedido(){
    
    }

    public void confirmar_venta(Factura factura){
    }

            


}
