package AppJavaFX;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfWriter;

public class DocExemplo {	
	public static void main(String[] args) throws Exception {
		String nome;
		int idade;
		int id;
		Document doc = null;
		OutputStream os = null;
		
		try {
			nome = "Raí Lima Ferreira";
			idade = 19;
			id = 3546;
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String data = sdf.format(new Date(System.currentTimeMillis()));
			
			
			doc = new Document(PageSize.A4, 72, 72, 72, 72);
			os = new FileOutputStream("out.pdf");
			PdfWriter writer = PdfWriter.getInstance(doc, os);
			doc.open();
			
			Font fg = new Font(FontFamily.TIMES_ROMAN, 25);
			Font fs = new Font(FontFamily.TIMES_ROMAN, 14);
			Font t2 = new Font(FontFamily.TIMES_ROMAN, 18);
			Font dcl = new Font(FontFamily.TIMES_ROMAN, 13);
			Font dcl2 = new Font(FontFamily.TIMES_ROMAN, 13, Font.BOLD);
			
			
			
			Paragraph titulo = new Paragraph("GymSystem", fg);
			titulo.setAlignment(Element.ALIGN_CENTER);
			doc.add(titulo);
			Paragraph subtitulo = new Paragraph("Sistema de Academias", fs);
			subtitulo.setAlignment(Element.ALIGN_CENTER);
			subtitulo.setSpacingAfter(20);
			doc.add(subtitulo);
			Paragraph titulo2 = new Paragraph("COMPROVANTE DE MATRICULA", t2);
			titulo2.setAlignment(Element.ALIGN_CENTER);
			titulo2.setSpacingAfter(200);
			doc.add(titulo2);
			
			Paragraph declaracao = new Paragraph("Afirmamos, para os fins que se fizerem necessários, que o cliente " + nome + ", está devidamente"
					+ " matriculado nesta instituição, sob o ID número: " + id + ".", dcl);
			declaracao.setSpacingAfter(300);
			declaracao.setAlignment(Element.ALIGN_JUSTIFIED);
			declaracao.setAlignment(Element.ALIGN_CENTER);
			doc.add(declaracao);
			
			Paragraph rodape = new Paragraph("GymSystem, " + data, dcl);
			rodape.setAlignment(Element.ALIGN_CENTER);
			doc.add(rodape);
			
			PdfContentByte canvas = writer.getDirectContentUnder();
		    Image image = Image.getInstance("gymsystemrem.png");
		    image.scalePercent(100);
		    image.setAbsolutePosition(25, 250); // o quanto pra esquerda, o quanto pra cima
		    canvas.saveState();
		    PdfGState state = new PdfGState();
		    state.setFillOpacity(0.05f);
		    canvas.setGState(state);
		    canvas.addImage(image);
		    canvas.restoreState();
			
		} finally {
			if(doc != null) {
				doc.close();
			}if(os != null) {
				os.close();
			}
		}

	}

}
