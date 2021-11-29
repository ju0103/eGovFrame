package egovframework.example.sample.service.impl;

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
	
}