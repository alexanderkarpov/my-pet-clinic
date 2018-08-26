package com.example.mypetclinic.service;

import com.example.mypetclinic.model.BaseEntity;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AbstractMapBasedService<V extends BaseEntity> implements CrudService<V, Long> {

    private final Map<Long, V> map = new ConcurrentHashMap<>();

    @Override
    public Set<V> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public V findById(Long id) {
        return map.get(id);
    }

    @Override
    public V save(V obj) {
        return map.put(obj.getId(), obj);
    }

    @Override
    public void delete(V obj) {
        deleteById(obj.getId());
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
}
