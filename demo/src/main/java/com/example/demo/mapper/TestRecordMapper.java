package com.example.demo.mapper;

import com.example.demo.entity.TestRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestRecordMapper {

    List<TestRecord> selectAll();
    Integer insert(String name,String sid,Integer choice,Integer completion,Integer judge,Integer shortanswer,Integer score);
    Integer deleteById(Integer id);
}
