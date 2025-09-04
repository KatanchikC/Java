package com;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;      
import java.util.Collections;
     public class Option{
     	public static int Find(List<String> items, String name) {
			String funct = new String(name);
			int find = -1;
        		for (int i=0; i<items.size();i++){
        			if (funct.equals(items.get(i))){
        				find = i;
        				break;
        				}
        }	return find;
    }
	public static List<String> collection(List<String> options) {	
		
		int O = Find(options, "-o");
		if (O!=-1) { 
			options.remove(O);
			options.remove(O);}
			
		int P = Find(options,"-p");
		if (P!=-1) {
			options.remove(P);
			options.remove(P);}
		int A = Find(options, "-a");
		if (A!=-1) {
			options.remove(A);
			}
		int status = Find(options,"-s");
		if (status!=-1) {
			options.remove(status);}
			
		status = Find(options,"-f");
		if (status!=-1) {
			options.remove(status);}
		return options;	
     }
     }
