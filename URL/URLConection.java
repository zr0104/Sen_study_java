package URL;
/*
openConnection() 返回一个 java.net.URLConnection。
例如：
如果你连接HTTP协议的URL, openConnection() 方法返回 HttpURLConnection 对象。
如果你连接的URL为一个 JAR 文件, openConnection() 方法将返回 JarURLConnection 对象。
等等...
*/
import java.io.*;
import java.net.*;

public class URLConection {
  public static void main(String[] args) {
	  try {
		  URL url = new URL("http://test.portal.lvdatong.com/#/index");
		  URLConnection urlConnection = url.openConnection();
		  HttpURLConnection connection = null;
		  if(urlConnection instanceof HttpURLConnection) {
			  connection = (HttpURLConnection) urlConnection;
		  }else {
			  System.out.println("请输入 URL 地址");
		  }
		  BufferedReader in = new BufferedReader(
		  new InputStreamReader(connection.getInputStream()));
		  String urlString = "";
		  String current;
		  while((current = in.readLine()) != null) {
			  urlString += current;
		  }
		  System.out.println(urlString);
	  }catch(IOException e){
		  e.printStackTrace();
	  }
  }
}
