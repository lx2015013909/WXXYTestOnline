package com.example.demo.mapper;

import com.example.demo.entity.ShortAnswer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShortAnswerMapper {

    List<ShortAnswer> selectAll();
    List<ShortAnswer> selectrand();
    Integer insert(String textcontent, String key1, String key2, String key3, String result);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String textcontent, String key1, String key2, String key3,String result);
    ShortAnswer selectById(Integer id);
}
