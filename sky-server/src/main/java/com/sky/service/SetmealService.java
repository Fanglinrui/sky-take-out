package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetmealService {

    /**
     * 新增套餐,同时还有套餐和菜品的关联信息
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);
}
