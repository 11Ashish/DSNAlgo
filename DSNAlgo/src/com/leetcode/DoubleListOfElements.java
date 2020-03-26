package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DoubleListOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
m1(l);
		//m1(l).forEach(x->System.out.println(x));
		/*l.clear();
		l.add(10.0);
		l.add(20.0);
		m1(l).forEach(x->System.out.println(x));*/
		
	}

	private static void m1(List<Number> l) {
		
		// TODO Auto-generated method stub
		Class<? extends List> s=l.getClass();
		System.out.println(s);
		List<Number> doubleElements=null;;
		for(Object o:l){
			if (o instanceof Integer) {
				List<Integer> v = (List<Integer>)(List<?>) l;
				doubleElements=v.stream().map(x->x*2).collect(Collectors.toList());
				doubleElements.forEach(x->System.out.println(x));
				//return doubleElements;
				//break;
		    }
		    else if (o instanceof Double) {
		    	List<Double> v = (List<Double>)(List<?>) l;
		    	doubleElements=v.stream().map(x->x*2).collect(Collectors.toList());
		    	doubleElements.forEach(x->System.out.println(x));
		    	//return doubleElements;
		    //	break;
		    }
		   /* else if (o instanceof Byte) {
		    	List<Byte> v = (List<Byte>)(List<?>) l;
		    	break;
		    }
			*/
			
		}
			// doubleElements=v.stream().map(x->x*2).collect(Collectors.toList());
			
		
	//return doubleElements;
		//return doubleElements;
		
	}
	/*private static List<Double> m1(List<Double> d) {
		// TODO Auto-generated method stub
		List<Double>li=d;
		List<Double> doubleElements=li.stream().map(x->x*2).collect(Collectors.toList());
		return doubleElements;
		
	}*/
	
}
