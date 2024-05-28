package excelReadersForReports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import static resources.listeners.folderPath;
public class ExcelDataProviderForFinancialSettlementReportFSAInFrench {
	XSSFWorkbook wb;

	public ExcelDataProviderForFinancialSettlementReportFSAInFrench() throws Exception {
		File src = new File(folderPath + File.separator + "Rapport des paiements - Auction 187 09-14-2022.xlsx");
		String Path = folderPath + File.separator + "Rapport des paiements - Auction 187 09-14-2022.xlsx";
		String newString = Path.substring(113);
		System.out.println(newString);
		Assert.assertEquals("Rapport des paiements - Auction 187 09-14-2022.xlsx", newString);
		System.out.println("Report title verified successfully ");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getStringData(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public double getNumericData(String Sheetname, int row, int col) {
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getNumericCellValue();
	}
}