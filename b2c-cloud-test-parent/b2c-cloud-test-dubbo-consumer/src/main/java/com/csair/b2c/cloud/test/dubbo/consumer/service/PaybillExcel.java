package com.csair.b2c.cloud.test.dubbo.consumer.service;

import com.csair.b2c.cloud.test.dubbo.consumer.utils.CellUtils;
import com.csair.b2c.cloud.test.dubbo.consumer.utils.StyleUtils;
import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportPaybillVo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

/**
 * Created on 2018/12/6.<br/>
 *
 * @author yudong
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PaybillExcel {
    /**
     * 导出账单表第二行的列名
     */
    private static String[] paybillCellNames = {"序号", "衣物编码", "衣物类型", "洗涤结果", "实际单价", "实际结算金额"
            , "服务费核算基数", "还衣单号", "还衣方式", "洗衣订单号", "订单状态", "结算状态", "消费者", "消费者联系方式"
            , "收件人", "收件人联系方式", "收件地址", "付款时间", "收衣时间", "签收时间", "集团", "品牌", "省份", "城市"
            , "县区", "合作点名称"};

    private List<ExportPaybillVo> exportPaybillVos;

    private HSSFWorkbook workbook = new HSSFWorkbook();
    private HSSFSheet sheet = workbook.createSheet("账单明细");

    public PaybillExcel(List<ExportPaybillVo> exportPaybillVos) {
        this.exportPaybillVos = exportPaybillVos;
    }

    public HSSFWorkbook createPaybillExcel() throws Exception {
        fillHeaderInfo();
        for (int i = 0; i < exportPaybillVos.size(); i++) {
            HSSFRow row = sheet.createRow(i + 2);
            fillPaymentRow(row, i + 1, exportPaybillVos.get(i));
        }
        fillFooterInfo();
        return workbook;
    }

    /**
     * 设置账单明细头部信息
     */
    private void fillHeaderInfo() {
        // 设置单元格合并信息
        sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 6));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 7, 8));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 9, 19));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 20, 25));

        HSSFRow row0 = sheet.createRow(0);
        for (int i = 0; i < paybillCellNames.length; i++) {
            HSSFCell cell = row0.createCell(i);
            if (i == 0) {
                CellUtils.fillStrCell(cell, "序号",
                        StyleUtils.getDiffColorCellStyle(workbook, IndexedColors.YELLOW.index));
            } else if (i >= 1 && i <= 6) {
                CellUtils.fillStrCell(cell, "衣物信息",
                        StyleUtils.getDiffColorCellStyle(workbook, IndexedColors.TAN.index));
            } else if (i >= 7 && i <= 8) {
                CellUtils.fillStrCell(cell, "还衣单信息",
                        StyleUtils.getDiffColorCellStyle(workbook, IndexedColors.GOLD.index));
            } else if (i >= 9 && i <= 19) {
                CellUtils.fillStrCell(cell, "订单信息",
                        StyleUtils.getDiffColorCellStyle(workbook, HSSFColor.LIGHT_TURQUOISE.index));
            } else {
                CellUtils.fillStrCell(cell, "送洗点信息",
                        StyleUtils.getDiffColorCellStyle(workbook, HSSFColor.LIGHT_GREEN.index));
            }
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }

        HSSFRow row1 = sheet.createRow(1);
        for (int i = 0; i < paybillCellNames.length; i++) {
            HSSFCell cell = row1.createCell(i);
            if (i == 0) {
                cell.setCellStyle(StyleUtils.getDiffColorCellStyle(workbook, IndexedColors.YELLOW.index));
            } else if (i >= 1 && i <= 6) {
                cell.setCellStyle(StyleUtils.getDiffColorCellStyle(workbook, IndexedColors.TAN.index));
            } else if (i >= 7 && i <= 8) {
                cell.setCellStyle(StyleUtils.getDiffColorCellStyle(workbook, IndexedColors.GOLD.index));
            } else if (i >= 9 && i <= 19) {
                cell.setCellStyle(StyleUtils.getDiffColorCellStyle(workbook, HSSFColor.LIGHT_TURQUOISE.index));
            } else {
                cell.setCellStyle(StyleUtils.getDiffColorCellStyle(workbook, HSSFColor.LIGHT_GREEN.index));
            }
            CellUtils.fillStrCell(cell, paybillCellNames[i], cell.getCellStyle());
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }
    }

    private void fillFooterInfo() {
        // 创建最后合计行
        int lastRowNum = exportPaybillVos.size() + 2;
        sheet.addMergedRegion(new CellRangeAddress(lastRowNum, lastRowNum, 0, 4));

        HSSFCellStyle style = StyleUtils.getMoneyCellStyle(workbook);

        HSSFRow lastRow = sheet.createRow(lastRowNum);
        for (int i = 0; i < paybillCellNames.length; i++) {
            HSSFCell cell = lastRow.createCell(i);
            if (i >= 0 && i <= 4) {
                CellUtils.fillStrCell(cell, "合计", style);
            } else if (i == 5) {
                // 汇总实际结算金额
                CellUtils.fillFuncCell(cell, sumPaybillFuncStr("F", lastRowNum), style);
            } else if (i == 6) {
                // 汇总服务费核算基数
                CellUtils.fillFuncCell(cell, sumPaybillFuncStr("G", lastRowNum), style);
            } else {
                CellUtils.fillStrCell(cell, "", style);
            }
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }
    }

    private String sumPaybillFuncStr(String colAlpha, int collectNum) {
        String s0 = "SUM(%s2)";
        String s1 = "SUM(%s3)";
        String s2 = "SUM(%s3:%s%s)";
        if (collectNum == 2) {
            // collectNum = 2 表明无记录
            return String.format(s0, colAlpha);
        } else if (collectNum == 3) {
            // collectNum = 3 表明只有一条记录
            return String.format(s1, colAlpha);
        } else {
            return String.format(s2, colAlpha, colAlpha, collectNum);
        }
    }

    private void fillPaymentRow(HSSFRow row, int rowIndex, ExportPaybillVo exportPaybillVo) throws Exception {

        HSSFCellStyle style = StyleUtils.getCommonCellStyle(workbook);
        HSSFCellStyle moneyStyle = StyleUtils.getMoneyCellStyle(workbook);
        HSSFCellStyle dateStyle = StyleUtils.getDateCellStyle(workbook);

        Field[] fields = exportPaybillVo.getClass().getDeclaredFields();
        AccessibleObject.setAccessible(fields, true);
        for (int j = 0; j < paybillCellNames.length; j++) {
            HSSFCell cell = row.createCell(j);
            if (j == 0) {
                CellUtils.fillNumberCell(cell, rowIndex, style);
            } else if (j >= 1 && j <= 3) {
                CellUtils.fillStrCell(cell, (String) fields[j].get(exportPaybillVo), style);
            } else if (j >= 4 && j <= 6) {
                CellUtils.fillNumberCell(cell, (Integer) fields[j].get(exportPaybillVo), moneyStyle);
            } else if (j >= 7 && j <= 16) {
                CellUtils.fillStrCell(cell, (String) fields[j].get(exportPaybillVo), style);
            } else if (j >= 17 && j <= 19) {
                CellUtils.fillDateCell(cell, (Date) fields[j].get(exportPaybillVo), dateStyle);
            } else {
                CellUtils.fillStrCell(cell, (String) fields[j].get(exportPaybillVo), style);
            }
            sheet.autoSizeColumn(j);
            sheet.setColumnWidth(j, sheet.getColumnWidth(j) * 17 / 10);
        }
    }
}
