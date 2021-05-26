package com.example.factura.controllers;

import com.example.factura.entities.Factura;
import com.example.factura.entities.Producto;
import com.example.factura.services.FacturaServiceImpl;
import com.example.factura.services.ProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl> {


}