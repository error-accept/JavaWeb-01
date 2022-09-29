package com.lixiaoxin.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@Data
@AllArgsConstructor
public class TUser implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String pwd;

    /**
     * 
     */
    private String city;

    /**
     * 
     */
    private String des;

    /**
     * 
     */
    private String hobby;

    /**
     * 
     */
    private String sex;

    private static final long serialVersionUID = 1L;

    public TUser() {

    }
}