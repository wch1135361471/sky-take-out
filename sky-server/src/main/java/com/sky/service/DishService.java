package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {

    /*
        新增菜品和对应的口味
     */

    public void saveWithFlavor(DishDTO dishDTO);

    //菜品分页查询
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    //菜品的批量删除
    void deleteBatch(List<Long> ids);

    //根据id查询菜品和对应的口味数据
    DishVO getByIdWithFlavor(Long id);

    //根据id修改菜品的基本信息和口味信息
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 菜品起售停售
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);
}
