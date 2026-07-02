package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("User Login");

        Label lblUsername = new Label("Username");

        TextField txtUsername = new TextField();

        Label lblPassword = new Label("Password");

        PasswordField txtPassword = new PasswordField();

        Button btnLogin = new Button("Sign In");
        Label lblMessage = new Label();

        VBox root = new VBox();

        root.setSpacing(10);

        root.setPadding(new Insets(20));

        root.getChildren().addAll(
                title,
                lblUsername,
                txtUsername,
                lblPassword,
                txtPassword,
                btnLogin,
                lblMessage
        );

        Scene scene = new Scene(root,350,250);

        stage.setTitle("Company Login System");

        stage.setScene(scene);

        btnLogin.setOnAction(event -> {

            String username = txtUsername.getText();

            lblMessage.setText("Hello " + username + ", Login Successful!");

        });

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}