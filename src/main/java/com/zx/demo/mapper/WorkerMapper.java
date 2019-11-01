package com.zx.demo.mapper;
import com.zx.demo.model.Worker;

import java.util.Date;

public interface
WorkerMapper {
    public int save(Integer id, String name, Integer age, String address, Integer salary, Date date);

    public Worker findById(int id);

    public void update(Integer id, String name, Integer age, String address, Integer salary, Date date);

    public void delete(Integer id);

}
