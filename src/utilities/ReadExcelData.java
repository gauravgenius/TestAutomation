package utilities;
import org.testng.annotations.Test;

public class ReadExcelData {

	@Test
	public void readExcel() throws Exception {
		ExcelData read = new ExcelData("C:/Users/KnexusGroup/Downloads/Zmarta.xls");

		System.out.println(read.getData(1, 0, 5));
	}

}
