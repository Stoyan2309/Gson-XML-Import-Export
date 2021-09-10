package softuni.exam.service;

import softuni.exam.models.Entity.Seller;

import javax.xml.bind.JAXBException;
import java.io.IOException;


public interface SellerService {
    
    boolean areImported();

    String readSellersFromFile() throws IOException;

    String importSellers() throws IOException, JAXBException;

    Seller findById(Long id);
}
