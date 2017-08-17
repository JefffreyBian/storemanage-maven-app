package com.store.model;

import java.util.List;

public class custctact {
    private String tCcid;

    private String tCcname;

    private String tCcadddress;

    private String tCcmail;

    private String tCcphone;

    private String tCustid;

    private String tCcmanagerid;
    
    private List<sale> sales;

    public List<sale> getSales() {
		return sales;
	}

	public void setSales(List<sale> sales) {
		this.sales = sales;
	}

	public String gettCcid() {
        return tCcid;
    }

    public void settCcid(String tCcid) {
        this.tCcid = tCcid;
    }

    public String gettCcname() {
        return tCcname;
    }

    public void settCcname(String tCcname) {
        this.tCcname = tCcname == null ? null : tCcname.trim();
    }

    public String gettCcadddress() {
        return tCcadddress;
    }

    public void settCcadddress(String tCcadddress) {
        this.tCcadddress = tCcadddress == null ? null : tCcadddress.trim();
    }

    public String gettCcmail() {
        return tCcmail;
    }

    public void settCcmail(String tCcmail) {
        this.tCcmail = tCcmail == null ? null : tCcmail.trim();
    }

    public String gettCcphone() {
        return tCcphone;
    }

    public void settCcphone(String tCcphone) {
        this.tCcphone = tCcphone == null ? null : tCcphone.trim();
    }

    public String gettCustid() {
        return tCustid;
    }

    public void settCustid(String tCustid) {
        this.tCustid = tCustid == null ? null : tCustid.trim();
    }

    public String gettCcmanagerid() {
        return tCcmanagerid;
    }

    public void settCcmanagerid(String tCcmanagerid) {
        this.tCcmanagerid = tCcmanagerid == null ? null : tCcmanagerid.trim();
    }
}