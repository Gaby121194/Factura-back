package com.example.factura.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "detalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Detalle extends Base{
    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "subtotal")
    private Integer subtotal;

    @ManyToOne(optional = false)
    @JoinColumn(name= "fk_producto")
    private Producto producto;

}
