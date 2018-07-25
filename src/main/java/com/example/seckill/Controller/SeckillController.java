package com.example.seckill.Controller;


import com.example.seckill.service.GoodsService;
import com.example.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seckill")
public class SeckillController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private SeckillService seckillService;

    @GetMapping("/user/{userId}/goods/{goodsId}")
    public boolean seckill(@PathVariable("userId") long userId,@PathVariable("goodsId") long goodsId){
        boolean insret=seckillService.insertSeckillOrder(userId,goodsId,1L);

        if(insret){
            if(goodsService.reduceStock(goodsId)){
                return true;
            }
        }

        return false;
    }
}
