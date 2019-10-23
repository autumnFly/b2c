
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.lang.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.csair.b2c.cloud.test.sys.picc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebServiceException_QNAME = new QName("http://web.service.newccs.cbd.csair.com", "WebServiceException");
    private final static QName _MbTipsDtoAddress_QNAME = new QName("http://domain.mileage.cbd.csair.com", "address");
    private final static QName _MbTipsDtoFax_QNAME = new QName("http://domain.mileage.cbd.csair.com", "fax");
    private final static QName _MbTipsDtoServiceType_QNAME = new QName("http://domain.mileage.cbd.csair.com", "serviceType");
    private final static QName _MbTipsDtoTelphone_QNAME = new QName("http://domain.mileage.cbd.csair.com", "telphone");
    private final static QName _MbTipsDtoWorkTime_QNAME = new QName("http://domain.mileage.cbd.csair.com", "workTime");
    private final static QName _SvcPcCertificatePKCertNum_QNAME = new QName("http://databean.etdcs", "certNum");
    private final static QName _SvcPcCertificatePKUid_QNAME = new QName("http://databean.etdcs", "uid");
    private final static QName _SvcPcCertificateDtoCertType_QNAME = new QName("http://business.common", "certType");
    private final static QName _SvcPcCertificateDtoId_QNAME = new QName("http://business.common", "id");
    private final static QName _SvcPcCertificateDtoLogId_QNAME = new QName("http://business.common", "logId");
    private final static QName _SvcPcCertificateDtoPriority_QNAME = new QName("http://business.common", "priority");
    private final static QName _SvcPcCertificateDtoRemark_QNAME = new QName("http://business.common", "remark");
    private final static QName _SvcPcCertificateDtoStatus_QNAME = new QName("http://business.common", "status");
    private final static QName _TravelCountDtoArr_QNAME = new QName("http://dto.service.custombehavior.cbd.csair.com", "arr");
    private final static QName _TravelCountDtoCount_QNAME = new QName("http://dto.service.custombehavior.cbd.csair.com", "count");
    private final static QName _TravelCountDtoDep_QNAME = new QName("http://dto.service.custombehavior.cbd.csair.com", "dep");
    private final static QName _TravelCountDtoMemberNo_QNAME = new QName("http://dto.service.custombehavior.cbd.csair.com", "memberNo");
    private final static QName _FlightSegmentDtoAdultType_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "adultType");
    private final static QName _FlightSegmentDtoAirlineCompany_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "airlineCompany");
    private final static QName _FlightSegmentDtoArriveAirport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "arriveAirport");
    private final static QName _FlightSegmentDtoAsrInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "asrInd");
    private final static QName _FlightSegmentDtoBaggageNumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "baggageNumber");
    private final static QName _FlightSegmentDtoBaggageWeight_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "baggageWeight");
    private final static QName _FlightSegmentDtoBedInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "bedInd");
    private final static QName _FlightSegmentDtoBlindInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "blindInd");
    private final static QName _FlightSegmentDtoBoardingGatenumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "boardingGatenumber");
    private final static QName _FlightSegmentDtoBoardingPnumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "boardingPnumber");
    private final static QName _FlightSegmentDtoCabin_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "cabin");
    private final static QName _FlightSegmentDtoCertificateIdnum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "certificateIdnum");
    private final static QName _FlightSegmentDtoCertificateType_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "certificateType");
    private final static QName _FlightSegmentDtoCheckinPid_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "checkinPid");
    private final static QName _FlightSegmentDtoCheckinTime_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "checkinTime");
    private final static QName _FlightSegmentDtoCheckinWorkernumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "checkinWorkernumber");
    private final static QName _FlightSegmentDtoChildType_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "childType");
    private final static QName _FlightSegmentDtoClazz_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "clazz");
    private final static QName _FlightSegmentDtoCodeshareAirlinecd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "codeshareAirlinecd");
    private final static QName _FlightSegmentDtoCodeshareFltnum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "codeshareFltnum");
    private final static QName _FlightSegmentDtoCodeshareFltnumsfx_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "codeshareFltnumsfx");
    private final static QName _FlightSegmentDtoCodesharepsgInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "codesharepsgInd");
    private final static QName _FlightSegmentDtoCrsPnrRef_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "crsPnrRef");
    private final static QName _FlightSegmentDtoCussInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "cussInd");
    private final static QName _FlightSegmentDtoDataSource_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "dataSource");
    private final static QName _FlightSegmentDtoDeafInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "deafInd");
    private final static QName _FlightSegmentDtoDepartureAirport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "departureAirport");
    private final static QName _FlightSegmentDtoDowngradesIdentification_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "downgradesIdentification");
    private final static QName _FlightSegmentDtoEtClazz_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etClazz");
    private final static QName _FlightSegmentDtoEtCouponStatus_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etCouponStatus");
    private final static QName _FlightSegmentDtoEtCpn_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etCpn");
    private final static QName _FlightSegmentDtoEtFareBasis_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etFareBasis");
    private final static QName _FlightSegmentDtoEtFlightRegion_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etFlightRegion");
    private final static QName _FlightSegmentDtoEtIataCode_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etIataCode");
    private final static QName _FlightSegmentDtoEtMc_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etMc");
    private final static QName _FlightSegmentDtoEtMcFlightno_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etMcFlightno");
    private final static QName _FlightSegmentDtoEtOc_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etOc");
    private final static QName _FlightSegmentDtoEtOcFlightno_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etOcFlightno");
    private final static QName _FlightSegmentDtoEtOriginClazz_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etOriginClazz");
    private final static QName _FlightSegmentDtoEtRemark_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etRemark");
    private final static QName _FlightSegmentDtoEtTureCode_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "etTureCode");
    private final static QName _FlightSegmentDtoEticketInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "eticketInd");
    private final static QName _FlightSegmentDtoEticketNumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "eticketNumber");
    private final static QName _FlightSegmentDtoFfpAirlinecompany_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "ffpAirlinecompany");
    private final static QName _FlightSegmentDtoFiller_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "filler");
    private final static QName _FlightSegmentDtoFlightNumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "flightNumber");
    private final static QName _FlightSegmentDtoFlightNumberSuffix_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "flightNumberSuffix");
    private final static QName _FlightSegmentDtoFlightRegion_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "flightRegion");
    private final static QName _FlightSegmentDtoFromStandyInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "fromStandyInd");
    private final static QName _FlightSegmentDtoGoshNoshId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "goshNoshId");
    private final static QName _FlightSegmentDtoGroupInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "groupInd");
    private final static QName _FlightSegmentDtoGroupPeopleNumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "groupPeopleNumber");
    private final static QName _FlightSegmentDtoIcsPnrRef_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "icsPnrRef");
    private final static QName _FlightSegmentDtoIdentification_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "identification");
    private final static QName _FlightSegmentDtoInbndAirlinecompany_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndAirlinecompany");
    private final static QName _FlightSegmentDtoInbndArrairport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndArrairport");
    private final static QName _FlightSegmentDtoInbndBaggagenum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndBaggagenum");
    private final static QName _FlightSegmentDtoInbndBaggageweight_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndBaggageweight");
    private final static QName _FlightSegmentDtoInbndBrdgatenum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndBrdgatenum");
    private final static QName _FlightSegmentDtoInbndClazz_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndClazz");
    private final static QName _FlightSegmentDtoInbndDepairport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndDepairport");
    private final static QName _FlightSegmentDtoInbndFlightnumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndFlightnumber");
    private final static QName _FlightSegmentDtoInbndFltnumsfx_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndFltnumsfx");
    private final static QName _FlightSegmentDtoInbndSeatnum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "inbndSeatnum");
    private final static QName _FlightSegmentDtoJumpseatInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "jumpseatInd");
    private final static QName _FlightSegmentDtoMemberNo_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "memberNo");
    private final static QName _FlightSegmentDtoOpId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "opId");
    private final static QName _FlightSegmentDtoOriginClazz_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "originClazz");
    private final static QName _FlightSegmentDtoOutbndAirlinecompany_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndAirlinecompany");
    private final static QName _FlightSegmentDtoOutbndArrairport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndArrairport");
    private final static QName _FlightSegmentDtoOutbndBaggagenum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndBaggagenum");
    private final static QName _FlightSegmentDtoOutbndBaggageweight_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndBaggageweight");
    private final static QName _FlightSegmentDtoOutbndBrdgatenum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndBrdgatenum");
    private final static QName _FlightSegmentDtoOutbndClazz_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndClazz");
    private final static QName _FlightSegmentDtoOutbndDepairport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndDepairport");
    private final static QName _FlightSegmentDtoOutbndFlightnumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndFlightnumber");
    private final static QName _FlightSegmentDtoOutbndFltnumsfx_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndFltnumsfx");
    private final static QName _FlightSegmentDtoOutbndSeatnum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "outbndSeatnum");
    private final static QName _FlightSegmentDtoPassengerChinesename_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "passengerChinesename");
    private final static QName _FlightSegmentDtoPassengerFirstname_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "passengerFirstname");
    private final static QName _FlightSegmentDtoPassengerLastname_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "passengerLastname");
    private final static QName _FlightSegmentDtoPassportNum_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "passportNum");
    private final static QName _FlightSegmentDtoRspOfcCd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "rspOfcCd");
    private final static QName _FlightSegmentDtoSeatNumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "seatNumber");
    private final static QName _FlightSegmentDtoSpecialmealInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "specialmealInd");
    private final static QName _FlightSegmentDtoSsiosiInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "ssiosiInd");
    private final static QName _FlightSegmentDtoTravelDetailId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "travelDetailId");
    private final static QName _FlightSegmentDtoUid_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "uid");
    private final static QName _FlightSegmentDtoUpgradesIdentification_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "upgradesIdentification");
    private final static QName _FlightSegmentDtoUsedFfpcardno_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "usedFfpcardno");
    private final static QName _FlightSegmentDtoVipInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "vipInd");
    private final static QName _FlightSegmentDtoVolntInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "volntInd");
    private final static QName _FlightSegmentDtoWebcheckinInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "webcheckinInd");
    private final static QName _FlightSegmentDtoWheelchairInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "wheelchairInd");
    private final static QName _FlightSegmentDtoWithbabyInd_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "withbabyInd");
    private final static QName _LatestMileageDtoArrCity_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "arrCity");
    private final static QName _LatestMileageDtoArrivalAirport_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "arrivalAirport");
    private final static QName _LatestMileageDtoDepCity_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "depCity");
    private final static QName _LatestMileageDtoDesc_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "desc");
    private final static QName _LatestMileageDtoFlightSegment_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "flightSegment");
    private final static QName _LatestMileageDtoUpgradeMileage_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "upgradeMileage");
    private final static QName _LatestMileageDtoUpgradeSegment_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "upgradeSegment");
    private final static QName _LatestMileageDtoUseMileage_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "useMileage");
    private final static QName _RecruitDtoAid_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "aid");
    private final static QName _RecruitDtoApplyId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "applyId");
    private final static QName _RecruitDtoApplySource_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "applySource");
    private final static QName _RecruitDtoBatchId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "batchId");
    private final static QName _RecruitDtoCollectId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "collectId");
    private final static QName _RecruitDtoCumulateCabin_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "cumulateCabin");
    private final static QName _RecruitDtoCumulateFlightNumber_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "cumulateFlightNumber");
    private final static QName _RecruitDtoCumulatePassengerName_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "cumulatePassengerName");
    private final static QName _RecruitDtoExportFlag_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "exportFlag");
    private final static QName _RecruitDtoMuFtdId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "muFtdId");
    private final static QName _RecruitDtoRemark_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "remark");
    private final static QName _RecruitDtoSourceCode_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "sourceCode");
    private final static QName _RecruitDtoStatus_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "status");
    private final static QName _MileageStandardDtoClazz_QNAME = new QName("http://dto.services.account.cbd.csair.com", "clazz");
    private final static QName _MileageStandardDtoDep_QNAME = new QName("http://dto.services.account.cbd.csair.com", "dep");
    private final static QName _MileageStandardDtoDest_QNAME = new QName("http://dto.services.account.cbd.csair.com", "dest");
    private final static QName _FreeExchangeStandDtoBusinessCabin_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "businessCabin");
    private final static QName _FreeExchangeStandDtoEconomicCabin_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "economicCabin");
    private final static QName _FreeExchangeStandDtoFirstCabin_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "firstCabin");
    private final static QName _FreeExchangeStandDtoLuxuryCabin_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "luxuryCabin");
    private final static QName _FreeExchangeStandDtoLuxuryFirstCabin_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "luxuryFirstCabin");
    private final static QName _UpgradeExchangeStandDtoBLuxuryFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "b_luxury_first");
    private final static QName _UpgradeExchangeStandDtoBusinessFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "business_first");
    private final static QName _UpgradeExchangeStandDtoELuxuryFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "e_luxury_first");
    private final static QName _UpgradeExchangeStandDtoEconomicBusiness_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "economic_business");
    private final static QName _UpgradeExchangeStandDtoEconomicFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "economic_first");
    private final static QName _UpgradeExchangeStandDtoEconomicLuxury_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "economic_luxury");
    private final static QName _UpgradeExchangeStandDtoHLuxuryFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "h_luxury_first");
    private final static QName _UpgradeExchangeStandDtoLLuxuryFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "l_luxury_first");
    private final static QName _UpgradeExchangeStandDtoLuxuryBusiness_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "luxury_business");
    private final static QName _UpgradeExchangeStandDtoLuxuryFirst_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "luxury_first");
    private final static QName _QueryPriceDtoArriveAirport_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "arriveAirport");
    private final static QName _QueryPriceDtoClazz_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "clazz");
    private final static QName _QueryPriceDtoDepartureAirport_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "departureAirport");
    private final static QName _QueryPriceDtoFlightNumber_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "flightNumber");
    private final static QName _QueryPriceDtoRealCarrier_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "realCarrier");
    private final static QName _QueryPriceDtoSaleCarrier_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "saleCarrier");
    private final static QName _QueryPriceDtoTicketNumber_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "ticketNumber");
    private final static QName _QueryPriceDtoUpgradedClazz_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "upgradedClazz");
    private final static QName _MobileExchangeStandDtoFor2015Arr_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "arr");
    private final static QName _MobileExchangeStandDtoFor2015Dep_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "dep");
    private final static QName _MobileExchangeStandDtoFor2015FreeExchangeStandDto_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "freeExchangeStandDto");
    private final static QName _MobileExchangeStandDtoFor2015UpgradeExchangeStandDto_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "upgradeExchangeStandDto");
    private final static QName _MemberExchangeInfoForB2CDtoAccountStatus_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "accountStatus");
    private final static QName _MemberExchangeInfoForB2CDtoActiveStatus_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "activeStatus");
    private final static QName _MemberExchangeInfoForB2CDtoBusinessChanel_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "businessChanel");
    private final static QName _MemberExchangeInfoForB2CDtoCertificates_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "certificates");
    private final static QName _MemberExchangeInfoForB2CDtoCnName_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "cnName");
    private final static QName _MemberExchangeInfoForB2CDtoEnFirstName_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "enFirstName");
    private final static QName _MemberExchangeInfoForB2CDtoEnLastName_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "enLastName");
    private final static QName _MemberExchangeInfoForB2CDtoEnName_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "enName");
    private final static QName _MemberExchangeInfoForB2CDtoExchangeMileage_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "exchangeMileage");
    private final static QName _MemberExchangeInfoForB2CDtoExchangeOrderId_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "exchangeOrderId");
    private final static QName _MemberExchangeInfoForB2CDtoHavePassword_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "havePassword");
    private final static QName _MemberExchangeInfoForB2CDtoLoyaltyNmae_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "loyaltyNmae");
    private final static QName _MemberExchangeInfoForB2CDtoMemberNo_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "memberNo");
    private final static QName _MemberExchangeInfoForB2CDtoTierId_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "tierId");
    private final static QName _MemberExchangeInfoForB2CDtoTitle_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "title");
    private final static QName _MemberExchangeInfoForB2CDtoUid_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "uid");
    private final static QName _MemberInfoForB2CDtoAccountStatus_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "accountStatus");
    private final static QName _MemberInfoForB2CDtoActiveStatus_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "activeStatus");
    private final static QName _MemberInfoForB2CDtoBusinessChanel_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "businessChanel");
    private final static QName _MemberInfoForB2CDtoCertificates_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "certificates");
    private final static QName _MemberInfoForB2CDtoCnName_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "cnName");
    private final static QName _MemberInfoForB2CDtoEnFirstName_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "enFirstName");
    private final static QName _MemberInfoForB2CDtoEnLastName_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "enLastName");
    private final static QName _MemberInfoForB2CDtoEnName_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "enName");
    private final static QName _MemberInfoForB2CDtoExchangeMileage_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "exchangeMileage");
    private final static QName _MemberInfoForB2CDtoExchangeOrderId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "exchangeOrderId");
    private final static QName _MemberInfoForB2CDtoHavePassword_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "havePassword");
    private final static QName _MemberInfoForB2CDtoLoyaltyNmae_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "loyaltyNmae");
    private final static QName _MemberInfoForB2CDtoTierId_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "tierId");
    private final static QName _MemberInfoForB2CDtoTitle_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "title");
    private final static QName _QueryPriceResultDtoCarrier_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "carrier");
    private final static QName _QueryPriceResultDtoExchangeFlag_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "exchangeFlag");
    private final static QName _QueryPriceResultDtoPayCount_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "payCount");
    private final static QName _QueryPriceResultDtoPayType_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "payType");
    private final static QName _QueryPriceResultDtoPolicyDescription_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "policyDescription");
    private final static QName _QueryPriceResultDtoPolicyLimit_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "policyLimit");
    private final static QName _QueryPriceResultDtoPolicyType_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "policyType");
    private final static QName _QueryPriceResultDtoSaleCode_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "saleCode");
    private final static QName _MemberInfoForVOSAccountType_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "accountType");
    private final static QName _MemberInfoForVOSLatestMileageDto_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "latestMileageDto");
    private final static QName _MemberInfoForVOSLoyaltyName_QNAME = new QName("http://dto.services.cbdinterface.cbd.csair.com", "loyaltyName");
    private final static QName _RecruitApplyDtoAirlineCompany_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "airlineCompany");
    private final static QName _RecruitApplyDtoApplySource_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "applySource");
    private final static QName _RecruitApplyDtoApplyStatus_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "applyStatus");
    private final static QName _RecruitApplyDtoArriveAirport_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "arriveAirport");
    private final static QName _RecruitApplyDtoBatchId_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "batchId");
    private final static QName _RecruitApplyDtoCertificateIdnum_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "certificateIdnum");
    private final static QName _RecruitApplyDtoCertificateType_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "certificateType");
    private final static QName _RecruitApplyDtoClazz_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "clazz");
    private final static QName _RecruitApplyDtoCollectId_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "collectId");
    private final static QName _RecruitApplyDtoDepartureAirport_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "departureAirport");
    private final static QName _RecruitApplyDtoEticketNumber_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "eticketNumber");
    private final static QName _RecruitApplyDtoFlightNumber_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "flightNumber");
    private final static QName _RecruitApplyDtoFlightSegment_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "flightSegment");
    private final static QName _RecruitApplyDtoFtdId_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "ftdId");
    private final static QName _RecruitApplyDtoIcsPnrRef_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "icsPnrRef");
    private final static QName _RecruitApplyDtoMemberName_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "memberName");
    private final static QName _RecruitApplyDtoMemberNo_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "memberNo");
    private final static QName _RecruitApplyDtoMileageRecruitApplyOpId_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "mileageRecruitApplyOpId");
    private final static QName _RecruitApplyDtoMuFtdId_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "muFtdId");
    private final static QName _RecruitApplyDtoPassengerChinesename_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "passengerChinesename");
    private final static QName _RecruitApplyDtoPassengerFirstname_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "passengerFirstname");
    private final static QName _RecruitApplyDtoPassengerLastname_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "passengerLastname");
    private final static QName _RecruitApplyDtoPassportNum_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "passportNum");
    private final static QName _RecruitApplyDtoSourceCode_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "sourceCode");
    private final static QName _RecruitApplyDtoTravelDetailOpId_QNAME = new QName("http://dto.services.flyRecords.cbd.csair.com", "travelDetailOpId");
    private final static QName _FtuResutlDtoOrderNo_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "orderNo");
    private final static QName _FtuResutlDtoPassengerName_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "passengerName");
    private final static QName _FtuResutlDtoTotalPrice_QNAME = new QName("http://dto.services.marketing.cbd.csair.com", "totalPrice");
    private final static QName _WebServiceExceptionKey_QNAME = new QName("http://Exception.web.services.ccs.cbd.csair.com", "key");
    private final static QName _WebServiceExceptionMessage_QNAME = new QName("http://Exception.web.services.ccs.cbd.csair.com", "message");
    private final static QName _QuickEnrollInfoReturnDtoEnrollTag_QNAME = new QName("http://dto.services.member.cbd.csair.com", "enrollTag");
    private final static QName _QuickEnrollInfoReturnDtoMemberNo_QNAME = new QName("http://dto.services.member.cbd.csair.com", "memberNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.csair.b2c.cloud.test.sys.picc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnyType2AnyTypeMap }
     * 
     */
    public AnyType2AnyTypeMap createAnyType2AnyTypeMap() {
        return new AnyType2AnyTypeMap();
    }

    /**
     * Create an instance of {@link QuickEnrollMemberForCoop }
     * 
     */
    public QuickEnrollMemberForCoop createQuickEnrollMemberForCoop() {
        return new QuickEnrollMemberForCoop();
    }

    /**
     * Create an instance of {@link QuickEnrollMemberForCoopResponse }
     * 
     */
    public QuickEnrollMemberForCoopResponse createQuickEnrollMemberForCoopResponse() {
        return new QuickEnrollMemberForCoopResponse();
    }

    /**
     * Create an instance of {@link QuickEnrollInfoReturnDto }
     * 
     */
    public QuickEnrollInfoReturnDto createQuickEnrollInfoReturnDto() {
        return new QuickEnrollInfoReturnDto();
    }

    /**
     * Create an instance of {@link WebServiceException }
     * 
     */
    public WebServiceException createWebServiceException() {
        return new WebServiceException();
    }

    /**
     * Create an instance of {@link CommandFtu }
     * 
     */
    public CommandFtu createCommandFtu() {
        return new CommandFtu();
    }

    /**
     * Create an instance of {@link ArrayOfQueryPriceDto }
     * 
     */
    public ArrayOfQueryPriceDto createArrayOfQueryPriceDto() {
        return new ArrayOfQueryPriceDto();
    }

    /**
     * Create an instance of {@link CommandFtuResponse }
     * 
     */
    public CommandFtuResponse createCommandFtuResponse() {
        return new CommandFtuResponse();
    }

    /**
     * Create an instance of {@link FtuResutlDto }
     * 
     */
    public FtuResutlDto createFtuResutlDto() {
        return new FtuResutlDto();
    }

    /**
     * Create an instance of {@link IsAuthorizedCmd }
     * 
     */
    public IsAuthorizedCmd createIsAuthorizedCmd() {
        return new IsAuthorizedCmd();
    }

    /**
     * Create an instance of {@link IsAuthorizedCmdResponse }
     * 
     */
    public IsAuthorizedCmdResponse createIsAuthorizedCmdResponse() {
        return new IsAuthorizedCmdResponse();
    }

    /**
     * Create an instance of {@link PreSingleRecruitCheckFreeAndDe }
     * 
     */
    public PreSingleRecruitCheckFreeAndDe createPreSingleRecruitCheckFreeAndDe() {
        return new PreSingleRecruitCheckFreeAndDe();
    }

    /**
     * Create an instance of {@link RecruitApplyDto }
     * 
     */
    public RecruitApplyDto createRecruitApplyDto() {
        return new RecruitApplyDto();
    }

    /**
     * Create an instance of {@link PreSingleRecruitCheckFreeAndDeResponse }
     * 
     */
    public PreSingleRecruitCheckFreeAndDeResponse createPreSingleRecruitCheckFreeAndDeResponse() {
        return new PreSingleRecruitCheckFreeAndDeResponse();
    }

    /**
     * Create an instance of {@link QueryMileageStandardByDate }
     * 
     */
    public QueryMileageStandardByDate createQueryMileageStandardByDate() {
        return new QueryMileageStandardByDate();
    }

    /**
     * Create an instance of {@link QueryMileageStandardByDateResponse }
     * 
     */
    public QueryMileageStandardByDateResponse createQueryMileageStandardByDateResponse() {
        return new QueryMileageStandardByDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMileageStandardDto }
     * 
     */
    public ArrayOfMileageStandardDto createArrayOfMileageStandardDto() {
        return new ArrayOfMileageStandardDto();
    }

    /**
     * Create an instance of {@link HasEnabledPassword }
     * 
     */
    public HasEnabledPassword createHasEnabledPassword() {
        return new HasEnabledPassword();
    }

    /**
     * Create an instance of {@link HasEnabledPasswordResponse }
     * 
     */
    public HasEnabledPasswordResponse createHasEnabledPasswordResponse() {
        return new HasEnabledPasswordResponse();
    }

    /**
     * Create an instance of {@link QueryRecruitByMemberNo }
     * 
     */
    public QueryRecruitByMemberNo createQueryRecruitByMemberNo() {
        return new QueryRecruitByMemberNo();
    }

    /**
     * Create an instance of {@link QueryRecruitByMemberNoResponse }
     * 
     */
    public QueryRecruitByMemberNoResponse createQueryRecruitByMemberNoResponse() {
        return new QueryRecruitByMemberNoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRecruitDto }
     * 
     */
    public ArrayOfRecruitDto createArrayOfRecruitDto() {
        return new ArrayOfRecruitDto();
    }

    /**
     * Create an instance of {@link CommandFxe }
     * 
     */
    public CommandFxe createCommandFxe() {
        return new CommandFxe();
    }

    /**
     * Create an instance of {@link CommandFxeResponse }
     * 
     */
    public CommandFxeResponse createCommandFxeResponse() {
        return new CommandFxeResponse();
    }

    /**
     * Create an instance of {@link QueryMemberDetailInfoForVOS }
     * 
     */
    public QueryMemberDetailInfoForVOS createQueryMemberDetailInfoForVOS() {
        return new QueryMemberDetailInfoForVOS();
    }

    /**
     * Create an instance of {@link QueryMemberDetailInfoForVOSResponse }
     * 
     */
    public QueryMemberDetailInfoForVOSResponse createQueryMemberDetailInfoForVOSResponse() {
        return new QueryMemberDetailInfoForVOSResponse();
    }

    /**
     * Create an instance of {@link MemberInfoForVOS }
     * 
     */
    public MemberInfoForVOS createMemberInfoForVOS() {
        return new MemberInfoForVOS();
    }

    /**
     * Create an instance of {@link CheckExchangeStandardForVOS }
     * 
     */
    public CheckExchangeStandardForVOS createCheckExchangeStandardForVOS() {
        return new CheckExchangeStandardForVOS();
    }

    /**
     * Create an instance of {@link CheckExchangeStandardForVOSResponse }
     * 
     */
    public CheckExchangeStandardForVOSResponse createCheckExchangeStandardForVOSResponse() {
        return new CheckExchangeStandardForVOSResponse();
    }

    /**
     * Create an instance of {@link QueryExchangeStandForBM }
     * 
     */
    public QueryExchangeStandForBM createQueryExchangeStandForBM() {
        return new QueryExchangeStandForBM();
    }

    /**
     * Create an instance of {@link QueryExchangeStandForBMResponse }
     * 
     */
    public QueryExchangeStandForBMResponse createQueryExchangeStandForBMResponse() {
        return new QueryExchangeStandForBMResponse();
    }

    /**
     * Create an instance of {@link MobileExchangeStandDto }
     * 
     */
    public MobileExchangeStandDto createMobileExchangeStandDto() {
        return new MobileExchangeStandDto();
    }

    /**
     * Create an instance of {@link CountPsgTravelTimes }
     * 
     */
    public CountPsgTravelTimes createCountPsgTravelTimes() {
        return new CountPsgTravelTimes();
    }

    /**
     * Create an instance of {@link CountPsgTravelTimesResponse }
     * 
     */
    public CountPsgTravelTimesResponse createCountPsgTravelTimesResponse() {
        return new CountPsgTravelTimesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTravelCountDto }
     * 
     */
    public ArrayOfTravelCountDto createArrayOfTravelCountDto() {
        return new ArrayOfTravelCountDto();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForVOSNew }
     * 
     */
    public QueryMemberInfoForVOSNew createQueryMemberInfoForVOSNew() {
        return new QueryMemberInfoForVOSNew();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForVOSNewResponse }
     * 
     */
    public QueryMemberInfoForVOSNewResponse createQueryMemberInfoForVOSNewResponse() {
        return new QueryMemberInfoForVOSNewResponse();
    }

    /**
     * Create an instance of {@link MemberExchangeInfoForVOSNewDto }
     * 
     */
    public MemberExchangeInfoForVOSNewDto createMemberExchangeInfoForVOSNewDto() {
        return new MemberExchangeInfoForVOSNewDto();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForVOS }
     * 
     */
    public QueryMemberInfoForVOS createQueryMemberInfoForVOS() {
        return new QueryMemberInfoForVOS();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForVOSResponse }
     * 
     */
    public QueryMemberInfoForVOSResponse createQueryMemberInfoForVOSResponse() {
        return new QueryMemberInfoForVOSResponse();
    }

    /**
     * Create an instance of {@link MemberExchangeInfoForVOSDto }
     * 
     */
    public MemberExchangeInfoForVOSDto createMemberExchangeInfoForVOSDto() {
        return new MemberExchangeInfoForVOSDto();
    }

    /**
     * Create an instance of {@link FindPasswordByBindPhone }
     * 
     */
    public FindPasswordByBindPhone createFindPasswordByBindPhone() {
        return new FindPasswordByBindPhone();
    }

    /**
     * Create an instance of {@link FindPasswordByBindPhoneResponse }
     * 
     */
    public FindPasswordByBindPhoneResponse createFindPasswordByBindPhoneResponse() {
        return new FindPasswordByBindPhoneResponse();
    }

    /**
     * Create an instance of {@link CommandFrb }
     * 
     */
    public CommandFrb createCommandFrb() {
        return new CommandFrb();
    }

    /**
     * Create an instance of {@link CommandFrbResponse }
     * 
     */
    public CommandFrbResponse createCommandFrbResponse() {
        return new CommandFrbResponse();
    }

    /**
     * Create an instance of {@link QueryExchangeByFQU }
     * 
     */
    public QueryExchangeByFQU createQueryExchangeByFQU() {
        return new QueryExchangeByFQU();
    }

    /**
     * Create an instance of {@link QueryExchangeByFQUResponse }
     * 
     */
    public QueryExchangeByFQUResponse createQueryExchangeByFQUResponse() {
        return new QueryExchangeByFQUResponse();
    }

    /**
     * Create an instance of {@link QueryPriceResultDto }
     * 
     */
    public QueryPriceResultDto createQueryPriceResultDto() {
        return new QueryPriceResultDto();
    }

    /**
     * Create an instance of {@link FindPasswordByBindEmail }
     * 
     */
    public FindPasswordByBindEmail createFindPasswordByBindEmail() {
        return new FindPasswordByBindEmail();
    }

    /**
     * Create an instance of {@link FindPasswordByBindEmailResponse }
     * 
     */
    public FindPasswordByBindEmailResponse createFindPasswordByBindEmailResponse() {
        return new FindPasswordByBindEmailResponse();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForB2CWithJoinDate }
     * 
     */
    public QueryMemberInfoForB2CWithJoinDate createQueryMemberInfoForB2CWithJoinDate() {
        return new QueryMemberInfoForB2CWithJoinDate();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForB2CWithJoinDateResponse }
     * 
     */
    public QueryMemberInfoForB2CWithJoinDateResponse createQueryMemberInfoForB2CWithJoinDateResponse() {
        return new QueryMemberInfoForB2CWithJoinDateResponse();
    }

    /**
     * Create an instance of {@link MemberInfoForB2CDto }
     * 
     */
    public MemberInfoForB2CDto createMemberInfoForB2CDto() {
        return new MemberInfoForB2CDto();
    }

    /**
     * Create an instance of {@link QueryFlightSegment }
     * 
     */
    public QueryFlightSegment createQueryFlightSegment() {
        return new QueryFlightSegment();
    }

    /**
     * Create an instance of {@link QueryFlightSegmentResponse }
     * 
     */
    public QueryFlightSegmentResponse createQueryFlightSegmentResponse() {
        return new QueryFlightSegmentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFlightSegmentDto }
     * 
     */
    public ArrayOfFlightSegmentDto createArrayOfFlightSegmentDto() {
        return new ArrayOfFlightSegmentDto();
    }

    /**
     * Create an instance of {@link QueryTravelRecordByTicketNumber }
     * 
     */
    public QueryTravelRecordByTicketNumber createQueryTravelRecordByTicketNumber() {
        return new QueryTravelRecordByTicketNumber();
    }

    /**
     * Create an instance of {@link QueryTravelRecordByTicketNumberResponse }
     * 
     */
    public QueryTravelRecordByTicketNumberResponse createQueryTravelRecordByTicketNumberResponse() {
        return new QueryTravelRecordByTicketNumberResponse();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForB2C }
     * 
     */
    public QueryMemberInfoForB2C createQueryMemberInfoForB2C() {
        return new QueryMemberInfoForB2C();
    }

    /**
     * Create an instance of {@link QueryMemberInfoForB2CResponse }
     * 
     */
    public QueryMemberInfoForB2CResponse createQueryMemberInfoForB2CResponse() {
        return new QueryMemberInfoForB2CResponse();
    }

    /**
     * Create an instance of {@link MemberExchangeInfoForB2CDto }
     * 
     */
    public MemberExchangeInfoForB2CDto createMemberExchangeInfoForB2CDto() {
        return new MemberExchangeInfoForB2CDto();
    }

    /**
     * Create an instance of {@link QueryMileageStandard }
     * 
     */
    public QueryMileageStandard createQueryMileageStandard() {
        return new QueryMileageStandard();
    }

    /**
     * Create an instance of {@link QueryMileageStandardResponse }
     * 
     */
    public QueryMileageStandardResponse createQueryMileageStandardResponse() {
        return new QueryMileageStandardResponse();
    }

    /**
     * Create an instance of {@link CloseExchangeByEOT }
     * 
     */
    public CloseExchangeByEOT createCloseExchangeByEOT() {
        return new CloseExchangeByEOT();
    }

    /**
     * Create an instance of {@link CloseExchangeByEOTResponse }
     * 
     */
    public CloseExchangeByEOTResponse createCloseExchangeByEOTResponse() {
        return new CloseExchangeByEOTResponse();
    }

    /**
     * Create an instance of {@link QueryExchangeStandFor2015 }
     * 
     */
    public QueryExchangeStandFor2015 createQueryExchangeStandFor2015() {
        return new QueryExchangeStandFor2015();
    }

    /**
     * Create an instance of {@link QueryExchangeStandFor2015Response }
     * 
     */
    public QueryExchangeStandFor2015Response createQueryExchangeStandFor2015Response() {
        return new QueryExchangeStandFor2015Response();
    }

    /**
     * Create an instance of {@link MobileExchangeStandDtoFor2015 }
     * 
     */
    public MobileExchangeStandDtoFor2015 createMobileExchangeStandDtoFor2015() {
        return new MobileExchangeStandDtoFor2015();
    }

    /**
     * Create an instance of {@link FindMemberServiceInfoFromMbTips }
     * 
     */
    public FindMemberServiceInfoFromMbTips createFindMemberServiceInfoFromMbTips() {
        return new FindMemberServiceInfoFromMbTips();
    }

    /**
     * Create an instance of {@link FindMemberServiceInfoFromMbTipsResponse }
     * 
     */
    public FindMemberServiceInfoFromMbTipsResponse createFindMemberServiceInfoFromMbTipsResponse() {
        return new FindMemberServiceInfoFromMbTipsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMbTipsDto }
     * 
     */
    public ArrayOfMbTipsDto createArrayOfMbTipsDto() {
        return new ArrayOfMbTipsDto();
    }

    /**
     * Create an instance of {@link QueryPriceDto }
     * 
     */
    public QueryPriceDto createQueryPriceDto() {
        return new QueryPriceDto();
    }

    /**
     * Create an instance of {@link UpgradeExchangeStandDto }
     * 
     */
    public UpgradeExchangeStandDto createUpgradeExchangeStandDto() {
        return new UpgradeExchangeStandDto();
    }

    /**
     * Create an instance of {@link FreeExchangeStandDto }
     * 
     */
    public FreeExchangeStandDto createFreeExchangeStandDto() {
        return new FreeExchangeStandDto();
    }

    /**
     * Create an instance of {@link MileageStandardDto }
     * 
     */
    public MileageStandardDto createMileageStandardDto() {
        return new MileageStandardDto();
    }

    /**
     * Create an instance of {@link RecruitDto }
     * 
     */
    public RecruitDto createRecruitDto() {
        return new RecruitDto();
    }

    /**
     * Create an instance of {@link LatestMileageDto }
     * 
     */
    public LatestMileageDto createLatestMileageDto() {
        return new LatestMileageDto();
    }

    /**
     * Create an instance of {@link FlightSegmentDto }
     * 
     */
    public FlightSegmentDto createFlightSegmentDto() {
        return new FlightSegmentDto();
    }

    /**
     * Create an instance of {@link TravelCountDto }
     * 
     */
    public TravelCountDto createTravelCountDto() {
        return new TravelCountDto();
    }

    /**
     * Create an instance of {@link ArrayOfSvcPcCertificateDto }
     * 
     */
    public ArrayOfSvcPcCertificateDto createArrayOfSvcPcCertificateDto() {
        return new ArrayOfSvcPcCertificateDto();
    }

    /**
     * Create an instance of {@link SvcPcCertificateDto }
     * 
     */
    public SvcPcCertificateDto createSvcPcCertificateDto() {
        return new SvcPcCertificateDto();
    }

    /**
     * Create an instance of {@link java.lang.Byte }
     * 
     */
    public java.lang.Byte createByte() {
        return new java.lang.Byte("");
    }

    /**
     * Create an instance of {@link SvcPcCertificatePK }
     * 
     */
    public SvcPcCertificatePK createSvcPcCertificatePK() {
        return new SvcPcCertificatePK();
    }

    /**
     * Create an instance of {@link MbTipsDto }
     * 
     */
    public MbTipsDto createMbTipsDto() {
        return new MbTipsDto();
    }

    /**
     * Create an instance of {@link AnyType2AnyTypeMap.Entry }
     * 
     */
    public AnyType2AnyTypeMap.Entry createAnyType2AnyTypeMapEntry() {
        return new AnyType2AnyTypeMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.service.newccs.cbd.csair.com", name = "WebServiceException")
    public JAXBElement<WebServiceException> createWebServiceException(WebServiceException value) {
        return new JAXBElement<WebServiceException>(_WebServiceException_QNAME, WebServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.mileage.cbd.csair.com", name = "address", scope = MbTipsDto.class)
    public JAXBElement<String> createMbTipsDtoAddress(String value) {
        return new JAXBElement<String>(_MbTipsDtoAddress_QNAME, String.class, MbTipsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.mileage.cbd.csair.com", name = "fax", scope = MbTipsDto.class)
    public JAXBElement<String> createMbTipsDtoFax(String value) {
        return new JAXBElement<String>(_MbTipsDtoFax_QNAME, String.class, MbTipsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.mileage.cbd.csair.com", name = "serviceType", scope = MbTipsDto.class)
    public JAXBElement<String> createMbTipsDtoServiceType(String value) {
        return new JAXBElement<String>(_MbTipsDtoServiceType_QNAME, String.class, MbTipsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.mileage.cbd.csair.com", name = "telphone", scope = MbTipsDto.class)
    public JAXBElement<String> createMbTipsDtoTelphone(String value) {
        return new JAXBElement<String>(_MbTipsDtoTelphone_QNAME, String.class, MbTipsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.mileage.cbd.csair.com", name = "workTime", scope = MbTipsDto.class)
    public JAXBElement<String> createMbTipsDtoWorkTime(String value) {
        return new JAXBElement<String>(_MbTipsDtoWorkTime_QNAME, String.class, MbTipsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://databean.etdcs", name = "certNum", scope = SvcPcCertificatePK.class)
    public JAXBElement<String> createSvcPcCertificatePKCertNum(String value) {
        return new JAXBElement<String>(_SvcPcCertificatePKCertNum_QNAME, String.class, SvcPcCertificatePK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://databean.etdcs", name = "uid", scope = SvcPcCertificatePK.class)
    public JAXBElement<String> createSvcPcCertificatePKUid(String value) {
        return new JAXBElement<String>(_SvcPcCertificatePKUid_QNAME, String.class, SvcPcCertificatePK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.common", name = "certType", scope = SvcPcCertificateDto.class)
    public JAXBElement<String> createSvcPcCertificateDtoCertType(String value) {
        return new JAXBElement<String>(_SvcPcCertificateDtoCertType_QNAME, String.class, SvcPcCertificateDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcPcCertificatePK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.common", name = "id", scope = SvcPcCertificateDto.class)
    public JAXBElement<SvcPcCertificatePK> createSvcPcCertificateDtoId(SvcPcCertificatePK value) {
        return new JAXBElement<SvcPcCertificatePK>(_SvcPcCertificateDtoId_QNAME, SvcPcCertificatePK.class, SvcPcCertificateDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.common", name = "logId", scope = SvcPcCertificateDto.class)
    public JAXBElement<Long> createSvcPcCertificateDtoLogId(Long value) {
        return new JAXBElement<Long>(_SvcPcCertificateDtoLogId_QNAME, Long.class, SvcPcCertificateDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.common", name = "priority", scope = SvcPcCertificateDto.class)
    public JAXBElement<java.lang.Byte> createSvcPcCertificateDtoPriority(java.lang.Byte value) {
        return new JAXBElement<java.lang.Byte>(_SvcPcCertificateDtoPriority_QNAME, java.lang.Byte.class, SvcPcCertificateDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.common", name = "remark", scope = SvcPcCertificateDto.class)
    public JAXBElement<String> createSvcPcCertificateDtoRemark(String value) {
        return new JAXBElement<String>(_SvcPcCertificateDtoRemark_QNAME, String.class, SvcPcCertificateDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.common", name = "status", scope = SvcPcCertificateDto.class)
    public JAXBElement<String> createSvcPcCertificateDtoStatus(String value) {
        return new JAXBElement<String>(_SvcPcCertificateDtoStatus_QNAME, String.class, SvcPcCertificateDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.service.custombehavior.cbd.csair.com", name = "arr", scope = TravelCountDto.class)
    public JAXBElement<String> createTravelCountDtoArr(String value) {
        return new JAXBElement<String>(_TravelCountDtoArr_QNAME, String.class, TravelCountDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.service.custombehavior.cbd.csair.com", name = "count", scope = TravelCountDto.class)
    public JAXBElement<Integer> createTravelCountDtoCount(Integer value) {
        return new JAXBElement<Integer>(_TravelCountDtoCount_QNAME, Integer.class, TravelCountDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.service.custombehavior.cbd.csair.com", name = "dep", scope = TravelCountDto.class)
    public JAXBElement<String> createTravelCountDtoDep(String value) {
        return new JAXBElement<String>(_TravelCountDtoDep_QNAME, String.class, TravelCountDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.service.custombehavior.cbd.csair.com", name = "memberNo", scope = TravelCountDto.class)
    public JAXBElement<String> createTravelCountDtoMemberNo(String value) {
        return new JAXBElement<String>(_TravelCountDtoMemberNo_QNAME, String.class, TravelCountDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "adultType", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoAdultType(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoAdultType_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "airlineCompany", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoAirlineCompany(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoAirlineCompany_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "arriveAirport", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoArriveAirport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoArriveAirport_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "asrInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoAsrInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoAsrInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "baggageNumber", scope = FlightSegmentDto.class)
    public JAXBElement<Integer> createFlightSegmentDtoBaggageNumber(Integer value) {
        return new JAXBElement<Integer>(_FlightSegmentDtoBaggageNumber_QNAME, Integer.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "baggageWeight", scope = FlightSegmentDto.class)
    public JAXBElement<Integer> createFlightSegmentDtoBaggageWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightSegmentDtoBaggageWeight_QNAME, Integer.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "bedInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoBedInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoBedInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "blindInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoBlindInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoBlindInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "boardingGatenumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoBoardingGatenumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoBoardingGatenumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "boardingPnumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoBoardingPnumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoBoardingPnumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "cabin", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCabin(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCabin_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "certificateIdnum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCertificateIdnum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCertificateIdnum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "certificateType", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCertificateType(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCertificateType_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "checkinPid", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCheckinPid(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCheckinPid_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "checkinTime", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCheckinTime(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCheckinTime_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "checkinWorkernumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCheckinWorkernumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCheckinWorkernumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "childType", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoChildType(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoChildType_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "clazz", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoClazz_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "codeshareAirlinecd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCodeshareAirlinecd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCodeshareAirlinecd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "codeshareFltnum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCodeshareFltnum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCodeshareFltnum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "codeshareFltnumsfx", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCodeshareFltnumsfx(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCodeshareFltnumsfx_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "codesharepsgInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCodesharepsgInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCodesharepsgInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "crsPnrRef", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCrsPnrRef(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCrsPnrRef_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "cussInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoCussInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoCussInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "dataSource", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoDataSource(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoDataSource_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "deafInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoDeafInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoDeafInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "departureAirport", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoDepartureAirport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoDepartureAirport_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "downgradesIdentification", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoDowngradesIdentification(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoDowngradesIdentification_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etClazz", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtClazz_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etCouponStatus", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtCouponStatus(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtCouponStatus_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etCpn", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtCpn(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtCpn_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etFareBasis", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtFareBasis(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtFareBasis_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etFlightRegion", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtFlightRegion(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtFlightRegion_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etIataCode", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtIataCode(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtIataCode_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etMc", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtMc(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtMc_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etMcFlightno", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtMcFlightno(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtMcFlightno_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etOc", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtOc(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtOc_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etOcFlightno", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtOcFlightno(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtOcFlightno_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etOriginClazz", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtOriginClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtOriginClazz_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etRemark", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtRemark(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtRemark_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "etTureCode", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEtTureCode(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEtTureCode_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "eticketInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEticketInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEticketInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "eticketNumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoEticketNumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEticketNumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "ffpAirlinecompany", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoFfpAirlinecompany(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoFfpAirlinecompany_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "filler", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoFiller(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoFiller_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "flightNumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoFlightNumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoFlightNumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "flightNumberSuffix", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoFlightNumberSuffix(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoFlightNumberSuffix_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "flightRegion", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoFlightRegion(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoFlightRegion_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "fromStandyInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoFromStandyInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoFromStandyInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "goshNoshId", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoGoshNoshId(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoGoshNoshId_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "groupInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoGroupInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoGroupInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "groupPeopleNumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoGroupPeopleNumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoGroupPeopleNumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "icsPnrRef", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoIcsPnrRef(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoIcsPnrRef_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "identification", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoIdentification(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoIdentification_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndAirlinecompany", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndAirlinecompany(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndAirlinecompany_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndArrairport", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndArrairport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndArrairport_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndBaggagenum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndBaggagenum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndBaggagenum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndBaggageweight", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndBaggageweight(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndBaggageweight_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndBrdgatenum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndBrdgatenum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndBrdgatenum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndClazz", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndClazz_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndDepairport", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndDepairport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndDepairport_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndFlightnumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndFlightnumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndFlightnumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndFltnumsfx", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndFltnumsfx(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndFltnumsfx_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "inbndSeatnum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoInbndSeatnum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoInbndSeatnum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "jumpseatInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoJumpseatInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoJumpseatInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "memberNo", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoMemberNo(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoMemberNo_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "opId", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOpId(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOpId_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "originClazz", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOriginClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOriginClazz_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndAirlinecompany", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndAirlinecompany(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndAirlinecompany_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndArrairport", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndArrairport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndArrairport_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndBaggagenum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndBaggagenum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndBaggagenum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndBaggageweight", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndBaggageweight(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndBaggageweight_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndBrdgatenum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndBrdgatenum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndBrdgatenum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndClazz", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndClazz_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndDepairport", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndDepairport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndDepairport_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndFlightnumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndFlightnumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndFlightnumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndFltnumsfx", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndFltnumsfx(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndFltnumsfx_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "outbndSeatnum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoOutbndSeatnum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOutbndSeatnum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "passengerChinesename", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoPassengerChinesename(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoPassengerChinesename_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "passengerFirstname", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoPassengerFirstname(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoPassengerFirstname_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "passengerLastname", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoPassengerLastname(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoPassengerLastname_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "passportNum", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoPassportNum(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoPassportNum_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "rspOfcCd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoRspOfcCd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoRspOfcCd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "seatNumber", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoSeatNumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoSeatNumber_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "specialmealInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoSpecialmealInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoSpecialmealInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "ssiosiInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoSsiosiInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoSsiosiInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "travelDetailId", scope = FlightSegmentDto.class)
    public JAXBElement<Long> createFlightSegmentDtoTravelDetailId(Long value) {
        return new JAXBElement<Long>(_FlightSegmentDtoTravelDetailId_QNAME, Long.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "uid", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoUid(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoUid_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "upgradesIdentification", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoUpgradesIdentification(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoUpgradesIdentification_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "usedFfpcardno", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoUsedFfpcardno(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoUsedFfpcardno_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "vipInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoVipInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoVipInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "volntInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoVolntInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoVolntInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "webcheckinInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoWebcheckinInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoWebcheckinInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "wheelchairInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoWheelchairInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoWheelchairInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "withbabyInd", scope = FlightSegmentDto.class)
    public JAXBElement<String> createFlightSegmentDtoWithbabyInd(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoWithbabyInd_QNAME, String.class, FlightSegmentDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "arrCity", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoArrCity(String value) {
        return new JAXBElement<String>(_LatestMileageDtoArrCity_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "arrivalAirport", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoArrivalAirport(String value) {
        return new JAXBElement<String>(_LatestMileageDtoArrivalAirport_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "clazz", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoClazz(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoClazz_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "depCity", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoDepCity(String value) {
        return new JAXBElement<String>(_LatestMileageDtoDepCity_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "departureAirport", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoDepartureAirport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoDepartureAirport_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "desc", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoDesc(String value) {
        return new JAXBElement<String>(_LatestMileageDtoDesc_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "flightSegment", scope = LatestMileageDto.class)
    public JAXBElement<String> createLatestMileageDtoFlightSegment(String value) {
        return new JAXBElement<String>(_LatestMileageDtoFlightSegment_QNAME, String.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "upgradeMileage", scope = LatestMileageDto.class)
    public JAXBElement<Double> createLatestMileageDtoUpgradeMileage(Double value) {
        return new JAXBElement<Double>(_LatestMileageDtoUpgradeMileage_QNAME, Double.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "upgradeSegment", scope = LatestMileageDto.class)
    public JAXBElement<Double> createLatestMileageDtoUpgradeSegment(Double value) {
        return new JAXBElement<Double>(_LatestMileageDtoUpgradeSegment_QNAME, Double.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "useMileage", scope = LatestMileageDto.class)
    public JAXBElement<Double> createLatestMileageDtoUseMileage(Double value) {
        return new JAXBElement<Double>(_LatestMileageDtoUseMileage_QNAME, Double.class, LatestMileageDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "aid", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoAid(String value) {
        return new JAXBElement<String>(_RecruitDtoAid_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "applyId", scope = RecruitDto.class)
    public JAXBElement<Long> createRecruitDtoApplyId(Long value) {
        return new JAXBElement<Long>(_RecruitDtoApplyId_QNAME, Long.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "applySource", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoApplySource(String value) {
        return new JAXBElement<String>(_RecruitDtoApplySource_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "arriveAirport", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoArriveAirport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoArriveAirport_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "batchId", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoBatchId(String value) {
        return new JAXBElement<String>(_RecruitDtoBatchId_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "collectId", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoCollectId(String value) {
        return new JAXBElement<String>(_RecruitDtoCollectId_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "cumulateCabin", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoCumulateCabin(String value) {
        return new JAXBElement<String>(_RecruitDtoCumulateCabin_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "cumulateFlightNumber", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoCumulateFlightNumber(String value) {
        return new JAXBElement<String>(_RecruitDtoCumulateFlightNumber_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "cumulatePassengerName", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoCumulatePassengerName(String value) {
        return new JAXBElement<String>(_RecruitDtoCumulatePassengerName_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "departureAirport", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoDepartureAirport(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoDepartureAirport_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "eticketNumber", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoEticketNumber(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoEticketNumber_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "exportFlag", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoExportFlag(String value) {
        return new JAXBElement<String>(_RecruitDtoExportFlag_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "icsPnrRef", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoIcsPnrRef(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoIcsPnrRef_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "memberNo", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoMemberNo(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoMemberNo_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "muFtdId", scope = RecruitDto.class)
    public JAXBElement<Long> createRecruitDtoMuFtdId(Long value) {
        return new JAXBElement<Long>(_RecruitDtoMuFtdId_QNAME, Long.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "opId", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoOpId(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoOpId_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "remark", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoRemark(String value) {
        return new JAXBElement<String>(_RecruitDtoRemark_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "sourceCode", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoSourceCode(String value) {
        return new JAXBElement<String>(_RecruitDtoSourceCode_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "status", scope = RecruitDto.class)
    public JAXBElement<String> createRecruitDtoStatus(String value) {
        return new JAXBElement<String>(_RecruitDtoStatus_QNAME, String.class, RecruitDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.account.cbd.csair.com", name = "clazz", scope = MileageStandardDto.class)
    public JAXBElement<String> createMileageStandardDtoClazz(String value) {
        return new JAXBElement<String>(_MileageStandardDtoClazz_QNAME, String.class, MileageStandardDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.account.cbd.csair.com", name = "dep", scope = MileageStandardDto.class)
    public JAXBElement<String> createMileageStandardDtoDep(String value) {
        return new JAXBElement<String>(_MileageStandardDtoDep_QNAME, String.class, MileageStandardDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.account.cbd.csair.com", name = "dest", scope = MileageStandardDto.class)
    public JAXBElement<String> createMileageStandardDtoDest(String value) {
        return new JAXBElement<String>(_MileageStandardDtoDest_QNAME, String.class, MileageStandardDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "businessCabin", scope = FreeExchangeStandDto.class)
    public JAXBElement<Integer> createFreeExchangeStandDtoBusinessCabin(Integer value) {
        return new JAXBElement<Integer>(_FreeExchangeStandDtoBusinessCabin_QNAME, Integer.class, FreeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "economicCabin", scope = FreeExchangeStandDto.class)
    public JAXBElement<Integer> createFreeExchangeStandDtoEconomicCabin(Integer value) {
        return new JAXBElement<Integer>(_FreeExchangeStandDtoEconomicCabin_QNAME, Integer.class, FreeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "firstCabin", scope = FreeExchangeStandDto.class)
    public JAXBElement<Integer> createFreeExchangeStandDtoFirstCabin(Integer value) {
        return new JAXBElement<Integer>(_FreeExchangeStandDtoFirstCabin_QNAME, Integer.class, FreeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "luxuryCabin", scope = FreeExchangeStandDto.class)
    public JAXBElement<Integer> createFreeExchangeStandDtoLuxuryCabin(Integer value) {
        return new JAXBElement<Integer>(_FreeExchangeStandDtoLuxuryCabin_QNAME, Integer.class, FreeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "luxuryFirstCabin", scope = FreeExchangeStandDto.class)
    public JAXBElement<Integer> createFreeExchangeStandDtoLuxuryFirstCabin(Integer value) {
        return new JAXBElement<Integer>(_FreeExchangeStandDtoLuxuryFirstCabin_QNAME, Integer.class, FreeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "b_luxury_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoBLuxuryFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoBLuxuryFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "business_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoBusinessFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoBusinessFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "e_luxury_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoELuxuryFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoELuxuryFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "economic_business", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoEconomicBusiness(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoEconomicBusiness_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "economic_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoEconomicFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoEconomicFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "economic_luxury", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoEconomicLuxury(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoEconomicLuxury_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "h_luxury_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoHLuxuryFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoHLuxuryFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "l_luxury_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoLLuxuryFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoLLuxuryFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "luxury_business", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoLuxuryBusiness(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoLuxuryBusiness_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "luxury_first", scope = UpgradeExchangeStandDto.class)
    public JAXBElement<Integer> createUpgradeExchangeStandDtoLuxuryFirst(Integer value) {
        return new JAXBElement<Integer>(_UpgradeExchangeStandDtoLuxuryFirst_QNAME, Integer.class, UpgradeExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "arriveAirport", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoArriveAirport(String value) {
        return new JAXBElement<String>(_QueryPriceDtoArriveAirport_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "clazz", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoClazz(String value) {
        return new JAXBElement<String>(_QueryPriceDtoClazz_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "departureAirport", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoDepartureAirport(String value) {
        return new JAXBElement<String>(_QueryPriceDtoDepartureAirport_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "flightNumber", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoFlightNumber(String value) {
        return new JAXBElement<String>(_QueryPriceDtoFlightNumber_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "realCarrier", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoRealCarrier(String value) {
        return new JAXBElement<String>(_QueryPriceDtoRealCarrier_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "saleCarrier", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoSaleCarrier(String value) {
        return new JAXBElement<String>(_QueryPriceDtoSaleCarrier_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "ticketNumber", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoTicketNumber(String value) {
        return new JAXBElement<String>(_QueryPriceDtoTicketNumber_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "upgradedClazz", scope = QueryPriceDto.class)
    public JAXBElement<String> createQueryPriceDtoUpgradedClazz(String value) {
        return new JAXBElement<String>(_QueryPriceDtoUpgradedClazz_QNAME, String.class, QueryPriceDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "arr", scope = MobileExchangeStandDtoFor2015 .class)
    public JAXBElement<String> createMobileExchangeStandDtoFor2015Arr(String value) {
        return new JAXBElement<String>(_MobileExchangeStandDtoFor2015Arr_QNAME, String.class, MobileExchangeStandDtoFor2015 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "dep", scope = MobileExchangeStandDtoFor2015 .class)
    public JAXBElement<String> createMobileExchangeStandDtoFor2015Dep(String value) {
        return new JAXBElement<String>(_MobileExchangeStandDtoFor2015Dep_QNAME, String.class, MobileExchangeStandDtoFor2015 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeExchangeStandDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "freeExchangeStandDto", scope = MobileExchangeStandDtoFor2015 .class)
    public JAXBElement<FreeExchangeStandDto> createMobileExchangeStandDtoFor2015FreeExchangeStandDto(FreeExchangeStandDto value) {
        return new JAXBElement<FreeExchangeStandDto>(_MobileExchangeStandDtoFor2015FreeExchangeStandDto_QNAME, FreeExchangeStandDto.class, MobileExchangeStandDtoFor2015 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType2AnyTypeMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "upgradeExchangeStandDto", scope = MobileExchangeStandDtoFor2015 .class)
    public JAXBElement<AnyType2AnyTypeMap> createMobileExchangeStandDtoFor2015UpgradeExchangeStandDto(AnyType2AnyTypeMap value) {
        return new JAXBElement<AnyType2AnyTypeMap>(_MobileExchangeStandDtoFor2015UpgradeExchangeStandDto_QNAME, AnyType2AnyTypeMap.class, MobileExchangeStandDtoFor2015 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "accountStatus", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoAccountStatus(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoAccountStatus_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "activeStatus", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoActiveStatus(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoActiveStatus_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "businessChanel", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoBusinessChanel(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoBusinessChanel_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSvcPcCertificateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "certificates", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<ArrayOfSvcPcCertificateDto> createMemberExchangeInfoForB2CDtoCertificates(ArrayOfSvcPcCertificateDto value) {
        return new JAXBElement<ArrayOfSvcPcCertificateDto>(_MemberExchangeInfoForB2CDtoCertificates_QNAME, ArrayOfSvcPcCertificateDto.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "cnName", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoCnName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoCnName_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enFirstName", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoEnFirstName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnFirstName_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enLastName", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoEnLastName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnLastName_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enName", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoEnName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnName_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeMileage", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<Double> createMemberExchangeInfoForB2CDtoExchangeMileage(Double value) {
        return new JAXBElement<Double>(_MemberExchangeInfoForB2CDtoExchangeMileage_QNAME, Double.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeOrderId", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoExchangeOrderId(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoExchangeOrderId_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "havePassword", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoHavePassword(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoHavePassword_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "loyaltyNmae", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoLoyaltyNmae(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoLoyaltyNmae_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "memberNo", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoMemberNo(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoMemberNo_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "tierId", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoTierId(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoTierId_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "title", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoTitle(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoTitle_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "uid", scope = MemberExchangeInfoForB2CDto.class)
    public JAXBElement<String> createMemberExchangeInfoForB2CDtoUid(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoUid_QNAME, String.class, MemberExchangeInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "accountStatus", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoAccountStatus(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoAccountStatus_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "activeStatus", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoActiveStatus(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoActiveStatus_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "businessChanel", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoBusinessChanel(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoBusinessChanel_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSvcPcCertificateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "certificates", scope = MemberInfoForB2CDto.class)
    public JAXBElement<ArrayOfSvcPcCertificateDto> createMemberInfoForB2CDtoCertificates(ArrayOfSvcPcCertificateDto value) {
        return new JAXBElement<ArrayOfSvcPcCertificateDto>(_MemberInfoForB2CDtoCertificates_QNAME, ArrayOfSvcPcCertificateDto.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "cnName", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoCnName(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoCnName_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "enFirstName", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoEnFirstName(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoEnFirstName_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "enLastName", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoEnLastName(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoEnLastName_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "enName", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoEnName(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoEnName_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "exchangeMileage", scope = MemberInfoForB2CDto.class)
    public JAXBElement<Double> createMemberInfoForB2CDtoExchangeMileage(Double value) {
        return new JAXBElement<Double>(_MemberInfoForB2CDtoExchangeMileage_QNAME, Double.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "exchangeOrderId", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoExchangeOrderId(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoExchangeOrderId_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "havePassword", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoHavePassword(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoHavePassword_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "loyaltyNmae", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoLoyaltyNmae(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoLoyaltyNmae_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "memberNo", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoMemberNo(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoMemberNo_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "tierId", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoTierId(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoTierId_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "title", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoTitle(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoTitle_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "uid", scope = MemberInfoForB2CDto.class)
    public JAXBElement<String> createMemberInfoForB2CDtoUid(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoUid_QNAME, String.class, MemberInfoForB2CDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "carrier", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoCarrier(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoCarrier_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeFlag", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoExchangeFlag(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoExchangeFlag_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "payCount", scope = QueryPriceResultDto.class)
    public JAXBElement<Double> createQueryPriceResultDtoPayCount(Double value) {
        return new JAXBElement<Double>(_QueryPriceResultDtoPayCount_QNAME, Double.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "payType", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoPayType(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoPayType_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "policyDescription", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoPolicyDescription(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoPolicyDescription_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "policyLimit", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoPolicyLimit(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoPolicyLimit_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "policyType", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoPolicyType(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoPolicyType_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "saleCode", scope = QueryPriceResultDto.class)
    public JAXBElement<String> createQueryPriceResultDtoSaleCode(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoSaleCode_QNAME, String.class, QueryPriceResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "accountStatus", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoAccountStatus(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoAccountStatus_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "activeStatus", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoActiveStatus(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoActiveStatus_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "businessChanel", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoBusinessChanel(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoBusinessChanel_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSvcPcCertificateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "certificates", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<ArrayOfSvcPcCertificateDto> createMemberExchangeInfoForVOSDtoCertificates(ArrayOfSvcPcCertificateDto value) {
        return new JAXBElement<ArrayOfSvcPcCertificateDto>(_MemberExchangeInfoForB2CDtoCertificates_QNAME, ArrayOfSvcPcCertificateDto.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "cnName", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoCnName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoCnName_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enFirstName", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoEnFirstName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnFirstName_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enLastName", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoEnLastName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnLastName_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enName", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoEnName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnName_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeMileage", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<Double> createMemberExchangeInfoForVOSDtoExchangeMileage(Double value) {
        return new JAXBElement<Double>(_MemberExchangeInfoForB2CDtoExchangeMileage_QNAME, Double.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeOrderId", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoExchangeOrderId(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoExchangeOrderId_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "havePassword", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoHavePassword(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoHavePassword_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "loyaltyNmae", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoLoyaltyNmae(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoLoyaltyNmae_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "memberNo", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoMemberNo(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoMemberNo_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "tierId", scope = MemberExchangeInfoForVOSDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSDtoTierId(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoTierId_QNAME, String.class, MemberExchangeInfoForVOSDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "accountStatus", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoAccountStatus(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoAccountStatus_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "activeStatus", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoActiveStatus(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoActiveStatus_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "businessChanel", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoBusinessChanel(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoBusinessChanel_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSvcPcCertificateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "certificates", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<ArrayOfSvcPcCertificateDto> createMemberExchangeInfoForVOSNewDtoCertificates(ArrayOfSvcPcCertificateDto value) {
        return new JAXBElement<ArrayOfSvcPcCertificateDto>(_MemberExchangeInfoForB2CDtoCertificates_QNAME, ArrayOfSvcPcCertificateDto.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "cnName", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoCnName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoCnName_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enFirstName", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoEnFirstName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnFirstName_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enLastName", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoEnLastName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnLastName_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "enName", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoEnName(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoEnName_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeMileage", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<Double> createMemberExchangeInfoForVOSNewDtoExchangeMileage(Double value) {
        return new JAXBElement<Double>(_MemberExchangeInfoForB2CDtoExchangeMileage_QNAME, Double.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "exchangeOrderId", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoExchangeOrderId(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoExchangeOrderId_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "havePassword", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoHavePassword(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoHavePassword_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "loyaltyNmae", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoLoyaltyNmae(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoLoyaltyNmae_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "memberNo", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoMemberNo(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoMemberNo_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "tierId", scope = MemberExchangeInfoForVOSNewDto.class)
    public JAXBElement<String> createMemberExchangeInfoForVOSNewDtoTierId(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoTierId_QNAME, String.class, MemberExchangeInfoForVOSNewDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "arr", scope = MobileExchangeStandDto.class)
    public JAXBElement<String> createMobileExchangeStandDtoArr(String value) {
        return new JAXBElement<String>(_MobileExchangeStandDtoFor2015Arr_QNAME, String.class, MobileExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "dep", scope = MobileExchangeStandDto.class)
    public JAXBElement<String> createMobileExchangeStandDtoDep(String value) {
        return new JAXBElement<String>(_MobileExchangeStandDtoFor2015Dep_QNAME, String.class, MobileExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeExchangeStandDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "freeExchangeStandDto", scope = MobileExchangeStandDto.class)
    public JAXBElement<FreeExchangeStandDto> createMobileExchangeStandDtoFreeExchangeStandDto(FreeExchangeStandDto value) {
        return new JAXBElement<FreeExchangeStandDto>(_MobileExchangeStandDtoFor2015FreeExchangeStandDto_QNAME, FreeExchangeStandDto.class, MobileExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeExchangeStandDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "upgradeExchangeStandDto", scope = MobileExchangeStandDto.class)
    public JAXBElement<UpgradeExchangeStandDto> createMobileExchangeStandDtoUpgradeExchangeStandDto(UpgradeExchangeStandDto value) {
        return new JAXBElement<UpgradeExchangeStandDto>(_MobileExchangeStandDtoFor2015UpgradeExchangeStandDto_QNAME, UpgradeExchangeStandDto.class, MobileExchangeStandDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "accountStatus", scope = MemberInfoForVOS.class)
    public JAXBElement<String> createMemberInfoForVOSAccountStatus(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoAccountStatus_QNAME, String.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "accountType", scope = MemberInfoForVOS.class)
    public JAXBElement<String> createMemberInfoForVOSAccountType(String value) {
        return new JAXBElement<String>(_MemberInfoForVOSAccountType_QNAME, String.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "activeStatus", scope = MemberInfoForVOS.class)
    public JAXBElement<String> createMemberInfoForVOSActiveStatus(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoActiveStatus_QNAME, String.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatestMileageDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "latestMileageDto", scope = MemberInfoForVOS.class)
    public JAXBElement<LatestMileageDto> createMemberInfoForVOSLatestMileageDto(LatestMileageDto value) {
        return new JAXBElement<LatestMileageDto>(_MemberInfoForVOSLatestMileageDto_QNAME, LatestMileageDto.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "loyaltyName", scope = MemberInfoForVOS.class)
    public JAXBElement<String> createMemberInfoForVOSLoyaltyName(String value) {
        return new JAXBElement<String>(_MemberInfoForVOSLoyaltyName_QNAME, String.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "memberNo", scope = MemberInfoForVOS.class)
    public JAXBElement<String> createMemberInfoForVOSMemberNo(String value) {
        return new JAXBElement<String>(_FlightSegmentDtoMemberNo_QNAME, String.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.cbdinterface.cbd.csair.com", name = "tierId", scope = MemberInfoForVOS.class)
    public JAXBElement<String> createMemberInfoForVOSTierId(String value) {
        return new JAXBElement<String>(_MemberInfoForB2CDtoTierId_QNAME, String.class, MemberInfoForVOS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "airlineCompany", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoAirlineCompany(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoAirlineCompany_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "applySource", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoApplySource(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoApplySource_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "applyStatus", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoApplyStatus(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoApplyStatus_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "arriveAirport", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoArriveAirport(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoArriveAirport_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "batchId", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoBatchId(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoBatchId_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "certificateIdnum", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoCertificateIdnum(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoCertificateIdnum_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "certificateType", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoCertificateType(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoCertificateType_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "clazz", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoClazz(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoClazz_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "collectId", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoCollectId(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoCollectId_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "departureAirport", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoDepartureAirport(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoDepartureAirport_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "eticketNumber", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoEticketNumber(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoEticketNumber_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "flightNumber", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoFlightNumber(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoFlightNumber_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "flightSegment", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoFlightSegment(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoFlightSegment_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "ftdId", scope = RecruitApplyDto.class)
    public JAXBElement<Long> createRecruitApplyDtoFtdId(Long value) {
        return new JAXBElement<Long>(_RecruitApplyDtoFtdId_QNAME, Long.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "icsPnrRef", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoIcsPnrRef(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoIcsPnrRef_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "memberName", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoMemberName(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoMemberName_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "memberNo", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoMemberNo(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoMemberNo_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "mileageRecruitApplyOpId", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoMileageRecruitApplyOpId(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoMileageRecruitApplyOpId_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "muFtdId", scope = RecruitApplyDto.class)
    public JAXBElement<Long> createRecruitApplyDtoMuFtdId(Long value) {
        return new JAXBElement<Long>(_RecruitApplyDtoMuFtdId_QNAME, Long.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "passengerChinesename", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoPassengerChinesename(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoPassengerChinesename_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "passengerFirstname", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoPassengerFirstname(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoPassengerFirstname_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "passengerLastname", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoPassengerLastname(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoPassengerLastname_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "passportNum", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoPassportNum(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoPassportNum_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "sourceCode", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoSourceCode(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoSourceCode_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.flyRecords.cbd.csair.com", name = "travelDetailOpId", scope = RecruitApplyDto.class)
    public JAXBElement<String> createRecruitApplyDtoTravelDetailOpId(String value) {
        return new JAXBElement<String>(_RecruitApplyDtoTravelDetailOpId_QNAME, String.class, RecruitApplyDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "memberNo", scope = FtuResutlDto.class)
    public JAXBElement<String> createFtuResutlDtoMemberNo(String value) {
        return new JAXBElement<String>(_MemberExchangeInfoForB2CDtoMemberNo_QNAME, String.class, FtuResutlDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "orderNo", scope = FtuResutlDto.class)
    public JAXBElement<String> createFtuResutlDtoOrderNo(String value) {
        return new JAXBElement<String>(_FtuResutlDtoOrderNo_QNAME, String.class, FtuResutlDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "passengerName", scope = FtuResutlDto.class)
    public JAXBElement<String> createFtuResutlDtoPassengerName(String value) {
        return new JAXBElement<String>(_FtuResutlDtoPassengerName_QNAME, String.class, FtuResutlDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "payType", scope = FtuResutlDto.class)
    public JAXBElement<String> createFtuResutlDtoPayType(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoPayType_QNAME, String.class, FtuResutlDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "policyLimit", scope = FtuResutlDto.class)
    public JAXBElement<String> createFtuResutlDtoPolicyLimit(String value) {
        return new JAXBElement<String>(_QueryPriceResultDtoPolicyLimit_QNAME, String.class, FtuResutlDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.marketing.cbd.csair.com", name = "totalPrice", scope = FtuResutlDto.class)
    public JAXBElement<Double> createFtuResutlDtoTotalPrice(Double value) {
        return new JAXBElement<Double>(_FtuResutlDtoTotalPrice_QNAME, Double.class, FtuResutlDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Exception.web.services.ccs.cbd.csair.com", name = "key", scope = WebServiceException.class)
    public JAXBElement<String> createWebServiceExceptionKey(String value) {
        return new JAXBElement<String>(_WebServiceExceptionKey_QNAME, String.class, WebServiceException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Exception.web.services.ccs.cbd.csair.com", name = "message", scope = WebServiceException.class)
    public JAXBElement<String> createWebServiceExceptionMessage(String value) {
        return new JAXBElement<String>(_WebServiceExceptionMessage_QNAME, String.class, WebServiceException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.member.cbd.csair.com", name = "enrollTag", scope = QuickEnrollInfoReturnDto.class)
    public JAXBElement<String> createQuickEnrollInfoReturnDtoEnrollTag(String value) {
        return new JAXBElement<String>(_QuickEnrollInfoReturnDtoEnrollTag_QNAME, String.class, QuickEnrollInfoReturnDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.services.member.cbd.csair.com", name = "memberNo", scope = QuickEnrollInfoReturnDto.class)
    public JAXBElement<String> createQuickEnrollInfoReturnDtoMemberNo(String value) {
        return new JAXBElement<String>(_QuickEnrollInfoReturnDtoMemberNo_QNAME, String.class, QuickEnrollInfoReturnDto.class, value);
    }

}
