package fushi;

import java.util.*;
import java.util.stream.*;


public class SorrtAndSearch {

	
	//3-7 这个是一个测试的代码
	
	
	
	
	
	//3-6 二分查
	//二分查找返回x的下表,不存在返回-1
	//二分查找要求给出来的数组是有序的，对于无序数组无法进行二分查找
	public int BinarySearch(int[] nums,int x)
	{
		int low=0;
		int high=nums.length-1;
		int mid;
		while(low<high)
		{
			mid=(low+high);
			if(nums[mid]==x)
			{
				return mid;
			}
			if(nums[mid]>x)
			{
				//中间的比想要查找的要大
				low=mid+1;
			}
			if(nums[mid]<x)
			{
				high=mid-1;
			}
		}
		
		return -1;
		
	}
	
	
	
	
	
	
	//3-5
	//输入长度为n，输入数组a[]，输出查找次数m,输入查找数字b[1...m],输出YES或者NO
	public void YesOrNo()
	{
		
        System.out.println("请输入数组大小");
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.valueOf(scanner.nextInt());
        int index=0;
        System.out.println("请输入集合数组");
        scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        while(index<num1)
        {
            list.add(Integer.valueOf(scanner.nextInt()));
            index++;
        }
        System.out.println("请输入查找数组大小");
        num1=Integer.valueOf(scanner.nextInt());
        List<Integer> list1=new ArrayList<Integer>();
        System.out.println("请输入查找数组");
        index=0;
        while(index<num1)
        {
            list1.add(Integer.valueOf(scanner.nextInt()));
            index++;
        }
        for(int i=0;i<list1.size();i++)
        {
            if(list.contains(list1.get(i)))
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
	}
	
	
	
	
	
	
	//3-3 找出x
	public void findX()
	{
		System.out.println("请输入数字的数量");
		Scanner scanner=new Scanner(System.in);
		int num=Integer.valueOf(scanner.nextInt());
		System.out.println("请输入数据组和，空格分开");
		scanner=new Scanner(System.in);
		int index=0;
		int temp=0;
		List<Integer> list=new ArrayList<Integer>();
		while(index<num)
		{
			temp=Integer.valueOf(scanner.nextInt());
			list.add(temp);
			index++;
		}
		
		System.out.println("请输入需要查找的数字:");
		scanner=new Scanner(System.in);	
		scanner=new Scanner(System.in);
		int find=Integer.valueOf(scanner.nextInt());
		
		index=list.indexOf(find);
		
		System.out.println(index);
		
		
	}
	
	
	
	
	
	//3-2 成绩排序
	//用一维数组保存学号和成绩，然后按照成绩排序输出
	//这个题目最好是定义利用一个结构体或者类取封装，让然后做排序
	public void SortWithGrades()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num = Integer.valueOf(scanner.nextInt());
        //先声明一个数组保存一下对应的学号和成绩
        System.out.println("请按照指定格式输入学号和成绩");
        scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int index = 0;
        String temp = "";
        while (index < num) {
            temp = scanner.nextLine();
            String[] datas = temp.split(" ");
            int key = Integer.valueOf(datas[0]);
            int value = Integer.valueOf(datas[1]);
            map.put(key, value);
            index++;
        }
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();      map.entrySet().stream().sorted((p1, p2) -> p1.getValue().compareTo(p2.getValue())).collect(Collectors.toList()).forEach(x -> res.put(x.getKey(), x.getValue()));
        map.entrySet().stream().sorted((p1, p2) -> p1.getValue().compareTo(p2.getValue())).collect(Collectors.toList()).forEach(entry->
                System.out.println(entry.getKey() + " " + entry.getValue()));

		
	}
	
	
	
	
	
	
	
	
	//3-1 对输入的n个数字进行排序
	public void SortWithUserInput()
	{
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("请输入第一行的一个数字");
		Scanner scanner=new Scanner(System.in);
		list.add(Integer.valueOf(scanner.next()));
		System.out.println("请输入第二行的一串数字");
		Scanner	scanner1=new Scanner(System.in);
		while(scanner1.hasNext())
		{
			list.add(Integer.valueOf(scanner1.next()));
		}
		list.stream().sorted().collect(Collectors.toList());
		scanner.close();
		scanner1.close();
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
	}
	
	
	
	
}
