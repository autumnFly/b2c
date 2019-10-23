package b2c.csair.b2c.cloud.test.mybatis.generator.plugin;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.OutputUtilities;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Context;

import java.util.Date;
import java.util.List;

/**
 * Created on 2019/2/12.<br/>
 *
 * @author yudong
 */
public class MybatisGeneratorPlugin extends PluginAdapter {

    private static final String PATTERN = "yyyy/MM/dd HH:mm:ss";

    @Override
    public void setContext(Context context) {
        super.setContext(context);
    }

    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // 添加entity类注释
        String docLine = "/**\n" +
                " * %s\n" +
                " * \n" +
                " * @author mybatis generator\n" +
                " * @date %s\n" +
                " */";
        String dateStr = DateFormatUtils.format(new Date(), PATTERN);
        docLine = String.format(docLine, introspectedTable.getRemarks(), dateStr);
        topLevelClass.addJavaDocLine(docLine);

        topLevelClass.addImportedType("java.io.Serializable");
        FullyQualifiedJavaType javaType = new FullyQualifiedJavaType("Serializable");
        topLevelClass.addSuperInterface(javaType);

        Field field = new Field("serialVersionUID", new FullyQualifiedJavaType("long"));
        field.setVisibility(JavaVisibility.PRIVATE);
        field.setStatic(true);
        field.setFinal(true);
        field.setInitializationString(RandomUtils.nextLong() + "L");
        topLevelClass.addField(field);

        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn
            , IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // 添加entity字段注释
        String docLine = "/**\n" +
                "     * %s\n" +
                "     */";
        field.addJavaDocLine(String.format(docLine, introspectedColumn.getRemarks()));
        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // 添加entity get方法注释
        String docLine = "/**\n" +
                "     * 获取%s\n" +
                "     */";
        method.addJavaDocLine(String.format(docLine, introspectedColumn.getRemarks()));
        return super.modelGetterMethodGenerated(method, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        // 添加entity set方法注释
        String docLine = "/**\n" +
                "     * 设置%s\n" +
                "     */";
        method.addJavaDocLine(String.format(docLine, introspectedColumn.getRemarks()));
        return super.modelGetterMethodGenerated(method, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // 添加example类注释
        String docLine = "/**\n" +
                " * @author mybatis generator\n" +
                " * @date %s\n" +
                " */";
        String dateStr = DateFormatUtils.format(new Date(), PATTERN);
        topLevelClass.addJavaDocLine(String.format(docLine, dateStr));
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // 添加mapper类注释
        String docLine = "/**\n" +
                " * 操纵%s\n" +
                " * \n" +
                " * @author mybatis generator\n" +
                " * @date %s\n" +
                " */";
        String dateStr = DateFormatUtils.format(new Date(), PATTERN);
        docLine = String.format(docLine, introspectedTable.getRemarks(), dateStr);
        interfaze.addJavaDocLine(docLine);
        return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
    }


    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        Element element = new Element() {
            @Override
            public String getFormattedContent(int indentLevel) {
                StringBuilder sb = new StringBuilder();
                OutputUtilities.xmlIndent(sb, indentLevel);
                String dateStr = DateFormatUtils.format(new Date(), PATTERN);
                sb.append("<!-- This file was generated by Mybatis generator, Generated time: ").append(dateStr).append(" -->");
                return sb.toString();
            }
        };
        document.getRootElement().addElement(0, element);
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        List<IntrospectedColumn> columns = introspectedTable.getPrimaryKeyColumns();
        if (columns.size() == 1) {
            element.addAttribute(new Attribute("useGeneratedKeys", "true"));
            element.addAttribute(new Attribute("keyProperty", columns.get(0).getJavaProperty()));
        }
        return super.sqlMapInsertElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        // 重复生成xml文件时不合并已有文件
        sqlMap.setMergeable(false);
        return true;
    }
}
