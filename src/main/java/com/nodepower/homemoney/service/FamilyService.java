package com.nodepower.homemoney.service;

import com.nodepower.homemoney.beans.Family;
import com.nodepower.homemoney.commen.R;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-29 11:12
 */
public interface FamilyService {
    public R selectFamily(Integer fid);

    public R addFamily(Family family);

    public R updateFamily(int fid);

    public R deleteFamily(int fid);

    public R selectFamilyDetail(int fid);
}
