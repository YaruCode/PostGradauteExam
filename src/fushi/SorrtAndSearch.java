package fushi;

import java.util.*;
import java.util.stream.*;


public class SorrtAndSearch {

	
	//3-7 �����һ�����ԵĴ���
	
	
	
	
	
	//3-6 ���ֲ�
	//���ֲ��ҷ���x���±�,�����ڷ���-1
	//���ֲ���Ҫ�������������������ģ��������������޷����ж��ֲ���
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
				//�м�ı���Ҫ���ҵ�Ҫ��
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
	//���볤��Ϊn����������a[]��������Ҵ���m,�����������b[1...m],���YES����NO
	public void YesOrNo()
	{
		
        System.out.println("�����������С");
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.valueOf(scanner.nextInt());
        int index=0;
        System.out.println("�����뼯������");
        scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        while(index<num1)
        {
            list.add(Integer.valueOf(scanner.nextInt()));
            index++;
        }
        System.out.println("��������������С");
        num1=Integer.valueOf(scanner.nextInt());
        List<Integer> list1=new ArrayList<Integer>();
        System.out.println("�������������");
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
	
	
	
	
	
	
	//3-3 �ҳ�x
	public void findX()
	{
		System.out.println("���������ֵ�����");
		Scanner scanner=new Scanner(System.in);
		int num=Integer.valueOf(scanner.nextInt());
		System.out.println("������������ͣ��ո�ֿ�");
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
		
		System.out.println("��������Ҫ���ҵ�����:");
		scanner=new Scanner(System.in);	
		scanner=new Scanner(System.in);
		int find=Integer.valueOf(scanner.nextInt());
		
		index=list.indexOf(find);
		
		System.out.println(index);
		
		
	}
	
	
	
	
	
	//3-2 �ɼ�����
	//��һά���鱣��ѧ�źͳɼ���Ȼ���ճɼ��������
	//�����Ŀ����Ƕ�������һ���ṹ�������ȡ��װ����Ȼ��������
	public void SortWithGrades()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ѧ������");
        int num = Integer.valueOf(scanner.nextInt());
        //������һ�����鱣��һ�¶�Ӧ��ѧ�źͳɼ�
        System.out.println("�밴��ָ����ʽ����ѧ�źͳɼ�");
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
	
	
	
	
	
	
	
	
	//3-1 �������n�����ֽ�������
	public void SortWithUserInput()
	{
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("�������һ�е�һ������");
		Scanner scanner=new Scanner(System.in);
		list.add(Integer.valueOf(scanner.next()));
		System.out.println("������ڶ��е�һ������");
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
