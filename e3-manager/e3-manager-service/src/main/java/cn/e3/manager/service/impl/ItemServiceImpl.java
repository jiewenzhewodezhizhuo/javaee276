package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {
	// 注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findItemById(Long itemId) throws Exception {
		/**
		 * 根据商品id查询商品数据 
		 * 参数 Long itemId 
		 * 返回值 TbItem对象
		 */

		TbItem item = itemMapper.selectByPrimaryKey(itemId);

		return item;
	}

}
