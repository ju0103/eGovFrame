package main.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import main.service.BoardService;
import main.service.BoardVO;

@Controller
public class BoardController {

	@Resource(name = "boardService")
	private BoardService boardService;
	
	// 게시물 등록 화면
	@RequestMapping(value = "/boardWrite.do")
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	// 게시물 등록
	@RequestMapping(value = "/boardWriteSave.do")
	@ResponseBody
	public String boardWriteSave(BoardVO boardVO) throws Exception {
		String result = boardService.insertBoard(boardVO);
		String msg = "";
		
		if (result == null) {
			msg = "ok";
		} else {
			msg = "fail";
		}
		
		System.out.println("board write msg >> " + msg);
		return msg;
	}
}
