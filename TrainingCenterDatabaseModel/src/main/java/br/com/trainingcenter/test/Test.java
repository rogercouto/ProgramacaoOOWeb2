/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.test;

import br.com.trainingcenter.model.TrainingCenterDatabase;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author roger
 */
public class Test {
 
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            //We had written this file in marshalling example
            TrainingCenterDatabase tcd = (TrainingCenterDatabase) jaxbUnmarshaller.unmarshal( new File("rota2.tcx") );
        } catch (JAXBException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
