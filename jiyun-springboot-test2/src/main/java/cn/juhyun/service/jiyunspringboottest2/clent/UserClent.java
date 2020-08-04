package cn.juhyun.service.jiyunspringboottest2.clent;

import cn.juhyun.service.jiyunspringboottest2.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provlder",fallback =UserClentFallBack.class )
public interface UserClent {
    @GetMapping("user/{id}")
    User findById(@PathVariable("id") Integer id);


}
