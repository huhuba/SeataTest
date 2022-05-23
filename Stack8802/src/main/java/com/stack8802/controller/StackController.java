package com.stack8802.controller;

import com.stack8802.mapper.StackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackController {
    @Autowired
    private StackMapper  stackMapper;
    @GetMapping("/update")
    public  String update(){
        stackMapper.updateStack();
        return "update ok";
    }
}
