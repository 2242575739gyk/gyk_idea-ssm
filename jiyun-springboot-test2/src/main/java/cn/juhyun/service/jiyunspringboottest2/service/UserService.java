package cn.juhyun.service.jiyunspringboottest2.service;

import cn.juhyun.service.jiyunspringboottest2.dao.UserDao;
import cn.juhyun.service.jiyunspringboottest2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> findById(List<Integer> ids) {
        List<User> l1=new ArrayList<User>();
        for (Integer id : ids) {
            l1.add(userDao.findById(id));
        }
        return  l1;

    }
}
