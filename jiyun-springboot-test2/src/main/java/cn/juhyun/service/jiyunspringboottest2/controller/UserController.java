package cn.juhyun.service.jiyunspringboottest2.controller;

import cn.juhyun.service.jiyunspringboottest2.pojo.User;
import cn.juhyun.service.jiyunspringboottest2.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consuer/user")
@DefaultProperties//(defaultFallback ="getUserFallBack")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    @ResponseBody
   //@HystrixCommand//(fallbackMethod = "getUserFallBack")
    public String findByList(@RequestParam("ids")List<Integer> ids){
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//       if(ids.get(0)==1){
//           throw new RuntimeException("太忙了");
//       }


        return   this.userService.findById(ids).toString();
    }
//  public String getUserFallBack(){
//      return  "请求失败，稍后重试";
//   }

}
