package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;

@Controller
public class CodeController {

	@Resource(name = "codeService")
	private CodeService codeService;
	
	// 코드 등록 화면
	@RequestMapping(value = "/codeWrite.do")
	public String codeWrite() {
		return "code/codeWrite";
	}
	
	// 코드 등록
	@RequestMapping(value = "/codeWriteSave.do")
	public String codeWriteSave(CodeVO codeVo) throws Exception {
		codeService.insertCode(codeVo);
		return "redirect:codeList.do";
	}
	
	// 코드 목록 조회
	@RequestMapping(value = "/codeList.do")
	public String selectCodeList(CodeVO codeVO, ModelMap model) throws Exception {
		
		List<?> codeList = codeService.selectCodeList(codeVO);
		model.addAttribute("codeList", codeList);
		
		// 코드 총 갯수
		int total = codeService.selectCodeCount(codeVO);
		model.addAttribute("total", total);
		
		return "code/codeList";
	}
	
	// 코드 삭제
	@RequestMapping(value = "/deleteCode.do")
	public String deleteCode(CodeVO codeVO) throws Exception {
		codeService.deleteCode(codeVO);
		return "redirect:codeList.do";
	}
	
	// 코드 수정 화면
	@RequestMapping(value = "/modifyCode.do")
	public String modifyCode(CodeVO codeVO, Model model) throws Exception {
		CodeVO code = codeService.selectCodeDetail(codeVO);
		model.addAttribute("codeVo", code);
		return "code/codeModifyWrite";
	}
	
	// 코드 수정
	@RequestMapping(value = "/modifyCodeSave.do")
	public String modeifyCodeSave(CodeVO codeVO) throws Exception {
		codeService.updateCode(codeVO);
		return "redirect:codeList.do";
	}
}
