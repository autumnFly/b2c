
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TravelCountDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TravelCountDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelCountDto", namespace = "http://dto.service.custombehavior.cbd.csair.com", propOrder = {
    "arr",
    "count",
    "dep",
    "memberNo"
})
public class TravelCountDto {

    @XmlElementRef(name = "arr", namespace = "http://dto.service.custombehavior.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arr;
    @XmlElementRef(name = "count", namespace = "http://dto.service.custombehavior.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> count;
    @XmlElementRef(name = "dep", namespace = "http://dto.service.custombehavior.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dep;
    @XmlElementRef(name = "memberNo", namespace = "http://dto.service.custombehavior.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;

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
     * ��ȡcount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCount(JAXBElement<Integer> value) {
        this.count = value;
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

}
