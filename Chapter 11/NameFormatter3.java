import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * Create a JavaFX app that lets the user enter the following pieces of data
 * user's first name
 * user's middle name
 * user's last name
 * user's preferred title
 * and program will have buttons that display the user's name formatted 6 different ways
 */

public class NameFormatter3 extends Application {

    //create label and textfield variables
    private Label resultLabel;
    private TextField fName;
    private TextField mName;
    private TextField lName;
    private TextField pTitle;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;


    public static void main(String[] args) {
        //launch application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //create labels to prompt user
        Label prompt1 = new Label("Enter your first name:");
        Label prompt2 = new Label("Enter your middle name:");
        Label prompt3 = new Label("Enter your last name:");
        Label prompt4 = new Label("Enter your preferred title:");

        //Create textfields for input
        fName = new TextField();
        mName = new TextField();
        lName = new TextField();
        pTitle = new TextField();

        //create buttons to show different name formats
        Button button1 = new Button("Show Full Name with Title");
        Button button2 = new Button("Show Full Name");
        Button button3 = new Button("Show First and Last Name Only");
        Button button4 = new Button("Show Full name with last name first including title");
        Button button5 = new Button("Show Full name with last name first");
        Button button6 = new Button("Show Last name first");

       //register the events
        button1.setOnAction(new buttonHandler());
        button2.setOnAction(new buttonHandler());
        button3.setOnAction(new buttonHandler());
        button4.setOnAction(new buttonHandler());
        button5.setOnAction(new buttonHandler());
        button6.setOnAction(new buttonHandler());

         //create an empty Label to display the result
        resultLabel = new Label();

        //put the promptLabels and the textFields in a HBox
        HBox hbox = new HBox(10, prompt1, fName, prompt2, mName, prompt3, lName, prompt4, pTitle);

        //put the HBox, buttons, and resultLabel in a HBox
        HBox hbox2 = new HBox(10, button1, button2, button3, button4, button5, button6);

        //put the Hbox and Hbox2 into a vbox
        VBox vbox = new VBox(10, hbox, hbox2, resultLabel);

        //set the VBox's alignment to center
        hbox.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);

        //set the VBox's padding to 10 pixels
        hbox.setPadding(new Insets(10));
        hbox.setPadding(new Insets(10));
        vbox.setPadding(new Insets(10));

        //create a scene
        Scene scene = new Scene(vbox);

        //add the Scene to the Stage
        primaryStage.setScene(scene);

        //Set the stage title
        primaryStage.setTitle("Name Formatter: Let's Play With Your Name!");

        //show the window
        primaryStage.show();
    }

   class buttonHandler implements EventHandler<ActionEvent>{

       @Override
       public void handle(ActionEvent event) {

           if (event.getSource() == button1){
               resultLabel.setText(pTitle.getText() + " " + fName.getText() + " " + mName.getText() + " " + lName.getText());
           }
           else if (event.getSource() == button2){
               resultLabel.setText(fName.getText() + " " + mName.getText() + " " + lName.getText());
           }
           else if (event.getSource() == button3){
               resultLabel.setText(fName.getText() + " " + lName.getText());
           }
           else if (event.getSource() == button4){
               resultLabel.setText(lName.getText() + ", " + fName.getText() + ", " + mName.getText() + ", " + pTitle.getText());
           }
           else if (event.getSource() == button5){
               resultLabel.setText(lName.getText() + ", " + fName.getText() + ", " + mName.getText());
           }
           else {
               resultLabel.setText(lName.getText() + ", " + fName.getText());
           }

       }
   }


}