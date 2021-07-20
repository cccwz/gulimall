package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cccwz
 * @email 2365503287@qq.com
 * @date 2021-07-20 23:53:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
