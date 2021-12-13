package egovframework.example.sample.service.impl;

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
}
