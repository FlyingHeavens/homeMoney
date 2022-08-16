package com.nodepower.homemoney.controller;

import com.nodepower.homemoney.beans.Bill;
import com.nodepower.homemoney.beans.Family;
import com.nodepower.homemoney.commen.R;
import com.nodepower.homemoney.commen.ResStatus;
import com.nodepower.homemoney.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author : Jerry
 * @create : 2022-07-29 11:20
 */
@RestController
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    private FamilyService familyService;

    @GetMapping("/list")
    public R listFamily(Integer fid,@RequestHeader("token")String token){
        if(fid != null){
            R r = familyService.selectFamily(fid);
            return r;
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @PostMapping("/add")
    public R addFamily(@RequestBody Family family,
                       @RequestHeader("token")String token){
        R r = familyService.addFamily(family);
        return r;
    }

    @GetMapping("/update/{fid}")
    public R updateFamily(@PathVariable("fid")int fid,
                          @RequestHeader("token")String token){

        R r = familyService.updateFamily(fid);
        return r;
    }

    @GetMapping("/delete")
    public R deleteBill(Integer fid,@RequestHeader("token")String token){
        if(fid != null){
            R r = familyService.deleteFamily(fid);
            return r;
        }
        return new R(ResStatus.NO,"fail",null);
    }

    @GetMapping("/selectFamilly/{fid}")
    public R selectFamilyDetail(@PathVariable("fid") int fid){
        return familyService.selectFamilyDetail(fid);
    }

}
