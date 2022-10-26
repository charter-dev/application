package com.backend.dtsrea4b.fin.application.model;

import java.util.Date;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Other {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.judul")
    private String judul;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.createdBy")
    private String createdBy;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.createdAt")
    private Date createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.updatedBy")
    private String updatedBy;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.updatedAt")
    private Date updatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.content")
    private String content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.judul")
    public String getJudul() {
        return judul;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.judul")
    public void setJudul(String judul) {
        this.judul = judul;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9575594+07:00", comments="Source field: other.createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.createdAt")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.updatedAt")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.content")
    public String getContent() {
        return content;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-24T12:24:34.9585465+07:00", comments="Source field: other.content")
    public void setContent(String content) {
        this.content = content;
    }
}