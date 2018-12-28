package basics;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		long l = i;
		System.out.println("long is:"+l);
		long l1=125;
		int x=0;
		x=(int) (l1+2);
		System.out.println(x);
		int y;
		char c ='A';
		y=c;
		//c=(char) y;
		System.out.println(y);
		char b=50;
		b=(char) (b*2);
		System.out.println(b);
	}

}
