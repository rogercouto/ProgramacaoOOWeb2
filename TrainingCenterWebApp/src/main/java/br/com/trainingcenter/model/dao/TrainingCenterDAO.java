package br.com.trainingcenter.model.dao;

import br.com.trainingcenter.model.TrainingCenterDatabase;
import br.com.trainingcenter.model.util.NamespaceFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class TrainingCenterDAO {
    
    public File file;
    
    /**
     * 
     * @param fileName nome do arquivo tcx
     */
    public TrainingCenterDAO(String fileName){
        file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException(fileName+": arquivo não encontrado!");
    }
    
    /**
     * Realiza o unmarshall do arquivo txc e tetorna o modelo completo
     * @return TrainingCenterDatabase
     */
    public TrainingCenterDatabase unmarshall(){
        try {
            JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Unmarshaller u = jc.createUnmarshaller();
            //Create an XMLReader to use with our filter
            XMLReader reader = XMLReaderFactory.createXMLReader();
            //Create the filter (to add namespace) and set the xmlReader as its parent.
            NamespaceFilter inFilter = new NamespaceFilter(null, true);
            inFilter.setParent(reader);
            //Prepare the input, in this case a java.io.File (output)
            InputSource is = new InputSource(new FileInputStream(file));
            //Create a SAXSource specifying the filter
            SAXSource source = new SAXSource(inFilter, is);
            //Do unmarshalling
            return (TrainingCenterDatabase)u.unmarshal(source);
        } catch (JAXBException | FileNotFoundException | SAXException ex) {
            Logger.getLogger(TrainingCenterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
