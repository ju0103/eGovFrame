package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;

@Controller
public class MemberController {

	@Resource(name = "memberService")
	private MemberService memberService;
	
	@RequestMapping(value = "/register.do")
	public String register() {
		return "member/register";
	}
	
	@RequestMapping(value = "/register_ok.do")
	public String register_ok(MemberVO member) throws Exception {
		
		memberService.register(member);
		
		return "redirect:login.do";
	}
	
	@RequestMapping(value = "/login.do")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping(value = "/login_ok.do")
	public String login_ok(MemberVO member) throws Exception {
		
		int result = memberService.login(member);
		
		if (result == 1) {
			return "member/login_ok";
		}
		
		return "member/login";
	}
}
