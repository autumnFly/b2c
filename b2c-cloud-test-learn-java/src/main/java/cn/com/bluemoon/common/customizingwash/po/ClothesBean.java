package cn.com.bluemoon.common.customizingwash.po;

import cn.com.bluemoon.handypoi.excel.annos.ExcelColumn;
import lombok.Data;

/**
 * @author yudong
 * @date 2019/6/9
 */
@Data
public class ClothesBean {

    @ExcelColumn(columnName = "序号")
    private Integer index;

    @ExcelColumn(columnName = "服务项名称")
    private String serviceItemName;

    @ExcelColumn(columnName = "服务名称")
    private String serviceName;

    @ExcelColumn(columnName = "服务名称排序")
    private Integer serviceSort;

    @ExcelColumn(columnName = "关联服务项")
    private String associateServiceItem;

    @ExcelColumn(columnName = "服务项序号")
    private Integer itemSort;

    @ExcelColumn(columnName = "互斥属性")
    private String mutex;

    @ExcelColumn(columnName = "是否默认")
    private String isDefault;

    @ExcelColumn(columnName = "服务价格")
    private Integer price;

    @ExcelColumn(columnName = "所属sku")
    private String goodsCode;

}

