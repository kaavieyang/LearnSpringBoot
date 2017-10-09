package com.kaavie.sprintboot.config.mybatis;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by kaavie on 17/10/9.
 */
public class JDBCConfiguration {


    @Value("${com.kaavie.mysql.url}")
    private String url;
    @Value("${com.kaavie.mysql.port}")
    private String port;
    @Value("${com.kaavie.mysql.userName}")
    private String userName;
    @Value("${com.kaavie.mysql.password}")
    private String password;
    @Value("${com.kaavie.mysql.maxActive}")
    private Integer maxActive;

    @Value("${com.kaavie.mysql.maxIdle}")
    private Integer maxIdle;
    @Value("${com.kaavie.mysql.minIdle}")
    private Integer minIdle;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }
}
