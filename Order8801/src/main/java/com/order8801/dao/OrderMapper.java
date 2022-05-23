package com.order8801.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Mapper
public interface OrderMapper {
    /**
     * 生成订单
     * @param id 订单id
     * @param count 数量
     */
//    void  create(int  id,int count);
    int  create();
}
