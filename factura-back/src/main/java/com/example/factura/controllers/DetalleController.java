package com.example.factura.controllers;


import com.example.factura.entities.Detalle;
import com.example.factura.entities.Factura;
import com.example.factura.services.DetalleServiceImpl;
import com.example.factura.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detalles")
public class DetalleController extends BaseControllerImpl<Detalle, DetalleServiceImpl> {


}
