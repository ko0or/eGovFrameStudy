/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.sample.service.impl;

import java.util.List;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import egovframework.example.sample.service.EgovSampleService;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("deptService")
@Slf4j
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService {

	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		log.info("### 순서 예상 ==> 인터페이스 오버라이딩된 자식요소가 대신 실행 ==> 2번");
		deptDAO.insertDept(vo);
		return "dao 실행했음";
	}


}
