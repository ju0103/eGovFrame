package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	/** EmpDAO */
	@Resource(name="empDAO")
	private EmpDAO empDAO;

	/**
	 * 사원을 등록한다.
	 * @param vo - 등록할 사원 정보가 담긴 EmpVO
	 * @return	등록 결과
	 * @exception Exception
	 */
	@Override
	public String insertEmp(EmpVO vo) throws Exception {
		return empDAO.insertEmp(vo);
	}

	/**
	 * 사원 목록을 조회한다.
	 * @param empVO - 조회할 사원 정보가 담긴 EmpVO
	 * @return 사원 목록
	 * @exception Exception
	 */
	@Override
	public List<?> selectEmpList(EmpVO empVO) throws Exception {
		return empDAO.selectEmpList(empVO);
	}
	
}
