package com.zx.demo.service;


import com.zx.demo.mapper.WorkerMapper;
import com.zx.demo.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class WorkerServiceImpl {

    @Autowired
    private WorkerMapper workerMapper;

    public void register(Integer id, String name, Integer age, String address,Integer salary,Date date) {
        workerMapper.save(id,name,age,address,salary,date);
    }

    public Worker find(Integer id) {
        return workerMapper.findById(id);
    }

    public void delete(Integer id){
        workerMapper.delete(id);
    }

    public void update(Integer id, String name, Integer age, String address, Integer salary, Date date){
        workerMapper.update(id, name, age, address, salary, date);
    }

}
