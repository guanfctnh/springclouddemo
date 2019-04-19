package demo.springcloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public String sayhi(String name){
        return eurekaClientFeign.hiFromEurekaClient(name);
    }

}
