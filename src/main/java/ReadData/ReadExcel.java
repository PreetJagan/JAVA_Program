package ReadData;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        String FilePath = ".\\Datafiles\\Codes.xlsx";

        // Open the file by using input stream
        FileInputStream inputStream = new FileInputStream(FilePath);

        // Get the workbook
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

// Get sheet by index value
        //        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        // Using for loop
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int r = 1; r <= rows; r++) {


            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < cols; c++) {

                XSSFCell cell = row.getCell(c);

                switch (cell.getCellType()) {


                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;


                }
                System.out.print(" | ");

            }
            System.out.println("");
        }
    }
}

        // Iterator Method
//
//        Iterator iterator =sheet.iterator();
//
//        while (iterator.hasNext())
//        {
//            XSSFRow row = (XSSFRow) iterator.next();
//
//            Iterator cellIterator =row.cellIterator();
//
//            while (cellIterator.hasNext()){
//
//
//                XSSFCell cell = (XSSFCell) cellIterator.next();
//                switch (cell.getCellType()) {
//
//
//                    case STRING:
//                        System.out.print(cell.getStringCellValue());
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue());
//                        break;
//                    case BOOLEAN:
//                        System.out.print(cell.getBooleanCellValue());
//                        break;
//
//
//                }
//                System.out.print(" | ");
//
//            }
//            System.out.println("");
//
//
//            }
//
//        }


//    }



