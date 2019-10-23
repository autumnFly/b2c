
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QueryPriceResultDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QueryPriceResultDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="exchangeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="payType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="saleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPriceResultDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "beginDate",
    "carrier",
    "endDate",
    "exchangeFlag",
    "payCount",
    "payType",
    "policyDescription",
    "policyLimit",
    "policyType",
    "priceSequence",
    "saleCode",
    "segNumber"
})
public class QueryPriceResultDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElementRef(name = "carrier", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrier;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "exchangeFlag", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeFlag;
    @XmlElementRef(name = "payCount", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> payCount;
    @XmlElementRef(name = "payType", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payType;
    @XmlElementRef(name = "policyDescription", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyDescription;
    @XmlElementRef(name = "policyLimit", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyLimit;
    @XmlElementRef(name = "policyType", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyType;
    protected Integer priceSequence;
    @XmlElementRef(name = "saleCode", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleCode;
    protected Integer segNumber;

    /**
     * ��ȡbeginDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * ����beginDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * ��ȡcarrier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrier() {
        return carrier;
    }

    /**
     * ����carrier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrier(JAXBElement<String> value) {
        this.carrier = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡexchangeFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExchangeFlag() {
        return exchangeFlag;
    }

    /**
     * ����exchangeFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExchangeFlag(JAXBElement<String> value) {
        this.exchangeFlag = value;
    }

    /**
     * ��ȡpayCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPayCount() {
        return payCount;
    }

    /**
     * ����payCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPayCount(JAXBElement<Double> value) {
        this.payCount = value;
    }

    /**
     * ��ȡpayType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayType() {
        return payType;
    }

    /**
     * ����payType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayType(JAXBElement<String> value) {
        this.payType = value;
    }

    /**
     * ��ȡpolicyDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyDescription() {
        return policyDescription;
    }

    /**
     * ����policyDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyDescription(JAXBElement<String> value) {
        this.policyDescription = value;
    }

    /**
     * ��ȡpolicyLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyLimit() {
        return policyLimit;
    }

    /**
     * ����policyLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyLimit(JAXBElement<String> value) {
        this.policyLimit = value;
    }

    /**
     * ��ȡpolicyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyType() {
        return policyType;
    }

    /**
     * ����policyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyType(JAXBElement<String> value) {
        this.policyType = value;
    }

    /**
     * ��ȡpriceSequence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceSequence() {
        return priceSequence;
    }

    /**
     * ����priceSequence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceSequence(Integer value) {
        this.priceSequence = value;
    }

    /**
     * ��ȡsaleCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleCode() {
        return saleCode;
    }

    /**
     * ����saleCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleCode(JAXBElement<String> value) {
        this.saleCode = value;
    }

    /**
     * ��ȡsegNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegNumber() {
        return segNumber;
    }

    /**
     * ����segNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegNumber(Integer value) {
        this.segNumber = value;
    }

}
