import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import javafx.scene.image.*;
import java.util.List;

/*
 * Class to upload images
 */
public class ImageUploader implements EventHandler<ActionEvent> {
    private static Stage mainScreenStage;
    private static Scene mainScreenScene;
    private static Scene uploadImageScreenScene;
    private static Button downloadImageButton;
    private static Button goBackButton;
    private static List<File> imageFiles;
    private static FileChooser imageFileChooser = new FileChooser();
    private static VBox uploadImageLayout;

    public ImageUploader(Stage mainScreenStage, Scene mainScreenScene) {
        this.mainScreenStage = mainScreenStage;
        this.mainScreenScene = mainScreenScene;

        // downloadImageButton
        downloadImageButton = new Button("Download Images");

        // goBackButton
        goBackButton = new Button("Go Back");
        goBackButton.setOnAction(e -> {
            this.mainScreenStage.setScene(this.mainScreenScene);
            return;
        });

        // create label
        Label uploadImagelabel = new Label("Display Uploaded Images Screen");
        uploadImageLayout = new VBox(20);
        uploadImageLayout.setAlignment(Pos.TOP_CENTER);

        // Create Upload layout
        HBox uploadImageHbox = new HBox(50);
        uploadImageHbox.setAlignment(Pos.CENTER);
        uploadImageHbox.getChildren().addAll(downloadImageButton, goBackButton);

        uploadImageLayout.getChildren().addAll(uploadImagelabel, uploadImageHbox);

        // Upload Image Screen Scene
        uploadImageScreenScene = new Scene(uploadImageLayout, 5000, 5000);
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Uploading images!");

        // Allow the user to upload images
        imageFiles = imageFileChooser.showOpenMultipleDialog(mainScreenStage);

        // return to main screen if no images were uploaded
        if (imageFiles == null || imageFiles.size() == 0){
            return;
        }

        // upload images
        for (File imageFile: imageFiles) {
            try{
                FileInputStream input = new FileInputStream(imageFile);
                Image image = new Image(input);
                ImageView imageView = new ImageView(image);
                imageView.setFitHeight(100);
                imageView.setFitWidth(100);

                Label imageData = new Label("Width: " + image.getWidth() + " Height: " + image.getHeight());
                uploadImageLayout.getChildren().addAll(imageView, imageData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Set the Scene
        mainScreenStage.setScene(uploadImageScreenScene);
        downloadImageButton.setOnAction(new ImageDownloader(mainScreenStage, imageFiles));
        mainScreenStage.show();
    }
}
