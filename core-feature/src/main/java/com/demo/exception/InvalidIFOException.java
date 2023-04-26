package com.demo.exception;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
public class InvalidIFOException extends RuntimeException {

    String info;

    public String getInfo() {
        return info;
    }

    public InvalidIFOException(String message) {
        super(message);
    }

    public static String buildMessage(String info) {
        return "Invalid info property: "+ info +", it must be start with: IFO";
    }
}
