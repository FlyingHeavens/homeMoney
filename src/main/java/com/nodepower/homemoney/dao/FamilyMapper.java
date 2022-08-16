package com.nodepower.homemoney.dao;

import com.nodepower.homemoney.beans.Family;
import com.nodepower.homemoney.general.GeneralDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyMapper extends GeneralDAO<Family> {
    public int updateByExample(int fid);
}