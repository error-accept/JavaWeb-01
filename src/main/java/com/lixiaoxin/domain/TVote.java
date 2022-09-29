package com.lixiaoxin.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @TableName t_vote
 */
@Data
@AllArgsConstructor
public class TVote implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * teacher id
     */
    private Integer tId;

    /**
     * user id
     */
    private Integer uId;

    /**
     * 
     */
    private Date voteTime;

    private static final long serialVersionUID = 1L;

    public TVote(String id, String uid, Date date) {
        this.tId= Integer.valueOf(id);
        this.uId= Integer.valueOf(uid);
        this.voteTime=date;
    }
}