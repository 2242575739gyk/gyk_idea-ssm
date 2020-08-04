package cn.juhyun.service.jiyunspringboottest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/*@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //开启熔断机制*/
@SpringCloudApplication
@EnableFeignClients     //开启fegin客户端
public class JiyunSpringbootTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(JiyunSpringbootTest2Application.class, args);
    }
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//
//        return new  RestTemplate(new OkHttp3ClientHttpRequestFactory());
//    }
}
