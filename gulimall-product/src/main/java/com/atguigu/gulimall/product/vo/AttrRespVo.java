package com.atguigu.gulimall.product.vo;

import lombok.Data;

//多包含了分组名字和分类名字
@Data
public class AttrRespVo extends AttrVo{

    /**
     * catelogName：所属的分类名字
     * groupName：所属的分组名字
     */
    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
