package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cccwz
 * @email 2365503287@qq.com
 * @date 2021-07-20 18:57:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
