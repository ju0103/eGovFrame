package egovframework.example.sample.service;

public interface EmpService {
	
	/**
	 * 사원을 등록한다.
	 * @param vo - 등록할 사원의 정보가 담긴 EmpVO
	 * @return 등록 결과
	 * @throws Exception
	 */
	String insertEmp(EmpVO vo) throws Exception;
}
