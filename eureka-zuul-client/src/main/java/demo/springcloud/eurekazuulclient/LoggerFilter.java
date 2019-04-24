package demo.springcloud.eurekazuulclient;

import com.netflix.zuul.ZuulFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * @program: springclouddemo
 * @description: 添加链路信息
 * @author: Mr.gyc
 * @create: 2019-04-23 14:25
 */
@Component
public class LoggerFilter extends ZuulFilter {
    @Autowired
    Tracer tracer;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operater","gyc");
        System.out.println(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
