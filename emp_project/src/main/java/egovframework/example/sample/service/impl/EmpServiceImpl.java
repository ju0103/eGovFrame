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

	/**
	 * 사원 상세 정보를 조회한다.
	 * @param empno - 조회할 사원의 사원번호
	 * @return 조회한 사원의 상세 정보
	 * @exception Exception
	 */
	@Override
	public EmpVO selectEmpDetail(int empno) throws Exception {
		return empDAO.selectEmpDetail(empno);
	}

	/**
	 * 사원을 삭제한다.
	 * @param empno - 삭제할 사원의 사원번호
	 * @return int형
	 * @exception Exception
	 */
	@Override
	public int deleteEmp(int empno) throws Exception {
		return empDAO.deleteEmp(empno);
	}

	/**
	 * 사원 정보를 수정한다.
	 * @param empVO - 수정할 사원 정보가 담긴 VO
	 * @return int형
	 * @exception Exception
	 */
	@Override
	public int updateEmp(EmpVO empVO) throws Exception {
		return empDAO.updateEmp(empVO);
	}
	
}
