
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpgradeExchangeStandDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpgradeExchangeStandDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="b_luxury_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="business_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="e_luxury_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="economic_business" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="economic_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="economic_luxury" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="h_luxury_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="l_luxury_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="luxury_business" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="luxury_first" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeExchangeStandDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "bLuxuryFirst",
    "businessFirst",
    "eLuxuryFirst",
    "economicBusiness",
    "economicFirst",
    "economicLuxury",
    "hLuxuryFirst",
    "lLuxuryFirst",
    "luxuryBusiness",
    "luxuryFirst"
})
public class UpgradeExchangeStandDto {

    @XmlElementRef(name = "b_luxury_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bLuxuryFirst;
    @XmlElementRef(name = "business_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> businessFirst;
    @XmlElementRef(name = "e_luxury_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eLuxuryFirst;
    @XmlElementRef(name = "economic_business", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> economicBusiness;
    @XmlElementRef(name = "economic_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> economicFirst;
    @XmlElementRef(name = "economic_luxury", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> economicLuxury;
    @XmlElementRef(name = "h_luxury_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hLuxuryFirst;
    @XmlElementRef(name = "l_luxury_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lLuxuryFirst;
    @XmlElementRef(name = "luxury_business", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> luxuryBusiness;
    @XmlElementRef(name = "luxury_first", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> luxuryFirst;

    /**
     * ��ȡbLuxuryFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBLuxuryFirst() {
        return bLuxuryFirst;
    }

    /**
     * ����bLuxuryFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBLuxuryFirst(JAXBElement<Integer> value) {
        this.bLuxuryFirst = value;
    }

    /**
     * ��ȡbusinessFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBusinessFirst() {
        return businessFirst;
    }

    /**
     * ����businessFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBusinessFirst(JAXBElement<Integer> value) {
        this.businessFirst = value;
    }

    /**
     * ��ȡeLuxuryFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getELuxuryFirst() {
        return eLuxuryFirst;
    }

    /**
     * ����eLuxuryFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setELuxuryFirst(JAXBElement<Integer> value) {
        this.eLuxuryFirst = value;
    }

    /**
     * ��ȡeconomicBusiness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEconomicBusiness() {
        return economicBusiness;
    }

    /**
     * ����economicBusiness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEconomicBusiness(JAXBElement<Integer> value) {
        this.economicBusiness = value;
    }

    /**
     * ��ȡeconomicFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEconomicFirst() {
        return economicFirst;
    }

    /**
     * ����economicFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEconomicFirst(JAXBElement<Integer> value) {
        this.economicFirst = value;
    }

    /**
     * ��ȡeconomicLuxury���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEconomicLuxury() {
        return economicLuxury;
    }

    /**
     * ����economicLuxury���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEconomicLuxury(JAXBElement<Integer> value) {
        this.economicLuxury = value;
    }

    /**
     * ��ȡhLuxuryFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHLuxuryFirst() {
        return hLuxuryFirst;
    }

    /**
     * ����hLuxuryFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHLuxuryFirst(JAXBElement<Integer> value) {
        this.hLuxuryFirst = value;
    }

    /**
     * ��ȡlLuxuryFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLLuxuryFirst() {
        return lLuxuryFirst;
    }

    /**
     * ����lLuxuryFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLLuxuryFirst(JAXBElement<Integer> value) {
        this.lLuxuryFirst = value;
    }

    /**
     * ��ȡluxuryBusiness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLuxuryBusiness() {
        return luxuryBusiness;
    }

    /**
     * ����luxuryBusiness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLuxuryBusiness(JAXBElement<Integer> value) {
        this.luxuryBusiness = value;
    }

    /**
     * ��ȡluxuryFirst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLuxuryFirst() {
        return luxuryFirst;
    }

    /**
     * ����luxuryFirst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLuxuryFirst(JAXBElement<Integer> value) {
        this.luxuryFirst = value;
    }

}
