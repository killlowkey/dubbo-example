package com.xzc.dubbo;

import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ray
 * @date created in 2020/9/28 9:03
 */
@DubboService(interfaceName = "userAddress")
public class UserAddressImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddress(String username) {
        UserAddress userAddress1 = new UserAddress(1, "北京");
        UserAddress userAddress2 = new UserAddress(2, "香港");
        return Arrays.asList(userAddress1, userAddress2);
    }
}
