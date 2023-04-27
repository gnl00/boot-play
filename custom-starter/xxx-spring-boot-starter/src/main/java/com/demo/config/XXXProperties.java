package com.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@ConfigurationProperties("xxx")
public class XXXProperties {

    private String info;

    private String version;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
