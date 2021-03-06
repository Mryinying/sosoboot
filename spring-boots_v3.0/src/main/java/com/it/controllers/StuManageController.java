package com.it.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it.jooq.generated.tables.pojos.StudentInfo;
import com.it.jooq.model.Result;
import com.it.service.StuService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/stu")
@Api(tags="学生信息管理api")
public class StuManageController {
	
	@Autowired
	private StuService stuService;
	
	@ModelAttribute
    public void modelAttribute(HttpServletResponse response,HttpServletRequest request,Model model,String tab){
		model.addAttribute("tab", tab);
	}
	
	@GetMapping("/add")  
	@ApiOperation(value="学生新增页面")
    public String hi(Model model) {  
        return "stu/addStu"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    }  

	@PostMapping("/insertStu")
	@ApiOperation(value="学生新增方法")
	@ApiImplicitParam(name="info",value="学生信息",required=true)
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
	
	@GetMapping("/stuListAjax")
	@ResponseBody
	@ApiOperation(value="查询所有")
	@Cacheable(value="W",key="#root.targetClass")
	public Result fidStuListAjax() {
		List<StudentInfo> stuList = stuService.fidStuList();
		return Result.success("stuList", stuList);
	}
	
	@PostMapping(value="/fidStu")
	@ResponseBody
	@ApiOperation(value="查询stu")
	@ApiImplicitParam(name="id",value="查询stu",required=true)
	@Cacheable(value="W",key="#id")
//	@CacheEvict(value = "user", key = "#id", condition = "#root.target.canCache() and #root.caches[0].get(#user.id).get().username ne #user.username", beforeInvocation = true)
	public Result fidStuById(Integer id,HttpServletRequest request){
		
//		BufferedReader reader = request.getReader();
//		String str,buffer = null;
//		if((str = reader.readLine()) != null) {
//			buffer += reader.readLine();
//		}
		
		StudentInfo stu = stuService.findById(id);
		return Result.success("stuList", stu);
	}
}
