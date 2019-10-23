
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MemberInfoForVOS complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MemberInfoForVOS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentUpgradeMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currentUpgradeSegment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="joinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="latestMileageDto" type="{http://dto.services.cbdinterface.cbd.csair.com}LatestMileageDto" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "MemberInfoForVOS", namespace = "http://dto.services.cbdinterface.cbd.csair.com", propOrder = {
    "accountStatus",
    "accountType",
    "activeStatus",
    "currentUpgradeMileage",
    "currentUpgradeSegment",
    "endTime",
    "joinDate",
    "latestMileageDto",
    "loyaltyId",
    "loyaltyName",
    "memberNo",
    "tierId",
    "totalMileage",
    "usefulMileage"
})
public class MemberInfoForVOS {

    @XmlElementRef(name = "accountStatus", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountStatus;
    @XmlElementRef(name = "accountType", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountType;
    @XmlElementRef(name = "activeStatus", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeStatus;
    protected Double currentUpgradeMileage;
    protected Double currentUpgradeSegment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar joinDate;
    @XmlElementRef(name = "latestMileageDto", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<LatestMileageDto> latestMileageDto;
    protected Integer loyaltyId;
    @XmlElementRef(name = "loyaltyName", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyName;
    @XmlElementRef(name = "memberNo", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;
    @XmlElementRef(name = "tierId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierId;
    protected Double totalMileage;
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
     * ��ȡaccountType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountType() {
        return accountType;
    }

    /**
     * ����accountType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountType(JAXBElement<String> value) {
        this.accountType = value;
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
     * ��ȡcurrentUpgradeMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentUpgradeMileage() {
        return currentUpgradeMileage;
    }

    /**
     * ����currentUpgradeMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentUpgradeMileage(Double value) {
        this.currentUpgradeMileage = value;
    }

    /**
     * ��ȡcurrentUpgradeSegment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentUpgradeSegment() {
        return currentUpgradeSegment;
    }

    /**
     * ����currentUpgradeSegment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentUpgradeSegment(Double value) {
        this.currentUpgradeSegment = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * ��ȡjoinDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJoinDate() {
        return joinDate;
    }

    /**
     * ����joinDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJoinDate(XMLGregorianCalendar value) {
        this.joinDate = value;
    }

    /**
     * ��ȡlatestMileageDto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LatestMileageDto }{@code >}
     *     
     */
    public JAXBElement<LatestMileageDto> getLatestMileageDto() {
        return latestMileageDto;
    }

    /**
     * ����latestMileageDto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LatestMileageDto }{@code >}
     *     
     */
    public void setLatestMileageDto(JAXBElement<LatestMileageDto> value) {
        this.latestMileageDto = value;
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
     * ��ȡloyaltyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyName() {
        return loyaltyName;
    }

    /**
     * ����loyaltyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyName(JAXBElement<String> value) {
        this.loyaltyName = value;
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
