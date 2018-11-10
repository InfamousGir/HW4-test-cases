/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author BAEtesting
 */

/**
 *
 * @author Alejandro
 */
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.R;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BoardGUIBase extends Application {

    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final SeparatorMenuItem separatorMenuItem;
    protected final MenuItem menuItem1;
    protected final MenuItem menuItem2;
    protected final MenuItem menuItem3;
    protected final MenuItem menuItem4;
    protected final SeparatorMenuItem separatorMenuItem0;
    protected final MenuItem menuItem5;
    protected final SeparatorMenuItem separatorMenuItem1;
    protected final MenuItem menuItem6;
    protected final Menu menu1;
    protected final MenuItem menuItem7;
    protected final MenuItem menuItem8;
    protected final SeparatorMenuItem separatorMenuItem2;
    protected final MenuItem menuItem9;
    protected final MenuItem menuItem10;
    protected final MenuItem menuItem11;
    protected final MenuItem menuItem12;
    protected final SeparatorMenuItem separatorMenuItem3;
    protected final MenuItem menuItem13;
    protected final MenuItem menuItem14;
    protected final Menu menu2;
    protected final MenuItem menuItem15;
    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final ImageView imageView;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView boardTrainCard1;
    protected final ImageView boardTrainCard2;
    protected final ImageView boardTrainCard3;
    protected final ImageView pH1;
    protected final ImageView pH2;
    protected final ImageView pH3;
    protected final ImageView pH4;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button boardCard1;
    protected final Button boardCard2;
    protected final Button boardCard3;
    protected final Button playerHand1;
    protected final Button playerHand2;
    protected final Button playerHand3;
    protected final Button playerHand4;
    protected VBox v;

    public BoardGUIBase() {

        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu0 = new Menu();
        separatorMenuItem = new SeparatorMenuItem();
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        menuItem3 = new MenuItem();
        menuItem4 = new MenuItem();
        separatorMenuItem0 = new SeparatorMenuItem();
        menuItem5 = new MenuItem();
        separatorMenuItem1 = new SeparatorMenuItem();
        menuItem6 = new MenuItem();
        menu1 = new Menu();
        menuItem7 = new MenuItem();
        menuItem8 = new MenuItem();
        separatorMenuItem2 = new SeparatorMenuItem();
        menuItem9 = new MenuItem();
        menuItem10 = new MenuItem();
        menuItem11 = new MenuItem();
        menuItem12 = new MenuItem();
        separatorMenuItem3 = new SeparatorMenuItem();
        menuItem13 = new MenuItem();
        menuItem14 = new MenuItem();
        menu2 = new Menu();
        menuItem15 = new MenuItem();
        anchorPane = new AnchorPane();
        label = new Label();
        imageView = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        pH1 = new ImageView();
        pH2 = new ImageView();
        pH3 = new ImageView();
        pH4 = new ImageView();
        boardTrainCard1 = new ImageView();
        boardTrainCard2 = new ImageView();        
        boardTrainCard3 = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        boardCard1 = new Button();
        boardCard2 = new Button();
        boardCard3 = new Button();
        playerHand1 = new Button();
        playerHand2 = new Button();
        playerHand3 = new Button();
        playerHand4 = new Button();
        v = new VBox();



    }
    public VBox setScene(){   
        
        //Setting up string array to hold city strings in order to pass to controller
        String[] cityArray = new String[2];

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("New");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Open…");

        menu0.setMnemonicParsing(false);
        menu0.setText("Open Recent");

        separatorMenuItem.setMnemonicParsing(false);

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Close");

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Save");

        menuItem3.setMnemonicParsing(false);
        menuItem3.setText("Save As…");

        menuItem4.setMnemonicParsing(false);
        menuItem4.setText("Revert");

        separatorMenuItem0.setMnemonicParsing(false);

        menuItem5.setMnemonicParsing(false);
        menuItem5.setText("Preferences…");

        separatorMenuItem1.setMnemonicParsing(false);

        menuItem6.setMnemonicParsing(false);
        menuItem6.setText("Quit");

        menu1.setMnemonicParsing(false);
        menu1.setText("Edit");

        menuItem7.setMnemonicParsing(false);
        menuItem7.setText("Undo");

        menuItem8.setMnemonicParsing(false);
        menuItem8.setText("Redo");

        separatorMenuItem2.setMnemonicParsing(false);

        menuItem9.setMnemonicParsing(false);
        menuItem9.setText("Cut");

        menuItem10.setMnemonicParsing(false);
        menuItem10.setText("Copy");

        menuItem11.setMnemonicParsing(false);
        menuItem11.setText("Paste");

        menuItem12.setMnemonicParsing(false);
        menuItem12.setText("Delete");

        separatorMenuItem3.setMnemonicParsing(false);

        menuItem13.setMnemonicParsing(false);
        menuItem13.setText("Select All");

        menuItem14.setMnemonicParsing(false);
        menuItem14.setText("Unselect All");

        menu2.setMnemonicParsing(false);
        menu2.setText("Help");

        menuItem15.setMnemonicParsing(false);
        menuItem15.setText("About MyHelloApp");
        
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(346.0);
        label.setLayoutY(176.0);
        label.setStyle("");
        label.setText("Drag components from Library here…");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#9f9f9f"));
        label.setWrapText(false);
        label.setFont(new Font(18.0));

        imageView.setFitHeight(571.0);
        imageView.setFitWidth(849.0);
        imageView.setLayoutX(26.0);
        imageView.setImage(new Image(getClass().getResource("ticket_to_ride_map.jpg").toExternalForm()));
        
        imageView1.setFitHeight(80.0);
        imageView1.setFitWidth(134.0);
        imageView1.setLayoutX(935);
        imageView1.setLayoutY(71);
        imageView1.setImage(new Image(getClass().getResource("Back2.jpg").toExternalForm()));
        
         // Button to draw Train Cards
        imageView1.setFitHeight(80.0);
        imageView1.setFitWidth(134.0);
        imageView1.setImage(new Image(getClass().getResource("Back2.jpg").toExternalForm()));
        
 
        Button button3 = new Button("Train Cards Draw");
        button3.setLayoutX(935);
        button3.setLayoutY(71);
        button3.setGraphic(imageView1);
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                //hand.drawTrainCard();
            }
        });
        
        
        // Button for Destination Cards
        imageView2.setFitHeight(80.0);
        imageView2.setFitWidth(134.0);
        imageView2.setImage(new Image(getClass().getResource("Back2.jpg").toExternalForm()));
        
        Button button4 = new Button("Destination Cards Draw");
        button4.setLayoutX(915);
        button4.setLayoutY(750);
        button4.setGraphic(imageView2);
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                //hand.drawTrainCard(deck);
            }
        });
        
       
        
         // Board Train Card 1
        boardTrainCard1.setFitHeight(80.0);
        boardTrainCard1.setFitWidth(134.0);
        boardTrainCard1.setImage(new Image(getClass().getResource("Green.jpg").toExternalForm()));
         
        Button boardCard1 = new Button("Sample Board Card");
        boardCard1.setLayoutX(935);
        boardCard1.setLayoutY(200);
        boardCard1.setGraphic(boardTrainCard1);
        boardCard1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                //drawTrainCard(tc);
            }
        });

        


        // Board Train Card 2
        boardTrainCard2.setFitHeight(80.0);
        boardTrainCard2.setFitWidth(134.0);
        boardTrainCard2.setImage(new Image(getClass().getResource("Locomotive.jpg").toExternalForm()));
         
        Button boardCard2 = new Button("Sample Board Card");
        boardCard2.setLayoutX(935);
        boardCard2.setLayoutY(330);
        boardCard2.setGraphic(boardTrainCard2);
        boardCard2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

            }
        });

        // Board Train Card 3
        boardTrainCard3.setFitHeight(80.0);
        boardTrainCard3.setFitWidth(134.0);
        boardTrainCard3.setImage(new Image(getClass().getResource("Black.jpg").toExternalForm()));
         
        Button boardCard3 = new Button("Sample Board Card");
        boardCard3.setLayoutX(935);
        boardCard3.setLayoutY(460);
        boardCard3.setGraphic(boardTrainCard3);
        boardCard3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

            }
        });
        
        // Sample Player Hand 1
        pH1.setFitHeight(80.0);
        pH1.setFitWidth(134.0);
        pH1.setImage(new Image(getClass().getResource("Black.jpg").toExternalForm()));
         
        Button playerHand1 = new Button("Sample Hand");
        playerHand1.setLayoutX(30);
        playerHand1.setLayoutY(630);
        playerHand1.setGraphic(pH1);
        playerHand1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

            }
        });
        
        // Sample Player Hand 2
        pH2.setFitHeight(80.0);
        pH2.setFitWidth(134.0);
        pH2.setImage(new Image(getClass().getResource("Red.jpg").toExternalForm()));
         
        Button playerHand2 = new Button("Sample Hand");
        playerHand2.setLayoutX(270);
        playerHand2.setLayoutY(630);
        playerHand2.setGraphic(pH2);
        playerHand2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

            }
        });
        
        // Sample Player Hand 3
        pH3.setFitHeight(80.0);
        pH3.setFitWidth(134.0);
        pH3.setImage(new Image(getClass().getResource("Locomotive.jpg").toExternalForm()));
         
        Button playerHand3 = new Button("Sample Hand");
        playerHand3.setLayoutX(510);
        playerHand3.setLayoutY(630);
        playerHand3.setGraphic(pH3);
        playerHand1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

            }
        });
        
        // Sample Player Hand 4
        pH4.setFitHeight(80.0);
        pH4.setFitWidth(134.0);
        pH4.setImage(new Image(getClass().getResource("Locomotive.jpg").toExternalForm()));
         
        Button playerHand4 = new Button("Sample Hand");
        playerHand4.setLayoutX(30);
        playerHand4.setLayoutY(740);
        playerHand4.setGraphic(pH4);
        playerHand1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

            }
        });


        button.setId("SanFrancisco");
        button.setLayoutX(37.0);
        button.setLayoutY(326.0);
        button.setMnemonicParsing(false);
        button.setText("San Francisco");
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                if(cityArray[0] == null){
                 //String btnText = ((Button)findViewById(R.id.my_Button)).getText().toString();
                 cityArray[0] = "SanFrancisco";
                }
                else if(cityArray[1] == null){
                //String btnText = ((Button)findViewById(R.id.my_Button)).getText().toString();
                cityArray[1] = "SanFrancisco";
                
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button0.setId("LosAngeles");
        button0.setLayoutX(99.0);
        button0.setLayoutY(416.0);
        button0.setMnemonicParsing(false);
        button0.setText("Los Angeles");
        
        button0.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "LosAngeles";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "LosAngeles";
                
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1.setId("Porland");
        button1.setLayoutX(64.0);
        button1.setLayoutY(163.0);
        button1.setMnemonicParsing(false);
        button1.setText("Portland");
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Portland";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Portland";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button2.setId("Seatle");
        button2.setLayoutX(84.0);
        button2.setLayoutY(121.0);
        button2.setMnemonicParsing(false);
        button2.setText("Seattle");
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Seatle";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Seattle";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });
        
        

        menu.getItems().add(menuItem);
        menu.getItems().add(menuItem0);
        menu.getItems().add(menu0);
        menu.getItems().add(separatorMenuItem);
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);
        menu.getItems().add(menuItem4);
        menu.getItems().add(separatorMenuItem0);
        menu.getItems().add(menuItem5);
        menu.getItems().add(separatorMenuItem1);
        menu.getItems().add(menuItem6);
        menuBar.getMenus().add(menu);
        menu1.getItems().add(menuItem7);
        menu1.getItems().add(menuItem8);
        menu1.getItems().add(separatorMenuItem2);
        menu1.getItems().add(menuItem9);
        menu1.getItems().add(menuItem10);
        menu1.getItems().add(menuItem11);
        menu1.getItems().add(menuItem12);
        menu1.getItems().add(separatorMenuItem3);
        menu1.getItems().add(menuItem13);
        menu1.getItems().add(menuItem14);
        menuBar.getMenus().add(menu1);
        menu2.getItems().add(menuItem15);
        menuBar.getMenus().add(menu2);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(imageView1);
         anchorPane.getChildren().add(imageView2);
        anchorPane.getChildren().add(boardTrainCard1);
        anchorPane.getChildren().add(boardTrainCard2);
        anchorPane.getChildren().add(boardTrainCard3);
        anchorPane.getChildren().add(pH1);
        anchorPane.getChildren().add(pH2);
        anchorPane.getChildren().add(pH3);
        anchorPane.getChildren().add(pH4);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(button1);
        anchorPane.getChildren().add(button2);
        anchorPane.getChildren().add(button3);
        anchorPane.getChildren().add(button4);
        anchorPane.getChildren().add(boardCard1);
        anchorPane.getChildren().add(boardCard2);
        anchorPane.getChildren().add(boardCard3);
        anchorPane.getChildren().add(playerHand1);
        anchorPane.getChildren().add(playerHand2);
        anchorPane.getChildren().add(playerHand3);
        anchorPane.getChildren().add(playerHand4);
        return v;
    }


    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ticket to Ride");
        GridPane p = new GridPane();
        p.getChildren().add(setScene());
        Scene scene = new Scene(p, 1200, 850);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
