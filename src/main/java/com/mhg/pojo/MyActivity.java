package com.mhg.pojo;

import java.util.Date;

public class MyActivity {
    private Long acid;

    private String acname;

    private String acmsg;

    private String mimage;

    private Date credate;

    public Long getAcid() {
        return acid;
    }

    public void setAcid(Long acid) {
        this.acid = acid;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getAcmsg() {
        return acmsg;
    }

    public void setAcmsg(String acmsg) {
        this.acmsg = acmsg;
    }

    public String getMimage() {
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }

    public Date getCredate() {
        return credate;
    }

    public void setCredate(Date credate) {
        this.credate = credate;
    }
}