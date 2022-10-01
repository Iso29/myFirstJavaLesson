package ilkAyucunTasklar;

import java.lang.Math;

public class Tasks {
	public static boolean task7(String st){
		if(st.isEmpty()) {
			return false;
		}
		for(int i=0;i<st.length();i++) {
			char sag=st.charAt(i);
			char sol=st.charAt(st.length()-1-i);
			if(sag!=sol){
				return false;
			}
		}return true;
		
	}
	
	public static void task1(int value) {
		for(int i=0;i<=value;i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}
			
		}
	}
	
	public static void task2(int value) {
		int sum=0;
		for(int i=1;i<value;i++) {
			if(value%i==0) {
				sum++;
			}
		}
		if(sum==1) {
			System.out.println(value+" is simple");
		}else {System.out.println(value+" is not simple");}
	}
	
	public static void task2n2(int value){
		for(int i=0;i<=value;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum++;
				}
			}if(sum==1) {
				System.out.print(i+",");
			}
		}
		
		
	}
	
	public static void task3(int value) {
		int sum=0;
		while(value>0) {
			int qaliq = value%10;
			value=value/10;
			System.out.print(qaliq+" ");
			sum+=qaliq;
		}
		System.out.println("   ");
		System.out.println(sum);
		
	}
	
	public static int task5(int value) {
		int sum=0;
		while(value>0) {
			value=value/10;
			sum++;
		}
		return sum;
	}
	
	public static int task6withfor(int value) {
		int result=1;
		for(int i=1;i<=value;i++) {
			result=result*i;
		}
		return result;
	}
	
	public static int task6withoutfor(int value) {
		if(value==0) {
			return 1;
		}
		else {
			return (value*task6withoutfor(value-1));
		}
	}
	public static boolean CheckreverseOfInt(int value) {
		int newint = 0;
		while(value>0) {
			int qaliq = value%10;
			value=value/10;
			newint=(newint+qaliq)*10;
		}newint=newint/10;
		if (value!=newint) {
			return false ;
		}
		else {
			return true;
		}
	}
	
	public static int reverseOfInt(int value) {
		int newint = 0;
		while(value>0) {
			int qaliq = value%10;
			value=value/10;
			newint=(newint+qaliq)*10;
		}newint=newint/10;
		return newint;
	}
	
	public static boolean task8(int value) {
		if(value==reverseOfInt(value)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void task9(int a, char c, boolean altAlta)
	{
		if (altAlta == true) {
			for (int i = 0 ; i < a ; i++){
				System.out.println(c);
			}
			
		}
		else {
			System.out.print(c);
		}
	}
	
	public static void task85(int a, int b, int c)
	{
		if(a<=b) {
			for(int i=a;i<=b;i++) {
				System.out.print(Math.pow(i,c)+" ");
			}
		}
		else {
			System.out.println("Error!");
		}
		
	}
	
	public static boolean task13(int[] arr) {
		if(arr==null) {
			return false;
		}
		else {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						return true;
					}
					
				}
			}return false;
		}
	}
	
	public static boolean task14(int[] arr) {
		if(arr==null) {
			return false;
		}
		else {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						return false;
					}
					
				}
			}return true;
		}
	}
	
	public static char task15(String st,int i) {
		return st.charAt(i);
	}
	
	public static boolean task16(String st1,String st2) {
		if(st1.equalsIgnoreCase(st2)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void task17(String st,char c,int count) {
		for(int i=0;i<count;i++) {
			st+=c;
		}
		System.out.println(st);
	}
	
	public static boolean task18(String st1,String st2,String st3) {
		if(st3.matches(st1) && st3.matches(st2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void task19(String st,int begin,int end) {
		System.out.println(st.charAt(begin));
		System.out.println(st.charAt(end));
	}
	
	public static String task20(String s1,String s2) {
		if(s1.length()>s2.length()) {
			return s1;
		}
		else if (s1.length()<s2.length()) {
			return s2;
		}
		else
			return "";
	}

}
