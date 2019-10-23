
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
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="in5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in7" type="{http://dto.services.marketing.cbd.csair.com}ArrayOfQueryPriceDto"/&gt;
 *         &lt;element name="in8" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in9" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in10" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in11" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in12" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in13" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in14" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "in6",
    "in7",
    "in8",
    "in9",
    "in10",
    "in11",
    "in12",
    "in13",
    "in14"
})
@XmlRootElement(name = "commandFtu")
public class CommandFtu {

    @XmlElement(required = true, nillable = true)
    protected String in0;
    @XmlElement(required = true, nillable = true)
    protected String in1;
    @XmlElement(required = true, nillable = true)
    protected String in2;
    @XmlElement(required = true, nillable = true)
    protected String in3;
    protected int in4;
    @XmlElement(required = true, nillable = true)
    protected String in5;
    @XmlElement(required = true, nillable = true)
    protected String in6;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfQueryPriceDto in7;
    @XmlElement(required = true, nillable = true)
    protected String in8;
    @XmlElement(required = true, nillable = true)
    protected String in9;
    @XmlElement(required = true, nillable = true)
    protected String in10;
    @XmlElement(required = true, nillable = true)
    protected String in11;
    @XmlElement(required = true, nillable = true)
    protected String in12;
    @XmlElement(required = true, nillable = true)
    protected String in13;
    protected int in14;

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
     *     {@link String }
     *     
     */
    public String getIn1() {
        return in1;
    }

    /**
     * ����in1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn1(String value) {
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
     */
    public int getIn4() {
        return in4;
    }

    /**
     * ����in4���Ե�ֵ��
     * 
     */
    public void setIn4(int value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn6() {
        return in6;
    }

    /**
     * ����in6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn6(String value) {
        this.in6 = value;
    }

    /**
     * ��ȡin7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryPriceDto }
     *     
     */
    public ArrayOfQueryPriceDto getIn7() {
        return in7;
    }

    /**
     * ����in7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryPriceDto }
     *     
     */
    public void setIn7(ArrayOfQueryPriceDto value) {
        this.in7 = value;
    }

    /**
     * ��ȡin8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn8() {
        return in8;
    }

    /**
     * ����in8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn8(String value) {
        this.in8 = value;
    }

    /**
     * ��ȡin9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn9() {
        return in9;
    }

    /**
     * ����in9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn9(String value) {
        this.in9 = value;
    }

    /**
     * ��ȡin10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn10() {
        return in10;
    }

    /**
     * ����in10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn10(String value) {
        this.in10 = value;
    }

    /**
     * ��ȡin11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn11() {
        return in11;
    }

    /**
     * ����in11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn11(String value) {
        this.in11 = value;
    }

    /**
     * ��ȡin12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn12() {
        return in12;
    }

    /**
     * ����in12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn12(String value) {
        this.in12 = value;
    }

    /**
     * ��ȡin13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn13() {
        return in13;
    }

    /**
     * ����in13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn13(String value) {
        this.in13 = value;
    }

    /**
     * ��ȡin14���Ե�ֵ��
     * 
     */
    public int getIn14() {
        return in14;
    }

    /**
     * ����in14���Ե�ֵ��
     * 
     */
    public void setIn14(int value) {
        this.in14 = value;
    }

}
