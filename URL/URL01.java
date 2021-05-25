package URL;

import java.net.*;
import java.io.*;

public class URL01 {
  public static void main(String[] args) {
	  try {
		  URL url = new URL("http://test.portal.lvdatong.com/#/index");
		  System.out.println("URL 为：" + url.toString());
		  System.out.println("协议 为：" + url.getProtocol());
		  System.out.println("验证信息：" + url.getAuthority());
		  System.out.println("文件名及请求参数 ：" + url.getFile());
		  System.out.println("主机名：" + url.getHost());
		  System.out.println("路径为：" + url.getPath());
		  System.out.println("端口为：" + url.getPort());
		  System.out.println("默认端口：" + url.getDefaultPort());
		  System.out.println("请求参数：" + url.getQuery());
		  System.out.println("定位位置：" + url.getRef());

	  }catch(IOException e){
		  e.printStackTrace();
	  }
  }
}

/*
http://www.runoob.com/index.html?language=cn#j2se
URL 解析：

协议为(protocol)：http
主机为(host:port)：www.runoob.com
端口号为(port): 80 ，以上URL实例并未指定端口，因为 HTTP 协议默认的端口号为 80。
文件路径为(path)：/index.html
请求参数(query)：language=cn
定位位置(fragment)：j2se，定位到网页中 id 属性为 j2se 的 HTML 元素位置 。*/
