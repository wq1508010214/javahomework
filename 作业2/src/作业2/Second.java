package 作业2;
import java.util.Scanner;  

public class Second {  
  
    static int a[][]=new int[20][20];//默认值为0  
  
    static void t(int a[][],int b,int s,int d){//a是存储方阵元素的数组,b为每个方阵的起始位置；d是为a数组赋值的整数；s是方阵的阶数  
        int j,h=b,v=b;  
        if(s==0) return;          // 递归出口    
        if(s==1)   
        { a[h][v]=d;return;} 
        for(j=1;j<s;j++)          // 一圈的左列从上至下递增      
        { a[h][v]=d;h++;d++;}  
        for(j=1;j<s;j++)          // 一圈的下行从左至右递增      
        { a[h][v]=d;v++;d++;}  
        for(j=1;j<s;j++)          // 一圈的右列从下至上递增      
        { a[h][v]=d;h--;d++;}  
        for(j=1;j<s;j++)          // 一圈的上行从右至左递增      
        { a[h][v]=d;v--;d++;}  
        t(a,b+1,s-2,d);           // 调用内一圈递归函数    
  
    }  
    public static void main(String[] args) {  
        int h,v,b,p,s,d,n;  
        Scanner in=new Scanner(System.in);  
        n=in.nextInt();  
        b=1;s=n;d=1;  
        t(a,b,s,d);  
          
        for(h=1;h<=n;h++)   
          { for(v=1;v<=n;v++)   
            System.out.print(a[h][v]+" ");  
          System.out.println();  
                    
          }  
    }  
}  