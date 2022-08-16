package com.nodepower.homemoney.commen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-28 22:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    //相应给前端的状态码
    private int code;
    //相应给前端的提示信息
    private String msg;
    //相应给前端的数据
    private Object data;
}
