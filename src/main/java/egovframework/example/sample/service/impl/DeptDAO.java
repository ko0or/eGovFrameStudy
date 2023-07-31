package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import lombok.extern.slf4j.Slf4j;

@Repository("deptDAO")
@Slf4j
public class DeptDAO extends EgovAbstractDAO {

	public String insertDept(DeptVO vo) throws Exception {
		log.info("### 순서 예상 ==> 정보 접근 요소 ==> 3번");
		return (String) insert("deptDAO.insertDept", vo);
	}
}
