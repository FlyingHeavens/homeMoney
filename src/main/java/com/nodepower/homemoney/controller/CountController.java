package com.nodepower.homemoney.controller;

import com.nodepower.homemoney.commen.R;
import com.nodepower.homemoney.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-29 15:04
 */
@RestController
@RequestMapping("/count")
public class CountController {

    @Autowired
    private CountService countService;

    @GetMapping("/monthPerson")
    public R personCountByBPId(int bpid, String date, int bid){
        return countService.personCountByBpId(bpid, date, bid);
    }

    @GetMapping("/monthFamily")
    public R familyCountByBFId(int bfid, String date, int bid){
        return countService.familyCountByBfId(bfid, date, bid);
    }

    @GetMapping("/monthType")
    public R typeCountByBType(String type, String date, int bid){
        return countService.typeCountByBType(type, date, bid);
    }

    @GetMapping("/monthPersonAndType")
    public R countByBpIdAndType(int bpid,String type,int bid,String date){
        return countService.countByBpIdAndType(bpid,type, bid, date);
    }



    @GetMapping("/yearPerson")
    public R YearPersonCountByBPId(int bpid, String date, int bid){
        return countService.personCountByBpId(bpid, date, bid);
    }

    @GetMapping("/yearFamily")
    public R YearFamilyCountByBFId(int bfid, String date, int bid){
        return countService.familyCountByBfId(bfid, date, bid);
    }

    @GetMapping("/yearType")
    public R YearTypeCountByBType(String type, String date, int bid){
        return countService.typeCountByBType(type, date, bid);
    }

    @GetMapping("/yearPersonAndType")
    public R YearCountByBpIdAndType(int bpid,String type,int bid,String date){
        return countService.countByBpIdAndType(bpid,type, bid, date);
    }
}
