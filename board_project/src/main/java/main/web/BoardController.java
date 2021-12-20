package main.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String boardWriteSave(BoardVO boardVO) throws Exception {
		String result = boardService.insertBoard(boardVO);
		
		if (result == null) {
			System.out.println("저장 완료");
		} else {
			System.out.println("저장 실패");
		}
		
		return "";
	}
}
