package egovframework.example.sample.service.impl;

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
}
