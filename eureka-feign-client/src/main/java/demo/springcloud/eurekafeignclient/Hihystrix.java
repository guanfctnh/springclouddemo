package demo.springcloud.eurekafeignclient;

import org.springframework.stereotype.Component;

/**
 * @program: springclouddemo
 * @description:
 * @author: Mr.gyc
 * @create: 2019-04-20 13:42
 */
@Component
public class Hihystrix implements EurekaClientFeign {
    @Override
    public String hiFromEurekaClient(String name) {
        return "hi,"+name+" sorry error!";
    }
}
