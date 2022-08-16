package com.nodepower.homemoney.controller;

import com.nodepower.homemoney.beans.Bill;
import com.nodepower.homemoney.commen.R;
import com.nodepower.homemoney.commen.ResStatus;
import com.nodepower.homemoney.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-28 22:21
 */
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/list")
    public R listBill(Integer bId,@RequestHeader("token")String token){
        if(bId != null){
            R r = billService.selectAllBills(bId);
            return r;
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @PostMapping("/add")
    public R addShoppingCart(@RequestBody Bill bill, @RequestHeader("token")String token){
        R r = billService.addBills(bill);
        return r;
    }

    @PutMapping("/update/{bid}/{bNum}")
    public R updateNum(@PathVariable("bid") Integer bid,
                       @PathVariable("bNum") Integer bNum,
                       @RequestHeader("token")String token){
        R r = billService.updateBill(bid, bNum);
        return r;
    }

    @GetMapping("/delete")
    public R deleteBill(Integer bid,@RequestHeader("token")String token){
        if(bid != null){
            R r = billService.deleteBill(bid);
            return r;
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @GetMapping("/selectBill/{bid}")
    public R getBillParams(@PathVariable("bid") int bid){
        return billService.selectBillByBid(bid);
    }

}
