package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.Repositories.*;
import com.controller.pojo.*;

@Controller
@EnableJpaRepositories
//@ComponentScan("com.bd.service")
public class HelloController {
	
@Autowired
 private TableMainRepository tableMainRepository;
@Autowired	
private FmmInfraRepository fmmInfraRepository;
@Autowired
private PhotoUploadRepository photoUploadRepository;



public List<FmmPhotoInfrastruture> getAllphotodata(){
	return (List<FmmPhotoInfrastruture>) photoUploadRepository.findAll();
	
}

@RequestMapping(value="/photo")
public String  photo(Model model , @RequestParam(value="name1", required=false ,defaultValue="orgsl not found" ) Long  test) {
	List<FmmPhotoInfrastruture> fmmPhotoInfra=getAllphotodata();
	System.out.println(fmmPhotoInfra.size());
	if(fmmPhotoInfra.size( )> 0)
     test=fmmPhotoInfra.get(0).getPhotoSlNo();
	model.addAttribute("test", test);
	return "hello";
	
}

    
	public List<FmmInfrastructure> findByincharge(String incharge){
		return fmmInfraRepository.findByincharge(incharge);
	}
	
	public List<FmmInfrastructure> findByorgSlNo(Long orgSlNo){
		return  fmmInfraRepository.findByorgSlNo(orgSlNo);
		
	}
	@RequestMapping(value="/orgslno")
	public String Infra (Model model , @RequestParam(value="orgSlNo" ,defaultValue="xxxxxxx")  String test ) {
		List<FmmInfrastructure> fmmInfrastructures=findByorgSlNo(Long.valueOf(25));
		System.out.println(fmmInfrastructures.size());
    	if(fmmInfrastructures.size()>0)
		test=fmmInfrastructures.get(0).getPatternExam();
    String	test1=fmmInfrastructures.get(0).getHeavyDutyFlooring();
    Long test2=fmmInfrastructures.get(0).getTrackCenterDistanceBetweenLines();
		model.addAttribute("test" ,test);
		model.addAttribute("test1", test1);
		model.addAttribute("test2", test2);
		return "hello";
	}
	
	List<FmmOrgMTable> getAllData() {
	    return (List<FmmOrgMTable>) tableMainRepository.findAll();
	}
	
//	@GetMapping("/FmmOrgMTable/{orgSlNo}/OrgType")
//	public List<FmmOrgMTable> retrieveFmmtable(@PathVariable Long orgSlNo) {
//		return tableMainRepository.retrieveOrgType(orgSlNo);
//	}
	
	@RequestMapping(value = "/Data")
	public String Demo(Model model , @RequestParam(value="name" ,defaultValue="xxxxxxxxxxxx") String test) {
		List<FmmOrgMTable> listfmm=getAllData();
		test=listfmm.get(2).getOrgType();
	
		model.addAttribute("test" ,test);
		return "hello";
	}
	
	
//	
//	@GetMapping("/FmmOrgMTable/{orgSlNo}/RohCapacity")
//	public List<FmmOrgMTable> retriveorgsl(@PathVariable String studentId) {
//		return tableMainRepository.retriveorgsl(orgSlNo);
//	}


    @RequestMapping(value= {"/hello","/hello2"})
    public String hello1(Model model, @RequestParam(value="name", required=false, defaultValue="World") String test ,@RequestParam(value="name1", required=false, defaultValue="World") String test1) {
    	List<FmmOrgMTable> listFmmorg=getAllData();
    	 test1 = listFmmorg.get(0).getOrgDesc();
    	
		//"FmmOrgMTable";
    	model.addAttribute("name", "Name: nakul this is test......for finding value of 25");
    	model.addAttribute("test" , "CRIS test this is test for finding db value of 25");
    	
    	
    	List<FmmInfrastructure> listfmmminfra=findByincharge("nakul");
    	System.out.println(listfmmminfra.size());
    	if(listfmmminfra.size()>0)
    			test1=listfmmminfra.get(0).getRohCapacity();//Capacity();
    	model.addAttribute("test1", test1);
        return "hello";
    }
    
    public List<FmmOrgMTable> getAllDetails() {
		return (List<FmmOrgMTable>) tableMainRepository.findAll();
	}
 
    @RequestMapping("/hello1")
    public String hello2(Model model, @RequestParam(value="name", required=false, defaultValue="Hey Baby") String test) {
    	List<FmmInfrastructure> listfmmminfra=findByincharge("nakul");
    	System.out.println(listfmmminfra.size());
    	if(listfmmminfra.size()>0)
    			test=listfmmminfra.get(0).getRohCapacity();//Capacity();
    	model.addAttribute("test", test);
        return "hello";
    }
    

  
//    @RequestMapping(value = "/tablemaindata", method = RequestMethod.GET)
//	public String showAllPosts(Model model) {
//		model.addAttribute("test", tableMainRepository.findAll());
//		return "tablemaindata";
//	}
//  
//	@RequestMapping(Value="/AnnexureB",method=RequestMethod.POST)
//	public PageB AnnexureB(@ModelAttribute User user ) {
//	PageB pageB=new PageB();
//	pageB.setViewName("AnnexureB Data");
//	pageB.addObject("AnnexureB", user);
//	return pageB;
//	}
//	


//    @RequestMapping(value="/index")
//    
//    public String page1(Model model, @RequestParam(value="name", required=false, defaultValue="Worldhjhhbgjh") String name) {
//    	model.addAttribute("test", name);
//    	return "index"; 
//    }

    
//    
//    @RequestMapping(value="/hello",method= RequestMethod.GET)
//    
//    public String page2(ModelMap model) {
//    	
//    	return "layout/hello";
    
//    @RequestMapping(value="/hello")
//  
//    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
//        model.addAttribute("name", name);
//        return "layout/hello";
//    }
//    


@RequestMapping(value="/annexureB", method=RequestMethod.GET)
    public String page3(Model model)  {
    	model.addAttribute("FmmOrgMTable");
    	return "layout/AnnexureB"; 
    }
    
  /*   
    @RequestMapping(value="/annexureB", method=RequestMethod.POST)
    public String page3aSubmit(@ModelAttribute FmmInfrastructure fmmOrgInfrastructure,  Model model )  {
    	model.addAttribute("fmmOrgInfrastructure", fmmOrgInfrastructure);
    	FormTableRepo.save(fmmOrgInfrastructure);
    	
    	return "layout/AnnexureB"; 
    }
    
    */
  
 
   @RequestMapping(value="/annexureC" , method=RequestMethod.GET)
    public String page4() {
    	return "layout/AnnexureC"; 
    }
    
    @RequestMapping(value="/annexureC" , method=RequestMethod.POST)
    public String page4a() {
    	return "layout/AnnexureC"; 
    }
    
    @RequestMapping(value="/annexureD" , method=RequestMethod.GET)
    public String page5() {
    	return "layout/AnnexureD"; 
    }
    
    @RequestMapping(value="/annexureD" , method=RequestMethod.POST)
    public String page5a() {
    	return "layout/AnnexureD"; 
    }
    
    }
    
  
    