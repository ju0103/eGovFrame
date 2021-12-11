package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;
	
	@Override
	public void register(MemberVO member) throws Exception {
		memberDAO.register(member);
	}

	@Override
	public MemberVO login(MemberVO member) throws Exception {
		return memberDAO.login(member);
	}

}
