package main.service;

import java.util.List;

public interface BoardService {
	
	/**
	 * 게시물 등록
	 * @param boardVO - 등록할 게시물 정보가 담긴 VO
	 * @return
	 * @throws Exception
	 */
	public String insertBoard(BoardVO boardVO) throws Exception;
	
	/**
	 * 게시물 목록
	 * @param boardVO
	 * @return 게시물 목록
	 * @throws Exception
	 */
	public List<?> selectBoardList(BoardVO boardVO) throws Exception;
}
