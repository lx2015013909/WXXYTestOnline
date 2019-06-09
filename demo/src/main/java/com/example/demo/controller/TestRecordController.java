package com.example.demo.controller;

import com.example.demo.entity.TestRecord;
import com.example.demo.service.TestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/testrecord")
@CrossOrigin // 需要跨域
public class TestRecordController {

    @Autowired
    private TestRecordService testRecordService;



    @ResponseBody
    @PostMapping("")
    public List<TestRecord> selectAll() {

        List<TestRecord> testRecords=testRecordService.selectAll();
        return  testRecords;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam (value = "name")String name,
                      @RequestParam (value = "sid")String sid,
                      @RequestParam (value = "choiceid")Integer choiceid[],
                      @RequestParam (value = "choiceresult")String choiceresult[],
                      @RequestParam (value = "completionid")Integer completionid[],
                      @RequestParam (value = "completionresult")String completionresult[],
                      @RequestParam (value = "judgeid")Integer judgeid[],
                      @RequestParam (value = "judgeresult")String judgeresult[],
                      @RequestParam (value = "shortanswerid")Integer shortanswerid[],
                      @RequestParam (value = "shortanswerresult")String shortanswerresult[]) {
        return testRecordService.insert(name,sid,choiceid,choiceresult,completionid,completionresult,judgeid,judgeresult,shortanswerid,shortanswerresult);
    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return testRecordService.deleteById(id);
    }



}
