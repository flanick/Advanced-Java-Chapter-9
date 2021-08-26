import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
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

public class NameFormatterGridPane extends Application {

    //create label and textfield variables
    private Label resultLabel;
    private TextField fName;
    private TextField mName;
    private TextField lName;
    private TextField pTitle;


    public static void main(String[] args) {
        //launch application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
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
        Button button4 = new Button("Show Full Name with last Name First Including Title");
        Button button5 = new Button("Show Full Name with Last Name First");
        Button button6 = new Button("Show Last Name First");

        //set action for buttons
        button1.setOnAction(e -> resultLabel.setText(pTitle.getText() + " " + fName.getText() + " " + mName.getText() + " " + lName.getText()));
        button2.setOnAction(e -> resultLabel.setText(fName.getText() + " " + mName.getText() + " " + lName.getText()));
        button3.setOnAction(e -> resultLabel.setText(fName.getText() + " " + lName.getText()));
        button4.setOnAction(e -> resultLabel.setText(lName.getText() + ", " + fName.getText() + ", " + mName.getText() + ", " + pTitle.getText()));
        button5.setOnAction(e -> resultLabel.setText(lName.getText() + ", " + fName.getText() + ", " + mName.getText()));
        button6.setOnAction(e -> resultLabel.setText(lName.getText() + ", " + fName.getText()));

        //create an empty Label to display the result
        resultLabel = new Label();

        //add elements to gridpane
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.setAlignment(Pos.CENTER);


        grid.add(prompt1, 0, 0);
        grid.add(fName, 1, 0);
        grid.add(prompt2, 0, 1 );
        grid.add(mName, 1, 1);
        grid.add(prompt3, 0, 2);
        grid.add(lName, 1, 2);
        grid.add(prompt4, 0, 3);
        grid.add(pTitle, 1, 3);
        grid.add(button1, 2, 0);
        grid.add(button2, 2, 1);
        grid.add(button3, 2, 2);
        grid.add(button4, 2, 3);
        grid.add(button5, 2, 4);
        grid.add(button6, 2, 5);
        grid.add(resultLabel, 1, 8);

        //create a scene
        Scene scene = new Scene(grid, 700, 300);

        //add the Scene to the Stage
        primaryStage.setScene(scene);

        //Set the stage title
        primaryStage.setTitle("Name Formatter: Let's Play With Your Name!");

        //show the window
        primaryStage.show();
    }

}