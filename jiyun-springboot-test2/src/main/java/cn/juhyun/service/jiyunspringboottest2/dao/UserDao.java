package cn.juhyun.service.jiyunspringboottest2.dao;
import cn.juhyun.service.jiyunspringboottest2.clent.UserClent;
import cn.juhyun.service.jiyunspringboottest2.pojo.User;
import com.netflix.discovery.util.DiscoveryBuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class UserDao {
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private DiscoveryClient discoveryClient;
    @Autowired
    private  UserClent userClent;
    public User findById(Integer id) {

     /*   List<ServiceInstance> instanceList = discoveryClient.getInstances("service-provlder");
        ServiceInstance instance = instanceList.get(0);
        String url="http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
        return  restTemplate.getForObject(url,User.class);
*/
//     String   besuUrl="http://service-provlder/user/";
//    return  this.restTemplate.getForObject(besuUrl+id,User.class);
        return  this.userClent.findById(id);
    }
}
