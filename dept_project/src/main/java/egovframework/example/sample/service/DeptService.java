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

	/**
	 * 부서 상세 내역을 조회한다.
	 * @param deptno
	 * @return 부서 상세 내역
	 * @throws Exception
	 */
	DeptVO selectDeptDetail(int deptno) throws Exception;

	/**
	 * 부서를 삭제한다.
	 * @param deptno - 삭제할 부서번호
	 * @return int형
	 * @throws Exception
	 */
	int deleteDept(int deptno) throws Exception;
	
	/**
	 * 부서 정보를 수정한다.
	 * @param deptVO - 수정할 부서 정보가 담긴 VO
	 * @return int형
	 * @throws Exception
	 */
	int updateDept(DeptVO deptVO) throws Exception;
}