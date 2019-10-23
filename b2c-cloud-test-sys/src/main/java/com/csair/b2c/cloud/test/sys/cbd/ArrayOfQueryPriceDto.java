
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfQueryPriceDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQueryPriceDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryPriceDto" type="{http://dto.services.marketing.cbd.csair.com}QueryPriceDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryPriceDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "queryPriceDto"
})
public class ArrayOfQueryPriceDto {

    @XmlElement(name = "QueryPriceDto", nillable = true)
    protected List<QueryPriceDto> queryPriceDto;

    /**
     * Gets the value of the queryPriceDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryPriceDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryPriceDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPriceDto }
     * 
     * 
     */
    public List<QueryPriceDto> getQueryPriceDto() {
        if (queryPriceDto == null) {
            queryPriceDto = new ArrayList<QueryPriceDto>();
        }
        return this.queryPriceDto;
    }

}
