package com.itheima.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class SaxDemo1 {
	public static void main(String[] args) throws Exception {
		//1.��ȡ����������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2.ͨ��������ȡsax������
		SAXParser parser = factory.newSAXParser();
		//3.��ȡ��ȡ��
		XMLReader reader = parser.getXMLReader();
		//4.ע���¼�������
		reader.setContentHandler(new MyContentHandler2() );
		//5.����xml
		reader.parse("book.xml");
		
		
	}
}

//���������ģʽ
class MyContentHandler2 extends DefaultHandler{
	private String eleName = null;
	private int count = 0;
	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		this.eleName = name;
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if("����".equals(eleName) && ++count==2){
			System.out.println(new String(ch,start,length));
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		eleName = null;
	}
	
}




class MyContentHandler implements ContentHandler{

	public void startDocument() throws SAXException {
		System.out.println("�ĵ�������ʼ��.......");
	}
	
	public void startElement(String uri, String localName, String name,
			Attributes atts) throws SAXException {
		System.out.println("�����˿�ʼ��ǩ,"+name);
	}
	
	public void characters(char[] ch, int start, int length)
		throws SAXException {
		System.out.println(new String(ch,start,length));
	}
	
	public void endElement(String uri, String localName, String name)
		throws SAXException {
		System.out.println("���ֽ�����ǩ,"+name);
	}

	
	public void endDocument() throws SAXException {
		System.out.println("�ĵ�����������.......");
	}
	
	
	
	
	
	
	
	
	
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		
	}

	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	

	

	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}
	
}
