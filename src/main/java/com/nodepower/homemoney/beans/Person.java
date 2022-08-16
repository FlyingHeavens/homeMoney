package com.nodepower.homemoney.beans;



public class Person {

    private Integer pId;

    private String pName;

    private Integer pPassword;

    private Integer pAge;

    private String pRole;

    private Integer pFId;

    /**
     * @return p_id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * @param pId
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * @return p_name
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    /**
     * @return p_password
     */
    public Integer getpPassword() {
        return pPassword;
    }

    /**
     * @param pPassword
     */
    public void setpPassword(Integer pPassword) {
        this.pPassword = pPassword;
    }

    /**
     * @return p_age
     */
    public Integer getpAge() {
        return pAge;
    }

    /**
     * @param pAge
     */
    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    /**
     * @return p_role
     */
    public String getpRole() {
        return pRole;
    }

    /**
     * @param pRole
     */
    public void setpRole(String pRole) {
        this.pRole = pRole == null ? null : pRole.trim();
    }

    /**
     * @return p_f_id
     */
    public Integer getpFId() {
        return pFId;
    }

    /**
     * @param pFId
     */
    public void setpFId(Integer pFId) {
        this.pFId = pFId;
    }
}