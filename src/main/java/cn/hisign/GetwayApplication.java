package cn.hisign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringCloudApplication
public class GetwayApplication {
    public static void main(String[] strs){
        new SpringApplicationBuilder(GetwayApplication.class).web(true).run(strs);
    }
}
