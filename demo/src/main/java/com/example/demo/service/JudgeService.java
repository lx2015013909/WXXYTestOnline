package com.example.demo.service;

import com.example.demo.entity.Judge;
import com.example.demo.mapper.JudgeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudgeService {

    @Autowired
    private JudgeMapper judgeMapper;


    public List<Judge> selectAll(){
        return judgeMapper.selectAll();
    }

    public List<Judge> selectrand(){
        return judgeMapper.selectrand();
    }

    public Integer insert(String textcontent,Integer result){
       return  judgeMapper.insert(textcontent,result);
    }

    public Integer deleteById(Integer id){
        return judgeMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String textcontent,String result){
        return  judgeMapper.updateById(id,textcontent,result);
    }

    public Judge selectById(Integer id){
        return judgeMapper.selectById(id);
    }
}
