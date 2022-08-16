package com.nodepower.homemoney.beans;

import javax.persistence.*;

public class Home {
    @Id
    @Column(name = "h_id")
    private Integer hId;

    @Column(name = "h_name")
    private String hName;

    @Column(name = "h_f_id")
    private Integer hFId;

    /**
     * @return h_id
     */
    public Integer gethId() {
        return hId;
    }

    /**
     * @param hId
     */
    public void sethId(Integer hId) {
        this.hId = hId;
    }

    /**
     * @return h_name
     */
    public String gethName() {
        return hName;
    }

    /**
     * @param hName
     */
    public void sethName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    /**
     * @return h_f_id
     */
    public Integer gethFId() {
        return hFId;
    }

    /**
     * @param hFId
     */
    public void sethFId(Integer hFId) {
        this.hFId = hFId;
    }
}