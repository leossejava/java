class AreaCircl3
{
public static void main(String[] args){
	area obj=new area();
	obj.get(18);
	obj.cal();
	obj.disp();
	}
}
class area
{
	int r;
	double c;
	void get(int x)
	{
		r=x;
	}
	void cal()
	{
		c=r*r*3.14;
	}
	void disp(){
		System.out.println("Area of circle= "+c);
	}
}
