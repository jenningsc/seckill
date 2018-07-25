package com.example.seckill.service;

import com.example.seckill.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeckillService {

    @Autowired
    private OrderDao orderDao;

    public boolean insertSeckillOrder(long userId,long goodsId,long orderId){
        return orderDao.insertSeckillOrder(userId,goodsId,orderId)>0;
    }
}
