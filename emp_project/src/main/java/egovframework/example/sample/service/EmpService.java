package egovframework.example.sample.service;

import java.util.List;

public interface EmpService {
	
	/**
	 * 사원을 등록한다.
	 * @param vo - 등록할 사원의 정보가 담긴 EmpVO
	 * @return 등록 결과
	 * @throws Exception
	 */
	String insertEmp(EmpVO vo) throws Exception;
	
	/**
	 * 사원 목록을 조회한다.
	 * @param empVO - 조회할 사원 정보가 담긴 EmpVO
	 * @return 사원 목록
	 * @throws Exception
	 */
	List<?> selectEmpList(EmpVO empVO) throws Exception;
	
	/**
	 * 사원 상세 정보를 조회한다.
	 * @param empno - 조회할 사원의 사원번호
	 * @return 조회한 사원의 상세 정보
	 * @exception Exception
	 */
	EmpVO selectEmpDetail(int empno) throws Exception;
}
