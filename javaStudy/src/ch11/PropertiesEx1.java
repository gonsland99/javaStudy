package ch11;

import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {
	public static void main(String[] args) {
		//properties: hashMap의 구버전 hashtable을 상속받아 구현 (String, String)형태로 키,값을 저장
		Properties p = new Properties();
		p.setProperty("timeout", "30");
		p.setProperty("language", "kr");
		p.setProperty("size", "10");
		p.setProperty("capacity", "10");
		
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			String el = (String)e.nextElement();
			System.out.println(el+"= "+p.getProperty(el));
		}
		System.out.println();
		
		p.setProperty("size", "20");
		System.out.println("size= "+p.getProperty("size"));
		System.out.println("capacity= "+p.getProperty("capacity"));
		System.out.println("loadfactor= "+p.getProperty("loadfactor","0.75"));
		System.out.println();
		
		System.out.println(p);
		p.list(System.out);
	}
}
