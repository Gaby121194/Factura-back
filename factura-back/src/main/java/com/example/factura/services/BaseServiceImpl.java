package com.example.factura.services;

import com.example.factura.entities.Base;
import com.example.factura.entities.Factura;
import com.example.factura.respositories.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entity = baseRepository.findById(id);
            return entity.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E update(E entity, ID id) throws Exception {
        try {
            Optional<E> optionalEntity = baseRepository.findById(id);

            E updateEntity = optionalEntity.get();

            updateEntity = baseRepository.save(updateEntity);
            return updateEntity;

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(ID id) throws Exception {
        try {
            if( baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            }
            else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
