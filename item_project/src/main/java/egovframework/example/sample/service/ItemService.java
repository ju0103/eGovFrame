package egovframework.example.sample.service;

import java.util.List;

public interface ItemService {
	
	/**
	 * item을 추가한다.
	 * @param itemVO - 추가할 item 정보가 담긴 VO
	 * @throws Exception
	 */
	public void insertItem(ItemVO itemVO) throws Exception;
	
	/**
	 * item 목록을 조회한다.
	 * @return item 목록
	 * @throws Exception
	 */
	public List<?> selectItemList(ItemVO itemVO) throws Exception;
}
