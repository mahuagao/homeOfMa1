package com.mhg.dto;

import java.util.Date;

public class MyMessageDTO {

    private Integer meid;

    private String message;

    private String souip;

    private Date messdate;

    private String dear;

    public Integer getMeid() {
        return meid;
    }

    public void setMeid(Integer meid) {
        this.meid = meid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSouip() {
        return souip;
    }

    public void setSouip(String souip) {
        this.souip = souip;
    }

    public Date getMessdate() {
        return messdate;
    }

    public void setMessdate(Date messdate) {
        this.messdate = messdate;
    }

    public String getDear() {
        return dear;
    }

    public void setDear(String dear) {
        this.dear = dear;
    }
}
