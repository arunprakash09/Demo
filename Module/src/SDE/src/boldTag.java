import java.util.Scanner;

public class boldTag {
	public static void BoldTag(String s, String[] dict) {
        int n = s.length();
        int[] mark = new int[n+1];
        for(String d : dict) {
            int i = -1;
            while((i = s.indexOf(d, i+1)) >= 0) {
                mark[i]++;
                mark[i + d.length()]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            int cur = sum + mark[i];
            if (cur > 0 && sum == 0) sb.append("<b>");
            if (cur == 0 && sum > 0) sb.append("</b>");
            if (i == n) break;
            sb.append(s.charAt(i));
            sum = cur;
        }
       System.out.println( sb.toString());
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		String dict[]=new String[n];
		for(int i=0;i<n;i++)
			dict[i]=sc.next();
		BoldTag(s,dict);
	}
}
