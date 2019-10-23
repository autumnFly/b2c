
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MileageStandardDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MileageStandardDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="upCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="upNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MileageStandardDto", namespace = "http://dto.services.account.cbd.csair.com", propOrder = {
    "basicCount",
    "clazz",
    "dep",
    "dest",
    "loyaltyId",
    "upCount",
    "upNumber"
})
public class MileageStandardDto {

    protected Integer basicCount;
    @XmlElementRef(name = "clazz", namespace = "http://dto.services.account.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clazz;
    @XmlElementRef(name = "dep", namespace = "http://dto.services.account.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dep;
    @XmlElementRef(name = "dest", namespace = "http://dto.services.account.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dest;
    protected Integer loyaltyId;
    protected Integer upCount;
    protected Double upNumber;

    /**
     * ��ȡbasicCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBasicCount() {
        return basicCount;
    }

    /**
     * ����basicCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBasicCount(Integer value) {
        this.basicCount = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClazz(JAXBElement<String> value) {
        this.clazz = value;
    }

    /**
     * ��ȡdep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDep() {
        return dep;
    }

    /**
     * ����dep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDep(JAXBElement<String> value) {
        this.dep = value;
    }

    /**
     * ��ȡdest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDest() {
        return dest;
    }

    /**
     * ����dest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDest(JAXBElement<String> value) {
        this.dest = value;
    }

    /**
     * ��ȡloyaltyId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoyaltyId() {
        return loyaltyId;
    }

    /**
     * ����loyaltyId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoyaltyId(Integer value) {
        this.loyaltyId = value;
    }

    /**
     * ��ȡupCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpCount() {
        return upCount;
    }

    /**
     * ����upCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpCount(Integer value) {
        this.upCount = value;
    }

    /**
     * ��ȡupNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpNumber() {
        return upNumber;
    }

    /**
     * ����upNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpNumber(Double value) {
        this.upNumber = value;
    }

}
