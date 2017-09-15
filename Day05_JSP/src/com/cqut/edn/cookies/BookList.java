package com.cqut.edn.cookies;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 这个累主要是模拟数据库中的书
 * @author Administrator
 *
 */
public class BookList {

	private Map<String,Book> bookMaps = new LinkedHashMap<String, Book>();
	//静态代码块，在该类被类加载器加载到内存的时候执行这个代码快中的代码
	{
		Book book = new Book("西游记","罗贯中",12,"人名邮电出版社","1");
		bookMaps.put("1", book);
		book = new Book("三国演义","记不得了",10,"中共宣传出版社","2");
		bookMaps.put("2", book);
		book = new Book("红楼梦","曹雪芹",20,"清华大学出版社","3");
		bookMaps.put("3", book);
		book = new Book("水浒传","施耐庵",10,"机械工业出版社","4");
		bookMaps.put("4",book);			
	}
	
	private BookList(){
		
	}
	public static BookList getInstance(){
		return new BookList();
	}
	/**
	 * 返回整个数据库中的书籍
	 * @return
	 */
	public Map<String,Book> getBooks()
	{
		return bookMaps;
	}
	/**
	 * 返回指定ID的书籍
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
