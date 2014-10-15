package com.qburst.marks;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;

import com.qburst.marks.ExceptionHandling.InvalidExceptions;
import com.qburst.marks.ExceptionHandling.PassExceptions;
import com.qburst.marks.result.Marklist;
import com.qburst.personal.PersonalDatas;

public class Result {
	Marklist Mark = new Marklist();
	PersonalDatas PD = new PersonalDatas();
	ExceptionHandling E = new ExceptionHandling();

	public void Result1() throws PassExceptions, InvalidExceptions {

		if (Mark.total >= 45)
			throw E.new PassExceptions("PASSED");

		else if ((Mark.total >= 30) && (PD.isCast() == true))
			throw E.new PassExceptions("PASSED");

		if (Mark.total > 300)
			throw E.new InvalidExceptions("INVALID MARKS");

	}

	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException {
		
		//nio
		//copyFileUsingFIS();
		Scanner as=new Scanner(System.in);
		String inputpath=as.nextLine();
		BufferedReader br = null;
		try {
			br  = new BufferedReader(new InputStreamReader(
					new FileInputStream((inputpath))));
			String str = null;
			str = (br.readLine());
			while(str!=null){
				System.out.print(str+"\n");
				//System.out.print(str);
				str = (br.readLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		copyFileUsingFIS();
		
	}
	
	private static void copyFileUsingFIS() throws FileNotFoundException,
			IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
		in = new FileInputStream("/home/vineeth/test.txt");
			out = new FileOutputStream("/home/vineeth/output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
		}
		}
	}
}

