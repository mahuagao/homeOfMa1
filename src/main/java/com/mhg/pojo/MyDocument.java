package com.mhg.pojo;

import java.util.Date;

public class MyDocument {
    private Long did;

    private String docname;

    private String docsize;

    private String docpath;

    private Date uplodate;

    private Long scannum;

    private Long downnum;

    private Date modifydate;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getDocsize() {
        return docsize;
    }

    public void setDocsize(String docsize) {
        this.docsize = docsize;
    }

    public String getDocpath() {
        return docpath;
    }

    public void setDocpath(String docpath) {
        this.docpath = docpath;
    }

    public Date getUplodate() {
        return uplodate;
    }

    public void setUplodate(Date uplodate) {
        this.uplodate = uplodate;
    }

    public Long getScannum() {
        return scannum;
    }

    public void setScannum(Long scannum) {
        this.scannum = scannum;
    }

    public Long getDownnum() {
        return downnum;
    }

    public void setDownnum(Long downnum) {
        this.downnum = downnum;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}