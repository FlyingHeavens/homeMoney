package com.nodepower.homemoney.service.Impl;

import com.nodepower.homemoney.beans.Bill;
import com.nodepower.homemoney.beans.Family;
import com.nodepower.homemoney.commen.R;
import com.nodepower.homemoney.commen.ResStatus;
import com.nodepower.homemoney.dao.FamilyMapper;
import com.nodepower.homemoney.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-29 11:15
 */
@Service
public class FamilyServiceImpl implements FamilyService {

    @Autowired
    private FamilyMapper familyMapper;

    @Override
    public R selectFamily(Integer fid) {
        List<Family> list = familyMapper.selectByExample(fid);
        R r = new R(ResStatus.OK, "success", list);
        return r;
    }

    @Override
    public R addFamily(@RequestBody Family family) {
        int i = familyMapper.insert(family);
        if(i > 0){
            return new R(ResStatus.OK,"success",null);
        }else{
            return new R(ResStatus.NO,"fail",null);
        }
    }

    @Override
    public R updateFamily(int fid) {
        int i = familyMapper.updateByExample(fid);
        if(i>0){
            return new R(ResStatus.OK,"update success",null);
        }else{
            return new R(ResStatus.NO,"update fail",null);
        }
    }

    @Override
    public R deleteFamily(int fid) {
        int i = familyMapper.deleteByExample(fid);
        if(i>0){
            return new R(ResStatus.OK,"delete success",null);
        }else{
            return new R(ResStatus.NO,"delete fail",null);
        }
    }

    @Override
    public R selectFamilyDetail(int fid) {
        Example example = new Example(Family.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("fid",fid);
        List<Family> productParams = familyMapper.selectByExample(example);
        if(productParams.size() > 0){
            return new R(ResStatus.OK,"success",productParams.get(0));
        }else{
            return new R(ResStatus.NO,"没有此账户",null);
        }
    }


}
