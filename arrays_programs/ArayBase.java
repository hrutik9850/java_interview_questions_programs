class ArayBase 
{
	public static void main(String[] args) 
	{
		int [] al1={3,44,55, 'a',66,3,5 };
		long [] al2={34,55,888888888l,334,5};
		short [] al3={22,33,44,6,(short)300885,334};
		System.out.println(al1[3]);
		System.out.println(al2[4]);
		System.out.println(al3[4]);
		System.out.println(al1.length);
		System.out.println(al2.length);
		System.out.println(al3.length);
		int l1=al1.length;
		int l2=al2.length;
		int l3=al3.length;
		//System.out.println("="+l1);
		System.out.println("=============================================\n");
		for(int i=0;i<l1;i++)
		System.out.print("  "+al1[i]);
		System.out.println();
		System.out.println("=============================================");
		for (int i=0;i<l2;i++)
			System.out.print("  "+al2[i]);
			System.out.println();
		System.out.println("=============================================");
		for (int i=0;i<l3;i++)
		System.out.print("  "+al3[i]);
		
	}
}
