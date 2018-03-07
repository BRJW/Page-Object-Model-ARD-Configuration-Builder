package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.List;


//The file builder code in theory should be ...somewhat language independent. How certain languages need to be represented inside Automation Builder snippets will likely dictate at least some specialisation in the future.
//For example, here we use the pattern ObjClass ~ObjName~ = new ObjClass(); -> which just won't be appropriate for some languages.
//So Instantiation should be optional/overridable by the language implementation.
//Taking this further, big chunks of the file builder may be language specific.

public class FileBuilder {

    public static String BuildConfig(List<ConfigObject> configObjects) throws Exception {
        //Don't blame me for the DocumentBuilderFactory nonsense, blame w3c or whoever made the library..
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        docBuilder = docFactory.newDocumentBuilder();

        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("AutomationConfiguration");
        doc.appendChild(rootElement);

        Element AutomationLayers = doc.createElement("AutomationLayers");
        rootElement.appendChild(AutomationLayers);

        Element AutomationLayer = doc.createElement("AutomationLayer");
        AutomationLayers.appendChild(AutomationLayer);

        Element Guid = doc.createElement("Guid");
        //Hardcoded guid.. maybe a bad idea..
        Guid.setTextContent("50e39f1c-ed1d-45f0-be08-e98630010063");
        Element Name = doc.createElement("Name");
        Name.setTextContent("POM");
        Element Objects = doc.createElement("Objects");

        AutomationLayer.appendChild(Guid);
        AutomationLayer.appendChild(Name);
        AutomationLayer.appendChild(Objects);

        for(ConfigObject ConfigObject : configObjects){
            //Headers we always have to add per 'Class'
            Element Object = doc.createElement("Object");
            Objects.appendChild(Object);

            Element ObjectType = doc.createElement("ObjectType");
            ObjectType.setTextContent(ConfigObject.getName());
            Object.appendChild(ObjectType);

            Element ObjectActions = doc.createElement("ObjectActions");
            Object.appendChild(ObjectActions);

            //Instantiation now handled if applicable in the parser.

            for(ConfigAction Method : ConfigObject.getMethods()){
                //Each action gets added to to the config xml.
                Element MethodAction = doc.createElement("Action");
                MethodAction.setAttribute("ActionName",Method.getName());
                //I.e. so they can refer to the particular instance with a variable in ARD.
                String MethodCodeSnippet = Method.getCodeSnippet();
                //All of the text we're building simply gets added as an attribute of the Action.
                MethodAction.setAttribute("CodeSnippet",MethodCodeSnippet);

                //Add to it's class.
                ObjectActions.appendChild(MethodAction);
            }
        }
        System.out.print("\n");

        //Convert back to string.
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(domSource, result);
        return writer.toString();

    }

}
