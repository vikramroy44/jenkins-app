package java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParllStreamDemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=0, start=0;
		long endTime =0, end=0;
		 startTime = System.currentTimeMillis();
		IntStream.range(1,5000).forEach(System.out::println);
		endTime = System.currentTimeMillis();
		//(endTime-startTime);
		System.out.println("Total Time Of Execution :" + (endTime-startTime));
		
		System.out.println("#####################");
		
		start = System.currentTimeMillis();
		IntStream.range(1,5000).parallel().forEach(System.out::println);
		end= System.currentTimeMillis();
		//(endTime-startTime)
		System.out.println("Total Time Of Execution :" + (endTime-startTime));
		System.out.println("Total Time Of ||l Execution :" + (end-start));

	}

}
