package login;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.tools.PDFBox;
import sun.misc.BASE64Decoder; 


public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.err.println(userName+";"+password);
		String myUser = "Dong";
		String myPwd = "5432100";
		if(userName.equals(myUser)&&password.equals(myPwd)) {
			response.sendRedirect(request.getContextPath()+"/hello.jsp?userName="+userName);
		}else {
			request.setAttribute("message", "账密错误，请重新登录<br>");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
}
	
	      public void createHelloPDF() {
		          PDDocument doc = null;
		          PDPage page = null;
		  
		       /*   String aaa = "";
		          byte[] bbBytes = aaa.getBytes();*/
		          
		          try {
		        	  
		        	  String temp = null;
		        	  PDDocument pdfdocument = null;
		        	  FileInputStream is = new FileInputStream(filename);
		        	  PDFParser parser = new PDFParser(is);
		        	  parser.parse();
		        	  pdfdocument = parser.getPDDocument();
		        	  ByteArrayOutputStream out = new ByteArrayOutputStream();
		        	  OutputStreamWriter writer = new OutputStreamWriter(out);
		        	  
		        	  stripper.writeText(pdfdocument.getDocument(), writer);
		        	  writer.close();
		        	  byte[] contents = out.toByteArray();

		        	  String ts = new String(contents);
		        	  
		             doc = new PDDocument();
		             page = new PDPage();
	
		             doc.addPage(page);
		             PDFont font = PDType1Font.HELVETICA_BOLD;
		             PDPageContentStream content = new PDPageContentStream(doc, page);
		             content.beginText();
		             content.setFont(font, 12);
		             content.moveTextPositionByAmount(100, 700);
		             //content.drawString("hello");
		             
		             String aaa = "";
		             byte [] bbBytes = aaa.getBytes();
		             BASE64Decoder decoder = new BASE64Decoder();
		             byte[] bytes=decoder.decodeBuffer(aaa);
		 
		             content.endText();
		             content.close();
		             doc.save("C:\\cena\\pdfwithText.pdf");
		            doc.close();
		         } catch (Exception e) {
		             System.out.println(e);
		         }

	      }
		
}
