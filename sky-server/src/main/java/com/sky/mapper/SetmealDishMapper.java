package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品Id查对应套餐Id
     * @param dishIds
     * @return
     */
    public List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量插入
     * @param setmealDishes
     */
    void insetBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id批量删除
     * @param setmealIds
     */
    void deleteBySetmealIds(List<Long> setmealIds);
}
