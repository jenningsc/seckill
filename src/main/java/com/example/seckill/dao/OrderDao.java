package com.example.seckill.dao;


import com.example.seckill.domain.SeckillOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderDao {



    @Insert("insert into seckill_order(user_id,goods_id,order_id) values(#{userId},#{goodsId},#{orderId})")
    int insertSeckillOrder(@Param("userId") Long userId, @Param("goodsId") long goodsId,@Param("orderId") long orderId);
}
