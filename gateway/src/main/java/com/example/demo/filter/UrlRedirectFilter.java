package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @Auther: zwg
 * @Date: 2019/3/19 15:52
 * @Description:
 */
@Component
public class UrlRedirectFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx=RequestContext.getCurrentContext();
        String url=ctx.getRequest().getRequestURI();
        if(url.contains("/price/info")){
            url="/product/detail";
            ctx.put(FilterConstants.REQUEST_URI_KEY,url);
            //ctx.put(FilterConstants.SERVICE_ID_KEY,"service-b");
        }
        return null;
    }

}
