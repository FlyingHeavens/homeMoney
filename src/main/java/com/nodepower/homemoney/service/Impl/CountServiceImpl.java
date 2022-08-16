package com.nodepower.homemoney.service.Impl;

import com.nodepower.homemoney.commen.R;
import com.nodepower.homemoney.commen.ResStatus;
import com.nodepower.homemoney.dao.BillMapper;
import com.nodepower.homemoney.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-29 13:14
 */
@Service
public class CountServiceImpl implements CountService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public R personCountByBpId(int bpid, String date, int bid) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30 &&time1 <= time2 ){
            int i = billMapper.selectByBpId(bpid);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @Override
    public R familyCountByBfId(int bfid, String date, int bid) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30 &&time1 <= time2 ){
            int i = billMapper.selectByBfId(bfid);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @Override
    public R typeCountByBType(String type,String date,int bid) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30 &&time1 <= time2 ){
            int i = billMapper.selectByBType(type);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @Override
    public R countByBpIdAndType(int bpid, String type, int bid,String date) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30 &&time1 <= time2 ){
            int i = billMapper.selectByTypeByBpId(bpid,type);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }



    @Override
    public R YearPersonCountByBpId(int bpid, String date, int bid) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30*12 &&time1 <= time2 ){
            int i = billMapper.selectByBpId(bpid);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @Override
    public R YearFamilyCountByBfId(int bfid, String date, int bid) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30*12 &&time1 <= time2 ){
            int i = billMapper.selectByBfId(bfid);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @Override
    public R YearTypeCountByBType(String type,String date,int bid) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30*12 &&time1 <= time2 ){
            int i = billMapper.selectByBType(type);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @Override
    public R YearCountByBpIdAndType(int bpid, String type, int bid,String date) {
        int count = 0;
        int time1 = Integer.parseInt(date);
        int time2 = Integer.parseInt(String.valueOf(new Date()));
        if( time1>= time2-3600*24*30*12 &&time1 <= time2 ){
            int i = billMapper.selectByTypeByBpId(bpid,type);
            for (int j = 0; j < i; j++) {
                count +=billMapper.selectCountById(bid);
            }
            return new R(ResStatus.OK,"success",count);
        }
        return new R(ResStatus.NO,"fail",null);
    }


}
