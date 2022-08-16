package com.nodepower.homemoney.beans;

import javax.persistence.*;
import java.util.Date;

public class Bill {
    @Id
    @Column(name = "b_id")
    private Integer bId;

    @Column(name = "b_p_id")
    private Integer bPId;

    @Column(name = "b_date")
    private String bDate;

    @Column(name = "b_type")
    private String bType;

    @Column(name = "b_money")
    private Integer bMoney;

    @Column(name = "b_person")
    private String bPerson;

    @Column(name = "b_hname")
    private String bHname;

    @Column(name = "b_f_id")
    private Integer bFId;

    /**
     * @return b_id
     */
    public Integer getbId() {
        return bId;
    }

    /**
     * @param bId
     */
    public void setbId(Integer bId) {
        this.bId = bId;
    }

    /**
     * @return b_num
     */
    public Integer getbNum() {
        return bPId;
    }

    /**
     * @param bNum
     */
    public void setbNum(Integer bNum) {
        this.bPId = bPId;
    }

    /**
     * @return b_date
     */
    public String getbDate() {
        return bDate;
    }

    /**
     * @param bDate
     */
    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    /**
     * @return b_type
     */
    public String getbType() {
        return bType;
    }

    /**
     * @param bType
     */
    public void setbType(String bType) {
        this.bType = bType == null ? null : bType.trim();
    }

    /**
     * @return b_money
     */
    public Integer getbMoney() {
        return bMoney;
    }

    /**
     * @param bMoney
     */
    public void setbMoney(Integer bMoney) {
        this.bMoney = bMoney ;
    }

    /**
     * @return b_person
     */
    public String getbPerson() {
        return bPerson;
    }

    /**
     * @param bPerson
     */
    public void setbPerson(String bPerson) {
        this.bPerson = bPerson == null ? null : bPerson.trim();
    }

    /**
     * @return b_hname
     */
    public String getbHname() {
        return bHname;
    }

    /**
     * @param bHname
     */
    public void setbHname(String bHname) {
        this.bHname = bHname == null ? null : bHname.trim();
    }

    /**
     * @return b_f_id
     */
    public Integer getbFId() {
        return bFId;
    }

    /**
     * @param bFId
     */
    public void setbFId(Integer bFId) {
        this.bFId = bFId;
    }
}