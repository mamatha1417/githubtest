package automationproject;

import java.util.ArrayList;
import java.util.List;

public class Iterativeloop {

	public static void main(String[] args) {
	/*	int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		List<String> x=new ArrayList<>();
		x.add("selenium");
		x.add("automation");
		x.add("hello");
		x.add("10");
		x.add("BY");
		System.out.println(x.size());
		for(int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i));
		}
		}

}
