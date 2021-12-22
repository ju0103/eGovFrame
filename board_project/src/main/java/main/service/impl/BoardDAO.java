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
	
	/**
	 * 게시물 상세 내용 조회
	 * @param boardVO
	 * @return 게시물 상세 내용
	 * @throws Exception
	 */
	public BoardVO selectBoardDetail(int bno) throws Exception {
		return (BoardVO) select("boardDAO.selectBoardDetail", bno);
	}
	
	/**
	 * 게시물 조회수 증가
	 * @param bno
	 * @throws Exception
	 */
	public void updateHits(int bno) throws Exception {
		update("boardDAO.updateHits", bno);
	}
	
	/**
	 * 게시물 수정
	 * @param boardVO
	 * @return 수정 결과(int형)
	 * @throws Exception
	 */
	public int updateBoard(BoardVO boardVO) throws Exception {
		return update("boardDAO.updateBoard", boardVO);
	}
}
