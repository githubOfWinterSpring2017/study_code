package com.cqut.edn.cookies;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * �������Ҫ��ģ�����ݿ��е���
 * @author Administrator
 *
 */
public class BookList {

	private Map<String,Book> bookMaps = new LinkedHashMap<String, Book>();
	//��̬����飬�ڸ��౻����������ص��ڴ��ʱ��ִ�����������еĴ���
	{
		Book book = new Book("���μ�","�޹���",12,"�����ʵ������","1");
		bookMaps.put("1", book);
		book = new Book("��������","�ǲ�����",10,"�й�����������","2");
		bookMaps.put("2", book);
		book = new Book("��¥��","��ѩ��",20,"�廪��ѧ������","3");
		bookMaps.put("3", book);
		book = new Book("ˮ䰴�","ʩ����",10,"��е��ҵ������","4");
		bookMaps.put("4",book);			
	}
	
	private BookList(){
		
	}
	public static BookList getInstance(){
		return new BookList();
	}
	/**
	 * �����������ݿ��е��鼮
	 * @return
	 */
	public Map<String,Book> getBooks()
	{
		return bookMaps;
	}
	/**
	 * ����ָ��ID���鼮
	 * @param id
	 * @return
	 */
	public Book getBook(String id){
		for(Map.Entry<String, Book> map:bookMaps.entrySet()){
			if(map.getKey().equals(id)){
				return map.getValue();
			}
		}
		return null;
	}
	
	
	
	
	
}
