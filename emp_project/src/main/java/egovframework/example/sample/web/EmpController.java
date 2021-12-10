package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	/**
	 * 사원의 목록을 조회한다.
	 * @param empVO - 조회할 사원 정보가 담긴 EmpVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/empList.do")
	public String selectEmpList(@ModelAttribute("empVO") EmpVO empVO, ModelMap model) throws Exception {

		List<?> empList = empService.selectEmpList(empVO);
		model.addAttribute("empList", empList);

		return "emp/empList";
	}
	
	/**
	 * 사원 상세 정보를 조회한다.
	 * @param empno - 조회할 사원의 사원번호
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/empDetail.do")
	public String selectEmpDetail(int empno, ModelMap model) throws Exception {
		
		EmpVO vo = empService.selectEmpDetail(empno);
		model.addAttribute("empVO", vo);
		
		return "emp/empDetail";
	}
	
	/**
	 * 사원을 삭제한다.
	 * @param empno - 삭제할 사원의 사원번호
	 * @return int형
	 * @throws Exception
	 */
	@RequestMapping(value = "/deleteEmp.do")
	public String deleteEmp(int empno) throws Exception {
		
		int result = empService.deleteEmp(empno);
		System.out.println(">> delete result >> " + result);
		
		return "";
	}
	
	/**
	 * 사원 수정 화면을 조회한다.
	 * @param empno - 수정할 사원의 사원번호
	 * @param model
	 * @return "updateEmp"
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateEmp.do")
	public String updateEmp(int empno, Model model) throws Exception {

		EmpVO vo = empService.selectEmpDetail(empno);
		model.addAttribute("empVO", vo);
		
		return "emp/updateEmp";
	}
	
	/**
	 * 사원 정보를 수정한다.
	 * @param empVO - 수정할 사원의 정보가 담긴 VO
	 * @return "empList"
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateEmpSave.do")
	public String updateEmpSave(EmpVO empVO) throws Exception {
		
		int result = empService.updateEmp(empVO);
		System.out.println(">> update result >> " + result);
		
		return "redirect:empList.do";
	}
}
