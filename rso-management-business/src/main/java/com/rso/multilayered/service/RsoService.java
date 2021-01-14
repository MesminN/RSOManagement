package com.rso.multilayered.service;

import com.rso.multilayered.dao.implementations.RsoDAO;
import com.rso.multilayered.model.RSO;

import java.util.List;

public class RsoService {


    private RsoDAO rsoDao;

    public RSO getByKey(int key) {
        RSO rso = null;
        if (rsoDao.findByKey(key).isPresent()) {
            rso = rsoDao.findByKey(key).get();
        }
        return rso;
    }

    public List<RSO> getAll() {
        return rsoDao.findAll();
    }
}
