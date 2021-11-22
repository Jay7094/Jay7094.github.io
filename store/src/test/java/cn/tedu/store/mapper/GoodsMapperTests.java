package cn.tedu.store.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Goods;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsMapperTests {
	
	@Autowired
	GoodsMapper mapper;
	
	@Test
	public void findHotList(){
		List<Goods> list = mapper.findHotList();
		System.err.println("Begin:");
		for(Goods item : list){
			System.err.println(item);
		}
		System.err.println("End:");
	}
	
	@Test
	public void findById(){
		long id = 10000042L;
		Goods result = mapper.findById(id);
		System.err.println(result);
	}
}
