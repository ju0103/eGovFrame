package main.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.service.BoardService;
import main.service.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	/**
	 * 게시물 등록
	 * @param boardVO - 등록할 게시물 정보가 담긴 VO
	 * @return
	 * @throws Exception
	 */
	@Override
	public String insertBoard(BoardVO boardVO) throws Exception {
		return boardDAO.insertBoard(boardVO);
	}

	/**
	 * 게시물 목록
	 * @param boardVO
	 * @return 게시물 목록
	 * @throws Exception
	 */
	@Override
	public List<?> selectBoardList(BoardVO boardVO) throws Exception {
		return boardDAO.selectBoardList(boardVO);
	}

	/**
	 * 게시물 상세 내용 조회
	 * @param boardVO
	 * @return 게시물 상세 내용
	 * @throws Exception
	 */
	@Override
	public BoardVO selectBoardDetail(int bno) throws Exception {
		return boardDAO.selectBoardDetail(bno);
	}

	/**
	 * 게시물 조회수 증가
	 * @param bno
	 * @throws Exception
	 */
	@Override
	public void updateHits(int bno) throws Exception {
		boardDAO.updateHits(bno);
	}

}
