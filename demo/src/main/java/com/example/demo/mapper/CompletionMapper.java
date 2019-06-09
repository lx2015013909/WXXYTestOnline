package com.example.demo.mapper;

import com.example.demo.entity.Completion;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompletionMapper {

    List<Completion> selectAll();
    List<Completion> selectrand();
    Integer insert(String textcontent, String result);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String textcontent,String result);
    Completion selectById(Integer id);
}
