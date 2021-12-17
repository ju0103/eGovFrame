package egovframework.example.sample.service;

import java.util.List;

public interface CodeService {
	
	/**
	 * 코드를 등록한다.
	 * @param codeVo - 등록할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	void insertCode(CodeVO codeVo) throws Exception;
	
	/**
	 * 코드 목록을 조회한다.
	 * @param codeVO - 조회할 코드 정보가 담긴 VO
	 * @return 코드 목록
	 * @throws Exception
	 */
	List<?> selectCodeList(CodeVO codeVO) throws Exception;
	
}
