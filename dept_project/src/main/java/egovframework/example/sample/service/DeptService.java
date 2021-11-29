package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	
	/**
	 * 부서를 등록한다.
	 * @param vo - 등록할 부서 정보가 담긴 DeptVO
	 * @return 등록 결과
	 * @throws Exception
	 */
	String insertDept(DeptVO vo) throws Exception;
	
	/**
	 * 부서 목록을 조회한다.
	 * @param deptVO - 조회할 부서 정보가 담긴 VO
	 * @return 부서 목록
	 * @exception Exception
	 */
	List<?> selectDeptList(DeptVO deptVO) throws Exception;

}