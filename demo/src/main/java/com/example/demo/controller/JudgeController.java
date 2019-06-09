package com.example.demo.controller;

import com.example.demo.entity.Judge;
import com.example.demo.service.JudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/judge")
@CrossOrigin // 需要跨域
public class JudgeController {

    @Autowired
    private JudgeService judgeService;



    @ResponseBody
    @PostMapping("")
    public List<Judge> selectAll() {

        List<Judge> judges=judgeService.selectAll();
        return  judges;
    }

    @ResponseBody
    @PostMapping("/rand")
    public List<Judge> selectRand() {

        List<Judge> judges=judgeService.selectrand();
        return  judges;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "textcontent") String textcontent,
                      @RequestParam(value = "result") Integer result) {
        return judgeService.insert(textcontent,result);
    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return judgeService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "textcontent") String textcontent,
                          @RequestParam(value = "result") String result) {
        return judgeService.updateById(id,textcontent,result);
    }

    @ResponseBody
    @PostMapping("/select")
    public Judge selectById(@RequestParam(value = "id")Integer id){
        return judgeService.selectById(id);
    }

}
