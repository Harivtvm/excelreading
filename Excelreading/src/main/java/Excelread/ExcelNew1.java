package Excelread;

import java.io.IOException;

public class ExcelNew1 {
	

	public static void main(String[] args) {
		try {
		System.out.println(ExcelNew.getstringdata(1,0));
		System.out.println(ExcelNew.getnumericdata(1,1));
		}
catch(IOException a) {
	System.out.println(" error");
}
	}

}
