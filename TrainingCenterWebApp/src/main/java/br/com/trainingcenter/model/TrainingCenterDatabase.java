package br.com.trainingcenter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TrainingCenterDatabase")
@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingCenterDatabase {
    
    @XmlElement(name="Activities")
    private Activities activities;
    @XmlElement(name="Author")
    private Author author;
//    @XmlElement(name="Lap")
//    private Lap lap;

    public TrainingCenterDatabase() {
    }

//     /**
//     * @return the Lap
//     */
//    public Lap getLap(){
//        return lap;
//    }
//    
//    
//    /**
//     * @param Lap the Lap to set
//     */
//    public void setLap(Lap Lap) {
//        this.lap = Lap;
//    }
    
    /**
     * @return the Author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(Author Author) {
        this.author = Author;
    }

    /**
     * @return the Activity
     */
    public Activities getActivities() {
        return activities;
    }

    /**
     * @param Activities the Activity to set
     */
    public void setActivities(Activities Activities) {
        this.activities = Activities;
    }
    
    
}
