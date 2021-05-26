package com.example.factura.services;

import com.example.factura.entities.Producto;
import com.example.factura.respositories.BaseRepository;
import com.example.factura.respositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository){
        super(baseRepository);
    }

}
