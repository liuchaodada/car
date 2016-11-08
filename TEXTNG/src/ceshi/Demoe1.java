package ceshi;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demoe1 {
	@BeforeClass
	public void a(){
		System.out.println("111");
	}
	@Test
	public void b(){
		System.out.println("111");
	}
}
