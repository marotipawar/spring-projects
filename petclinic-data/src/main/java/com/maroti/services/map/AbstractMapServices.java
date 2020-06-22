package com.maroti.services.map;

import com.maroti.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapServices<T extends BaseEntity, ID extends Integer> {

    protected Map<Integer,T> map = new HashMap<>();

    T findById(ID id)
    {
        return map.get(id);
    }

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }

    T save(T t)
    {
        if(t!=null)
        {
            if(t.getId()==null)
            {
                t.setId(getMaxId());
            }
            map.put(t.getId(), t);
        }else{
            throw new RuntimeException("Object cannot be null");
        }


        return t;
    }

    void deleteById(ID id)
    {
        map.remove(id);
    }
    void delete(T t)
    {
        map.entrySet().removeIf(entry->entry.getValue().equals(t));
    }

    private Integer getMaxId()
    {
        Integer nextId=null;
        try {
            nextId=Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e)
        {
            nextId=1;
        }

        return nextId;
    }

}
