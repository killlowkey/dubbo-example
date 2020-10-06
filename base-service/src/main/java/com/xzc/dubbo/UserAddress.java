package com.xzc.dubbo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Ray
 * @date created in 2020/9/28 9:02
 */
@AllArgsConstructor
@Data
public class UserAddress implements Serializable {

    private static final long serialVersionUID = -7288743720466119288L;

    private long id;
    private String city;
}
