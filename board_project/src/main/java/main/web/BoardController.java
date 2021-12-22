package main.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	// 게시물 목록
	@RequestMapping(value = "/boardList.do")
	public String boardList(BoardVO boardVO, Model model) throws Exception {
		List<?> boardList = boardService.selectBoardList(boardVO);
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
	
	// 게시물 상세 내용 조회
	@RequestMapping(value = "/boardDetail.do")
	public String boardDetail(int bno, Model model) throws Exception {
		// 조회수 증가
		boardService.updateHits(bno);
		
		// 게시물 상세 내용 조회
		BoardVO boardDetail = boardService.selectBoardDetail(bno);
		model.addAttribute("boardDetail", boardDetail);
		return "board/boardDetail";
	}
	
}
