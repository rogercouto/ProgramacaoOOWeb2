package br.com.trainingcenter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Extensions {
    
    @XmlElement(name="Lx")
    private LX lx;

    public Extensions() {
    }

    /**
     * @return the lx
     */
    public LX getLx() {
        return lx;
    }

    /**
     * @param Lx the lx to set
     */
    public void setLx(LX Lx) {
        this.lx = Lx;
    }
    
    
}
