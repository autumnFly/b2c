
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemberExchangeInfoForVOSNewDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MemberExchangeInfoForVOSNewDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessChanel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificates" type="{http://business.common}ArrayOfSvcPcCertificateDto" minOccurs="0"/&gt;
 *         &lt;element name="cnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exchangeMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="exchangeOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="havePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyNmae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalExpiredMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalUsedMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="usefulMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberExchangeInfoForVOSNewDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "accountStatus",
    "activeStatus",
    "businessChanel",
    "certificates",
    "cnName",
    "enFirstName",
    "enLastName",
    "enName",
    "exchangeMileage",
    "exchangeOrderId",
    "havePassword",
    "loyaltyId",
    "loyaltyNmae",
    "memberNo",
    "tierId",
    "totalExpiredMileage",
    "totalMileage",
    "totalUsedMileage",
    "usefulMileage"
})
public class MemberExchangeInfoForVOSNewDto {

    @XmlElementRef(name = "accountStatus", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountStatus;
    @XmlElementRef(name = "activeStatus", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeStatus;
    @XmlElementRef(name = "businessChanel", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessChanel;
    @XmlElementRef(name = "certificates", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSvcPcCertificateDto> certificates;
    @XmlElementRef(name = "cnName", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnName;
    @XmlElementRef(name = "enFirstName", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enFirstName;
    @XmlElementRef(name = "enLastName", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enLastName;
    @XmlElementRef(name = "enName", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enName;
    @XmlElementRef(name = "exchangeMileage", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> exchangeMileage;
    @XmlElementRef(name = "exchangeOrderId", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeOrderId;
    @XmlElementRef(name = "havePassword", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> havePassword;
    protected Integer loyaltyId;
    @XmlElementRef(name = "loyaltyNmae", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyNmae;
    @XmlElementRef(name = "memberNo", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;
    @XmlElementRef(name = "tierId", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierId;
    protected Double totalExpiredMileage;
    protected Double totalMileage;
    protected Double totalUsedMileage;
    protected Double usefulMileage;

    /**
     * ��ȡaccountStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountStatus() {
        return accountStatus;
    }

    /**
     * ����accountStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountStatus(JAXBElement<String> value) {
        this.accountStatus = value;
    }

    /**
     * ��ȡactiveStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveStatus() {
        return activeStatus;
    }

    /**
     * ����activeStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveStatus(JAXBElement<String> value) {
        this.activeStatus = value;
    }

    /**
     * ��ȡbusinessChanel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessChanel() {
        return businessChanel;
    }

    /**
     * ����businessChanel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessChanel(JAXBElement<String> value) {
        this.businessChanel = value;
    }

    /**
     * ��ȡcertificates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSvcPcCertificateDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSvcPcCertificateDto> getCertificates() {
        return certificates;
    }

    /**
     * ����certificates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSvcPcCertificateDto }{@code >}
     *     
     */
    public void setCertificates(JAXBElement<ArrayOfSvcPcCertificateDto> value) {
        this.certificates = value;
    }

    /**
     * ��ȡcnName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnName() {
        return cnName;
    }

    /**
     * ����cnName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnName(JAXBElement<String> value) {
        this.cnName = value;
    }

    /**
     * ��ȡenFirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnFirstName() {
        return enFirstName;
    }

    /**
     * ����enFirstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnFirstName(JAXBElement<String> value) {
        this.enFirstName = value;
    }

    /**
     * ��ȡenLastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnLastName() {
        return enLastName;
    }

    /**
     * ����enLastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnLastName(JAXBElement<String> value) {
        this.enLastName = value;
    }

    /**
     * ��ȡenName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnName() {
        return enName;
    }

    /**
     * ����enName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnName(JAXBElement<String> value) {
        this.enName = value;
    }

    /**
     * ��ȡexchangeMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExchangeMileage() {
        return exchangeMileage;
    }

    /**
     * ����exchangeMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExchangeMileage(JAXBElement<Double> value) {
        this.exchangeMileage = value;
    }

    /**
     * ��ȡexchangeOrderId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExchangeOrderId() {
        return exchangeOrderId;
    }

    /**
     * ����exchangeOrderId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExchangeOrderId(JAXBElement<String> value) {
        this.exchangeOrderId = value;
    }

    /**
     * ��ȡhavePassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHavePassword() {
        return havePassword;
    }

    /**
     * ����havePassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHavePassword(JAXBElement<String> value) {
        this.havePassword = value;
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
     * ��ȡloyaltyNmae���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyNmae() {
        return loyaltyNmae;
    }

    /**
     * ����loyaltyNmae���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyNmae(JAXBElement<String> value) {
        this.loyaltyNmae = value;
    }

    /**
     * ��ȡmemberNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberNo() {
        return memberNo;
    }

    /**
     * ����memberNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberNo(JAXBElement<String> value) {
        this.memberNo = value;
    }

    /**
     * ��ȡtierId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTierId() {
        return tierId;
    }

    /**
     * ����tierId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTierId(JAXBElement<String> value) {
        this.tierId = value;
    }

    /**
     * ��ȡtotalExpiredMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalExpiredMileage() {
        return totalExpiredMileage;
    }

    /**
     * ����totalExpiredMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalExpiredMileage(Double value) {
        this.totalExpiredMileage = value;
    }

    /**
     * ��ȡtotalMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalMileage() {
        return totalMileage;
    }

    /**
     * ����totalMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalMileage(Double value) {
        this.totalMileage = value;
    }

    /**
     * ��ȡtotalUsedMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalUsedMileage() {
        return totalUsedMileage;
    }

    /**
     * ����totalUsedMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalUsedMileage(Double value) {
        this.totalUsedMileage = value;
    }

    /**
     * ��ȡusefulMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsefulMileage() {
        return usefulMileage;
    }

    /**
     * ����usefulMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsefulMileage(Double value) {
        this.usefulMileage = value;
    }

}
