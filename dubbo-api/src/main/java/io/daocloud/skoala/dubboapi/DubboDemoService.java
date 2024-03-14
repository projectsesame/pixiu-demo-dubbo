package io.daocloud.skoala.dubboapi;

/**
 * @author yangyang
 * @date 2022/3/17 上午10:11
 */
public interface DubboDemoService {
    String sayHello(String name);

    User returnUserInfo(User user);

    String returnUserInfoAndNameAndIntAge(String name,User user,int age);

    String returnUserInfoAndNameAndIntegerAge(String name,User user,Integer age);

}
