package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;

@Service("codeService")
public class CodeServiceImpl implements CodeService {

	@Resource(name = "codeDAO")
	private CodeDAO codeDAO;

	/**
	 * 코드를 등록한다.
	 * @param codeVo - 등록할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void insertCode(CodeVO codeVo) throws Exception {
		codeDAO.insertCode(codeVo);
	}

	/**
	 * 코드 목록을 조회한다.
	 * @param codeVO - 조회할 코드 정보가 담긴 VO
	 * @return 코드 목록
	 * @exception Exception
	 */
	@Override
	public List<?> selectCodeList(CodeVO codeVO) throws Exception {
		return codeDAO.selectCodeList(codeVO);
	}

	/**
	 * 코드 총 갯수를 조회한다.
	 * @param codeVO
	 * @return 코드 총 갯수
	 * @throws Exception
	 */
	@Override
	public int selectCodeCount(CodeVO codeVO) throws Exception {
		return codeDAO.selectCodeCount(codeVO);
	}

	/**
	 * 코드를 삭제한다.
	 * @param codeVO - 삭제할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void deleteCode(CodeVO codeVO) throws Exception {
		codeDAO.deleteCode(codeVO);
	}

	/**
	 * 코드 정보를 조회한다.
	 * @param codeVO - 조회할 코드 정보가 담긴 VO
	 * @return codeVO
	 * @throws Exception
	 */
	@Override
	public CodeVO selectCodeDetail(CodeVO codeVO) throws Exception {
		return codeDAO.selectCodeDetail(codeVO);
	}

	/**
	 * 코드 정보를 수정한다.
	 * @param codeVO - 수정할 코드 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void updateCode(CodeVO codeVO) throws Exception {
		codeDAO.updateCode(codeVO);
	}
}
