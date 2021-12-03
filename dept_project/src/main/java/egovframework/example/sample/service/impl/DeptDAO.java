package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {
	/**
	 * 부서를 등록한다.
	 * @param vo - 등록할 부서 정보가 담긴 DeptVO
	 * @return 등록 결과
	 * @throws Exception
	 */
	public String insertDept(DeptVO vo) throws Exception {
		return (String) insert("deptDAO.insertDept", vo);
	}

	/**
	 * 부서 목록을 조회한다.
	 * @param deptVO - 조회할 부서 정보가 담긴 VO
	 * @return 부서 목록
	 * @throws Exception
	 */
	public List<?> selectDeptList(DeptVO deptVO) throws Exception {
		return list("deptDAO.selectDeptList", deptVO);
	}
	
	/**
	 * 부서 상세 내역을 조회한다.
	 * @param deptno
	 * @return 부서 상세 내역
	 * @throws Exception
	 */
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		return (DeptVO) select("deptDAO.selectDeptDetail", deptno);
	}

}