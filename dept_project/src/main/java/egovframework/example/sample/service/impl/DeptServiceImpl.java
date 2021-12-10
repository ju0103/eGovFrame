package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	/** DeptDAO */
	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	/**
	 * 부서를 등록한다.
	 * @param vo - 등록할 부서 정보가 담긴 DeptVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		return deptDAO.insertDept(vo);
	}

	/**
	 * 부서 목록을 조회한다.
	 * @param deptVO - 조회할 부서 정보가 담긴 VO
	 * @return 부서 목록
	 * @exception Exception
	 */
	@Override
	public List<?> selectDeptList(DeptVO deptVO) throws Exception {
		return deptDAO.selectDeptList(deptVO);
	}

	/**
	 * 부서 상세 내역을 조회한다.
	 * @param deptno
	 * @return 부서 상세 내역
	 * @exception Exception
	 */
	@Override
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		return deptDAO.selectDeptDetail(deptno);
	}

	/**
	 * 부서를 삭제한다.
	 * @param deptno - 삭제할 부서번호
	 * @return int형
	 * @exception Exception
	 */
	@Override
	public int deleteDept(int deptno) throws Exception {
		return deptDAO.deleteDept(deptno);
	}

	/**
	 * 부서 정보를 수정한다.
	 * @param - deptVO - 수정할 부서 정보가 담긴 VO
	 * @return int형
	 * @exception Exception
	 */
	@Override
	public int updateDept(DeptVO deptVO) throws Exception {
		return deptDAO.updateDept(deptVO);
	}
	
}