package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	/**
	 * 부서 목록을 조회한다.
	 * @param deptVO - 조회할 부서 정보가 담긴 DeptVO
	 * @param model
	 * @return "deptList"
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptList.do")
	public String selectSampleList(@ModelAttribute("deptVO") DeptVO deptVO, ModelMap model) throws Exception {

		List<?> deptList = deptService.selectDeptList(deptVO);
		model.addAttribute("deptList", deptList);

		return "dept/deptList";
	}
	
	/**
	 * 부서 상세 내역을 조회한다.
	 * @param deptno
	 * @param model
	 * @return "deptDetail"
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptDetail.do")
	public String selectDeptDetail(int deptno, Model model) throws Exception {
		
		DeptVO deptVO = deptService.selectDeptDetail(deptno);
		model.addAttribute("deptDetail", deptVO);
		
		return "dept/deptDetail";
	}
	
	/**
	 * 부서를 삭제한다.
	 * @param deptno - 삭제할 부서번호
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deleteDept.do")
	public String deleteDept(int deptno) throws Exception {
		
		int result = deptService.deleteDept(deptno);
		System.out.println(">> delete result >>" + result);
		
		return "";
	}
	
	/**
	 * 부서 수정 화면을 조회한다.
	 * @param deptno - 수정할 부서번호
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateDept.do")
	public String updateDept(int deptno, Model model) throws Exception {

		DeptVO deptVO = deptService.selectDeptDetail(deptno);
		model.addAttribute("deptVO", deptVO);
		
		return "dept/updateDept";
	}
	
	/**
	 * 부서 정보를 수정한다.
	 * @param deptVO - 수정할 부서 정보
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateDeptSave.do")
	public String updateDeptSave(DeptVO deptVO) throws Exception {
		
		int result = deptService.updateDept(deptVO);
		System.out.println(">> update result >> " + result);
		
		return "";
	}
}
