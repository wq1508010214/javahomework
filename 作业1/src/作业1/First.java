package 作业1;
import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;
Scanner s=new Scanner(System.in);
System.out.print("请输入一个整数：");
n=s.nextInt();
F1 a=new F1();
a.F(n);
	}

}

class F1{
	public int F(int k){
		
		if(k>5000)
			System.out.println(k);
		else{
			System.out.println(k);
			
			F(2*k);	
		}
	
		return 0;
		}
	}
	
	
	

