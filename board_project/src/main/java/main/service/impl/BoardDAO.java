package main.service.impl;

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
}
