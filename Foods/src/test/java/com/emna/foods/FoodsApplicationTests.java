package com.emna.foods;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emna.foods.entities.Foods;
import com.emna.foods.entities.Types;
import com.emna.foods.repos.FoodsRepository;

@SpringBootTest
class FoodsApplicationTests {

		@Autowired
	private FoodsRepository FoodsRepository;
		/*@Test
	public void testCreateFoods() {
		Foods p = new Foods("Piza",22.500,new Date());
		FoodsRepository.save(p);
	}
	
	
	
	@Test
	public void testUpdateFoods()
	{
		Foods p = FoodsRepository.findById(1L).get();
	p.setPrixFoods(10.0);
	FoodsRepository.save(p);
	}
	@Test
	public void testListerTousFoods()
	{
	List<Foods> prods = FoodsRepository.findAll();
	for (Foods p : prods)
	{
	System.out.println(p);
	}
	}
	/*@Test
	public void testDeleteFoods()
	{
		FoodsRepository.deleteById(1L);
	}
	
	@Test
	public void testFindByNomFoods()
	{
	List<Foods> prods = FoodsRepository.findByNomFoods("Pizza");
	for (Foods p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomFoodsContains ()
	{
	List<Foods> prods=FoodsRepository.findByNomFoodsContains("Pizza");
	for (Foods p : prods)
	{
	System.out.println(p);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Foods> prods = FoodsRepository.findByNomPrix("Pizza",10.0);
	for (Foods p : prods)
	{
	System.out.println(p);
	}
	}
	
	

	
	*/
  
	@Test
	public void testfindByTypes()
	{
		Types Types= new Types();
		Types.setIdTypes(1L);
	    List<Foods> prods= FoodsRepository.findByTypes(Types);
	    for (Foods p : prods)
	    {
	      System.out.println(p);
	     }
	}
	
	
	
	@Test
		public void findByTypesIdTypes()
		{
		List<Foods> prods= FoodsRepository.findByTypesIdTypes(1L);
		for (Foods p : prods)
		{
		    System.out.println(p);
		}
		 
		}
		
	
	
}





