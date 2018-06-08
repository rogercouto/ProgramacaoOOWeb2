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
    
    public TrainingCenterDatabase() {
    }

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
