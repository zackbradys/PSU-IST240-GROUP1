
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * This class reads and writes XML files based on Java Beans DTD
 * It uses the standard Java classes
 * XMLEncoder
 * XMLDecoder
 *
 * Use: create the class XML_240 x = new XML_240();
 * READER
 * Open a XML file to read: x.openReader(filename);
 * Close a XML reader file: x.closeReader();
 *
 * Read an Object: x.readObject();
 * You need to know what TYPE of Object you are reading
 * String s = (String) x.readObject();
 *
 * WRITER
 * Open a XML file to write: x.openWriter(filename);
 * Close a XML writer file: x.closeWriter();
 *
 * Write an Object: x.writeObject(ANY JAVA OBJECT/INSTANCE HERE)
 * String s = "fred";
 * x.writeObject(s);
 */
public class XML_240 {

    XMLEncoder xe;
    XMLDecoder de;

    public XML_240() {

    }
//==========================================================================

    public void openReaderXML(String filename) {
        try {
            de = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)));
        } catch (FileNotFoundException xx) {
        }
    }
//==========================================================================

    public void openWriterXML(String filename) {
        try {
            xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        } catch (FileNotFoundException xx) {
        }
    }
//==========================================================================

    public void writeObject(Object o) {
        try {
            xe.writeObject(o);
        } catch (Exception xx) {
        }
    }
//==========================================================================

    public Object ReadObject() {
        Object o = new Object();
        try {
            o = de.readObject();
        } catch (Exception xx) {
        }
        return o;
    }
//==========================================================================

    public void closeReaderXML() {
        try {
            de.close();
        } catch (Exception xx) {
        }
    }
//==========================================================================

    public void closeWriterXML() {
        try {
            xe.close();
        } catch (Exception xx) {
        }
    }
}
