package com.springboot.dao;


import com.springboot.model.Item;

import java.util.HashMap;
import java.util.Map;


public class ItemDao {
    public Map<String, Item> loadAllItems() {
        Map<String, Item> allItems = new HashMap<String, Item>();
        allItems.put("item1", new Item("ITEM000000", "可口可乐", "瓶", 3.00));
        allItems.put("item2", new Item("ITEM000001", "雪碧", "瓶", 3.00));
        allItems.put("item3", new Item("ITEM000002", "苹果", "斤", 5.50));
        allItems.put("item4", new Item("ITEM000003", "荔枝", "斤", 15.00));
        allItems.put("item5", new Item("ITEM000004", "电池", "个", 2.00));
        allItems.put("item6", new Item("ITEM000005", "方便面", "袋", 4.50));
        return allItems;
    }
}
