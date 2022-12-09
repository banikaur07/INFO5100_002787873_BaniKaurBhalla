import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import javafx.stage.Stage;

/*
 * Class to download images
 */
public class ImageDownloader implements EventHandler<ActionEvent> {
    private static List<File> imageFiles;
    private static Stage mainScreenStage;

    /**
     * Constructor
     * @param mainScreenStage
     * @param imageFiles
     */
    public ImageDownloader(Stage mainScreenStage, List<File> imageFiles) {
        this.imageFiles = imageFiles;
        this.mainScreenStage = mainScreenStage;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Downloading images!");

        // Use filesystem dialog to ask the extension from the user
        FileChooser downloadFileChooserDialog = new FileChooser();
        downloadFileChooserDialog.setInitialFileName("downloaded_file");
        downloadFileChooserDialog.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("JPG","*.jpg"),
            new FileChooser.ExtensionFilter("PNG","*.png")
        );

        // Get the absolute file from the user 
        File downloadedFile = downloadFileChooserDialog.showSaveDialog(mainScreenStage);
        convertImageFileFormatAndDownload(downloadedFile.getAbsolutePath(), this.imageFiles);
    }

    /**
     * Convert Image File Format
     * @param imageFilePath
     * @param imageFiles
     */
    private void convertImageFileFormatAndDownload(String imageFilePath, List<File> imageFiles){
        if (imageFiles.size() == 0 || imageFilePath.length() == 0){
            return;
        }

        String folderName = imageFilePath.substring(0, imageFilePath.lastIndexOf('.'));
        String fileExtentionName = imageFilePath.substring(imageFilePath.lastIndexOf('.'));

        for (File imageFile: imageFiles) {
            String currentImageFilePath = imageFile.getName();
            String currentImageFileName = currentImageFilePath.substring(0, currentImageFilePath.lastIndexOf('.'));
            String newDestinationFilePath = folderName + currentImageFileName + fileExtentionName;

            try {
                BufferedImage image = ImageIO.read(new File(imageFile.getPath()));
                String format = fileExtentionName.substring(1);
                File outputfile = new File(newDestinationFilePath);
                ImageIO.write(image, format, outputfile);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("File downloaded: " + newDestinationFilePath);
        }
    }
}
