package com.cts.platform.SpringSample;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestEnviroment {
	
	public int sum(int i,int k){
		return i+k;
	}
	@Test
	public void test(){
		assertEquals("SuccessFull",5,sum(2,3));
		//assertEquals("Failed",3,sum(2,3));
		assertEquals("SuccessFull",8,sum(5,3));
		assertEquals("Failed",9,sum(2,3));
		
	}
	
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(TestEnviroment.class);
		for(Failure f:r.getFailures()){
			System.out.println(f.toString());
			System.out.println(r.getFailureCount());
		}

	}

}
