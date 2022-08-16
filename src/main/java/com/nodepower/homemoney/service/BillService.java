package com.nodepower.homemoney.service;

import com.nodepower.homemoney.beans.Bill;
import com.nodepower.homemoney.commen.R;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-28 21:58
 */
public interface BillService {
    public R selectAllBills(Integer bid);

    public R addBills(Bill bill);

    public R updateBill(int bid,int bNum);

    public R deleteBill(int bid);

    public R selectBillByBid(int bid);
}
