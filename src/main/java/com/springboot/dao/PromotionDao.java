package com.springboot.dao;

import com.springboot.model.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PromotionDao {
    public List<Promotion> loadAllPromotions() {
        List<Promotion> allPromotions = new ArrayList<Promotion>();
        String[] pros = {"ITEM000000", "ITEM000001", "ITEM000005"};
        allPromotions.add(new Promotion("BUY_TWO_GET_ONE_FREE", pros));
        return allPromotions;
    }

    public Map<String, String> loadPromotionByBarcode(List<String> barcodes, List<Promotion> allPromotions) {
        Map<String, String> promotions = new HashMap<String, String>();
        for(int i = 0; i < allPromotions.size(); i++) {
            Promotion pi = allPromotions.get(i);
            for(int j = 0; j < pi.getBarcodes().length; j++) {
                String barcode = pi.getBarcodes()[j];
                if(barcodes.contains(barcode)) {
                    promotions.put(barcode, pi.getType());
                }
            }
        }
        return promotions;
    }
}
