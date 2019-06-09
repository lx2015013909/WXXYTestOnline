package com.example.demo.service;

import com.example.demo.entity.ShortAnswer;
import com.example.demo.mapper.ShortAnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortAnswerService {

    @Autowired
    private ShortAnswerMapper shortAnswerMapper;


    public List<ShortAnswer> selectAll(){
        return shortAnswerMapper.selectAll();
    }

    public List<ShortAnswer> selectrand(){ return  shortAnswerMapper.selectrand();}

    public Integer insert(String textcontent,String key1,String key2,String key3,String result){
       return  shortAnswerMapper.insert(textcontent,key1,key2,key3,result);
    }

    public Integer deleteById(Integer id){
        return shortAnswerMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String textcontent,String key1,String key2,String key3,String result){
        return  shortAnswerMapper.updateById(id,textcontent,key1,key2,key3,result);
    }

    public ShortAnswer selectById(Integer id){
        return shortAnswerMapper.selectById(id);
    }
}
