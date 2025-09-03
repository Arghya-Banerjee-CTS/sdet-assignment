package com.example.conf;
import java.io.IOException; import java.util.Properties; 
public class ShowConfig {
  public static void main(String[] args) throws IOException {
    Properties p = new Properties();
    p.load(ShowConfig.class.getClassLoader().getResourceAsStream("application.properties"));
    System.out.println(p.getProperty("datasource.url"));
  }
}
