package ReadData;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Data_read {

    public static void main(String[] args) throws IOException {
        String path = ".\\Datafiles\\Codes.xlsx";

        FileInputStream inputstream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
        XSSFSheet Sheet = workbook.getSheet("Sheet1");

        int row = Sheet.getLastRowNum();
        int column = Sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= row; r++) {

            XSSFRow rows = Sheet.getRow(r);
            for (int c = 0; c < column; c++) {

                XSSFCell Cell = rows.getCell(c);

                switch (Cell.getCellType()) {

                    case STRING:
                        System.out.print(Cell.getStringCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(Cell.getBooleanCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(Cell.getNumericCellValue());
                        break;
                }

                System.out.print(" | ");
            }


            System.out.print("");
        }
    }
}



