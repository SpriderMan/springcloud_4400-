package spring.cloud.advance.zuul.open.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class AccessFilter extends ZuulFilter {

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		String token = ctx.getRequest().getHeader("token");
		if (!StringUtils.isNotBlank(token)) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseBody("xxxx");
			ctx.setResponseStatusCode(500);
		}
		return ctx;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
