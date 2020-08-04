package cn.juhyun.service.jiyunspringboottest2.clent;

import cn.juhyun.service.jiyunspringboottest2.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class UserClentFallBack implements  UserClent {
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setName("用户查询出现异常！");
        return user;
    }



}
