package com.example.demo.controller;

import com.example.demo.entity.Choice;
import com.example.demo.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/choice")
@CrossOrigin // 需要跨域
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;



    @ResponseBody
    @PostMapping("")
    public List<Choice> selectAll() {

        List<Choice> choices=choiceService.selectAll();
        return  choices;
    }

    @ResponseBody
    @PostMapping("/rand")
    public List<Choice> selectRand() {

        List<Choice> choices=choiceService.selectrand();
        return  choices;
    }



    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "textcontent") String textcontent,
                      @RequestParam(value = "choice1") String choice1,
                      @RequestParam(value = "choice2") String choice2,
                      @RequestParam(value = "choice3") String choice3,
                      @RequestParam(value = "choice4") String choice4,
                      @RequestParam(value = "result") String result) {
        return choiceService.insert(textcontent,choice1,choice2,choice3,choice4,result);
    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return choiceService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "textcontent") String textcontent,
                          @RequestParam(value = "choice1") String choice1,
                          @RequestParam(value = "choice2") String choice2,
                          @RequestParam(value = "choice3") String choice3,
                          @RequestParam(value = "choice4") String choice4,
                          @RequestParam(value = "result") String result) {
        return choiceService.updateById(id,textcontent,choice1,choice2,choice3,choice4,result);
    }

    @ResponseBody
    @PostMapping("/select")
    public Choice selectById(@RequestParam(value = "id")Integer id){
        return choiceService.selectById(id);
    }

}
