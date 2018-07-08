package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//这个类就是表的一个映射
@Entity
@DynamicUpdate
@Data//里面包含了get set tostring方法
public class ProductCategory {
    /**
     * 类目id.
     */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**
     * 类目名字.
     */
    private String categoryName;
    /**
     * 类目编号.
     */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
    //要进行repository的find查询一定要给表构造一个无参的构造方法
    public ProductCategory() {
    }
    //    private Date createTime;
//    private Date updateTime;
}