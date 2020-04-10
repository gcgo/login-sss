package com.gcgo.controller;

import com.gcgo.pojo.Resume;
import com.gcgo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Resume> resumeList = resumeService.findAll();
//        for (Resume resume : resumeList) {
//            System.out.println(resume);
//        }
        model.addAttribute("resumeList", resumeList);
        return "list";
    }
    @RequestMapping("/addResumePage")
    public String showform(){
        return "addResumePage";
    }
    @RequestMapping(value="/save")
    public String save(Resume resume){
        resumeService.save(resume);
        return "redirect:/resume/findAll";//跳转到查询所有
    }
}
