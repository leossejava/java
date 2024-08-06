class Addtest
{
public static void main(String[] args){
	Add obj=new Add();
	obj.get();
	obj.cal();
	obj.disp();
	}
}
class Add
{
	int a;
	int b;
	int c;
	void get()
	{
		a=10;
		b=20;
	}
	void cal()
	{
		c=a+b;
	}
	void disp(){
		System.out.println("Output= "+c);
	}
}
