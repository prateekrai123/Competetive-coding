/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int count = 0;
	        String s = Integer.toBinaryString(n);
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='1'){
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}