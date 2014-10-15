package com.qburst.personal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.qburst.marks.Result;



public class PersonalDatas {
	private String Name;
	private String surname;
	private String religion;
	private boolean cast;
	public boolean isCast() {
		return cast;
	}
	public void setCast(boolean cast) {
		this.cast = cast;
	}
	public static void main(String[] args){
	Set<Result> setA = new HashSet<>();

//	String element = "element 1";

	//setA.add(element);

	//Set setA = new HashSet();
	Result Ram=new Result();
	setA.add(Ram);
	setA.add(new Result());
	setA.add(new Result() );
  Result element=null;
	//access via Iterator
	
	java.util.Iterator<Result> iterator = setA.iterator();
	while(iterator.hasNext()){
	  element = (Result) iterator.next();
	  System.out.println(element);
	}


	//access via new for-loop
	for(Result str : setA) {
	   element = str;
	  System.out.println(element);
	}

	}

}

