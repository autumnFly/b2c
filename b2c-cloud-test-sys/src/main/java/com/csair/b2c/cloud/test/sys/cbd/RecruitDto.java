
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RecruitDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RecruitDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="applySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arriveAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="batchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="collectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cumulateCabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cumulateFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cumulatePassengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exportFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="icsPnrRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="muFtdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="opDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="opId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecruitDto", namespace = "http://dto.services.cbdinterface.cbd.csair.com", propOrder = {
    "aid",
    "applyDate",
    "applyId",
    "applySource",
    "arriveAirport",
    "batchId",
    "collectDate",
    "collectId",
    "cumulateCabin",
    "cumulateFlightNumber",
    "cumulatePassengerName",
    "departureAirport",
    "eticketNumber",
    "exportFlag",
    "flightDate",
    "icsPnrRef",
    "memberNo",
    "muFtdId",
    "opDate",
    "opId",
    "remark",
    "sourceCode",
    "status"
})
public class RecruitDto {

    @XmlElementRef(name = "aid", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    @XmlElementRef(name = "applyId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> applyId;
    @XmlElementRef(name = "applySource", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applySource;
    @XmlElementRef(name = "arriveAirport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arriveAirport;
    @XmlElementRef(name = "batchId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> batchId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectDate;
    @XmlElementRef(name = "collectId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectId;
    @XmlElementRef(name = "cumulateCabin", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cumulateCabin;
    @XmlElementRef(name = "cumulateFlightNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cumulateFlightNumber;
    @XmlElementRef(name = "cumulatePassengerName", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cumulatePassengerName;
    @XmlElementRef(name = "departureAirport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureAirport;
    @XmlElementRef(name = "eticketNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eticketNumber;
    @XmlElementRef(name = "exportFlag", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElementRef(name = "icsPnrRef", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icsPnrRef;
    @XmlElementRef(name = "memberNo", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;
    @XmlElementRef(name = "muFtdId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> muFtdId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar opDate;
    @XmlElementRef(name = "opId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opId;
    @XmlElementRef(name = "remark", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "sourceCode", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceCode;
    @XmlElementRef(name = "status", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;

    /**
     * ��ȡaid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAid() {
        return aid;
    }

    /**
     * ����aid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAid(JAXBElement<String> value) {
        this.aid = value;
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
     * ��ȡapplyId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getApplyId() {
        return applyId;
    }

    /**
     * ����applyId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setApplyId(JAXBElement<Long> value) {
        this.applyId = value;
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
     * ��ȡcumulateCabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCumulateCabin() {
        return cumulateCabin;
    }

    /**
     * ����cumulateCabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCumulateCabin(JAXBElement<String> value) {
        this.cumulateCabin = value;
    }

    /**
     * ��ȡcumulateFlightNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCumulateFlightNumber() {
        return cumulateFlightNumber;
    }

    /**
     * ����cumulateFlightNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCumulateFlightNumber(JAXBElement<String> value) {
        this.cumulateFlightNumber = value;
    }

    /**
     * ��ȡcumulatePassengerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCumulatePassengerName() {
        return cumulatePassengerName;
    }

    /**
     * ����cumulatePassengerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCumulatePassengerName(JAXBElement<String> value) {
        this.cumulatePassengerName = value;
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
     * ��ȡexportFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportFlag() {
        return exportFlag;
    }

    /**
     * ����exportFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportFlag(JAXBElement<String> value) {
        this.exportFlag = value;
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
     * ��ȡopDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpDate() {
        return opDate;
    }

    /**
     * ����opDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpDate(XMLGregorianCalendar value) {
        this.opDate = value;
    }

    /**
     * ��ȡopId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpId() {
        return opId;
    }

    /**
     * ����opId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpId(JAXBElement<String> value) {
        this.opId = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
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
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

}
