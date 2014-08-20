package br.com.pontualimportbrindes.staging;

import java.io.*;
import java.awt.*;

import javax.swing.*;

import org.jopendocument.dom.*;
import org.jopendocument.dom.spreadsheet.*;

import static br.com.pontualimportbrindes.util.Convenience.print;

public class ODSTable {
    // http://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data    
    public static void main(String[] args) {
        final String filename = "C:\\Users\\heitor\\Desktop\\samplecodigo.ods";
        print("Open ODS and populate Product instances");

        Sheet sheet = null;
        File file = null;

        try {
            file = new File(filename);
            sheet = SpreadSheet.createFromFile(file).getSheet(0);
            for (int row = 1; row <= sheet.getRowCount(); row++) {
                print(sheet.getImmutableCellAt("A" + row).getTextValue());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
                      
    }
}
