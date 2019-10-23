
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RecruitApplyDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RecruitApplyDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="applyEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="applySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="applyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arriveAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="batchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateIdnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="collectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="flightEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ftdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="icsPnrRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mileageRecruitApplyOpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mileageRecruitApplyOpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="muFtdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="passengerChinesename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelDetailOpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecruitApplyDto", namespace = "http://dto.services.flyRecords.cbd.csair.com", propOrder = {
    "airlineCompany",
    "applyDate",
    "applyEndDate",
    "applySource",
    "applyStartDate",
    "applyStatus",
    "arriveAirport",
    "batchId",
    "certificateIdnum",
    "certificateType",
    "clazz",
    "collectDate",
    "collectId",
    "departureAirport",
    "eticketNumber",
    "flightDate",
    "flightEndDate",
    "flightNumber",
    "flightSegment",
    "flightStartDate",
    "ftdId",
    "icsPnrRef",
    "memberName",
    "memberNo",
    "mileageRecruitApplyOpDate",
    "mileageRecruitApplyOpId",
    "muFtdId",
    "passengerChinesename",
    "passengerFirstname",
    "passengerLastname",
    "passportNum",
    "sourceCode",
    "travelDetailOpId"
})
public class RecruitApplyDto {

    @XmlElementRef(name = "airlineCompany", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlineCompany;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyEndDate;
    @XmlElementRef(name = "applySource", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applySource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyStartDate;
    @XmlElementRef(name = "applyStatus", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyStatus;
    @XmlElementRef(name = "arriveAirport", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arriveAirport;
    @XmlElementRef(name = "batchId", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> batchId;
    @XmlElementRef(name = "certificateIdnum", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateIdnum;
    @XmlElementRef(name = "certificateType", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateType;
    @XmlElementRef(name = "clazz", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clazz;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectDate;
    @XmlElementRef(name = "collectId", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectId;
    @XmlElementRef(name = "departureAirport", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureAirport;
    @XmlElementRef(name = "eticketNumber", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eticketNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightEndDate;
    @XmlElementRef(name = "flightNumber", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNumber;
    @XmlElementRef(name = "flightSegment", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightSegment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightStartDate;
    @XmlElementRef(name = "ftdId", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ftdId;
    @XmlElementRef(name = "icsPnrRef", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icsPnrRef;
    @XmlElementRef(name = "memberName", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberName;
    @XmlElementRef(name = "memberNo", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mileageRecruitApplyOpDate;
    @XmlElementRef(name = "mileageRecruitApplyOpId", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mileageRecruitApplyOpId;
    @XmlElementRef(name = "muFtdId", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> muFtdId;
    @XmlElementRef(name = "passengerChinesename", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerChinesename;
    @XmlElementRef(name = "passengerFirstname", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerFirstname;
    @XmlElementRef(name = "passengerLastname", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerLastname;
    @XmlElementRef(name = "passportNum", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNum;
    @XmlElementRef(name = "sourceCode", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceCode;
    @XmlElementRef(name = "travelDetailOpId", namespace = "http://dto.services.flyRecords.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> travelDetailOpId;

    /**
     * ��ȡairlineCompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirlineCompany() {
        return airlineCompany;
    }

    /**
     * ����airlineCompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirlineCompany(JAXBElement<String> value) {
        this.airlineCompany = value;
    }

    /**
     * ��ȡapplyDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * ����applyDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
    }

    /**
     * ��ȡapplyEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyEndDate() {
        return applyEndDate;
    }

    /**
     * ����applyEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyEndDate(XMLGregorianCalendar value) {
        this.applyEndDate = value;
    }

    /**
     * ��ȡapplySource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplySource() {
        return applySource;
    }

    /**
     * ����applySource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplySource(JAXBElement<String> value) {
        this.applySource = value;
    }

    /**
     * ��ȡapplyStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyStartDate() {
        return applyStartDate;
    }

    /**
     * ����applyStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyStartDate(XMLGregorianCalendar value) {
        this.applyStartDate = value;
    }

    /**
     * ��ȡapplyStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyStatus() {
        return applyStatus;
    }

    /**
     * ����applyStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyStatus(JAXBElement<String> value) {
        this.applyStatus = value;
    }

    /**
     * ��ȡarriveAirport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArriveAirport() {
        return arriveAirport;
    }

    /**
     * ����arriveAirport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArriveAirport(JAXBElement<String> value) {
        this.arriveAirport = value;
    }

    /**
     * ��ȡbatchId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatchId() {
        return batchId;
    }

    /**
     * ����batchId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatchId(JAXBElement<String> value) {
        this.batchId = value;
    }

    /**
     * ��ȡcertificateIdnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificateIdnum() {
        return certificateIdnum;
    }

    /**
     * ����certificateIdnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificateIdnum(JAXBElement<String> value) {
        this.certificateIdnum = value;
    }

    /**
     * ��ȡcertificateType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificateType() {
        return certificateType;
    }

    /**
     * ����certificateType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificateType(JAXBElement<String> value) {
        this.certificateType = value;
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
     * ��ȡcollectDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectDate() {
        return collectDate;
    }

    /**
     * ����collectDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectDate(XMLGregorianCalendar value) {
        this.collectDate = value;
    }

    /**
     * ��ȡcollectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectId() {
        return collectId;
    }

    /**
     * ����collectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectId(JAXBElement<String> value) {
        this.collectId = value;
    }

    /**
     * ��ȡdepartureAirport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureAirport() {
        return departureAirport;
    }

    /**
     * ����departureAirport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureAirport(JAXBElement<String> value) {
        this.departureAirport = value;
    }

    /**
     * ��ȡeticketNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEticketNumber() {
        return eticketNumber;
    }

    /**
     * ����eticketNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEticketNumber(JAXBElement<String> value) {
        this.eticketNumber = value;
    }

    /**
     * ��ȡflightDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * ����flightDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * ��ȡflightEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightEndDate() {
        return flightEndDate;
    }

    /**
     * ����flightEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightEndDate(XMLGregorianCalendar value) {
        this.flightEndDate = value;
    }

    /**
     * ��ȡflightNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNumber() {
        return flightNumber;
    }

    /**
     * ����flightNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNumber(JAXBElement<String> value) {
        this.flightNumber = value;
    }

    /**
     * ��ȡflightSegment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightSegment() {
        return flightSegment;
    }

    /**
     * ����flightSegment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightSegment(JAXBElement<String> value) {
        this.flightSegment = value;
    }

    /**
     * ��ȡflightStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightStartDate() {
        return flightStartDate;
    }

    /**
     * ����flightStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightStartDate(XMLGregorianCalendar value) {
        this.flightStartDate = value;
    }

    /**
     * ��ȡftdId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFtdId() {
        return ftdId;
    }

    /**
     * ����ftdId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFtdId(JAXBElement<Long> value) {
        this.ftdId = value;
    }

    /**
     * ��ȡicsPnrRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIcsPnrRef() {
        return icsPnrRef;
    }

    /**
     * ����icsPnrRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIcsPnrRef(JAXBElement<String> value) {
        this.icsPnrRef = value;
    }

    /**
     * ��ȡmemberName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberName() {
        return memberName;
    }

    /**
     * ����memberName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberName(JAXBElement<String> value) {
        this.memberName = value;
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
     * ��ȡmileageRecruitApplyOpDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMileageRecruitApplyOpDate() {
        return mileageRecruitApplyOpDate;
    }

    /**
     * ����mileageRecruitApplyOpDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMileageRecruitApplyOpDate(XMLGregorianCalendar value) {
        this.mileageRecruitApplyOpDate = value;
    }

    /**
     * ��ȡmileageRecruitApplyOpId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMileageRecruitApplyOpId() {
        return mileageRecruitApplyOpId;
    }

    /**
     * ����mileageRecruitApplyOpId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMileageRecruitApplyOpId(JAXBElement<String> value) {
        this.mileageRecruitApplyOpId = value;
    }

    /**
     * ��ȡmuFtdId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMuFtdId() {
        return muFtdId;
    }

    /**
     * ����muFtdId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMuFtdId(JAXBElement<Long> value) {
        this.muFtdId = value;
    }

    /**
     * ��ȡpassengerChinesename���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassengerChinesename() {
        return passengerChinesename;
    }

    /**
     * ����passengerChinesename���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassengerChinesename(JAXBElement<String> value) {
        this.passengerChinesename = value;
    }

    /**
     * ��ȡpassengerFirstname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassengerFirstname() {
        return passengerFirstname;
    }

    /**
     * ����passengerFirstname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassengerFirstname(JAXBElement<String> value) {
        this.passengerFirstname = value;
    }

    /**
     * ��ȡpassengerLastname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassengerLastname() {
        return passengerLastname;
    }

    /**
     * ����passengerLastname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassengerLastname(JAXBElement<String> value) {
        this.passengerLastname = value;
    }

    /**
     * ��ȡpassportNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNum() {
        return passportNum;
    }

    /**
     * ����passportNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNum(JAXBElement<String> value) {
        this.passportNum = value;
    }

    /**
     * ��ȡsourceCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceCode() {
        return sourceCode;
    }

    /**
     * ����sourceCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceCode(JAXBElement<String> value) {
        this.sourceCode = value;
    }

    /**
     * ��ȡtravelDetailOpId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTravelDetailOpId() {
        return travelDetailOpId;
    }

    /**
     * ����travelDetailOpId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTravelDetailOpId(JAXBElement<String> value) {
        this.travelDetailOpId = value;
    }

}
