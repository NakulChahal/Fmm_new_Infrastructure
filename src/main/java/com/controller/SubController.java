package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.Repositories.TableMainRepository;
import com.controller.pojo.FmmOrgMTable;

@Controller
@EnableJpaRepositories
//@RequestMapping("Subcontrol")
public class SubController {

	@Autowired
	private TableMainRepository tableMainRepository2;
	
	List<FmmOrgMTable> getAllData() {
	    return (List<FmmOrgMTable>) tableMainRepository2.findAll();
	 }
	
	@RequestMapping(value = "/orgdesc")
	public String Demo2(Model model , @RequestParam(value="name" ,defaultValue="xxxxxxxxxxxx") String test) {
		List<FmmOrgMTable> listfmm=getAllData();
		test=listfmm.get(5).getOrgDesc();
	
		model.addAttribute("test" ,test);
		return "hello";
	}
}