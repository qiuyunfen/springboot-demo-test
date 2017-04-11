package com.springboot.service;

import com.springboot.dao.ItemDao;
import com.springboot.model.Item;
import java.util.Map;

/**
 * Created by qiuyf on 17-4-11.
 */
public class ItemService {
    ItemDao itemDao = new ItemDao();

    public Map<String, Item> loadAllItems() {
        Map<String, Item> allItems = itemDao.loadAllItems();
        return  allItems;
    }
}
