package com.nodepower.homemoney.general;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-06-16 18:48
 */
public interface GeneralDAO<T> extends Mapper<T>, MySqlMapper<T> {
}
