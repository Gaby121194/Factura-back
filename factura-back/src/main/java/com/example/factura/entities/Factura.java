package com.example.factura.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Factura extends Base {


    @Column(name = "nombreCliente")
    private String nombreCliente;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "ciudadCliente")
    private String ciudadCliente;

    @Column(name = "compañiaCliente")
    private String compañiaCliente;

    @Column(name = "telefonoCliente")
    private String telefonoCliente;

    @Column(name= "total")
    private Integer total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable( name = "factura_producto",
            joinColumns = @JoinColumn(name = "factura_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos = new ArrayList<Producto>();

}
