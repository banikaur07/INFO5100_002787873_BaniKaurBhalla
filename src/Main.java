import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    // Button to Upload Images
    private static Button uploadButton;

    // Button to Filter Images
    private static Button filterButton;

    // Image Uploader Service
    private static ImageUploader imageUploader;

    // Image Uploader Service
    private static ImageFilters imageFilters;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainScreenStage) throws Exception {
        VBox layout = new VBox(50);
        layout.setPadding(new Insets(100));
        layout.setAlignment(Pos.CENTER);

        // Heading Label
        Label headingLabel = new Label("INFO 5100: Image Management Tool");
        
        // Upload Button
        uploadButton = new Button();
        uploadButton.setText("Upload Images");

        // Filter Button
        filterButton = new Button();
        filterButton.setText("Add Color Filters to Images");

        // add buttons to layout
        layout.getChildren().addAll(headingLabel, uploadButton, filterButton);

        // Scene
        Scene scene = new Scene(layout, 800, 800);
        mainScreenStage.setScene(scene);
        mainScreenStage.setTitle("INFO 5100: Image Management Tool");

        // add onclick listener on uploadButton
        imageUploader = new ImageUploader(mainScreenStage, scene);
        uploadButton.setOnAction(imageUploader);

        // add onclick listener on filterButton
        imageFilters = new ImageFilters(mainScreenStage, scene);
        filterButton.setOnAction(imageFilters);

        mainScreenStage.show();
    }
}