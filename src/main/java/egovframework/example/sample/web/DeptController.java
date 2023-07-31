package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DeptController {
	
	@Resource(name = "deptService")
	private DeptService deptService;
	
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	@RequestMapping(value = "/deptWriteSave.do")
//	public String deptWriteSave(String deptno, String dname) {
		public String deptWriteSave(DeptVO dept) throws Exception {
		log.info("부서번호 :"+dept.getDeptno());
		log.info("부서이름 :"+dept.getDname());
		log.info("부서위치 :"+dept.getLoc());
		
		log.info("### 순서 예상 ==> 컨트롤러  ==> 1번");
		String result = deptService.insertDept(dept);
		log.info("@# result => " + result);
		return "";
	}
	
}