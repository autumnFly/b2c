package com.csair.b2c.cloud.test.dubbo.consumer.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.Cell;

import java.util.Date;

/**
 * Created on 2018/11/22.<br/>
 *
 * @author yudong
 */
public class CellUtils {


    public static void fillFuncCell(HSSFCell cell, String value, HSSFCellStyle style) {
        cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
        cell.setCellFormula(value);
        cell.setCellStyle(style);
    }

    public static void fillNumberCell(HSSFCell cell, Number index, HSSFCellStyle columnCellStyle) {
        if (index == null) {
            index = 0;
        }
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellStyle(columnCellStyle);
        cell.setCellValue(index.doubleValue());
    }

    public static void fillStrCell(HSSFCell cell, String value, HSSFCellStyle columnCellStyle) {
        value = StringUtils.defaultString(value);
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellStyle(columnCellStyle);
        cell.setCellValue(value);
    }

    public static void fillDateCell(HSSFCell cell, Date value, HSSFCellStyle columnCellStyle) {
        cell.setCellStyle(columnCellStyle);
        if (value == null) {
            return;
        }
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue(value);
    }

}
