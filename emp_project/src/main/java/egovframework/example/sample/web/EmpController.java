package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;

@Controller
public class EmpController {
	
	/** EmpService */
	@Resource(name = "empService")
	private EmpService empService;

	/**
	 * 사원 등록 화면을 조회한다.
	 * @return "empWrite"
	 */
	@RequestMapping(value = "/empWrite.do")
	public String empWrite() {
		return "emp/empWrite";
	}
	
	/**
	 * 사원을 등록한다.
	 * @param empVO - 등록할 사원 정보가 담긴 VO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/empWriteSave.do")
	public String empWriteSave(EmpVO empVO) throws Exception {
		empService.insertEmp(empVO);
		return "";
	}
}
