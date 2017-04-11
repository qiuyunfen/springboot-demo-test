package com.springboot.service;

import com.springboot.dao.PromotionDao;
import com.springboot.model.Promotion;

import java.util.Map;

public class PromotionService {
    PromotionDao promotionDao = new PromotionDao();

    public Map<String, Promotion> loadAllPromotions() {
        return promotionDao.loadAllPromotions();
    }
}
