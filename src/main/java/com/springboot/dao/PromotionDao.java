package com.springboot.dao;

import com.springboot.model.Promotion;

import java.util.Map;
import java.util.HashMap;

public class PromotionDao {
    public Map<String, Promotion> loadAllPromotions() {
        Map<String, Promotion> allPromotions = new HashMap<String, Promotion>();
        String[] pros = {"ITEM000000", "ITEM000001", "ITEM000005"};
        allPromotions.put("pros1", new Promotion("BUY_TWO_GET_ONE_FREE", pros));
        return allPromotions;
    }
}
