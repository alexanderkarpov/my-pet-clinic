package com.example.mypetclinic.service.map;

import com.example.mypetclinic.model.BaseEntity;
import com.example.mypetclinic.service.CrudService;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class AbstractMapBasedService<V extends BaseEntity> implements CrudService<V, Long> {

    private final AtomicLong idGenerator = new AtomicLong();

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
        long id = Optional.ofNullable(obj.getId()).orElseGet(idGenerator::incrementAndGet);
        obj.setId(id);
        return map.put(id, obj);
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
