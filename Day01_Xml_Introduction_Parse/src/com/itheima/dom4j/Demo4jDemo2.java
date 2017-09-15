package com.itheima.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class Demo4jDemo2 {
	@Test
	public void attr() throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read("book.xml");
		Element root = dom.getRootElement();
		
		Element bookEle = root.element("��");
		//bookEle.addAttribute("������", "���ǳ�����");
//		String str = bookEle.attributeValue("������");
//		System.out.println(str);
		Attribute attr = bookEle.attribute("������");
		attr.getParent().remove(attr);
		
		XMLWriter writer = new XMLWriter(new FileOutputStream("book.xml"),OutputFormat.createPrettyPrint());
		writer.write(dom);
		writer.close();
	}
	
	@Test
	public void del() throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read("book.xml");
		Element root = dom.getRootElement();
		
		Element price2Ele = root.element("��").element("�ؼ�");
		price2Ele.getParent().remove(price2Ele);

		XMLWriter writer = new XMLWriter(new FileOutputStream("book.xml"),OutputFormat.createPrettyPrint());
		writer.write(dom);
		writer.close();
	}
	
	@Test
	public void update()throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read("book.xml");
		Element root = dom.getRootElement();
		
		root.element("��").element("�ؼ�").setText("4.0Ԫ");
		
		XMLWriter writer = new XMLWriter(new FileOutputStream("book.xml"),OutputFormat.createPrettyPrint());
		writer.write(dom);
		writer.close();
	}
	
	@Test
	public void add()throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read("book.xml");
		Element root = dom.getRootElement();
		//ƾ�մ���<�ؼ�>�ڵ�,���ñ�ǩ��
		Element price2Ele = DocumentHelper.createElement("�ؼ�");
		price2Ele.setText("40.0Ԫ");
		//��ȡ����ǩ<��>���ؼ۽ڵ������ȥ
		Element bookEle = root.element("��");
		bookEle.add(price2Ele);
		
		//���ڴ��е�dom����д��xml�ļ���,�Ӷ�ʹxml�е����ݽ��и���
//		FileWriter writer = new FileWriter("book.xml");
//		dom.write(writer);
//		writer.flush();
//		writer.close();
		XMLWriter writer = new XMLWriter(new FileOutputStream("book.xml"),OutputFormat.createPrettyPrint());
		writer.write(dom);
		writer.close();
	}
	
	@Test
	public void find() throws Exception{
		SAXReader reader = new SAXReader();
		Document dom = reader.read("book.xml");
		Element root = dom.getRootElement();
		
		List<Element> list =  root.elements();
		Element book2Ele = list.get(1);
		System.out.println(book2Ele.element("����").getText());
		
	}
}
