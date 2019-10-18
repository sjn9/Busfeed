package dao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
 
public class UserSMS {
 
  public static String encodeMessage(String message) {
  StringBuilder newMessage = new StringBuilder();
  newMessage.append("@U");
 
  for (char c : message.toCharArray()) {
  String charHex = String.format("%1$4s", Integer.toHexString(c));
  newMessage.append(charHex);
  }
 
  return newMessage.toString();
  }
 
  public static void main(String Mobile , String Route, String Bus, String Driver, String DriverMobile) throws UnsupportedEncodingException {
  String message = new String(("Your Bus Number is :" + Bus + " for Route :" + Route + ". " + Driver + "(Mobile :" + DriverMobile + ") will be driving.").getBytes("UTF8"));
  System.out.println(encodeMessage(new String(message.getBytes())));
 
  try {
  // Construct data
  String user = "username=taher88151@gmail.com";
  String hash = "&hash=41dee4a84c919fcf12d78c1fda6651e4ec9dae98be9981e6fb634b549e7cbd61";
   message = "&message=" + encodeMessage(new String(message.getBytes()));
  String sender = "&sender=" + "txtlcl";
  String numbers = "&numbers=" + ("91"+Mobile);
 
  // Send data
  HttpURLConnection conn = (HttpURLConnection) new URL("http://api.textlocal.in/send/?").openConnection();
  String data = user + hash + numbers + message + sender + "&unicode=1";
  conn.setDoOutput(true);
  conn.setRequestMethod("POST");
  conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
  conn.getOutputStream().write(data.getBytes("UTF-8"));
  final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
  final StringBuffer stringBuffer = new StringBuffer();
  String line;
  while ((line = rd.readLine()) != null) {
  stringBuffer.append(line);
  }
  rd.close();
 
   System.out.println(stringBuffer.toString());
  } catch (Exception e) {
  System.out.println("Error SMS " + e);
  }
  }
}