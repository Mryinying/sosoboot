package com.it.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.jooq.generated.tables.pojos.StudentInfo;
import com.it.service.StuService;

@Controller
@RequestMapping("/stu")
public class StuManageController {
	
	@Autowired
	private StuService stuService;
	
	@ModelAttribute
    public void modelAttribute(HttpServletResponse response,HttpServletRequest request,Model model,String tab){
		model.addAttribute("tab", tab);
	}
	
	@RequestMapping("/add")  
    public String hi(Model model) {  
        return "stu/addStu"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    }  

	@PostMapping("/insertStu")
	public String insertStu(StudentInfo info) {
		stuService.insertStu(info);
		return "redirect:/stu/stuList?tab=a2";
	}
	
	@GetMapping("/stuList")
	public String fidStuList(StudentInfo info,Model model) {
		List<StudentInfo> stuList = stuService.fidStuList();
		model.addAttribute("list", stuList);
		return "stu/stuList";
	}
}
