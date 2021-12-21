package main.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO {
	
	/**
	 * 게시물 등록
	 * @param boardVO - 등록할 게시물 정보가 담긴 VO
	 * @return
	 * @throws Exception
	 */
	public String insertBoard(BoardVO boardVO) throws Exception {
		return (String) insert("boardDAO.insertBoard", boardVO);
	}
	
	/**
	 * 게시물 목록
	 * @param boardVO
	 * @return 게시물 목록
	 * @throws Exception
	 */
	public List<?> selectBoardList(BoardVO boardVO) throws Exception {
		return list("boardDAO.selectBoardList", boardVO);
	}
}
