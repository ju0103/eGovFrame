package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

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
	
	@RequestMapping(value = "/empList.do")
	public String selectEmpList(@ModelAttribute("empVO") EmpVO empVO, ModelMap model) throws Exception {

		List<?> empList = empService.selectEmpList(empVO);
		model.addAttribute("empList", empList);

		return "emp/empList";
	}
}
