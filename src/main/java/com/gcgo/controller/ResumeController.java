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
    public String showform() {
        return "addResumePage";
    }

    @RequestMapping(value = "/save")
    public String save(Resume resume) {
        resumeService.save(resume);
        return "redirect:/resume/findAll";//跳转到查询所有
    }

    @RequestMapping(value = "/editResume/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Resume one = resumeService.findById(id);
        model.addAttribute("one", one);
        return "editResumePage";
    }

    @RequestMapping(value = "/editsave")
    public String editsave(@ModelAttribute("") Resume resume) {
        System.out.println(resume.getId());
        resumeService.save(resume);
        return "redirect:/resume/findAll";//跳转到查询所有
    }

    @RequestMapping(value = "/deleteResume/{id}")
    public String delete(@PathVariable Long id) {
        resumeService.deleteById(id);
        return "redirect:/resume/findAll";//跳转到查询所有
    }

}
