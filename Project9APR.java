
package project9apr;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Project9APR extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button  label = new Button("2048");   // i used butoon as label  
        label.setMinSize(230,60);// setting the size
        label.setStyle("-fx-background-color: #FFEFD5;");// setting the color for this button
                
        
        Button newGame = new Button(" NEW GAME ");  // creating new button for new  game
        newGame.setMinSize(230,60);
        newGame.setStyle("-fx-font-size: 20pt;");//setting the size
        newGame.setStyle("-fx-background-color:#DDA0DD;");//setiting the style
        
        
        
//        Button exit = new Button(" EXIT "); //creating new button for exit
//        exit.setMinSize(230, 60);
//        exit.setStyle("-fx-font-size: 30pt;");
//        exit.setStyle("-fx-font-weight: bold;");
//        exit.setStyle("-fx-background-color:#DA70D6;");
//        exit.setOnAction(e -> primaryStage.close());//setting action on exit button to exit the game
        
        
        
        Button about = new Button(" ABOUT ");//creating new button for about button
        about.setMinSize(230,60);
        about.setStyle("-fx-font-size: 20pt");
        about.setStyle("-fx-background-color: #BA55D3 ");
  
        VBox vb2 = new VBox();
        Label aboutInfo = new Label(" Game 2048 was made by Ryspayeva Anel \n Designed in SDU \n Version 1109.99  ");//#A9
        Button back1 = new Button(" BACK ");// creating button back to go back to main menue
        
        back1.setStyle("-fx-background-color:#FFFFCC;");
        back1.setMinSize(130, 60);
        vb2.getChildren().addAll(aboutInfo, back1);
        back1.setAlignment(Pos.CENTER);
        Scene sceneabout = new Scene(vb2,350,500);
        about.setOnAction(e -> primaryStage.setScene(sceneabout)); //setting action to the button about and changing scenes
        
        vb2.setAlignment(Pos.CENTER);
        vb2.setSpacing(20);
        vb2.setStyle("-fx-background-color: linear-gradient(#ff99ff, #ccff66)");//settting the style to background 
                                                                                  //in about scene
         Button exit = new Button(" EXIT "); //creating new button for exit
        exit.setMinSize(230, 60);
        exit.setStyle("-fx-font-size: 30pt;");
        exit.setStyle("-fx-font-weight: bold;");
        exit.setStyle("-fx-background-color:#DA70D6;");
        exit.setOnAction(e -> primaryStage.close());//setting action on exit button to exit the game
        
        VBox vb3 = new VBox();
               
       
        Pane pane = new Pane();//creating pane
        Scene scenenewGame = new Scene(pane, 350,500);//adding the scene to the pane
        newGame.setOnAction(e -> primaryStage.setScene(scenenewGame));//setting the action
       
        //pane.setStyle("-fx-background-image:url('/Users/anelyaastana/Desktop/back2048.jpg');");
          pane.setStyle("-fx-background-color: linear-gradient(#ff99ff, #ccff66)");
        Main game = new Main(scenenewGame);//class main stsrting the game
        
        
        game.getGroup().relocate(75,150);// changes te position of the game
         Button back2 = new Button(" BACK ");
         back2.setStyle("-fx-background-color:#FFFFCC;");
         
        back2.setMinSize(230, 60);
        vb3.getChildren().addAll( back2);
        vb3.setSpacing(20);
        pane.getChildren().addAll(game.getGroup(),back2);
              
        
        VBox vb = new VBox();
        vb.getChildren().addAll(label,  newGame, exit, about);
        
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(20);
        vb.setStyle("-fx-background-color: linear-gradient(#ccff66, #ff99ff)");
        
        
        
       
        
        Scene sc = new Scene(vb, 350, 500);
        primaryStage.setScene(sc);
        primaryStage.show();
        
        
        back1.setOnAction(e -> primaryStage.setScene(sc));
        back2.setOnAction(e -> primaryStage.setScene(sc));
                
      
        primaryStage.show();

    }

    /**
     * @anelyasti4
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
