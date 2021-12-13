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
	public int login(MemberVO member) throws Exception {
		MemberVO dbMember = memberDAO.login(member);
		
		if (dbMember != null) {
			String dbPwd = dbMember.getMem_pwd();
			String inputPwd = member.getMem_pwd();
			if (dbPwd.equals(inputPwd)) {
				return 1;
			} else {
				return 0;
			}
		}
		return -1;
	}

}
