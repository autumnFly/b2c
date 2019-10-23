
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFlightSegmentDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFlightSegmentDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightSegmentDto" type="{http://dto.services.cbdinterface.cbd.csair.com}FlightSegmentDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFlightSegmentDto", namespace = "http://dto.services.cbdinterface.cbd.csair.com", propOrder = {
    "flightSegmentDto"
})
public class ArrayOfFlightSegmentDto {

    @XmlElement(name = "FlightSegmentDto", nillable = true)
    protected List<FlightSegmentDto> flightSegmentDto;

    /**
     * Gets the value of the flightSegmentDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentDto }
     * 
     * 
     */
    public List<FlightSegmentDto> getFlightSegmentDto() {
        if (flightSegmentDto == null) {
            flightSegmentDto = new ArrayList<FlightSegmentDto>();
        }
        return this.flightSegmentDto;
    }

}
