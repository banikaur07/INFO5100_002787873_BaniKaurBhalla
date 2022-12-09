
import java.io.FileInputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.image.*;
import javafx.scene.image.Image;

import java.util.List;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Class to add image filters 
 */
public class ImageFilters implements EventHandler<ActionEvent> {
    private static Stage mainScreenStage;
    private static Scene mainScreenScene; 
    private static Button goBackButton;
    private static Scene filterScreenScene;
    private static List<File> imageFiles;
    private static VBox filterImageLayout;

    /**
     * Constructor
     * @param mainScreenStage
     * @param mainScreenScene
     */
    public ImageFilters(Stage mainScreenStage, Scene mainScreenScene) {
        this.mainScreenStage = mainScreenStage;
        this.mainScreenScene = mainScreenScene;

        // goBackButton
        goBackButton = new Button("Go Back");
        goBackButton.setOnAction(e -> {
            this.mainScreenStage.setScene(this.mainScreenScene);
            return;
        });

        Label filterImageLabel = new Label("Filtered Image Screen");
        filterImageLayout = new VBox(20);
        filterImageLayout.setAlignment(Pos.CENTER);

        filterImageLayout.getChildren().addAll(filterImageLabel, goBackButton);

        // Initialize currentFiltersScene
        filterScreenScene = new Scene(filterImageLayout, 5000, 5000);
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Filtering images!");

        FileChooser imageFileChooser = new FileChooser();
        imageFiles = imageFileChooser.showOpenMultipleDialog(mainScreenStage);

        if(imageFiles == null || imageFiles.size() == 0) {
            mainScreenStage.setScene(mainScreenScene);
            return;
        }

        for (File imageFile: imageFiles) {
            try {
                // Add black and white filter
                BufferedImage originalImage = ImageIO.read(imageFile);

                BufferedImage blackAndWhiteresult = new BufferedImage(
                    originalImage.getWidth(),
                    originalImage.getHeight(),
                        BufferedImage.TYPE_BYTE_BINARY);

                Graphics2D blackAndWhiteGraphic = blackAndWhiteresult.createGraphics();
                blackAndWhiteGraphic.drawImage(originalImage, 0, 0, Color.WHITE, null);
                blackAndWhiteGraphic.dispose();

                File output = new File("/tmp/tmp.png");
                ImageIO.write(blackAndWhiteresult, "png", output);

                FileInputStream input = new FileInputStream(output);
                Image updatedImage = new Image(input);
                ImageView imageView = new ImageView(updatedImage);
                imageView.setFitHeight(100);
                imageView.setFitWidth(100);
                
                Label imageData = new Label("Width: " + originalImage.getWidth() + " Height: " + originalImage.getHeight() + " Type: " + originalImage.getType());
                filterImageLayout.getChildren().addAll(imageView, imageData);

                // Add Tinted filter
                BufferedImage tintedResult = new BufferedImage(
                    originalImage.getWidth(),
                    originalImage.getHeight(),
                        BufferedImage.TYPE_BYTE_BINARY);
                Graphics2D tintedGraphics = tintedResult.createGraphics(); 
                Color newColor = new Color(251, 206, 177, 0);
                tintedGraphics.setXORMode(newColor);
                tintedGraphics.drawImage(originalImage, null, 0, 0);
                tintedGraphics.dispose();

                File output2 = new File("/tmp/tmp2.png");
                ImageIO.write(tintedResult, "png", output2);

                FileInputStream input2 = new FileInputStream(output2);
                Image updatedImage2 = new Image(input2);
                ImageView imageView2 = new ImageView(updatedImage2);
                imageView2.setFitHeight(100);
                imageView2.setFitWidth(100);

                Label imageData2 = new Label("Width: " + originalImage.getWidth() + " Height: " + originalImage.getHeight() + " type: " + originalImage.getType());
                filterImageLayout.getChildren().addAll(imageView2, imageData2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        mainScreenStage.setScene(filterScreenScene);
        mainScreenStage.show();
    }
}
