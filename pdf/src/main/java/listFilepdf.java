//import java.io.DataOutputStream;
import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.swing.event.DocumentListener;
//import javax.swing.event.UndoableEditListener;
//import javax.swing.text.AttributeSet;
//import javax.swing.text.BadLocationException;
//import javax.swing.text.Document;
//import javax.swing.text.Element;
//import javax.swing.text.Position;
//import javax.swing.text.Segment;




public class listFilepdf {
   public static void main(String[] args) {      
      File f = null;
      String[] paths;     
      try {     
         f = new File("C:\\Users\\DEV004\\Desktop\\abcabc");
         paths = f.list();
         for(String path:paths) {   
            System.out.println(path);
         }        
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
//   public void generatePDF() throws Exception {
//	   Document doc = new Document();
//		
//		
//	    File file = new File("C:\\Users\\DEV004\\Desktop\\abcabc");
//	    FileOutputStream pdfFileout = new FileOutputStream(file);
//	    PdfWriter.getInstance(doc, pdfFileout);
//	    doc.open();
//	    Paragraph para = new Paragraph("Test");
//	    doc.add(catPart);
//	    doc.close();
//	}
//	 
//	public void openPDF(HttpServletRequest request, HttpServletResponse response)
//	    throws IOException{
//	    
//	}
} 