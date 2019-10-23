
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MobileExchangeStandDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MobileExchangeStandDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="freeExchangeStandDto" type="{http://dto.services.marketing.cbd.csair.com}FreeExchangeStandDto" minOccurs="0"/&gt;
 *         &lt;element name="upgradeExchangeStandDto" type="{http://dto.services.marketing.cbd.csair.com}UpgradeExchangeStandDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileExchangeStandDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "arr",
    "dep",
    "freeExchangeStandDto",
    "upgradeExchangeStandDto"
})
public class MobileExchangeStandDto {

    @XmlElementRef(name = "arr", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arr;
    @XmlElementRef(name = "dep", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dep;
    @XmlElementRef(name = "freeExchangeStandDto", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FreeExchangeStandDto> freeExchangeStandDto;
    @XmlElementRef(name = "upgradeExchangeStandDto", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UpgradeExchangeStandDto> upgradeExchangeStandDto;

    /**
     * ��ȡarr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArr() {
        return arr;
    }

    /**
     * ����arr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArr(JAXBElement<String> value) {
        this.arr = value;
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
     * ��ȡfreeExchangeStandDto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FreeExchangeStandDto }{@code >}
     *     
     */
    public JAXBElement<FreeExchangeStandDto> getFreeExchangeStandDto() {
        return freeExchangeStandDto;
    }

    /**
     * ����freeExchangeStandDto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FreeExchangeStandDto }{@code >}
     *     
     */
    public void setFreeExchangeStandDto(JAXBElement<FreeExchangeStandDto> value) {
        this.freeExchangeStandDto = value;
    }

    /**
     * ��ȡupgradeExchangeStandDto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpgradeExchangeStandDto }{@code >}
     *     
     */
    public JAXBElement<UpgradeExchangeStandDto> getUpgradeExchangeStandDto() {
        return upgradeExchangeStandDto;
    }

    /**
     * ����upgradeExchangeStandDto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpgradeExchangeStandDto }{@code >}
     *     
     */
    public void setUpgradeExchangeStandDto(JAXBElement<UpgradeExchangeStandDto> value) {
        this.upgradeExchangeStandDto = value;
    }

}
