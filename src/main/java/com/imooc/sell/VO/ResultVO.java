package com.imooc.sell.VO;


import lombok.Data;

import java.io.Serializable;

//http请求返回的最外层对象
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 5286690861994412308L;
    //debug number
    private Integer code;
    //hints
    private String message;
    //Items
    private T data;
}
