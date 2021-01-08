package org.zerock.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//Java 설정의 경우
//@ContextConfiguration(classes = { org.zerock.config.RootConfig.class)
@Log4j
public class TimeMapperTests {

	@Setter(onMethod_ = @Autowired)
	
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		
		log.info("-----------------");
		log.info(timeMapper.getClass().getName());
		log.info("-----------------");
		log.info(timeMapper.getTime());
	}

	@Test
	public void testGetTime2() {
		assertNotNull(timeMapper.getTime2());
		log.info(timeMapper.getTime2());
	}
}
