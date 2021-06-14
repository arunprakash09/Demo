import java.util.*;

public class justification{
	public static void space(String s[],int space)
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=null)
			System.out.print(s[i]);
			for(int j=0;j<space;j++)
				System.out.print(" ");
				
		}
	}
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       String ip=sc.nextLine();
       String s[]=ip.split("[ ]");
       int maxwidth=sc.nextInt();
       int temp=maxwidth;
       String op[]=new String[3];
       int k=0,flag=0,j=0;
       for(int i=0;i<s.length;i++)
       {
          if(temp>s[i].length()) {
        	 // System.out.print(s[i]+" ");
        	  op[flag++]=s[i]+" ";
        	  temp-=s[i].length();
        	  j+=s[i].length()+1;
          }
          else
          {
        	  
        	  j--;
        	  int c=(maxwidth-j)/2;
        	 space(op,c);
        	  System.out.println();
        	  temp=maxwidth;
        	  i--;
        	  flag=0;
        	  op=new String[3];
        	  j=0;
          }
          if(i==s.length-1)
          {
        	  j--;
        	  int c=(maxwidth-j)/2;
        	  space(op,c);
          }
        	  
          
       }
 
    }
}