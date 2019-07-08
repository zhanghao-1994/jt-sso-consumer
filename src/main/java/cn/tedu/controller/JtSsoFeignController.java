package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.common.vo.SysResult;
import cn.tedu.feign.JtSsoFeign;
import cn.tedu.sso.pojo.User;

@RestController
public class JtSsoFeignController {
	
	@Autowired
	private JtSsoFeign feign;
	
	@RequestMapping("/user/check/{param}/{type}")
	public SysResult check(@PathVariable("param") String param, @PathVariable("type") Integer type) {
		return feign.check(param, type);
	}
	
	@RequestMapping("/user/register")
	public SysResult register(User user) {
		return feign.register(user);
	}
	
	@RequestMapping("/user/login")
	public SysResult login(@RequestParam("u") String username, @RequestParam("p") String password) {
		return feign.login(username, password);
	}
	
	@RequestMapping("/user/query/{ticket}")
	public SysResult queryTicket(@PathVariable("ticket") String ticket) {
		return feign.queryTicket(ticket);
	}

}
