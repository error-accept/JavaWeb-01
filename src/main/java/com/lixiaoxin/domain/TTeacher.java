package com.lixiaoxin.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_teacher
 */
@Data
public class TTeacher implements Serializable {
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
    private String gender;

    /**
     * 
     */
    private String desc;

    /**
     * 
     */
    private Integer vote;

    /**
     * 
     */
    private Integer statues;

    private static final long serialVersionUID = 1L;
}