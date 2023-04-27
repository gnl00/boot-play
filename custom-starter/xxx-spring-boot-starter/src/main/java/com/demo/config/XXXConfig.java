package com.demo.config;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
public class XXXConfig {

    private XXXProperties props;

    public XXXConfig(XXXProperties props) {
        this.props = props;
    }
    public XXXProperties getProps() {
        return props;
    }

    public void setProps(XXXProperties props) {
        this.props = props;
    }

    public String getInfo() {
        return props.getInfo();
    }

    public void setInfo(String info) {
        this.props.setInfo(info);
    }

    public String getVersion() {
        return this.props.getVersion();
    }

    public void setVersion(String version) {
        this.props.setVersion(version);
    }
}
