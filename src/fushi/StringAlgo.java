package fushi;
import java.util.*;
import java.lang.*;
public class StringAlgo {

	
	
	
	
	
	
	
	public void TraverseString(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	
	
	//实现java中String的插入功能
	public String InsertString(String insertedString,int index,String insert)
	{
		String newString="";
		for(int i=0;i<insertedString.length();i++)
		{
			newString+=insertedString.charAt(i);
			if(i==index)
			{
				newString+=insert;
			}
		}
		return newString;
	}
}
