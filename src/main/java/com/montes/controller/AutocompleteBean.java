/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montes.controller;

import com.montes.model.Producto;
import com.montes.service.ProductoService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


/**
 *
 * @author MONTES
 */
@ManagedBean
public class AutocompleteBean {
    
    private Producto producto;

    @ManagedProperty("#{productoService}")
    private ProductoService service;
    
    public AutocompleteBean(){
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ProductoService getService() {
        return service;
    }

    public void setService(ProductoService service) {
        this.service = service;
    }
    
    public List<Producto> completeProducto(String query) {
        List<Producto> allProductos = service.getProductos();
        
        List<Producto> productos = new ArrayList<Producto>();
        for (int i = 0; i < allProductos.size(); i++) {
            Producto producto = allProductos.get(i);
            if(producto.getNombre().toLowerCase().startsWith(query)) {
                productos.add(producto);
            }
        }
         
        return productos;
    }
}
