package day1;

import java.util.Scanner;

public class minibal {
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	int amount=s.nextInt();
    	int a=amount/1;
    	int b=amount/2;
    	int c=amount/5;
    	int d=amount/10;
    	int e=amount/50;
    	int f=amount/100;
    	if(a<b&& a<c && a<d && a<e && a<f) {
    		System.out.println(a);}
    	else if( b<c && b<d && b<e && b<f) {
    		System.out.println(b);}
    	else if(c<d && c<e && c<f) {
    		System.out.println(c);}
    	else if(d<e && d<f) {
    		System.out.println(d);}
    	else if(e<f) {
    		System.out.println(e);}
    	else {
    		System.out.println(f);}
    	}
    	
    }
