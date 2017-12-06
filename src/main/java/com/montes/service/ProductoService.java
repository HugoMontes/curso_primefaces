/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montes.service;

import com.montes.model.Producto;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "productoService", eager = true)
@ApplicationScoped
public class ProductoService {
    
     private List<Producto> productos;

    @PostConstruct
    public void init() {
        productos = new ArrayList<Producto>();
        productos.add(new Producto(0, "Afterdark", "afternoon"));
        productos.add(new Producto(1, "Afternoon", "afternoon"));
        productos.add(new Producto(2, "Afterwork", "afterwork"));
        productos.add(new Producto(3, "Aristo", "aristo"));
        productos.add(new Producto(4, "Black-Tie", "black-tie"));
        productos.add(new Producto(5, "Blitzer", "blitzer"));
        productos.add(new Producto(6, "Bluesky", "bluesky"));
        productos.add(new Producto(7, "Bootstrap", "bootstrap"));
        productos.add(new Producto(8, "Casablanca", "casablanca"));
        productos.add(new Producto(9, "Cupertino", "cupertino"));
        productos.add(new Producto(10, "Cruze", "cruze"));
        productos.add(new Producto(11, "Dark-Hive", "dark-hive"));
        productos.add(new Producto(12, "Delta", "delta"));
        productos.add(new Producto(13, "Dot-Luv", "dot-luv"));
        productos.add(new Producto(14, "Eggplant", "eggplant"));
        productos.add(new Producto(15, "Excite-Bike", "excite-bike"));
        productos.add(new Producto(16, "Flick", "flick"));
        productos.add(new Producto(17, "Glass-X", "glass-x"));
        productos.add(new Producto(18, "Home", "home"));
        productos.add(new Producto(19, "Hot-Sneaks", "hot-sneaks"));
        productos.add(new Producto(20, "Humanity", "humanity"));
        productos.add(new Producto(21, "Le-Frog", "le-frog"));
        productos.add(new Producto(22, "Midnight", "midnight"));
        productos.add(new Producto(23, "Mint-Choc", "mint-choc"));
        productos.add(new Producto(24, "Overcast", "overcast"));
        productos.add(new Producto(25, "Pepper-Grinder", "pepper-grinder"));
        productos.add(new Producto(26, "Redmond", "redmond"));
        productos.add(new Producto(27, "Rocket", "rocket"));
        productos.add(new Producto(28, "Sam", "sam"));
        productos.add(new Producto(29, "Smoothness", "smoothness"));
        productos.add(new Producto(30, "South-Street", "south-street"));
        productos.add(new Producto(31, "Start", "start"));
        productos.add(new Producto(32, "Sunny", "sunny"));
        productos.add(new Producto(33, "Swanky-Purse", "swanky-purse"));
        productos.add(new Producto(34, "Trontastic", "trontastic"));
        productos.add(new Producto(35, "UI-Darkness", "ui-darkness"));
        productos.add(new Producto(36, "UI-Lightness", "ui-lightness"));
        productos.add(new Producto(37, "Vader", "vader"));
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
