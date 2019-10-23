
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FlightSegmentDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="airlineCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arriveAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baggageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="baggageWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blindInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boardingGatenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boardingPnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateIdnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="checkinPid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkinTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkinWorkernumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeshareAirlinecd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeshareFltnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeshareFltnumsfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codesharepsgInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crsPnrRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cussInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deafInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="downgradesIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etClazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etCouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etCpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etFareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etFlightRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etMc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etMcFlightno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etOc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etOcFlightno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etOriginClazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etTureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eticketInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ffpAirlinecompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromStandyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goshNoshId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupPeopleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="icsPnrRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndAirlinecompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndArrairport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndBaggagenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndBaggageweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndBrdgatenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndClazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndDepairport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndFlightdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="inbndFlightnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndFltnumsfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inbndSeatnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jumpseatInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="opId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originClazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndAirlinecompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndArrairport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndBaggagenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndBaggageweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndBrdgatenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndClazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndDepairport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndFlightdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="outbndFlightnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndFltnumsfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outbndSeatnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerChinesename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rspOfcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialmealInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssiosiInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upgradesIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usedFfpcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="volntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webcheckinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wheelchairInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="withbabyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDto", namespace = "http://dto.services.cbdinterface.cbd.csair.com", propOrder = {
    "adultType",
    "airlineCompany",
    "arriveAirport",
    "asrInd",
    "baggageNumber",
    "baggageWeight",
    "bedInd",
    "blindInd",
    "boardingGatenumber",
    "boardingPnumber",
    "cabin",
    "certificateIdnum",
    "certificateType",
    "checkinDate",
    "checkinPid",
    "checkinTime",
    "checkinWorkernumber",
    "childType",
    "clazz",
    "codeshareAirlinecd",
    "codeshareFltnum",
    "codeshareFltnumsfx",
    "codesharepsgInd",
    "crsPnrRef",
    "cussInd",
    "dataSource",
    "deafInd",
    "departureAirport",
    "downgradesIdentification",
    "etClazz",
    "etCouponStatus",
    "etCpn",
    "etFareBasis",
    "etFlightRegion",
    "etIataCode",
    "etMc",
    "etMcFlightno",
    "etOc",
    "etOcFlightno",
    "etOriginClazz",
    "etRemark",
    "etTureCode",
    "eticketInd",
    "eticketNumber",
    "ffpAirlinecompany",
    "filler",
    "flightDate",
    "flightNumber",
    "flightNumberSuffix",
    "flightRegion",
    "fromStandyInd",
    "goshNoshId",
    "groupInd",
    "groupPeopleNumber",
    "icsPnrRef",
    "identification",
    "inbndAirlinecompany",
    "inbndArrairport",
    "inbndBaggagenum",
    "inbndBaggageweight",
    "inbndBrdgatenum",
    "inbndClazz",
    "inbndDepairport",
    "inbndFlightdate",
    "inbndFlightnumber",
    "inbndFltnumsfx",
    "inbndSeatnum",
    "jumpseatInd",
    "memberNo",
    "opDate",
    "opId",
    "originClazz",
    "outbndAirlinecompany",
    "outbndArrairport",
    "outbndBaggagenum",
    "outbndBaggageweight",
    "outbndBrdgatenum",
    "outbndClazz",
    "outbndDepairport",
    "outbndFlightdate",
    "outbndFlightnumber",
    "outbndFltnumsfx",
    "outbndSeatnum",
    "passengerChinesename",
    "passengerFirstname",
    "passengerLastname",
    "passportNum",
    "rspOfcCd",
    "seatNumber",
    "specialmealInd",
    "ssiosiInd",
    "travelDetailId",
    "uid",
    "upgradesIdentification",
    "usedFfpcardno",
    "vipInd",
    "volntInd",
    "webcheckinInd",
    "wheelchairInd",
    "withbabyInd"
})
public class FlightSegmentDto {

    @XmlElementRef(name = "adultType", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adultType;
    @XmlElementRef(name = "airlineCompany", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlineCompany;
    @XmlElementRef(name = "arriveAirport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arriveAirport;
    @XmlElementRef(name = "asrInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asrInd;
    @XmlElementRef(name = "baggageNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> baggageNumber;
    @XmlElementRef(name = "baggageWeight", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> baggageWeight;
    @XmlElementRef(name = "bedInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bedInd;
    @XmlElementRef(name = "blindInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blindInd;
    @XmlElementRef(name = "boardingGatenumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> boardingGatenumber;
    @XmlElementRef(name = "boardingPnumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> boardingPnumber;
    @XmlElementRef(name = "cabin", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabin;
    @XmlElementRef(name = "certificateIdnum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateIdnum;
    @XmlElementRef(name = "certificateType", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkinDate;
    @XmlElementRef(name = "checkinPid", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkinPid;
    @XmlElementRef(name = "checkinTime", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkinTime;
    @XmlElementRef(name = "checkinWorkernumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkinWorkernumber;
    @XmlElementRef(name = "childType", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> childType;
    @XmlElementRef(name = "clazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clazz;
    @XmlElementRef(name = "codeshareAirlinecd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeshareAirlinecd;
    @XmlElementRef(name = "codeshareFltnum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeshareFltnum;
    @XmlElementRef(name = "codeshareFltnumsfx", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeshareFltnumsfx;
    @XmlElementRef(name = "codesharepsgInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codesharepsgInd;
    @XmlElementRef(name = "crsPnrRef", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crsPnrRef;
    @XmlElementRef(name = "cussInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cussInd;
    @XmlElementRef(name = "dataSource", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSource;
    @XmlElementRef(name = "deafInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deafInd;
    @XmlElementRef(name = "departureAirport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureAirport;
    @XmlElementRef(name = "downgradesIdentification", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downgradesIdentification;
    @XmlElementRef(name = "etClazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etClazz;
    @XmlElementRef(name = "etCouponStatus", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etCouponStatus;
    @XmlElementRef(name = "etCpn", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etCpn;
    @XmlElementRef(name = "etFareBasis", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etFareBasis;
    @XmlElementRef(name = "etFlightRegion", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etFlightRegion;
    @XmlElementRef(name = "etIataCode", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etIataCode;
    @XmlElementRef(name = "etMc", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etMc;
    @XmlElementRef(name = "etMcFlightno", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etMcFlightno;
    @XmlElementRef(name = "etOc", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etOc;
    @XmlElementRef(name = "etOcFlightno", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etOcFlightno;
    @XmlElementRef(name = "etOriginClazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etOriginClazz;
    @XmlElementRef(name = "etRemark", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etRemark;
    @XmlElementRef(name = "etTureCode", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etTureCode;
    @XmlElementRef(name = "eticketInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eticketInd;
    @XmlElementRef(name = "eticketNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eticketNumber;
    @XmlElementRef(name = "ffpAirlinecompany", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffpAirlinecompany;
    @XmlElementRef(name = "filler", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filler;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElementRef(name = "flightNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNumber;
    @XmlElementRef(name = "flightNumberSuffix", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNumberSuffix;
    @XmlElementRef(name = "flightRegion", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightRegion;
    @XmlElementRef(name = "fromStandyInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromStandyInd;
    @XmlElementRef(name = "goshNoshId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goshNoshId;
    @XmlElementRef(name = "groupInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupInd;
    @XmlElementRef(name = "groupPeopleNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupPeopleNumber;
    @XmlElementRef(name = "icsPnrRef", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icsPnrRef;
    @XmlElementRef(name = "identification", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identification;
    @XmlElementRef(name = "inbndAirlinecompany", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndAirlinecompany;
    @XmlElementRef(name = "inbndArrairport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndArrairport;
    @XmlElementRef(name = "inbndBaggagenum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndBaggagenum;
    @XmlElementRef(name = "inbndBaggageweight", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndBaggageweight;
    @XmlElementRef(name = "inbndBrdgatenum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndBrdgatenum;
    @XmlElementRef(name = "inbndClazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndClazz;
    @XmlElementRef(name = "inbndDepairport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndDepairport;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inbndFlightdate;
    @XmlElementRef(name = "inbndFlightnumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndFlightnumber;
    @XmlElementRef(name = "inbndFltnumsfx", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndFltnumsfx;
    @XmlElementRef(name = "inbndSeatnum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inbndSeatnum;
    @XmlElementRef(name = "jumpseatInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jumpseatInd;
    @XmlElementRef(name = "memberNo", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar opDate;
    @XmlElementRef(name = "opId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opId;
    @XmlElementRef(name = "originClazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originClazz;
    @XmlElementRef(name = "outbndAirlinecompany", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndAirlinecompany;
    @XmlElementRef(name = "outbndArrairport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndArrairport;
    @XmlElementRef(name = "outbndBaggagenum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndBaggagenum;
    @XmlElementRef(name = "outbndBaggageweight", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndBaggageweight;
    @XmlElementRef(name = "outbndBrdgatenum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndBrdgatenum;
    @XmlElementRef(name = "outbndClazz", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndClazz;
    @XmlElementRef(name = "outbndDepairport", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndDepairport;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outbndFlightdate;
    @XmlElementRef(name = "outbndFlightnumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndFlightnumber;
    @XmlElementRef(name = "outbndFltnumsfx", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndFltnumsfx;
    @XmlElementRef(name = "outbndSeatnum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outbndSeatnum;
    @XmlElementRef(name = "passengerChinesename", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerChinesename;
    @XmlElementRef(name = "passengerFirstname", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerFirstname;
    @XmlElementRef(name = "passengerLastname", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerLastname;
    @XmlElementRef(name = "passportNum", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNum;
    @XmlElementRef(name = "rspOfcCd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rspOfcCd;
    @XmlElementRef(name = "seatNumber", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seatNumber;
    @XmlElementRef(name = "specialmealInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialmealInd;
    @XmlElementRef(name = "ssiosiInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssiosiInd;
    @XmlElementRef(name = "travelDetailId", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> travelDetailId;
    @XmlElementRef(name = "uid", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uid;
    @XmlElementRef(name = "upgradesIdentification", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upgradesIdentification;
    @XmlElementRef(name = "usedFfpcardno", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usedFfpcardno;
    @XmlElementRef(name = "vipInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vipInd;
    @XmlElementRef(name = "volntInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> volntInd;
    @XmlElementRef(name = "webcheckinInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webcheckinInd;
    @XmlElementRef(name = "wheelchairInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wheelchairInd;
    @XmlElementRef(name = "withbabyInd", namespace = "http://dto.services.cbdinterface.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> withbabyInd;

    /**
     * ��ȡadultType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdultType() {
        return adultType;
    }

    /**
     * ����adultType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdultType(JAXBElement<String> value) {
        this.adultType = value;
    }

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
     * ��ȡasrInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsrInd() {
        return asrInd;
    }

    /**
     * ����asrInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsrInd(JAXBElement<String> value) {
        this.asrInd = value;
    }

    /**
     * ��ȡbaggageNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBaggageNumber() {
        return baggageNumber;
    }

    /**
     * ����baggageNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBaggageNumber(JAXBElement<Integer> value) {
        this.baggageNumber = value;
    }

    /**
     * ��ȡbaggageWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBaggageWeight() {
        return baggageWeight;
    }

    /**
     * ����baggageWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBaggageWeight(JAXBElement<Integer> value) {
        this.baggageWeight = value;
    }

    /**
     * ��ȡbedInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBedInd() {
        return bedInd;
    }

    /**
     * ����bedInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBedInd(JAXBElement<String> value) {
        this.bedInd = value;
    }

    /**
     * ��ȡblindInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlindInd() {
        return blindInd;
    }

    /**
     * ����blindInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlindInd(JAXBElement<String> value) {
        this.blindInd = value;
    }

    /**
     * ��ȡboardingGatenumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoardingGatenumber() {
        return boardingGatenumber;
    }

    /**
     * ����boardingGatenumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoardingGatenumber(JAXBElement<String> value) {
        this.boardingGatenumber = value;
    }

    /**
     * ��ȡboardingPnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoardingPnumber() {
        return boardingPnumber;
    }

    /**
     * ����boardingPnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoardingPnumber(JAXBElement<String> value) {
        this.boardingPnumber = value;
    }

    /**
     * ��ȡcabin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabin() {
        return cabin;
    }

    /**
     * ����cabin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabin(JAXBElement<String> value) {
        this.cabin = value;
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
     * ��ȡcheckinDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckinDate() {
        return checkinDate;
    }

    /**
     * ����checkinDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckinDate(XMLGregorianCalendar value) {
        this.checkinDate = value;
    }

    /**
     * ��ȡcheckinPid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckinPid() {
        return checkinPid;
    }

    /**
     * ����checkinPid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckinPid(JAXBElement<String> value) {
        this.checkinPid = value;
    }

    /**
     * ��ȡcheckinTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckinTime() {
        return checkinTime;
    }

    /**
     * ����checkinTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckinTime(JAXBElement<String> value) {
        this.checkinTime = value;
    }

    /**
     * ��ȡcheckinWorkernumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckinWorkernumber() {
        return checkinWorkernumber;
    }

    /**
     * ����checkinWorkernumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckinWorkernumber(JAXBElement<String> value) {
        this.checkinWorkernumber = value;
    }

    /**
     * ��ȡchildType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChildType() {
        return childType;
    }

    /**
     * ����childType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChildType(JAXBElement<String> value) {
        this.childType = value;
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
     * ��ȡcodeshareAirlinecd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeshareAirlinecd() {
        return codeshareAirlinecd;
    }

    /**
     * ����codeshareAirlinecd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeshareAirlinecd(JAXBElement<String> value) {
        this.codeshareAirlinecd = value;
    }

    /**
     * ��ȡcodeshareFltnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeshareFltnum() {
        return codeshareFltnum;
    }

    /**
     * ����codeshareFltnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeshareFltnum(JAXBElement<String> value) {
        this.codeshareFltnum = value;
    }

    /**
     * ��ȡcodeshareFltnumsfx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeshareFltnumsfx() {
        return codeshareFltnumsfx;
    }

    /**
     * ����codeshareFltnumsfx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeshareFltnumsfx(JAXBElement<String> value) {
        this.codeshareFltnumsfx = value;
    }

    /**
     * ��ȡcodesharepsgInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodesharepsgInd() {
        return codesharepsgInd;
    }

    /**
     * ����codesharepsgInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodesharepsgInd(JAXBElement<String> value) {
        this.codesharepsgInd = value;
    }

    /**
     * ��ȡcrsPnrRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrsPnrRef() {
        return crsPnrRef;
    }

    /**
     * ����crsPnrRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrsPnrRef(JAXBElement<String> value) {
        this.crsPnrRef = value;
    }

    /**
     * ��ȡcussInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCussInd() {
        return cussInd;
    }

    /**
     * ����cussInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCussInd(JAXBElement<String> value) {
        this.cussInd = value;
    }

    /**
     * ��ȡdataSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSource() {
        return dataSource;
    }

    /**
     * ����dataSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSource(JAXBElement<String> value) {
        this.dataSource = value;
    }

    /**
     * ��ȡdeafInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeafInd() {
        return deafInd;
    }

    /**
     * ����deafInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeafInd(JAXBElement<String> value) {
        this.deafInd = value;
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
     * ��ȡdowngradesIdentification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDowngradesIdentification() {
        return downgradesIdentification;
    }

    /**
     * ����downgradesIdentification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDowngradesIdentification(JAXBElement<String> value) {
        this.downgradesIdentification = value;
    }

    /**
     * ��ȡetClazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtClazz() {
        return etClazz;
    }

    /**
     * ����etClazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtClazz(JAXBElement<String> value) {
        this.etClazz = value;
    }

    /**
     * ��ȡetCouponStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtCouponStatus() {
        return etCouponStatus;
    }

    /**
     * ����etCouponStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtCouponStatus(JAXBElement<String> value) {
        this.etCouponStatus = value;
    }

    /**
     * ��ȡetCpn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtCpn() {
        return etCpn;
    }

    /**
     * ����etCpn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtCpn(JAXBElement<String> value) {
        this.etCpn = value;
    }

    /**
     * ��ȡetFareBasis���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtFareBasis() {
        return etFareBasis;
    }

    /**
     * ����etFareBasis���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtFareBasis(JAXBElement<String> value) {
        this.etFareBasis = value;
    }

    /**
     * ��ȡetFlightRegion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtFlightRegion() {
        return etFlightRegion;
    }

    /**
     * ����etFlightRegion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtFlightRegion(JAXBElement<String> value) {
        this.etFlightRegion = value;
    }

    /**
     * ��ȡetIataCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtIataCode() {
        return etIataCode;
    }

    /**
     * ����etIataCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtIataCode(JAXBElement<String> value) {
        this.etIataCode = value;
    }

    /**
     * ��ȡetMc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtMc() {
        return etMc;
    }

    /**
     * ����etMc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtMc(JAXBElement<String> value) {
        this.etMc = value;
    }

    /**
     * ��ȡetMcFlightno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtMcFlightno() {
        return etMcFlightno;
    }

    /**
     * ����etMcFlightno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtMcFlightno(JAXBElement<String> value) {
        this.etMcFlightno = value;
    }

    /**
     * ��ȡetOc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtOc() {
        return etOc;
    }

    /**
     * ����etOc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtOc(JAXBElement<String> value) {
        this.etOc = value;
    }

    /**
     * ��ȡetOcFlightno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtOcFlightno() {
        return etOcFlightno;
    }

    /**
     * ����etOcFlightno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtOcFlightno(JAXBElement<String> value) {
        this.etOcFlightno = value;
    }

    /**
     * ��ȡetOriginClazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtOriginClazz() {
        return etOriginClazz;
    }

    /**
     * ����etOriginClazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtOriginClazz(JAXBElement<String> value) {
        this.etOriginClazz = value;
    }

    /**
     * ��ȡetRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtRemark() {
        return etRemark;
    }

    /**
     * ����etRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtRemark(JAXBElement<String> value) {
        this.etRemark = value;
    }

    /**
     * ��ȡetTureCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtTureCode() {
        return etTureCode;
    }

    /**
     * ����etTureCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtTureCode(JAXBElement<String> value) {
        this.etTureCode = value;
    }

    /**
     * ��ȡeticketInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEticketInd() {
        return eticketInd;
    }

    /**
     * ����eticketInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEticketInd(JAXBElement<String> value) {
        this.eticketInd = value;
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
     * ��ȡffpAirlinecompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFfpAirlinecompany() {
        return ffpAirlinecompany;
    }

    /**
     * ����ffpAirlinecompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFfpAirlinecompany(JAXBElement<String> value) {
        this.ffpAirlinecompany = value;
    }

    /**
     * ��ȡfiller���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiller() {
        return filler;
    }

    /**
     * ����filler���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiller(JAXBElement<String> value) {
        this.filler = value;
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
     * ��ȡflightNumberSuffix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNumberSuffix() {
        return flightNumberSuffix;
    }

    /**
     * ����flightNumberSuffix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNumberSuffix(JAXBElement<String> value) {
        this.flightNumberSuffix = value;
    }

    /**
     * ��ȡflightRegion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightRegion() {
        return flightRegion;
    }

    /**
     * ����flightRegion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightRegion(JAXBElement<String> value) {
        this.flightRegion = value;
    }

    /**
     * ��ȡfromStandyInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromStandyInd() {
        return fromStandyInd;
    }

    /**
     * ����fromStandyInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromStandyInd(JAXBElement<String> value) {
        this.fromStandyInd = value;
    }

    /**
     * ��ȡgoshNoshId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoshNoshId() {
        return goshNoshId;
    }

    /**
     * ����goshNoshId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoshNoshId(JAXBElement<String> value) {
        this.goshNoshId = value;
    }

    /**
     * ��ȡgroupInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupInd() {
        return groupInd;
    }

    /**
     * ����groupInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupInd(JAXBElement<String> value) {
        this.groupInd = value;
    }

    /**
     * ��ȡgroupPeopleNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupPeopleNumber() {
        return groupPeopleNumber;
    }

    /**
     * ����groupPeopleNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupPeopleNumber(JAXBElement<String> value) {
        this.groupPeopleNumber = value;
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
     * ��ȡidentification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentification() {
        return identification;
    }

    /**
     * ����identification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentification(JAXBElement<String> value) {
        this.identification = value;
    }

    /**
     * ��ȡinbndAirlinecompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndAirlinecompany() {
        return inbndAirlinecompany;
    }

    /**
     * ����inbndAirlinecompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndAirlinecompany(JAXBElement<String> value) {
        this.inbndAirlinecompany = value;
    }

    /**
     * ��ȡinbndArrairport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndArrairport() {
        return inbndArrairport;
    }

    /**
     * ����inbndArrairport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndArrairport(JAXBElement<String> value) {
        this.inbndArrairport = value;
    }

    /**
     * ��ȡinbndBaggagenum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndBaggagenum() {
        return inbndBaggagenum;
    }

    /**
     * ����inbndBaggagenum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndBaggagenum(JAXBElement<String> value) {
        this.inbndBaggagenum = value;
    }

    /**
     * ��ȡinbndBaggageweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndBaggageweight() {
        return inbndBaggageweight;
    }

    /**
     * ����inbndBaggageweight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndBaggageweight(JAXBElement<String> value) {
        this.inbndBaggageweight = value;
    }

    /**
     * ��ȡinbndBrdgatenum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndBrdgatenum() {
        return inbndBrdgatenum;
    }

    /**
     * ����inbndBrdgatenum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndBrdgatenum(JAXBElement<String> value) {
        this.inbndBrdgatenum = value;
    }

    /**
     * ��ȡinbndClazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndClazz() {
        return inbndClazz;
    }

    /**
     * ����inbndClazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndClazz(JAXBElement<String> value) {
        this.inbndClazz = value;
    }

    /**
     * ��ȡinbndDepairport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndDepairport() {
        return inbndDepairport;
    }

    /**
     * ����inbndDepairport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndDepairport(JAXBElement<String> value) {
        this.inbndDepairport = value;
    }

    /**
     * ��ȡinbndFlightdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInbndFlightdate() {
        return inbndFlightdate;
    }

    /**
     * ����inbndFlightdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInbndFlightdate(XMLGregorianCalendar value) {
        this.inbndFlightdate = value;
    }

    /**
     * ��ȡinbndFlightnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndFlightnumber() {
        return inbndFlightnumber;
    }

    /**
     * ����inbndFlightnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndFlightnumber(JAXBElement<String> value) {
        this.inbndFlightnumber = value;
    }

    /**
     * ��ȡinbndFltnumsfx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndFltnumsfx() {
        return inbndFltnumsfx;
    }

    /**
     * ����inbndFltnumsfx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndFltnumsfx(JAXBElement<String> value) {
        this.inbndFltnumsfx = value;
    }

    /**
     * ��ȡinbndSeatnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInbndSeatnum() {
        return inbndSeatnum;
    }

    /**
     * ����inbndSeatnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInbndSeatnum(JAXBElement<String> value) {
        this.inbndSeatnum = value;
    }

    /**
     * ��ȡjumpseatInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJumpseatInd() {
        return jumpseatInd;
    }

    /**
     * ����jumpseatInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJumpseatInd(JAXBElement<String> value) {
        this.jumpseatInd = value;
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
     * ��ȡoriginClazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginClazz() {
        return originClazz;
    }

    /**
     * ����originClazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginClazz(JAXBElement<String> value) {
        this.originClazz = value;
    }

    /**
     * ��ȡoutbndAirlinecompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndAirlinecompany() {
        return outbndAirlinecompany;
    }

    /**
     * ����outbndAirlinecompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndAirlinecompany(JAXBElement<String> value) {
        this.outbndAirlinecompany = value;
    }

    /**
     * ��ȡoutbndArrairport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndArrairport() {
        return outbndArrairport;
    }

    /**
     * ����outbndArrairport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndArrairport(JAXBElement<String> value) {
        this.outbndArrairport = value;
    }

    /**
     * ��ȡoutbndBaggagenum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndBaggagenum() {
        return outbndBaggagenum;
    }

    /**
     * ����outbndBaggagenum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndBaggagenum(JAXBElement<String> value) {
        this.outbndBaggagenum = value;
    }

    /**
     * ��ȡoutbndBaggageweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndBaggageweight() {
        return outbndBaggageweight;
    }

    /**
     * ����outbndBaggageweight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndBaggageweight(JAXBElement<String> value) {
        this.outbndBaggageweight = value;
    }

    /**
     * ��ȡoutbndBrdgatenum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndBrdgatenum() {
        return outbndBrdgatenum;
    }

    /**
     * ����outbndBrdgatenum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndBrdgatenum(JAXBElement<String> value) {
        this.outbndBrdgatenum = value;
    }

    /**
     * ��ȡoutbndClazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndClazz() {
        return outbndClazz;
    }

    /**
     * ����outbndClazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndClazz(JAXBElement<String> value) {
        this.outbndClazz = value;
    }

    /**
     * ��ȡoutbndDepairport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndDepairport() {
        return outbndDepairport;
    }

    /**
     * ����outbndDepairport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndDepairport(JAXBElement<String> value) {
        this.outbndDepairport = value;
    }

    /**
     * ��ȡoutbndFlightdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutbndFlightdate() {
        return outbndFlightdate;
    }

    /**
     * ����outbndFlightdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutbndFlightdate(XMLGregorianCalendar value) {
        this.outbndFlightdate = value;
    }

    /**
     * ��ȡoutbndFlightnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndFlightnumber() {
        return outbndFlightnumber;
    }

    /**
     * ����outbndFlightnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndFlightnumber(JAXBElement<String> value) {
        this.outbndFlightnumber = value;
    }

    /**
     * ��ȡoutbndFltnumsfx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndFltnumsfx() {
        return outbndFltnumsfx;
    }

    /**
     * ����outbndFltnumsfx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndFltnumsfx(JAXBElement<String> value) {
        this.outbndFltnumsfx = value;
    }

    /**
     * ��ȡoutbndSeatnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutbndSeatnum() {
        return outbndSeatnum;
    }

    /**
     * ����outbndSeatnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutbndSeatnum(JAXBElement<String> value) {
        this.outbndSeatnum = value;
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
     * ��ȡrspOfcCd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRspOfcCd() {
        return rspOfcCd;
    }

    /**
     * ����rspOfcCd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRspOfcCd(JAXBElement<String> value) {
        this.rspOfcCd = value;
    }

    /**
     * ��ȡseatNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeatNumber() {
        return seatNumber;
    }

    /**
     * ����seatNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeatNumber(JAXBElement<String> value) {
        this.seatNumber = value;
    }

    /**
     * ��ȡspecialmealInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialmealInd() {
        return specialmealInd;
    }

    /**
     * ����specialmealInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialmealInd(JAXBElement<String> value) {
        this.specialmealInd = value;
    }

    /**
     * ��ȡssiosiInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSsiosiInd() {
        return ssiosiInd;
    }

    /**
     * ����ssiosiInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSsiosiInd(JAXBElement<String> value) {
        this.ssiosiInd = value;
    }

    /**
     * ��ȡtravelDetailId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTravelDetailId() {
        return travelDetailId;
    }

    /**
     * ����travelDetailId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTravelDetailId(JAXBElement<Long> value) {
        this.travelDetailId = value;
    }

    /**
     * ��ȡuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUid() {
        return uid;
    }

    /**
     * ����uid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUid(JAXBElement<String> value) {
        this.uid = value;
    }

    /**
     * ��ȡupgradesIdentification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpgradesIdentification() {
        return upgradesIdentification;
    }

    /**
     * ����upgradesIdentification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpgradesIdentification(JAXBElement<String> value) {
        this.upgradesIdentification = value;
    }

    /**
     * ��ȡusedFfpcardno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsedFfpcardno() {
        return usedFfpcardno;
    }

    /**
     * ����usedFfpcardno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsedFfpcardno(JAXBElement<String> value) {
        this.usedFfpcardno = value;
    }

    /**
     * ��ȡvipInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVipInd() {
        return vipInd;
    }

    /**
     * ����vipInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVipInd(JAXBElement<String> value) {
        this.vipInd = value;
    }

    /**
     * ��ȡvolntInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVolntInd() {
        return volntInd;
    }

    /**
     * ����volntInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVolntInd(JAXBElement<String> value) {
        this.volntInd = value;
    }

    /**
     * ��ȡwebcheckinInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebcheckinInd() {
        return webcheckinInd;
    }

    /**
     * ����webcheckinInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebcheckinInd(JAXBElement<String> value) {
        this.webcheckinInd = value;
    }

    /**
     * ��ȡwheelchairInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWheelchairInd() {
        return wheelchairInd;
    }

    /**
     * ����wheelchairInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWheelchairInd(JAXBElement<String> value) {
        this.wheelchairInd = value;
    }

    /**
     * ��ȡwithbabyInd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWithbabyInd() {
        return withbabyInd;
    }

    /**
     * ����withbabyInd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWithbabyInd(JAXBElement<String> value) {
        this.withbabyInd = value;
    }

}
