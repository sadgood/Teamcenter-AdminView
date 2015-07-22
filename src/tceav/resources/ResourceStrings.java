/*
 * ResourceStrings.java
 *
 * Created on 13 July 2007, 11:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tceav.resources;

import java.net.URL;
import java.io.IOException;
/**
 *
 * @author nzr4dl
 */
public class ResourceStrings {
    
    /**
     * Creates a new instance of ResourceStrings
     */
    public ResourceStrings() {
    }
    
    public static URL getChangeLog() throws IOException {
        return ResourceStrings.class.getResource("ChangeLog.html");
    }
    
    public static URL getPLMXMLPDMSchema() throws IOException {
        return ResourceStrings.class.getResource("schema/PLMXMLPDMSchema.xsd");
    }
    
    public static String getVersion() {
        return "3.07";
    }
    
    public static String getBuild() {
        return "139";
    }
    
    public static String getReleaseDate() {
        return "07-July-08";
    }
    
    public static String getApplicationName() {
        return "Teamcenter Engineering Admin View";
    }
    
    public static String getApplicationNameShort() {
        return "TcE.AV";
    }
    
    public static String getAboutInfo() {
        return "<html><p>TcE Admin View</p><p></p>" +
                        "<p>Version: "+getVersion()+"</p>" +
                        "<p>Build: "+getBuild()+"</p>" +
                        "<p>Release Date: "+getReleaseDate()+"</p>"+
                        "<p></p>" +
                        "<p>Developed by"+
                        "<br>Nader Eloshaiker"+
                        "<br>email: nader.eloshaiker@gm.com"+
                        "<br>phone: +61 3 9647 5271</p>"+
                        "<p></p>" +
                        "<p>Math Based Systems<br>Engineering<br>General Motors Holden Pty. Ltd.</p>" +
                        "</html>";
    }
    
}
