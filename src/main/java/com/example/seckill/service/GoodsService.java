package com.example.seckill.service;

import com.example.seckill.dao.GoodsDao;
import com.example.seckill.domain.Goods;
import com.example.seckill.domain.SeckillGoods;
import com.example.seckill.vo.GoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;


    public List<Goods> listgoods(){
        return goodsDao.listgoods();
    }

    public  List<GoodVO> goodVOList(){
        return goodsDao.listSeckillGoods();
    }

    public boolean reduceStock(long goodsId){

        int ret=goodsDao.reduceStock(goodsId);
        return ret>0;

    }

    public GoodVO getGoodsVOByGoodsId(long goodsId){
        return goodsDao.getGoodsVOByGoodsId(goodsId);
    }

}
