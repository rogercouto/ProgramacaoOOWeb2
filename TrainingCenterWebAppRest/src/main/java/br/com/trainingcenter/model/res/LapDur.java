package br.com.trainingcenter.model.res;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para retornar apenas as laps e a duração de cada uma
 */
@XmlRootElement(name="Lap")
@XmlAccessorType(XmlAccessType.FIELD)
public class LapDur {
    
    @XmlAttribute(name="Number")
    private int number;
    @XmlElement(name="TotalTimeSeconds")
    private double totalTimeSeconds;

    public LapDur() {
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the TotalTimeSeconds
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * @param TotalTimeSeconds the TotalTimeSeconds to set
     */
    public void setTotalTimeSeconds(double TotalTimeSeconds) {
        this.totalTimeSeconds = TotalTimeSeconds;
    }
    
}
