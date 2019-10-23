package com.csair.b2c.cloud.test.dubbo.consumer.service;

import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportSettlementVo;
import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportSubSettlementVo;
import com.csair.b2c.cloud.test.dubbo.consumer.utils.CellUtils;
import com.csair.b2c.cloud.test.dubbo.consumer.utils.StyleUtils;
import javafx.scene.control.Cell;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.List;

/**
 * Created on 2018/12/6.<br/>
 *
 * @author yudong
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SettlementExcel {


    /**
     * 导出结算函第三行的列名
     */
    private static String[] settlementCellNames = {"序号", "品牌名称", "服务费率", "衣物数量", "服务费核算基数（元）", "服务费金额（元）"};

    private static short titleHeight = 800;
    private static short contentHeight = 400;

    private static short borderColor = HSSFColor.GREY_50_PERCENT.index;

    private ExportSettlementVo settlementVO;
    private List<ExportSubSettlementVo> subSettlementVOS;

    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("结算函");

    public SettlementExcel(ExportSettlementVo settlementVO, List<ExportSubSettlementVo> subSettlementVOS) {
        this.settlementVO = settlementVO;
        this.subSettlementVOS = subSettlementVOS;
        sheet.setSelected(true);
        sheet.setActive(true);
        sheet.setActiveCell(new CellAddress(0, 0));
        sheet.setDisplayGridlines(false);
    }

    public HSSFWorkbook createSettleExcel() throws Exception {
        fillHeaderInfo();
        for (int i = 0; i < subSettlementVOS.size(); i++) {
            HSSFRow row = sheet.createRow(i + 3);
            row.setHeight(contentHeight);
            fillSettleRow(row, i + 1, subSettlementVOS.get(i));
        }
        fillFooterInfo();
        return workbook;
    }

    private void fillHeaderInfo() {

        // 设置单元格合并信息
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 5));

        HSSFCellStyle titleStyle = StyleUtils.getCommonCellStyleNoBorder(workbook);
        titleStyle.getFont(workbook).setFontHeightInPoints((short) 14);
        titleStyle.getFont(workbook).setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

        HSSFRow row0 = sheet.createRow(0);
        row0.setHeight(titleHeight);
        for (int i = 0; i < settlementCellNames.length; i++) {
            HSSFCell cell = row0.createCell(i);
            CellUtils.fillStrCell(cell, settlementVO.getCompanyName(), titleStyle);
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }

        HSSFRow row1 = sheet.createRow(1);
        row1.setHeight(titleHeight);

        HSSFCellStyle rightStyle = StyleUtils.getCommonCellStyleNoBorder(workbook);
        rightStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
        rightStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        rightStyle.setTopBorderColor(borderColor);

        HSSFCellStyle leftStyle = StyleUtils.getCommonCellStyleNoBorder(workbook);
        leftStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
        leftStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        leftStyle.setTopBorderColor(borderColor);

        HSSFCellStyle dateStyle = StyleUtils.getCommonCellStyleNoBorder(workbook);
        dateStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
        dateStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        dateStyle.setTopBorderColor(borderColor);
        dateStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        dateStyle.setRightBorderColor(borderColor);
        HSSFDataFormat format = workbook.createDataFormat();
        dateStyle.setDataFormat(format.getFormat("yyyy/MM/dd"));

        for (int i = 0; i < settlementCellNames.length; i++) {
            HSSFCell cell = row1.createCell(i);
            if (i % 2 == 0) {
                cell.setCellStyle(rightStyle);
            } else {
                cell.setCellStyle(leftStyle);
            }
            if (i == 5) {
                cell.setCellStyle(dateStyle);
            }
            switch (i) {
                case 0:
                    CellUtils.fillStrCell(cell, "账单编号:", cell.getCellStyle());
                    break;
                case 1:
                    CellUtils.fillStrCell(cell, settlementVO.getPaybillCode(), cell.getCellStyle());
                    break;
                case 2:
                    CellUtils.fillStrCell(cell, "结算期数:", cell.getCellStyle());
                    break;
                case 3:
                    CellUtils.fillStrCell(cell, settlementVO.getSettlementPeriod(), cell.getCellStyle());
                    break;
                case 4:
                    CellUtils.fillStrCell(cell, "日期:", cell.getCellStyle());
                    break;
                default:
                    CellUtils.fillDateCell(cell, settlementVO.getConfirmTime(), dateStyle);
            }

            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }

        HSSFCellStyle contentStyle = getDefaultStyle();

        HSSFRow row2 = sheet.createRow(2);
        row2.setHeight(contentHeight);
        for (int i = 0; i < settlementCellNames.length; i++) {
            HSSFCell cell = row2.createCell(i);
            CellUtils.fillStrCell(cell, settlementCellNames[i], contentStyle);
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }

    }

    private void fillFooterInfo() {

        HSSFCellStyle style = getDefaultStyle();
        HSSFCellStyle moneyStyle = getDefaultStyle();
        moneyStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));

        // 创建结算函合计行
        int collectNum = subSettlementVOS.size() + 3;
        sheet.addMergedRegion(new CellRangeAddress(collectNum, collectNum, 0, 2));

        HSSFRow collectRow = sheet.createRow(collectNum);
        collectRow.setHeight(contentHeight);
        for (int i = 0; i < settlementCellNames.length; i++) {
            HSSFCell cell = collectRow.createCell(i);
            if (i == 0) {
                CellUtils.fillStrCell(collectRow.getCell(i), "合计", style);
            } else if (i == 3) {
                // 汇总衣物数量
                CellUtils.fillFuncCell(collectRow.getCell(i), sumSettleFuncStr("D", collectNum), style);
            } else if (i == 4) {
                // 汇总服务费核算基数
                CellUtils.fillFuncCell(collectRow.getCell(i), sumSettleFuncStr("E", collectNum), moneyStyle);
            } else if (i == 5) {
                // 汇总服务费金额（元）
                CellUtils.fillFuncCell(collectRow.getCell(i), sumSettleFuncStr("F", collectNum), moneyStyle);
            } else {
                CellUtils.fillStrCell(cell, "", style);
            }
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 17 / 10);
        }

        HSSFCellStyle companyStyle = StyleUtils.getCommonCellStyleNoBorder(workbook);
        companyStyle.getFont(workbook).setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        companyStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);

        HSSFCellStyle leftStyle = StyleUtils.getCommonCellStyleNoBorder(workbook);
        leftStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);

        HSSFRow blankRow = sheet.createRow(collectNum + 1);
        blankRow.setHeight(contentHeight);
        fillBankRow(blankRow, "", collectNum + 1, leftStyle);

        HSSFRow receiveRow = sheet.createRow(collectNum + 2);
        receiveRow.setHeight(contentHeight);
        fillBankRow(receiveRow, "收款单位账户信息", collectNum + 2, companyStyle);

        HSSFRow nameRow = sheet.createRow(collectNum + 3);
        nameRow.setHeight(contentHeight);
        fillBankRow(nameRow, "银行账户名称：" + settlementVO.getBankAccountName(), collectNum + 3, leftStyle);

        HSSFRow bankRow = sheet.createRow(collectNum + 4);
        bankRow.setHeight(contentHeight);
        fillBankRow(bankRow, "开户行：" + settlementVO.getBankName(), collectNum + 4, leftStyle);

        HSSFRow accountRow = sheet.createRow(collectNum + 5);
        accountRow.setHeight(contentHeight);
        fillBankRow(accountRow, "账号：" + settlementVO.getBankAccount(), collectNum + 5, leftStyle);

    }

    private void fillSettleRow(HSSFRow row, int rowIndex, ExportSubSettlementVo subSettlementVO) throws Exception {

        HSSFCellStyle style = getDefaultStyle();
        HSSFCellStyle moneyStyle = getDefaultStyle();
        moneyStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));

        Field[] fields = subSettlementVO.getClass().getDeclaredFields();
        AccessibleObject.setAccessible(fields, true);
        DecimalFormat df = new DecimalFormat("#.00");
        for (int j = 0; j < settlementCellNames.length; j++) {
            HSSFCell cell = row.createCell(j);
            if (j == 0) {
                CellUtils.fillNumberCell(cell, rowIndex, style);
            } else if (j == 1) {
                CellUtils.fillStrCell(cell, (String) fields[j].get(subSettlementVO), style);
            } else if (j == 2) {
                String rateStr;
                Double rate = ((Double) fields[j].get(subSettlementVO));
                if (rate != null) {
                    rateStr = df.format(rate) + "%";
                } else {
                    rateStr = "";
                }
                CellUtils.fillStrCell(cell, rateStr, style);
            } else if (j == 3) {
                CellUtils.fillNumberCell(cell, (Integer) fields[j].get(subSettlementVO), style);
            } else {
                CellUtils.fillNumberCell(cell, (Long) fields[j].get(subSettlementVO), moneyStyle);
            }
            sheet.autoSizeColumn(j);
            sheet.setColumnWidth(j, sheet.getColumnWidth(j) * 17 / 10);
        }
    }

    private void fillBankRow(HSSFRow row, String value, int rowNum, HSSFCellStyle style) {
        sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 0, 5));
        for (int i = 0; i < settlementCellNames.length; i++) {
            HSSFCell cell = row.createCell(i);
            if (i == 0) {
                CellUtils.fillStrCell(cell, value, style);

            } else {
                CellUtils.fillStrCell(cell, "", style);
            }
        }
    }

    private String sumSettleFuncStr(String colAlpha, int collectNum) {
        String s0 = "SUM(%s3)";
        String s1 = "SUM(%s4)";
        String s2 = "SUM(%s4:%s%s)";
        if (collectNum == 3) {
            // collectNum = 3 表明无记录
            return String.format(s0, colAlpha);
        } else if (collectNum == 4) {
            // collectNum = 4 表明只有一条记录
            return String.format(s1, colAlpha);
        } else {
            return String.format(s2, colAlpha, colAlpha, collectNum);
        }
    }

    private HSSFCellStyle getDefaultStyle() {
        HSSFCellStyle contentStyle = StyleUtils.getCommonCellStyle(workbook);
        contentStyle.setTopBorderColor(borderColor);
        contentStyle.setRightBorderColor(borderColor);
        contentStyle.setBottomBorderColor(borderColor);
        contentStyle.setLeftBorderColor(borderColor);
        return contentStyle;
    }

}
