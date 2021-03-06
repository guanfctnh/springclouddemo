package demo.springcloud.eurekafeignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = Hihystrix.class)
public interface EurekaClientFeign {
    @GetMapping("/hi")
    String hiFromEurekaClient(@RequestParam(value = "name")String name);
}
