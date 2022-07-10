package com.example.springboot2.mapper;

import com.example.springboot2.model.TbSqbBillMonth;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface TbSqbBillMonthMapper {
    TbSqbBillMonth findOne(Integer id);

    void insert(TbSqbBillMonth tbSqbBillMonth);
}
