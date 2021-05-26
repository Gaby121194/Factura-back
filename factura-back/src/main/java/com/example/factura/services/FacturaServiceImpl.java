package com.example.factura.services;

import com.example.factura.entities.Factura;
import com.example.factura.respositories.BaseRepository;
import com.example.factura.respositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> {
    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaServiceImpl(BaseRepository<Factura,Long> baseRepository){
        super(baseRepository);
    }


}
