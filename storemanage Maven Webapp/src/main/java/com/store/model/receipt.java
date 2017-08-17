package com.store.model;

import java.util.Date;

public class receipt {
    private String tReceiptid;

    private String tRcpsaleid;

    private String tRcptotal;

    private Date tRcptime;

    private Date tRcpfinish;

    private String tRcpstate;

    private String tRcpuserid;

    private String tRcpsureid;

    public String gettReceiptid() {
        return tReceiptid;
    }

    public void settReceiptid(String tReceiptid) {
        this.tReceiptid = tReceiptid == null ? null : tReceiptid.trim();
    }

    public String gettRcpsaleid() {
        return tRcpsaleid;
    }

    public void settRcpsaleid(String tRcpsaleid) {
        this.tRcpsaleid = tRcpsaleid == null ? null : tRcpsaleid.trim();
    }

    public String gettRcptotal() {
        return tRcptotal;
    }

    public void settRcptotal(String tRcptotal) {
        this.tRcptotal = tRcptotal == null ? null : tRcptotal.trim();
    }

    public Date gettRcptime() {
        return tRcptime;
    }

    public void settRcptime(Date tRcptime) {
        this.tRcptime = tRcptime;
    }

    public Date gettRcpfinish() {
        return tRcpfinish;
    }

    public void settRcpfinish(Date tRcpfinish) {
        this.tRcpfinish = tRcpfinish;
    }

    public String gettRcpstate() {
        return tRcpstate;
    }

    public void settRcpstate(String tRcpstate) {
        this.tRcpstate = tRcpstate == null ? null : tRcpstate.trim();
    }

    public String gettRcpuserid() {
        return tRcpuserid;
    }

    public void settRcpuserid(String tRcpuserid) {
        this.tRcpuserid = tRcpuserid == null ? null : tRcpuserid.trim();
    }

    public String gettRcpsureid() {
        return tRcpsureid;
    }

    public void settRcpsureid(String tRcpsureid) {
        this.tRcpsureid = tRcpsureid == null ? null : tRcpsureid.trim();
    }
}