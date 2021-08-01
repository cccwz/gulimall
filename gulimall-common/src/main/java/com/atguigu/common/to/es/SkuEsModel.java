package com.atguigu.common.to.es;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/*{
        "skuId": { "type": "long" },
        "spuId": { "type": "keyword" }, # 精确检索，不分词
        "skuTitle": {
        "type": "text", # 全文检索
        "analyzer": "ik_smart" # 分词器
        },
        "skuPrice": { "type": "keyword" },
        "skuImg": {
        "type": "keyword",
        "index": false, # false 不可被检索
        "doc_values": false # false 不可被聚合
        },
        "saleCount":{ "type":"long" }, # 商品销量
        "hasStock": { "type": "boolean" }, # 商品是否有库存
        "hotScore": { "type": "long"  }, # 商品热度评分
        "brandId":  { "type": "long" }, # 品牌id
        "catalogId": { "type": "long"  }, # 分类id
        "brandName": {	# 品牌名，只用来查看，不用来检索和聚合
        "type": "keyword",
        "index": false,
        "doc_values": false
        },
        "brandImg":{	# 品牌图片，只用来查看，不用来检索和聚合
        "type": "keyword",
        "index": false,
        "doc_values": false
        },
        "catalogName": {	# 分类名，只用来查看，不用来检索和聚合
        "type": "keyword",
        "index": false,
        "doc_values": false
        },
        "attrs": {	# 属性对象
        "type": "nested",	# 嵌入式，内部属性
        "properties": {
        "attrId": {"type": "long"  },
        "attrName": {	# 属性名
        "type": "keyword",
        "index": false,
        "doc_values": false
        },
        "attrValue": { "type": "keyword" }	# 属性值
        }
        }
        }*/
@Data
public class SkuEsModel implements Serializable{
    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private Long catalogId;

    private String brandName;

    private String brandImg;

    private String catalogName;

    private List<Attrs> attrs;

    /**
     *  检索属性
     */
    @Data
    public static class Attrs implements Serializable {
        private Long attrId;

        private String attrName;

        private String attrValue;
    }

}
