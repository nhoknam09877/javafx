/*package movie;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Long1 {
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;

   public void signin(){
       String sql="SELECT*FROM admin";
       connect=Database.connectDB();
       try {
           prepare=connect.prepareStatement(sql);
           prepare.setString(1,signIn_username.getText());
           prepare.setString(2,sigIn_password.getText());
           Alert alert;

           if (signIn_username.getText().isEmpty() || sigIn_password.getText().isEmpty()){

               alert = new Alert(Alert.AlertType.ERROR);
               alert.setTitle("Error Massage");
               alert.setHeaderText(null);
               alert.setContentText("Please fill all blank fields");
               alert.showAndWait();
/*

           }else {
               if (result.next()){
                   alert =new Alert(Alert.AlertType.INFORMATION);
                   alert.setTitle("Information Message");
                   alert.setHeaderText(null);
                   alert.setContentText("Succcessfully Login!");
                   alert.showAndWait();
               }else {
                   alert =new Alert(Alert.AlertType.ERROR);
                   alert.setTitle("Error Massage");
                   alert.setHeaderText(null);
                   alert.setContentText("Wrong Username/Password");
                   alert.showAndWait();
               }
           }


       }catch (Exception e){
           e.printStackTrace();
       }
   }
}

 */

