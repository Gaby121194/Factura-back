package com.example.factura.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto extends Base{
    @Column(name = "nombreProducto")
    private String nombreProducto;

    @Column(name = "descripcionProducto")
    private String descripcionProducto;

    @Column(name = "costo")
    private Integer costo;



}
