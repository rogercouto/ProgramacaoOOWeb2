/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.test;

import br.com.trainingcenter.model.TrainingCenterDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author roger
 */
public class Test {
 
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Unmarshaller u = jc.createUnmarshaller();
            //Create an XMLReader to use with our filter
            XMLReader reader = XMLReaderFactory.createXMLReader();
            //Create the filter (to add namespace) and set the xmlReader as its parent.
            NamespaceFilter inFilter = new NamespaceFilter(null, true);
            inFilter.setParent(reader);
            //Prepare the input, in this case a java.io.File (output)
            InputSource is = new InputSource(new FileInputStream(new File("rota2.tcx")));
            //Create a SAXSource specifying the filter
            SAXSource source = new SAXSource(inFilter, is);
            //Do unmarshalling
            TrainingCenterDatabase tcd = (TrainingCenterDatabase)u.unmarshal(source);
            //System.out.println(tcd.getAuthor().getName());
            
        } catch (JAXBException | SAXException | FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
