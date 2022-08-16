package com.nodepower.homemoney.dao;

import com.nodepower.homemoney.beans.Bill;
import com.nodepower.homemoney.general.GeneralDAO;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillMapper extends GeneralDAO<Bill> {
    public int updateByBNum(@Param("bid")int bid,
                               @Param("bNum") int bNum);

    public int selectCountById(int bid);

    public int selectByBpId(int bpid);

    public int selectByBfId(int bfid);

    public int selectByBType(String type);

    public int selectByTypeByBpId(@Param("bpid") int bpid,
                                  @Param("type") String type);


}