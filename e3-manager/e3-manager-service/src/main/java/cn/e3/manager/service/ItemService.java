package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
	
	/**
	 * 根据商品id查询商品数据
	 * 参数 Long itemId
	 * 返回值 TbItem对象
	 */
	
	public TbItem findItemById(Long itemId)throws Exception;
}
