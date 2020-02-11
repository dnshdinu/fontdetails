package pdfread;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class Pdfdetails {

	public static void main(String[] args) throws Exception {
		PDDocument pd;
	     pd = PDDocument.load(new File("C:\\Users\\Dineshkumar\\eclipse-workspace\\basicconcept\\pdf\\EPSF_FORM12BB_003948.pdf"));
		System.out.println("Total pages:"+pd.getNumberOfPages());
		PDFTextStripper pdf = new PDFTextStripper();
	
		System.out.println(pdf.getText(pd));
	
	}
}
