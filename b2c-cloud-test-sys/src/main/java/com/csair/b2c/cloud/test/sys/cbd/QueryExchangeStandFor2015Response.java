
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.services.marketing.cbd.csair.com}MobileExchangeStandDtoFor2015"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "queryExchangeStandFor2015Response")
public class QueryExchangeStandFor2015Response {

    @XmlElement(required = true, nillable = true)
    protected MobileExchangeStandDtoFor2015 out;

    /**
     * ��ȡout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MobileExchangeStandDtoFor2015 }
     *     
     */
    public MobileExchangeStandDtoFor2015 getOut() {
        return out;
    }

    /**
     * ����out���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MobileExchangeStandDtoFor2015 }
     *     
     */
    public void setOut(MobileExchangeStandDtoFor2015 value) {
        this.out = value;
    }

}
