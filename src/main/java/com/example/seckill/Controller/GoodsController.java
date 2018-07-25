package com.example.seckill.Controller;


import com.example.seckill.dao.OrderDao;
import com.example.seckill.domain.Goods;
import com.example.seckill.service.GoodsService;
import com.example.seckill.service.SeckillService;
import com.example.seckill.vo.GoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private SeckillService seckillService;

    @GetMapping("/to_list")
    public List<Goods> list(){
        return goodsService.listgoods();
    }

    @GetMapping("/vo_list")
    public List<GoodVO> goodsVOList(){
        return goodsService.goodVOList();
    }

    @GetMapping("/induce/{gid}")
    public boolean reduceStock(@PathVariable("gid") long goodsId){
        return goodsService.reduceStock(goodsId);
    }

    @GetMapping("/good/{gid}")
    public GoodVO getGoodsVOByGoodsId(@PathVariable("gid") long goodsId){
        return goodsService.getGoodsVOByGoodsId(goodsId);
    }

    @GetMapping("/insert/{gid}")
    public boolean insertSeckillOrder(@PathVariable("gid") long goodsId){
        return seckillService.insertSeckillOrder(1L,goodsId,1L);
    }

}
