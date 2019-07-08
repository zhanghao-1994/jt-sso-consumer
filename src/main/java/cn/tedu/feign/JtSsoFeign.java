package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tedu.common.vo.SysResult;
import cn.tedu.sso.pojo.User;

@FeignClient("jt-sso-provider")
public interface JtSsoFeign {
	@RequestMapping("/user/check/{param}/{type}")
	public SysResult check(@PathVariable(value="param") String param, @PathVariable(value="type") Integer type);
	
	@RequestMapping("/user/register")
	public SysResult register(User user);
	
	@RequestMapping("/user/login")
	public SysResult login(@RequestParam("u") String username, @RequestParam("p") String password);
	
	@RequestMapping("/user/query/{ticket}")
	public SysResult queryTicket(@PathVariable(value="ticket") String ticket);
}
