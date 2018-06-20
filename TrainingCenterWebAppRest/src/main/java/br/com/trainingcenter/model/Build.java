package br.com.trainingcenter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Build {
    
    @XmlElement(name="Version")
    private Version version;

    public Build() {
    }

    /**
     * @return the Version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(Version Version) {
        this.version = Version;
    }
    
}
