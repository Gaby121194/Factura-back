package com.example.factura.respositories;

import com.example.factura.entities.Detalle;
import com.example.factura.entities.Factura;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends BaseRepository<Detalle,Long> {

}
