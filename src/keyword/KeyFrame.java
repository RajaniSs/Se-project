package keyword;

import java.io.FileInputStream;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class KeyFrame {

	 public static void main(String[] args) throws Exception {
		 Workbook wb=null;
		 try{
			 FileInputStream fis=new FileInputStream("Book1.xls");
			 wb=Workbook.getWorkbook(fis);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		Sheet sh=wb.getSheet(0);
		int rows=sh.getRows();
		int column=sh.getColumns();
		
		System.out.println("number of rows:"+rows+"number of columns"+column);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("\t\t"+sh.getCell(j,i).getContents());
			}
			System.out.println();
			
		}
		 
		 
		 Operations o=new Operations();
		 o.openbrowser("firefox");
		 o.openurl("file:///C:/Users/Krrishna/Desktop/Selenium%20Class/Selenium%20Software/Offline%20Website/index.html");

		 o.username("id","email","kiran@gmail.com");
		 o.password("xpath","password","123456");
		 o.login("xpath","login", ".//*[@id='form']/div[3]/div/button");
		 //o.logout("xpath","logout" ,"//a[contains(.,' Logout')]");
		 o.Closebrowser();
		 
	 }
}


     

