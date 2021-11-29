package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
public class DeptController {
	
	/** DeptService */
	@Resource(name = "deptService")
	private DeptService deptService;
	
	/**
	 * 부서 등록 화면을 조회한다.
	 * @return "deptWrite"
	 */
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	/**
	 * 부서를 등록한다.
	 * @param deptVO - 등록할 부서 정보가 담긴 VO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptWriteSave.do")
	public String deptWriteSave(DeptVO vo) throws Exception {
		deptService.insertDept(vo);
		return "";
	}
}
