package fushi;

import java.util.ArrayList;
import java.util.List;

public class baoli {
	
	
	//Old Bill
	
	
	
	//�ټ�����
	public void HundreadProblem(int n)
	{
		
		
		
		
	}
	
	
	
	//2.1��7�޹ص�����
	public void SevenNumber()
	{
		//���ܱ�7������ʮ���Ʊ�ʾ���е����ֲ���7
		for(int i =0;i<=100;i++)
		{
			if(i%7==0 || !isContainsSeven(i))
			{
				continue;
			}
			System.out.println(i*i);
		}
	}
	public boolean isContainsSeven(int n)
	{
		while(n!=0)
		{
			if(n%10==7)
			{
				return true;
			}
			n/=10;
		}
		return false;
	}
	
	
	
	//2-3--->�Գ�ƽ����
	public  void pingfangshu()
	{
		for(int i=0;i<=256;i++)
		{
			if(i*i==Reverse(i*i))
			{
				System.out.print(i+"\t");
			}
		}
	}
	
	
	
	
	//2-2
	//һ����λ���������������
	public  void fanxushu()
	{
		for(int i=1000;i<9999;i++)
		{
			if(i*9==Reverse(i))
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	public  int Reverse(int n)
	{
		int res=0;
		List<Integer> list=new ArrayList<Integer>();
		while(n!=0)
		{
			list.add(n%10);
			res*=10;
			res+=n%10;
			n/=10;
		}
//		Collections.reverse(list);
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		return res;
		
	}
	
	
	//2-1
	//abc+bcc=532
	//a!=0 b!=0
	public void abs()
	{
	
		//List<Integer> list=new ArrayList<Integer>();
		int temp=0;
		for(int a=1;a<=9;a++)
		{
			for(int b=1;b<=9;b++)
			{
				for(int c=0;c<=9;c++)
				{
					temp=a*100+b*10+c+b*100+c*10+c;
					if(temp==532)
					{
						System.out.println("a="+a+"\t"+"b="+b+"\t"+"c="+c);
					}
				}
			}
		}
		
		
	}
}
