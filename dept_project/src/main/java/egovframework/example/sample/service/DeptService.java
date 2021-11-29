package egovframework.example.sample.service;

public interface DeptService {
	
	/**
	 * 부서를 등록한다.
	 * @param vo - 등록할 부서 정보가 담긴 DeptVO
	 * @return 등록 결과
	 * @throws Exception
	 */
	String insertDept(DeptVO vo) throws Exception;
}