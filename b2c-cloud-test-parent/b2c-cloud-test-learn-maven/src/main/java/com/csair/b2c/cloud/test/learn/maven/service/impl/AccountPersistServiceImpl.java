package com.csair.b2c.cloud.test.learn.maven.service.impl;

import com.csair.b2c.cloud.test.common.util.JaxbUtils;
import com.csair.b2c.cloud.test.learn.maven.exception.BusinessException;
import com.csair.b2c.cloud.test.learn.maven.model.Account;
import com.csair.b2c.cloud.test.learn.maven.service.AccountPersistService;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
@Service
public class AccountPersistServiceImpl implements AccountPersistService {
    Logger logger = LoggerFactory.getLogger(getClass());

    private static final File file;

    static {
        file = new File("G:\\account.xml");
    }

    @Override
    public void createAcount(Account account) {
        try {
            Document doc;
            if (!file.exists()) {
                doc = DocumentHelper.createDocument(DocumentHelper.createElement("accounts"));
            } else {
                doc = readDoc();
                if (getUserEle(account.getId(), doc.getRootElement()) != null) {
                    throw new BusinessException("用户id已存在!");
                }

            }
            Element root = doc.getRootElement();
            Element ele = DocumentHelper.createElement("account");
            Field[] fields = account.getClass().getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field field : fields) {
                Element element = DocumentHelper.createElement(field.getName());
                element.setText(String.valueOf(field.get(account)));
                ele.add(element);
            }
            root.add(ele);

            writeDoc(doc);

        } catch (Exception e) {
            throw new RuntimeException(account.toString(), e);
        }
    }

    @Override
    public Account readAcount(String id) {
        try {
            Document doc = readDoc();
            Element root = doc.getRootElement();
            Element userEle = getUserEle(id, root);
            if (userEle == null) {
                return null;
            }
            return JaxbUtils.xml2Bean(userEle.asXML(), Account.class);
        } catch (Exception e) {
            throw new RuntimeException(id, e);
        }
    }

    @Override
    public void deleteAcount(String id) {
        try {
            Document doc = readDoc();
            Element root = doc.getRootElement();
            Element userEle = getUserEle(id, root);
            if (userEle == null) {
                return;
            }
            root.remove(userEle);
        } catch (Exception e) {
            throw new RuntimeException(id, e);
        }
    }

    @Override
    public void updateAcount(Account account) {
        try {
            Document doc = readDoc();
            Element root = doc.getRootElement();
            Element userEle = getUserEle(account.getId(), root);
            if (userEle == null) {
                return;
            }
            Field[] fields = account.getClass().getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field field : fields) {
                Object object = field.get(account);
                if (object == null) {
                    continue;
                }
                String value = String.valueOf(object);
                logger.debug("updateAcount name:{},value:{}", field.getName(), value);
                if (StringUtils.isNotBlank(value)) {
                    userEle.element(field.getName()).setText(value);
                }
            }
            writeDoc(doc);
        } catch (Exception e) {
            throw new RuntimeException(account.toString(), e);
        }

    }

    private Document readDoc() throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read(file);
        return doc;
    }

    private void writeDoc(Document doc) throws Exception {
        Writer out = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        XMLWriter writer = new XMLWriter(out, OutputFormat.createPrettyPrint());
        writer.write(doc);
        out.close();
        writer.close();
    }

    private Element getUserEle(String id, Element root) {
        String s = String.format("/accounts/account[id='%s']", id);
        logger.debug("getUserEle s:{}", s);
        Element ele = ((Element) root.selectSingleNode(s));
        return ele;
    }
}
