package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("codeDAO")
public class CodeDAO extends EgovAbstractDAO {

	/**
	 * 코드를 등록한다.
	 * @param codeVo - 등록할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	public void insertCode(CodeVO codeVo) throws Exception {
		insert("codeDAO.insertCode", codeVo);
	}
	
	/**
	 * 코드 목록을 조회한다.
	 * @param codeVO - 조회할 코드 정보가 담긴 VO
	 * @return 코드 목록
	 * @throws Exception
	 */
	public List<?> selectCodeList(CodeVO codeVO) throws Exception {
		return list("codeDAO.selectCodeList", codeVO);
	}
	
	/**
	 * 코드 총 갯수를 조회한다.
	 * @param codeVO
	 * @return 코드 총 갯수
	 * @throws Exception
	 */
	public int selectCodeCount(CodeVO codeVO) throws Exception {
		return (int) select("codeDAO.selectCodeCount", codeVO);
	}
	
	/**
	 * 코드를 삭제한다.
	 * @param codeVO - 삭제할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	public void deleteCode(CodeVO codeVO) throws Exception {
		delete("codeDAO.deleteCode", codeVO);
	}
	
	/**
	 * 코드 정보를 조회한다.
	 * @param codeVO - 조회할 코드 정보가 담긴 VO
	 * @return codeVO
	 * @throws Exception
	 */
	public CodeVO selectCodeDetail(CodeVO codeVO) throws Exception {
		return (CodeVO) select("codeDAO.selectCodeDetail", codeVO);
	}
	
	/**
	 * 코드 정보를 수정한다.
	 * @param codeVO - 수정할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	public void updateCode(CodeVO codeVO) throws Exception {
		update("codeDAO.updateCode", codeVO);
	}
}
