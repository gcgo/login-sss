package com.gcgo.controller;

import com.gcgo.pojo.Resume;
import com.gcgo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    //查询所有
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Resume> resumeList = resumeService.findAll();
        //        for (Resume resume : resumeList) {
        //            System.out.println(resume);
        //        }
        model.addAttribute("resumeList", resumeList);
        return "list";
    }

    //跳转到添加简历页面
    @RequestMapping("/addResumePage")
    public String showform() {
        return "addResumePage";
    }

    //添加
    @RequestMapping(value = "/save")
    public String save(Resume resume) {
        resumeService.save(resume);
        return "redirect:/resume/findAll";//跳转到查询所有
    }

    //查询单个，并进入编辑页面
    @RequestMapping(value = "/editResume/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Resume one = resumeService.findById(id);
        model.addAttribute("one", one);
        return "editResumePage";
    }

    //编辑并更新
    @RequestMapping(value = "/editsave")
    public String editsave(@ModelAttribute("") Resume resume) {
        System.out.println(resume.getId());
        resumeService.save(resume);
        return "redirect:/resume/findAll";//跳转到查询所有
    }

    //删除
    @RequestMapping(value = "/deleteResume/{id}")
    public String delete(@PathVariable Long id) {
        resumeService.deleteById(id);
        return "redirect:/resume/findAll";//跳转到查询所有
    }



}
