package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class StringTest {
	@Test
	public void stringTest(){
		String str ="ABC";
		String str1= new String("Abc");
		
		System.out.println(str.equals(str1));
		
		System.out.println(StringUtils.hasLength(""));
		System.out.println(StringUtils.hasText(" "));
	}
	@Test
	public void stringTest1(){
	    String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
	    char[] ch = str.toCharArray();
	    int index = 0, n, z;
	    for (int i = 0; i < str.length(); i++) {
	        if (ch[i] == '�p') {
//	            i++;
	            z = i+1;
	            if (ch[z] == '�s') {
	                n = i + 2;
	                if (n < str.length() && ch[n] == '�k') {
	                    index++;
	                }
	            }
	        }
	    }
	    System.out.println(index);
	}

	@Test
	public void stringTest2(){
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		int i=0,index=0;
		String ans ="�p�s�k";
		while(str.indexOf(ans,i)!=-1) {
//			int found =str.indexOf(ans,i);				
			i=str.indexOf(ans,i)+ans.length();
			index++;
			i++;
	}
		System.out.println(index);
}
	@Test
	public void stringTest3() {
	    String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
	    int index = 0;

	    while (str.indexOf("�p�s�k") >= 0) {
	        int indexFound = str.indexOf("�p�s�k");
	        str = str.substring(indexFound + 3);
	        index++;
	    }

	    System.out.println(index);
	}
	@Test
	public void trimTest() {
		String str = "ABC";
		String str1 = " ABF ADC";
		System.out.println(str.equals(str1));
		str = str.trim();
	}
	@Test
	public void changeTest() {
		String str = "ABACADEF";
		int index = str.lastIndexOf("A");
		StringBuffer sb = new StringBuffer(str);
		sb.setCharAt(index,'W');
		System.out.print(sb);
	}
	@Test
	public void scanTest() {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		int add[]={0},x=0,i,j,Ans;

//		for(i=x-1;i>=0;i--)
//		{
//		 if(A[i]=='{')
//		 {
//		  for(j=i;j<x;j++)
//		  {
//		      if(A[j]=='}')
//		      {
//		    if((i+j)%2==1)
//		    {
//		    A[i]='0';
//		    A[j]='0';
//		    Ans=0;
//		    break;
//		    }
//		    else
//		   {
//		    Ans=1;
//		     break;
//		    }
//		  }
//		  }
//		}
//	}
//		for(i=0;i<x;i++)if(A[i]!='0')Ans=1;
//		if(Ans==0)System.out.print("CORRECT");
//		else if(Ans==1)System.out.print("ERROR");
//
	}
//	@Test
//	public void stringBufferTest2() {
//		Scanner scan = new Scanner(System.in);
//	}
//	
}
