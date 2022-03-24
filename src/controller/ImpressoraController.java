package controller;

import dao.ConexaoDAO;
import dao.ImpressoraDAO;
import helper.ImpressoraHelper;
import impressora.Impressao;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
=======
import java.sql.SQLException;
>>>>>>> e20416fd15dbb4c72e94afb8594711b6dcbb3dd7
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSize;
import javax.swing.JOptionPane;
import view.ViewCapaProcesso;



/**
 *
 * @author gabrielm
 */
public class ImpressoraController {
    
    private final ViewCapaProcesso view;
    private ImpressoraHelper helper;
    private Impressao impressora;
    private DocAttributeSet hasDoc;
<<<<<<< HEAD
    private ImpressoraDAO impressoraDAO;
    private ConexaoDAO conexao;
    private Connection connection;
=======
    private ImpressoraDAO impressoraDao;
    private ConexaoDAO conexao;
>>>>>>> e20416fd15dbb4c72e94afb8594711b6dcbb3dd7

    public ImpressoraController(ViewCapaProcesso view) {
        this.view = view;
        this.helper = new ImpressoraHelper(view);
        
        
    }
    
    public void imprimirCapa() throws FileNotFoundException, SQLException{
<<<<<<< HEAD
        ArrayList<String> processo = new ArrayList();
        impressora = helper.obterModelo();
        JOptionPane.showMessageDialog(view,"passei aqui " );
        connection = new ConexaoDAO().getConnection();
        impressoraDAO = new ImpressoraDAO(connection);
        JOptionPane.showMessageDialog(view,"conectei com o banco " + impressora.getConteudo1());
        processo = impressoraDAO.select(impressora.getConteudo1());
        
        JOptionPane.showMessageDialog(view,"Imprimindo processo Nº: " + processo.get(0));
=======
        
        String conteudo1 = impressora.getConteudo1();
              
        impressora = helper.obterModelo();
        impressoraDao.select(conteudo1);
        
        JOptionPane.showMessageDialog(view,"Imprimindo: " + impressora.getConteudo1());
>>>>>>> e20416fd15dbb4c72e94afb8594711b6dcbb3dd7
             
       
        PrintService[] printService = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE,null);
        PrintService impressoraPadrao = PrintServiceLookup.lookupDefaultPrintService();
        DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        HashDocAttributeSet hashDocAttributeSet = new HashDocAttributeSet();
        
        try{
            InputStream InputStream = new ByteArrayInputStream(impressora.getConteudo1().getBytes());
            Doc doc = new SimpleDoc(InputStream, docFlavor,hashDocAttributeSet);
            PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
            PrintService printServico = ServiceUI.printDialog(null, 300, 200, printService, impressoraPadrao, docFlavor, printRequestAttributeSet);
            if(printServico != null){
                DocPrintJob docPrintJob = printServico.createPrintJob();
                
                //mandar imprimir documento
                docPrintJob.print(doc, printRequestAttributeSet);
            }
        } catch (PrintException ex) {
            JOptionPane.showMessageDialog(view, ex);
        }
        
        //helper.limparTela();
        
      
    
    }

  
    
}
