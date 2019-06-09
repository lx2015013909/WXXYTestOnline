package com.example.demo.service;

import com.example.demo.entity.Completion;
import com.example.demo.mapper.CompletionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompletionService {

    @Autowired
    private CompletionMapper completionMapper;


    public List<Completion> selectAll(){
        return completionMapper.selectAll();
    }

    public List<Completion> selectrand(){
        return  completionMapper.selectrand();
    }

    public Integer insert(String textcontent,String result){
       return  completionMapper.insert(textcontent,result);
    }

    public Integer deleteById(Integer id){
        return completionMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String textcontent,String result){
        return  completionMapper.updateById(id,textcontent,result);
    }

    public Completion selectById(Integer id){
        return completionMapper.selectById(id);
    }
}
