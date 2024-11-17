class CLA
{
	public static void main(String[]args)
{
	int i;
	int sum=0;
	for(i=0;i<args.length;i++)
	{
		//System.out.println(args[i]);
		sum+=Integer.parseInt(args[i]);
	}
	System.out.println(sum);
}
}