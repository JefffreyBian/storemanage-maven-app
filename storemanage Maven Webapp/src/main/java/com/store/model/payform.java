package com.store.model;

import java.util.Date;

public class payform {
    private String tPayformid;

    private String tPfpurchaseid;

    private String tPftotal;

    private Date tPftime;

    private Date tPffinish;

    private String tPfstate;

    private String tPfuserid;

    private String tPfsureid;

    public String gettPayformid() {
        return tPayformid;
    }

    public void settPayformid(String tPayformid) {
        this.tPayformid = tPayformid == null ? null : tPayformid.trim();
    }

    public String gettPfpurchaseid() {
        return tPfpurchaseid;
    }

    public void settPfpurchaseid(String tPfpurchaseid) {
        this.tPfpurchaseid = tPfpurchaseid == null ? null : tPfpurchaseid.trim();
    }

    public String gettPftotal() {
        return tPftotal;
    }

    public void settPftotal(String tPftotal) {
        this.tPftotal = tPftotal == null ? null : tPftotal.trim();
    }

    public Date gettPftime() {
        return tPftime;
    }

    public void settPftime(Date tPftime) {
        this.tPftime = tPftime;
    }

    public Date gettPffinish() {
        return tPffinish;
    }

    public void settPffinish(Date tPffinish) {
        this.tPffinish = tPffinish;
    }

    public String gettPfstate() {
        return tPfstate;
    }

    public void settPfstate(String tPfstate) {
        this.tPfstate = tPfstate == null ? null : tPfstate.trim();
    }

    public String gettPfuserid() {
        return tPfuserid;
    }

    public void settPfuserid(String tPfuserid) {
        this.tPfuserid = tPfuserid == null ? null : tPfuserid.trim();
    }

    public String gettPfsureid() {
        return tPfsureid;
    }

    public void settPfsureid(String tPfsureid) {
        this.tPfsureid = tPfsureid == null ? null : tPfsureid.trim();
    }
}