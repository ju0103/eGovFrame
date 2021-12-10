package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.ItemService;
import egovframework.example.sample.service.ItemVO;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Resource(name = "itemDAO")
	private ItemDAO itemDAO;
	
	/**
	 * item을 추가한다.
	 */
	@Override
	public void insertItem(ItemVO itemVO) throws Exception {
		itemDAO.insertItem(itemVO);
	}

	/**
	 * item 목록을 조회한다.
	 */
	@Override
	public List<?> selectItemList(ItemVO itemVO) throws Exception {
		return itemDAO.selectItemList(itemVO);
	}

}
