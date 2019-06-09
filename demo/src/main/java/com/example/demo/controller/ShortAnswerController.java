package com.example.demo.controller;

import com.example.demo.entity.ShortAnswer;
import com.example.demo.service.ShortAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shortanswer")
@CrossOrigin // 需要跨域
public class ShortAnswerController {

    @Autowired
    private ShortAnswerService shortAnswerService;



    @ResponseBody
    @PostMapping("")
    public List<ShortAnswer> selectAll() {

        List<ShortAnswer> shortAnswers=shortAnswerService.selectAll();
        return  shortAnswers;
    }

    @ResponseBody
    @PostMapping("/rand")
    public List<ShortAnswer> selectRand() {

        List<ShortAnswer> shortAnswers=shortAnswerService.selectrand();
        return  shortAnswers;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "textcontent") String textcontent,
                      @RequestParam(value = "key1") String key1,
                      @RequestParam(value = "key2") String key2,
                      @RequestParam(value = "key3") String key3,
                      @RequestParam(value = "result") String result) {
        return shortAnswerService.insert(textcontent,key1,key2,key3,result);
    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return shortAnswerService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "textcontent") String textcontent,
                          @RequestParam(value = "key1") String key1,
                          @RequestParam(value = "key2") String key2,
                          @RequestParam(value = "key3") String key3,
                          @RequestParam(value = "result") String result) {
        return shortAnswerService.updateById(id,textcontent,key1,key2,key3,result);
    }

    @ResponseBody
    @PostMapping("/select")
    public ShortAnswer selectById(@RequestParam(value = "id")Integer id){
        return shortAnswerService.selectById(id);
    }

}
