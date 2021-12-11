package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.MemberVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO {
	public void register(MemberVO member) throws Exception {
		insert("memberDAO.register", member);
	}
	public MemberVO login(MemberVO member) throws Exception {
		return (MemberVO) select("memberDAO.login", member);
	}
}
