package com.xzc.dubbo;

import java.util.List;

/**
 * @author Ray
 * @date created in 2020/9/28 9:02
 */
public interface UserService {
    List<UserAddress> getUserAddress(String username);
}
