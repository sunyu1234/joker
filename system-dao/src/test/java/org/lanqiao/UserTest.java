package org.lanqiao;

import org.junit.Test;

public class UserTest {
    @Test
    public void userTest(){
        User user = new User("张三","1234567");
        user.showInfo(user);
    }
}
