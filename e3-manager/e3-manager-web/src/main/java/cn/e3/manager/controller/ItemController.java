package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {

	/**
	 * 需求: 根据商品id查询商品数据 参数:Long itemId 返回值: TbItem
	 */

	// 注入service服务对象
	@Autowired
	private ItemService itemService;

	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId) throws Exception {
		// 调用service 方法
		TbItem item = itemService.findItemById(itemId);
		return item;
	}
}
