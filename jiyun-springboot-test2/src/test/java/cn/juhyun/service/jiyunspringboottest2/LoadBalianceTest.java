package cn.juhyun.service.jiyunspringboottest2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest //测试
public class LoadBalianceTest {
    @Autowired
    RibbonLoadBalancerClient cilent;
    @Test
    public  void test(){
        for (int i=0;i<100;i++){
            ServiceInstance instance = this.cilent.choose("service-provlder");
            System.out.println(instance.getHost()+instance.getPort());

        }
    }

}
