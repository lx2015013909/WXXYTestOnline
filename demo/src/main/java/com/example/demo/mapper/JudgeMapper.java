package com.example.demo.mapper;

import com.example.demo.entity.Judge;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface JudgeMapper {

    List<Judge> selectAll();
    List<Judge> selectrand();
    Integer insert(String textcontent,Integer result);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String textcontent,String result);
    Judge selectById(Integer id);
}
