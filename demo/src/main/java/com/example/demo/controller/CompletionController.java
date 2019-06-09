package com.example.demo.controller;

import com.example.demo.entity.Completion;
import com.example.demo.service.CompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/completion")
@CrossOrigin // 需要跨域
public class CompletionController {

    @Autowired
    private CompletionService completionService;



    @ResponseBody
    @PostMapping("")
    public List<Completion> selectAll() {

        List<Completion> completions=completionService.selectAll();
        return  completions;
    }
    @ResponseBody
    @PostMapping("/rand")
    public List<Completion> selectRand() {

        List<Completion> completions=completionService.selectrand();
        return  completions;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "textcontent") String textcontent,
                      @RequestParam(value = "result") String result) {
        return completionService.insert(textcontent,result);
    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return completionService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "textcontent") String textcontent,
                          @RequestParam(value = "result") String result) {
        return completionService.updateById(id,textcontent,result);
    }

    @ResponseBody
    @PostMapping("/select")
    public Completion selectById(@RequestParam(value = "id")Integer id){
        return completionService.selectById(id);
    }

}
