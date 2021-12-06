package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.EmpVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("empDAO")
public class EmpDAO extends EgovAbstractDAO {

	/**
	 * 사원을 등록한다.
	 * @param vo - 등록할 사원 정보가 담긴 EmpVO
	 * @return 등록 결과
	 * @throws Exception
	 */
	public String insertEmp(EmpVO vo) throws Exception {
		return (String) insert("empDAO.insertEmp", vo);
	}
	
	/**
	 * 사원 목록을 조회한다.
	 * @param empVO - 조회할 사원 정보가 담긴 EmpVO
	 * @return 사원 목록
	 * @throws Exception
	 */
	public List<?> selectEmpList(EmpVO empVO) throws Exception {
		return list("empDAO.selectEmpList", empVO);
	}
	
	/**
	 * 사원 상세 정보를 조회한다.
	 * @param empno - 조회할 사원의 사원번호
	 * @return 조회한 사원의 상세 정보
	 * @throws Exception
	 */
	public EmpVO selectEmpDetail(int empno) throws Exception {
		return (EmpVO) select("empDAO.selectEmpDetail", empno);
	}
}
