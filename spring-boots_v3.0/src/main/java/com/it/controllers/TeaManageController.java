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

import com.it.jooq.generated.tables.pojos.TeacherInfo;
import com.it.service.TeaService;

@Controller
@RequestMapping("/tea")
public class TeaManageController {
	
	@Autowired
	private TeaService teaService;
	
	@ModelAttribute
    public void modelAttribute(HttpServletResponse response,HttpServletRequest request,Model model,String tab){
		model.addAttribute("tab", tab);
	}
	
	@RequestMapping("/add")  
    public String hi(Model model) {  
        return "tea/addTea"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    }  

	@PostMapping("/insertTea")
	public String insertStu(TeacherInfo info) {
		teaService.insertTea(info);
		return "redirect:/tea/teaList?tab=a2";
	}
	
	@GetMapping("/teaList")
	public String fidStuList(TeacherInfo info,Model model) {
		List<TeacherInfo> teaList = teaService.fidTeaList();
		model.addAttribute("list", teaList);
		return "tea/teaList";
	}
}
