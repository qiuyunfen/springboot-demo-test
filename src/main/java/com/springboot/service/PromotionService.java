package com.springboot.service;

import com.springboot.dao.PromotionDao;
import com.springboot.model.Promotion;

import java.util.List;
import java.util.Map;

public class PromotionService {
    PromotionDao promotionDao = new PromotionDao();

    public Map<String, String> loadPromotionByBarcode(List<String> barcodes) {
        List<Promotion> allPromotions = promotionDao.loadAllPromotions();
        return promotionDao.loadPromotionByBarcode(barcodes, allPromotions);
    }
}
