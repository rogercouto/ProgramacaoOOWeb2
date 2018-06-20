package br.com.trainingcenter.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Activities {
    
    @XmlElement(name="Activity")
    private List<Activity> list;

    public Activities() {
    }
    
    /**
     * @return the Activity
     */
    public List<Activity> getList() {
        return list;
    }

    /**
     * @param list the Activity to set
     */
    public void setList(List<Activity> list) {
        this.list = list;
    }
    
}
