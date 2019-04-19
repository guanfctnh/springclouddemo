package demo.springcloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService  hiService ;
    @GetMapping("/hi")
    public String sayhi(@RequestParam(defaultValue = "gyc",required = false)String name){
        return hiService.sayhi(name);
    }
}
