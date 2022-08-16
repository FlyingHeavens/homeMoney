package com.nodepower.homemoney.beans;

import javax.persistence.*;

public class Family {
    @Id
    @Column(name = "f_id")
    private Integer fId;

    @Column(name = "f_fname")
    private String fFname;

    @Column(name = "f_pname")
    private String fPname;

    @Column(name = "f_role")
    private String fRole;

    @Column(name = "f_age")
    private Integer fAge;

    @Column(name = "f_p_id")
    private Integer fPId;

    /**
     * @return f_id
     */
    public Integer getfId() {
        return fId;
    }

    /**
     * @param fId
     */
    public void setfId(Integer fId) {
        this.fId = fId;
    }

    /**
     * @return f_fname
     */
    public String getfFname() {
        return fFname;
    }

    /**
     * @param fFname
     */
    public void setfFname(String fFname) {
        this.fFname = fFname == null ? null : fFname.trim();
    }

    /**
     * @return f_pname
     */
    public String getfPname() {
        return fPname;
    }

    /**
     * @param fPname
     */
    public void setfPname(String fPname) {
        this.fPname = fPname == null ? null : fPname.trim();
    }

    /**
     * @return f_role
     */
    public String getfRole() {
        return fRole;
    }

    /**
     * @param fRole
     */
    public void setfRole(String fRole) {
        this.fRole = fRole == null ? null : fRole.trim();
    }

    /**
     * @return f_age
     */
    public Integer getfAge() {
        return fAge;
    }

    /**
     * @param fAge
     */
    public void setfAge(Integer fAge) {
        this.fAge = fAge;
    }

    /**
     * @return f_p_id
     */
    public Integer getfPId() {
        return fPId;
    }

    /**
     * @param fPId
     */
    public void setfPId(Integer fPId) {
        this.fPId = fPId;
    }
}