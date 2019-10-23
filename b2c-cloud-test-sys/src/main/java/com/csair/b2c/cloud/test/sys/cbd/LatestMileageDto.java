
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>LatestMileageDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="LatestMileageDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="flightSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incomeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="upgradeMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="upgradeSegment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="useMileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestMileageDto", namespace = "http://dto.services.cbdinterface.cbd.csair.com", propOrder = {
    "arrCity",
    "arrivalAirport",
    "clazz",
    "depCity",
    "departureAirport",
    "desc",
    "flightDate",
    "flightSegment",
    "incomeDate",
    "upgradeMileage",
    "upgradeSegment",
    "useMileage"
})
public class LatestMileageDto {

    @XmlElementRef(name = "arrCity", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCity;
    @XmlElementRef(name = "arrivalAirport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrivalAirport;
    @XmlElementRef(name = "clazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clazz;
    @XmlElementRef(name = "depCity", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCity;
    @XmlElementRef(name = "departureAirport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureAirport;
    @XmlElementRef(name = "desc", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElementRef(name = "flightSegment", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightSegment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar incomeDate;
    @XmlElementRef(name = "upgradeMileage", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> upgradeMileage;
    @XmlElementRef(name = "upgradeSegment", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> upgradeSegment;
    @XmlElementRef(name = "useMileage", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> useMileage;

    /**
     * ��ȡarrCity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCity() {
        return arrCity;
    }

    /**
     * ����arrCity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCity(JAXBElement<String> value) {
        this.arrCity = value;
    }

    /**
     * ��ȡarrivalAirport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * ����arrivalAirport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrivalAirport(JAXBElement<String> value) {
        this.arrivalAirport = value;
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
     * ��ȡdepCity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCity() {
        return depCity;
    }

    /**
     * ����depCity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCity(JAXBElement<String> value) {
        this.depCity = value;
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
     * ��ȡdesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesc() {
        return desc;
    }

    /**
     * ����desc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesc(JAXBElement<String> value) {
        this.desc = value;
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
     * ��ȡincomeDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncomeDate() {
        return incomeDate;
    }

    /**
     * ����incomeDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncomeDate(XMLGregorianCalendar value) {
        this.incomeDate = value;
    }

    /**
     * ��ȡupgradeMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUpgradeMileage() {
        return upgradeMileage;
    }

    /**
     * ����upgradeMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUpgradeMileage(JAXBElement<Double> value) {
        this.upgradeMileage = value;
    }

    /**
     * ��ȡupgradeSegment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUpgradeSegment() {
        return upgradeSegment;
    }

    /**
     * ����upgradeSegment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUpgradeSegment(JAXBElement<Double> value) {
        this.upgradeSegment = value;
    }

    /**
     * ��ȡuseMileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUseMileage() {
        return useMileage;
    }

    /**
     * ����useMileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUseMileage(JAXBElement<Double> value) {
        this.useMileage = value;
    }

}
