package egovframework.example.sample.service.impl;

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
	
}
