package egovframework.example.sample.service;

public interface CodeService {
	
	/**
	 * 코드를 등록한다.
	 * @param codeVo - 등록할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	void insertCode(CodeVO codeVo) throws Exception;
}
