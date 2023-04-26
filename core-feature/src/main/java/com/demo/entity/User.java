package com.demo.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Data
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 7223245362061138198L;
}
