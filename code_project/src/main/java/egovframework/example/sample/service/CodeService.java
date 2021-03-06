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
	
	/**
	 * 코드 총 갯수를 조회한다.
	 * @param codeVO
	 * @return 코드 총 갯수
	 * @throws Exception
	 */
	public int selectCodeCount(CodeVO codeVO) throws Exception;
	
	/**
	 * 코드를 삭제한다.
	 * @param codeVO - 삭제할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	public void deleteCode(CodeVO codeVO) throws Exception;
	
	/**
	 * 코드 정보를 조회한다.
	 * @param codeVO - 조회할 코드 정보가 담긴 VO
	 * @return codeVO
	 * @throws Exception
	 */
	public CodeVO selectCodeDetail(CodeVO codeVO) throws Exception;
	
	/**
	 * 코드 정보를 수정한다.
	 * @param codeVO - 수정할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	public void updateCode(CodeVO codeVO) throws Exception;
}
