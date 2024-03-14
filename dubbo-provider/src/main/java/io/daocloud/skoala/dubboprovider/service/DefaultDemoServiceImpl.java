package io.daocloud.skoala.dubboprovider.service;

import io.daocloud.skoala.dubboapi.DubboDemoService;
import io.daocloud.skoala.dubboapi.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author yangyang
 * @date 2022/3/17 上午10:48
 */
@DubboService(version = "${demo.service.version}")
public class DefaultDemoServiceImpl implements DubboDemoService {
    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    @Override
    public User returnUserInfo(User user) {
        return user;
    }

    @Override
    public String returnUserInfoAndNameAndIntAge(String name, User user, int age) {
        return String.format("method is %s,userInfo is %s,name is %s,age is %s","returnUserInfoAndNameAndIntAge", user,name, age);
    }

    @Override
    public String returnUserInfoAndNameAndIntegerAge(String name, User user, Integer age) {
        return String.format("method is %s,userInfo is %s,name is %s, age is %d", "returnUserInfoAndNameAndIntegerAge", user, name, age);
    }
}
