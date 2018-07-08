package com.imooc.sell.VO;


import lombok.Data;

//http请求返回的最外层对象
@Data
public class ResultVO<T> {
    //debug number
    private Integer code;
    //hints
    private String message;
    //Items
    private T data;
}
