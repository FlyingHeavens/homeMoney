package com.nodepower.homemoney.service.Impl;

import com.nodepower.homemoney.beans.Bill;
import com.nodepower.homemoney.commen.R;
import com.nodepower.homemoney.commen.ResStatus;
import com.nodepower.homemoney.dao.BillMapper;
import com.nodepower.homemoney.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-28 22:01
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public R selectAllBills(Integer bid) {
        List<Bill> list = billMapper.selectByExample(bid);
        R r = new R(ResStatus.OK, "success", list);
        return r;
    }

    @Override
    public R addBills(Bill bill) {
        bill.setbDate(sdf.format(new Date()));
        int i = billMapper.insert(bill);
        if(i > 0){
            return new R(ResStatus.OK,"success",null);
        }else{
            return new R(ResStatus.NO,"fail",null);
        }
    }

    @Override
    public R updateBill(int bid, int bNum) {
        int i = billMapper.updateByBNum(bid, bNum);
        if(i>0){
            return new R(ResStatus.OK,"update success",null);
        }else{
            return new R(ResStatus.NO,"update fail",null);
        }
    }

    @Override
    public R deleteBill(int bid) {
        int i = billMapper.deleteByExample(bid);
        if(i>0){
            return new R(ResStatus.OK,"delete success",null);
        }else{
            return new R(ResStatus.NO,"delete fail",null);
        }
    }

    @Override
    public R selectBillByBid(int bid) {
        Example example = new Example(Bill.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("bid",bid);
        List<Bill> productParams = billMapper.selectByExample(example);
        if(productParams.size() > 0){
            return new R(ResStatus.OK,"success",productParams.get(0));
        }else{
            return new R(ResStatus.NO,"没有此账单",null);
        }
    }

}
