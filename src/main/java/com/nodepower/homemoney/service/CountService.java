package com.nodepower.homemoney.service;

import com.nodepower.homemoney.commen.R;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-29 12:57
 */
public interface CountService {
    public R personCountByBpId(int bpid, String date, int bid);

    public R familyCountByBfId(int bfid, String date, int bid);

    public R typeCountByBType(String type,String date,int bid);

    public R countByBpIdAndType(int bpid,String type,int bid,String date);

    public R YearPersonCountByBpId(int bpid, String date, int bid);

    public R YearFamilyCountByBfId(int bfid, String date, int bid);

    public R YearTypeCountByBType(String type,String date,int bid);

    public R YearCountByBpIdAndType(int bpid,String type,int bid,String date);
}
