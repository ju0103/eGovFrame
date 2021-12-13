package egovframework.example.sample.service;

public interface MemberService {
	public void register(MemberVO member) throws Exception;
	public int login(MemberVO member) throws Exception;
}
