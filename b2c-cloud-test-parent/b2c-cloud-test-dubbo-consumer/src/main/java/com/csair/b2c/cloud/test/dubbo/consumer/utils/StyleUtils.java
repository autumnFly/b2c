package com.csair.b2c.cloud.test.dubbo.consumer.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

/**
 * Created on 2018/11/21.<br/>
 *
 * @author yudong
 */
public class StyleUtils {

    public static HSSFCellStyle getDiffColorCellStyle(HSSFWorkbook workbook, short color) {
        HSSFCellStyle style = getCommonCellStyle(workbook);
        //设置单元格背景颜色
        style.setFillForegroundColor(color);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        return style;
    }

    public static HSSFCellStyle getMoneyCellStyle(HSSFWorkbook workbook) {
        HSSFCellStyle style = getCommonCellStyle(workbook);
        style.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        return style;
    }

    public static HSSFCellStyle getDateCellStyle(HSSFWorkbook workbook) {
        HSSFCellStyle style = getCommonCellStyle(workbook);
        HSSFDataFormat format = workbook.createDataFormat();
        style.setDataFormat(format.getFormat("yyyy-MM-dd HH:mm:ss"));
        return style;
    }

    public static HSSFCellStyle getCommonCellStyle(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        //设置字体大小
        font.setFontHeightInPoints((short) 12);
        font.setFontName("DengXian");
        //设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);

        short borderColor = HSSFColor.BLACK.index;
        short borderWidth = HSSFCellStyle.BORDER_THIN;

        //设置底边框;
        style.setBorderBottom(borderWidth);
        //设置底边框颜色;
        style.setBottomBorderColor(borderColor);
        //设置左边框;
        style.setBorderLeft(borderWidth);
        //设置左边框颜色;
        style.setLeftBorderColor(borderColor);
        //设置右边框;
        style.setBorderRight(borderWidth);
        //设置右边框颜色;
        style.setRightBorderColor(borderColor);
        //设置顶边框;
        style.setBorderTop(borderWidth);
        //设置顶边框颜色;
        style.setTopBorderColor(borderColor);
        //设置自动换行;
        style.setWrapText(false);
        //设置水平对齐的样式为居中对齐;
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //设置垂直对齐的样式为居中对齐;
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        return style;
    }

    public static HSSFCellStyle getCommonCellStyleNoBorder(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        //设置字体大小
        font.setFontHeightInPoints((short) 12);
        font.setFontName("DengXian");
        //设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        //设置自动换行;
        style.setWrapText(false);
        //设置水平对齐的样式为居中对齐;
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //设置垂直对齐的样式为居中对齐;
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        return style;
    }
}
