package com.icxl.shopingonline.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.icxl.shopingonline.model.Category;
import com.icxl.shopingonline.service.CategoryService;



//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring/dispatcher-servlet.xml")
//@ContextConfiguration(classes = { WebConfig.class, DataConfig.class })
public class CategoryTestCase {

	
private static AnnotationConfigApplicationContext context;
	
//	@Autowired
//	private  CategoryRepository categoryRepository ;
	
//	private static CategoryRepository categoryRepository;
	private static CategoryService categoryService;
//	@Autowired
//	private  CategoryService categoryService ;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.icxl.shopingonline");
		context.refresh();
//		categoryRepository =(CategoryRepository)context.getBean("categoryRepository");
		categoryService =(CategoryService)context.getBean("categoryService");
	}
	
	
	/*	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_105.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}*/
	
	@Test
	public void testGetCategory() {
//		System.out.println("conatains  ="+context.containsBean("categoryService"));
		category = categoryService.get(3);
//		
//		
//		String []  str= context.getBeanDefinitionNames();
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//			assertEquals("Successfully fetched a single category from the table!","categoryService",str[i]);
//		}
//		assertEquals("Successfully fetched a single category from the table!",true,context.containsBean("categoryService"));
		
		
	}
	
}
