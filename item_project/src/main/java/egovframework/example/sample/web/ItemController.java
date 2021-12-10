package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.ItemService;
import egovframework.example.sample.service.ItemVO;

@Controller
public class ItemController {
	
	@Resource(name = "itemService")
	private ItemService itemService;
	
	/**
	 * item 등록 화면
	 * @param itemVO
	 * @return "itemWrite"
	 */
	@RequestMapping(value = "/itemWrite.do")
	public String itemWirte(ItemVO itemVO) {
		return "item/itemWrite";
	}
	
	/**
	 * item 등록
	 * @param itemVO
	 * @return "writeResult"
	 * @throws Exception
	 */
	@RequestMapping(value = "/writeResult.do")
	public String writeResult(ItemVO itemVO) throws Exception {
		
		itemService.insertItem(itemVO);
		return "item/writeResult";
	}
	
	/**
	 * item 목록
	 * @param itemVO
	 * @param model
	 * @return "itemList"
	 * @throws Exception
	 */
	@RequestMapping(value = "/itemList.do")
	public String itemList(@ModelAttribute("itemVO") ItemVO itemVO, Model model) throws Exception {
		
		List<?> itemList = itemService.selectItemList(itemVO);
		model.addAttribute("itemList", itemList);
		
		return "item/itemList";
	}
}
