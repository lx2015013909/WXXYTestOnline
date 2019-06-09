package com.example.demo.service;

import com.example.demo.entity.Choice;
import com.example.demo.mapper.ChoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceService {

    @Autowired
    private ChoiceMapper choiceMapper;


    public List<Choice> selectAll(){
        return choiceMapper.selectAll();
    }

    public  List<Choice> selectrand(){
        return choiceMapper.selectrand();
    }

    public Integer insert(String textcontent,String choice1,String choice2,String choice3,String choice4,String result){
       return  choiceMapper.insert(textcontent,choice1,choice2,choice3,choice4,result);
    }

    public Integer deleteById(Integer id){
        return choiceMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String textcontent,String choice1,String choice2,String choice3,String choice4,String result){
        return  choiceMapper.updateById(id,textcontent,choice1,choice2,choice3,choice4,result);
    }

    public Choice selectById(Integer id){
        return choiceMapper.selectById(id);
    }
}
