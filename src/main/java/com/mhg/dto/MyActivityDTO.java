package com.mhg.dto;

import java.util.Date;

public class MyActivityDTO {
    private Long acid;

    private String acname;

    private String acmsg;

    private String mimage;

    private String credate;

    public MyActivityDTO() {
    }

    public MyActivityDTO(String acname, String acmsg, String mimage, String credate) {
        this.acname = acname;
        this.acmsg = acmsg;
        this.mimage = mimage;
        this.credate = credate;
    }

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

    public String getCredate() {
        return credate;
    }

    public void setCredate(String credate) {
        this.credate = credate;
    }
}
