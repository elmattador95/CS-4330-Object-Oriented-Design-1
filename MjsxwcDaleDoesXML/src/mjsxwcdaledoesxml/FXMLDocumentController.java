/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwcdaledoesxml;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Matthew
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void open(ActionEvent event) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory build = DocumentBuilderFactory.newInstance();
        DocumentBuilder parse = build.newDocumentBuilder();
        Document file = parse.parse("simple.xml");
        file.getDocumentElement().normalize();
        NodeList something = file.getElementsByTagName("food");
        List<Dale> random= new ArrayList<Dale>();
        int length = something.getLength();
        for(int i = 0; i < length; i++){
            random.add(Quail(something.item(i)));
        }
    }
    
    public Dale Quail(Node snail){
        Dale pail = new Dale();
        if(snail.getNodeType() == Node.ELEMENT_NODE){
            Element flail = (Element) snail;
            pail.setcalories(mail("calories",flail));
            pail.setdescription(mail("description",flail));
            pail.setname(mail("name",flail));
            pail.setprice(mail("price",flail));
            //pail.hail();
            System.out.println(pail.hail());
        }
        return pail;
    }
    
    public String mail(String stale, Element ale){
        NodeList rail = ale.getElementsByTagName(stale).item(0).getChildNodes();
        Node frail = (Node) rail.item(0);
        return frail.getNodeValue();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
