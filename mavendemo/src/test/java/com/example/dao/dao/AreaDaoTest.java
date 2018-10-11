package com.example.dao.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dao.entity.Area;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
	@Autowired
	private AreaDao areaDao;
	@Test
	public void testQueryArea() {
		List<Area> areaList=areaDao.queryArea();
		assertEquals(2, areaList.size());  //断言测试
	}

	@Test
	@Ignore
	public void testQueryAreaById() {
		List<Area> areaList=areaDao.queryArea();
		assertEquals(2, areaList.size());  //断言测试
	}

	@Test
	@Ignore
	public void testInsertArea() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testUpdateArea() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testDeleteArea() {
		fail("Not yet implemented");
	}

}
