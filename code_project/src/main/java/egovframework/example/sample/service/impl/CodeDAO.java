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
}
