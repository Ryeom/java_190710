package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arr_Linked {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	
	ArrayList<String> arr = new ArrayList<>();
	
	for(int i = 0 ; i <50000; ++i) {
		list.add("start");
		arr.add("start");
	}
	for(int i = 0 ; i <50000; ++i) {
		list.add("end");
		arr.add("end");
	}
	
	long startarr = System.currentTimeMillis();
	for (int i = 0 ;i<10000;++i) {
		arr.add(50000,"중간");
	}
	long endarr = System.currentTimeMillis();
	System.out.println("----------------");
	long startlist = System.currentTimeMillis();
	for (int i = 0 ;i<10000;++i) {
		arr.add(50000,"중간");
	}
	long endlist = System.currentTimeMillis();
	
	System.out.println("----------------");
	
	
	System.out.println("arr :" +(endlist-startlist)/1000.0);
	System.out.println("list :" +(endarr-startarr)/1000.0);
}
}
