package com.order8801.controller;

import com.order8801.dao.OrderMapper;
import com.order8801.openfeigncliect.IStackClient;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private IStackClient stackClient;

    @GetMapping(value = "/create/{id}/{count}")
    @GlobalTransactional
    public String  create(@PathVariable(name = "id") int id, @PathVariable(name = "count") int count) {

        orderMapper.create();//生成订单
        stackClient.update();
        return "create ok!";
    }
}
