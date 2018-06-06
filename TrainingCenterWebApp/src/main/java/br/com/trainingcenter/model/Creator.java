package br.com.trainingcenter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Creator {
    
    @XmlElement(name="Name")
    private String name;
    @XmlElement(name="UnitID")
    private int unitId;
    @XmlElement(name="ProductID")
    private int productID;
    @XmlElement(name="Version")
    private Version version;

    public Creator() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the UnitId
     */
    public int getUnitId() {
        return unitId;
    }

    /**
     * @param UnitId the UnitId to set
     */
    public void setUnitId(int UnitId) {
        this.unitId = UnitId;
    }

    /**
     * @return the ProductID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param ProductID the ProductID to set
     */
    public void setProductID(int ProductID) {
        this.productID = ProductID;
    }

    /**
     * @return the version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Version version) {
        this.version = version;
    }
    
}
