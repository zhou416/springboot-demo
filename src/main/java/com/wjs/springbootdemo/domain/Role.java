package com.wjs.springbootdemo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private int    id;
    private String role_name;
    private int user_id;
}
