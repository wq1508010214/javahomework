package ��ҵ2;
import java.util.Scanner;  

public class Second {  
  
    static int a[][]=new int[20][20];//Ĭ��ֵΪ0  
  
    static void t(int a[][],int b,int s,int d){//a�Ǵ洢����Ԫ�ص�����,bΪÿ���������ʼλ�ã�d��Ϊa���鸳ֵ��������s�Ƿ���Ľ���  
        int j,h=b,v=b;  
        if(s==0) return;          // �ݹ����    
        if(s==1)   
        { a[h][v]=d;return;} 
        for(j=1;j<s;j++)          // һȦ�����д������µ���      
        { a[h][v]=d;h++;d++;}  
        for(j=1;j<s;j++)          // һȦ�����д������ҵ���      
        { a[h][v]=d;v++;d++;}  
        for(j=1;j<s;j++)          // һȦ�����д������ϵ���      
        { a[h][v]=d;h--;d++;}  
        for(j=1;j<s;j++)          // һȦ�����д����������      
        { a[h][v]=d;v--;d++;}  
        t(a,b+1,s-2,d);           // ������һȦ�ݹ麯��    
  
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