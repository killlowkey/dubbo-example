package com.xzc.dubbo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Ray
 * @date created in 2020/9/28 9:11
 */
@Component
public class OrderServiceImpl implements OrderService {

    @DubboReference
    private UserService userService;

    @Override
    public Object placeAnOrder(String username) {
        List<UserAddress> userAddress = userService.getUserAddress(username);
        System.out.println(userAddress);
        return userAddress;
    }
}
