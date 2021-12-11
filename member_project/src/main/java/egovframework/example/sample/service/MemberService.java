package egovframework.example.sample.service;

public interface MemberService {
	public void register(MemberVO member) throws Exception;
	public MemberVO login(MemberVO member) throws Exception;
}
