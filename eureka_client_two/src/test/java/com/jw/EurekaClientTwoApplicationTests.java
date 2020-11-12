package com.jw;

import com.jw.client.ClientInterface;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
class EurekaClientTwoApplicationTests {
    /*@Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        String serviceId ="EUREKA-CLIENT-ONE";
        String forObject = restTemplate.getForObject("http://" + serviceId + "/hello", String.class);
        System.out.println(forObject);
    }*/

    @Autowired
    private ClientInterface clientInterface;
    @Test
    public void clientTest(){
        String hello = clientInterface.hello();
        System.out.println(hello);
    }

}
