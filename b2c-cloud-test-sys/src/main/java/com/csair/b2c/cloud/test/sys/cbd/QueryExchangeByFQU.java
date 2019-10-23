
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
 *         &lt;element name="in0" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in1" type="{http://dto.services.marketing.cbd.csair.com}ArrayOfQueryPriceDto"/&gt;
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in6" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "in0",
    "in1",
    "in2",
    "in3",
    "in4",
    "in5",
    "in6"
})
@XmlRootElement(name = "queryExchangeByFQU")
public class QueryExchangeByFQU {

    @XmlElement(required = true, nillable = true)
    protected String in0;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfQueryPriceDto in1;
    @XmlElement(required = true, nillable = true)
    protected String in2;
    @XmlElement(required = true, nillable = true)
    protected String in3;
    @XmlElement(required = true, nillable = true)
    protected String in4;
    @XmlElement(required = true, nillable = true)
    protected String in5;
    protected int in6;

    /**
     * ��ȡin0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn0() {
        return in0;
    }

    /**
     * ����in0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn0(String value) {
        this.in0 = value;
    }

    /**
     * ��ȡin1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryPriceDto }
     *     
     */
    public ArrayOfQueryPriceDto getIn1() {
        return in1;
    }

    /**
     * ����in1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryPriceDto }
     *     
     */
    public void setIn1(ArrayOfQueryPriceDto value) {
        this.in1 = value;
    }

    /**
     * ��ȡin2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn2() {
        return in2;
    }

    /**
     * ����in2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn2(String value) {
        this.in2 = value;
    }

    /**
     * ��ȡin3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn3() {
        return in3;
    }

    /**
     * ����in3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn3(String value) {
        this.in3 = value;
    }

    /**
     * ��ȡin4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4() {
        return in4;
    }

    /**
     * ����in4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4(String value) {
        this.in4 = value;
    }

    /**
     * ��ȡin5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn5() {
        return in5;
    }

    /**
     * ����in5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn5(String value) {
        this.in5 = value;
    }

    /**
     * ��ȡin6���Ե�ֵ��
     * 
     */
    public int getIn6() {
        return in6;
    }

    /**
     * ����in6���Ե�ֵ��
     * 
     */
    public void setIn6(int value) {
        this.in6 = value;
    }

}
