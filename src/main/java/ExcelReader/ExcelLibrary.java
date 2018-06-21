package ExcelReader;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;

public class ExcelLibrary {

    Workbook wrkBook = null;
    Sheet sheet = null;

    public ExcelLibrary(String path)
    {
        try
        {
            wrkBook = Workbook.getWorkbook(new File(path));
        }
        catch(BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public String GetCellValue(int colNumber, int rowNumber)
    {
        return wrkBook.getSheet(0).getCell(colNumber, rowNumber).getContents();
    }
}
