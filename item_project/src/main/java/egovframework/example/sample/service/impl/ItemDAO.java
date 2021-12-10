package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.ItemVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("itemDAO")
public class ItemDAO extends EgovAbstractDAO {
	
	/**
	 * item을 추가한다.
	 * @param itemVO - item 정보가 담긴 VO
	 * @throws Exception
	 */
	public void insertItem(ItemVO itemVO) throws Exception {
		insert("itemDAO.insertItem", itemVO);
	}
	
	/**
	 * item 목록을 조회한다.
	 * @return item 목록
	 * @throws Exception
	 */
	public List<?> selectItemList(ItemVO itemVO) throws Exception {
		return list("itemDAO.selectItemList", itemVO);
	}
}
