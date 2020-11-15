package p4_group_8_repo.Views;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * An interface for all the different views in the game.
 */
public interface GameViews {
    /**
     * Method to be implemented by all classes implementing the interface.
     *
     * @param stage Stage object that is the stage of the application
     * @return a Scene object to display the view
     */
    Scene view(Stage stage);

}