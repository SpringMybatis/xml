package com.ibs.zj.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class TestSAX {  
	  
    public static void main(String[] args) {  
        read();  
        write();  
    }  
      
    public static void read() {  
        try {  
            SAXParserFactory factory = SAXParserFactory.newInstance();  
            SAXParser parser = factory.newSAXParser();  
            InputStream in = TestSAX.class.getClassLoader().getResourceAsStream("test.xml");  
            parser.parse(in, new MyHandler());  
        } catch (ParserConfigurationException e) {  
            e.printStackTrace();  
        } catch (SAXException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
      
    public static void write() {  
        System.err.println("纯SAX对于写操作无能为力");  
    }  
      
}  