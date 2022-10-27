package com.backend.dtsrea4b.fin.application.model;

import java.util.Date;
import javax.annotation.Generated;

public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5424701+07:00", comments="Source field: user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.createdby")
    private String createdby;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.createdAt")
    private Date createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.updatedby")
    private String updatedby;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5454696+07:00", comments="Source field: user.updatedAt")
    private Date updatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5435068+07:00", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.createdby")
    public String getCreatedby() {
        return createdby;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.createdby")
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5445027+07:00", comments="Source field: user.createdAt")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5454696+07:00", comments="Source field: user.updatedby")
    public String getUpdatedby() {
        return updatedby;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5454696+07:00", comments="Source field: user.updatedby")
    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5454696+07:00", comments="Source field: user.updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5454696+07:00", comments="Source field: user.updatedAt")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}