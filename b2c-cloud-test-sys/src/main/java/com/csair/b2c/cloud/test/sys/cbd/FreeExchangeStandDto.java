
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreeExchangeStandDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FreeExchangeStandDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessCabin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="economicCabin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="firstCabin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="luxuryCabin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="luxuryFirstCabin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeExchangeStandDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "businessCabin",
    "economicCabin",
    "firstCabin",
    "luxuryCabin",
    "luxuryFirstCabin"
})
public class FreeExchangeStandDto {

    @XmlElementRef(name = "businessCabin", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> businessCabin;
    @XmlElementRef(name = "economicCabin", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> economicCabin;
    @XmlElementRef(name = "firstCabin", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> firstCabin;
    @XmlElementRef(name = "luxuryCabin", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> luxuryCabin;
    @XmlElementRef(name = "luxuryFirstCabin", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> luxuryFirstCabin;

    /**
     * ��ȡbusinessCabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBusinessCabin() {
        return businessCabin;
    }

    /**
     * ����businessCabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBusinessCabin(JAXBElement<Integer> value) {
        this.businessCabin = value;
    }

    /**
     * ��ȡeconomicCabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEconomicCabin() {
        return economicCabin;
    }

    /**
     * ����economicCabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEconomicCabin(JAXBElement<Integer> value) {
        this.economicCabin = value;
    }

    /**
     * ��ȡfirstCabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFirstCabin() {
        return firstCabin;
    }

    /**
     * ����firstCabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFirstCabin(JAXBElement<Integer> value) {
        this.firstCabin = value;
    }

    /**
     * ��ȡluxuryCabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLuxuryCabin() {
        return luxuryCabin;
    }

    /**
     * ����luxuryCabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLuxuryCabin(JAXBElement<Integer> value) {
        this.luxuryCabin = value;
    }

    /**
     * ��ȡluxuryFirstCabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLuxuryFirstCabin() {
        return luxuryFirstCabin;
    }

    /**
     * ����luxuryFirstCabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLuxuryFirstCabin(JAXBElement<Integer> value) {
        this.luxuryFirstCabin = value;
    }

}
