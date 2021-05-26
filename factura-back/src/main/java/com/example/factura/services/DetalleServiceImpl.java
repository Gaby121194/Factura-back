package com.example.factura.services;

import com.example.factura.entities.Detalle;
import com.example.factura.entities.Producto;
import com.example.factura.respositories.BaseRepository;
import com.example.factura.respositories.DetalleRepository;
import com.example.factura.respositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServiceImpl extends BaseServiceImpl<Detalle,Long> implements DetalleService {
    @Autowired
    private DetalleRepository detalleRepository;

    public DetalleServiceImpl(BaseRepository<Detalle,Long> baseRepository){
        super(baseRepository);
    }

}