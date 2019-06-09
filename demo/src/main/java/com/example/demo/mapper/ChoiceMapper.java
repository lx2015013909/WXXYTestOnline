package com.example.demo.mapper;

import com.example.demo.entity.Choice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ChoiceMapper {

    List<Choice> selectAll();
    List<Choice> selectrand();
    Integer insert(String textcontent, String choice1, String choice2, String choice3, String choice4,String result);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String textcontent, String choice1, String choice2, String choice3, String choice4,String result);
    Choice selectById(Integer id);
}
