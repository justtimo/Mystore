package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

public class ItemSeviceImpl implements ItemService{
  @Autowired
  private TbItemMapper itemMapper;


  @Override
  public TbItem getItemById(long itemId) {
    TbItem item=itemMapper.selectByPrimaryKey(itemId);
    return item;
  }
  
}
