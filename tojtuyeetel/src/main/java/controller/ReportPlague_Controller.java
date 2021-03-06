
package controller;

import exceptions.EmptyException;
import exceptions.MyException;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import model.CRUD.ReportCRUD;
import model.CRUD.UserCRUD;
import model.schemas.Report;
import org.hibernate.HibernateException;
import view.ReportPlague_UI;

/**
 * Controller class to manage the corresponding view to report a plague
 * 
 */
public class ReportPlague_Controller {
    
    /**
     * Method to create a new plague report
     * @param view 
     * @throws exceptions.EmptyException 
     */
    public void report_crop(ReportPlague_UI view) throws EmptyException
 {
  ReportCRUD crud = new ReportCRUD();

  //Aqui las cosas a validar. Tienen que estar todas en 1 para continuar.
  int campos = 0; //campos llenos

  //Verificar que no haya informacion vacia
  if (view.titulo.getText().isEmpty() == false && //Titulo de reporte
      view.tipoplaga.getSelectedItem().toString().isEmpty() == false && //Tipo de plaga
      view.descripcao.getText().isEmpty () == false
     )
  {
   campos = 1;
  }

  //Enviar cosas al model si todo esta en orden
  if (campos == 1)
  {
      try{
          UserCRUD crud2 = new UserCRUD();
            Report reporte = new Report();
            reporte.setUser(crud2.getUserByEmail("alextorre@correo.com"));
            reporte.setTitle(view.titulo.getText());
            reporte.setPlague(view.tipoplaga.getSelectedItem().toString());
            reporte.setDescription(view.descripcao.getText());

            crud.createReport(reporte);
      }
      
      catch(HibernateException ex){
          view.showHibernateExceptions(ex);
      }
      catch(PersistenceException ex){
          view.showPersistenceExceptions(ex);
       }
   
  }
  else //EXCEPCIONES
  {
   if (campos == 0)
   {
    throw new EmptyException();
   }
  }
 }
}
