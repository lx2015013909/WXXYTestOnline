package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRecordService {

    @Autowired
    private TestRecordMapper testRecordMapper;

    @Autowired
    private ChoiceMapper choiceMapper;

    @Autowired
    private CompletionMapper completionMapper;

    @Autowired
    private JudgeMapper judgeMapper;

    @Autowired
    private ShortAnswerMapper shortAnswerMapper;


    public List<TestRecord> selectAll(){
        return testRecordMapper.selectAll();
    }


    public Integer insert(String name,String sid,Integer choiceid[],String choiceresult[],Integer completionid[],String completionresult[],Integer judgeid[],String judgeresult[],Integer shortanswerid[],String shortanswerresult[]){
      int choicecount=0,completioncount=0,judgecount=0,shortanswercount=0,score=0;
        Choice choice;
        Completion completion;
        Judge judge;
        ShortAnswer shortanswer;
        for(int i=0;i<10;i++)
        {
            choice=choiceMapper.selectById(choiceid[i]);
            if(choice.getResult().equals(choiceresult[i]))
            choicecount++;

        }
        for(int i=0;i<5;i++)
        {
            completion=completionMapper.selectById(completionid[i]);
            if(completion.getResult().equals(completionresult[i]))
                completioncount++;
            judge=judgeMapper.selectById(judgeid[i]);
            if(judge.getResult().equals(judgeresult[i]))
            judgecount++;
        }
        for(int i=0;i<2;i++)
        {
            shortanswer =shortAnswerMapper.selectById(shortanswerid[i]);
            if(shortanswerresult[i].contains(shortanswer.getKey1())){
                shortanswercount++;
            }
            if(shortanswerresult[i].contains(shortanswer.getKey2())){
                shortanswercount++;
            }
            if(shortanswerresult[i].contains(shortanswer.getKey3())){
                shortanswercount++;
            }
        }
        score=choicecount*2+completioncount*4+judgecount*3+shortanswercount*5;
       return  testRecordMapper.insert(name,sid,choicecount*2,completioncount*4,judgecount*3,shortanswercount*5,score);
    }

    public Integer deleteById(Integer id){
        return testRecordMapper.deleteById(id);
    }

}
