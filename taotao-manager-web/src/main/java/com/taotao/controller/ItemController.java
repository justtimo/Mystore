package com.taotao.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
public class ItemController {
  @Resource
  private ItemService itemService;
  @RequestMapping("/item/{itemId}")
  @ResponseBody
  public TbItem getItemById(@PathVariable Long itemId) {
      TbItem tbItem = itemService.getItemById(itemId);
      return tbItem;
  }
  
}
