package com.java.lists;

import java.util.*;  
class ArrayListExample{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("sushanth");//Adding object in arraylist  
list.add("suraj");  
list.add("surya");  
list.add("sunil");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
} 
}
 
