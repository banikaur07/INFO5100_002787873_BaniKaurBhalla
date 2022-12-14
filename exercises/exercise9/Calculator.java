package exercises.exercise9;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to showcase all basic operations of a calculator
 */
public class Calculator extends Application {
  private static final String[][] calculatorButtons = {
    {
      "7",
      "8",
      "9",
      "/"
    },
    {
      "4",
      "5",
      "6",
      "*"
    },
    {
      "1",
      "2",
      "3",
      "-"
    },
    {
      "0",
      "c",
      "=",
      "+"
    }
  };

  private final Map <String, Button> keyPressedHashmap = new HashMap < > ();
  private DoubleProperty prevValue = new SimpleDoubleProperty();
  private DoubleProperty currentValue = new SimpleDoubleProperty();

  private enum OpType {
    NOOP,
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
  }

  private OpType currentOperator = OpType.NOOP;
  private OpType prevOperator = OpType.NOOP;

  public static void main(String[] args) {
    launch(args);
  }

  @Override public void start(Stage mainScreenStage) {
    // 1. Create Basic Calculator textScreen
    final TextField textScreen = new TextField();
    textScreen.textProperty().bind(Bindings.format("%.0f", currentValue));

    // 2. Add Buttons to Calculator Screen 
    TilePane buttonTiles = new TilePane();
    buttonTiles.setVgap(25);
    buttonTiles.setHgap(25);
    buttonTiles.setPrefColumns(calculatorButtons[0].length);
    for (String[] buttonTypes: calculatorButtons) {
      for (String type: buttonTypes) {
        buttonTiles.getChildren().add(createButtonByType(type));
      }
    }

    // 3. Create Layout
    final VBox layout = new VBox(50);
    layout.setAlignment(Pos.CENTER);
    layout.getChildren().setAll(textScreen, buttonTiles);

    layout.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler < KeyEvent > () {
      @Override
      public void handle(KeyEvent keyEvent) {
        Button keyPressed = keyPressedHashmap.get(keyEvent.getText());
        if (keyPressed != null) {
          keyPressed.fire();
        }
      }
    });

    textScreen.prefWidthProperty().bind(buttonTiles.widthProperty());

    // 4. Create Scene
    mainScreenStage.setScene(new Scene(layout, 200, 300));

    // 5. Show MainScreen
    mainScreenStage.show();
  }

  /**
   * Method to Create a button by type
   */
  private Button createButtonByType(String type) {
    Button newButton = new Button(type);
    keyPressedHashmap.put(type, newButton);
    newButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

    if (type != null && type.matches("[0-9]")) {
      // Handle number buttons
      newButton.setOnAction(new EventHandler < ActionEvent > () {
        @Override
        public void handle(ActionEvent actionEvent) {
          if (currentOperator == OpType.NOOP) {
            currentValue.set(currentValue.get() * 10 + Integer.parseInt(type));
          } else {
            prevValue.set(currentValue.get());
            currentValue.set(Integer.parseInt(type));
            prevOperator = currentOperator;
            currentOperator = OpType.NOOP;
          }
        }
      });
    } else {
      //  Handle Operator Buttons
      final ObjectProperty <OpType> triggerOperator = new SimpleObjectProperty < > (OpType.NOOP);
      switch (type) {
      case "+":
      triggerOperator.set(OpType.ADD);
        break;

      case "-":
      triggerOperator.set(OpType.SUBTRACT);
        break;

      case "*":
      triggerOperator.set(OpType.MULTIPLY);
        break;

      case "/":
      triggerOperator.set(OpType.DIVIDE);
        break;
      }

      if (triggerOperator.get() != OpType.NOOP) {
        newButton.setOnAction(new EventHandler < ActionEvent > () {
          @Override
          public void handle(ActionEvent actionEvent) {
            currentOperator = triggerOperator.get();
          }
        });
      } else if (type != null && "c".equals(type)) {
        newButton.setOnAction(new EventHandler < ActionEvent > () {
          @Override
          public void handle(ActionEvent actionEvent) {
            currentValue.set(0);
          }
        });
      } else if (type != null && "=".equals(type)) {
        newButton.setOnAction(new EventHandler < ActionEvent > () {
          @Override
          public void handle(ActionEvent actionEvent) {
            switch (prevOperator) {
            case ADD:
              currentValue.set(prevValue.get() + currentValue.get());
              break;
            case SUBTRACT:
              currentValue.set(prevValue.get() - currentValue.get());
              break;
            case MULTIPLY:
              currentValue.set(prevValue.get() * currentValue.get());
              break;
            case DIVIDE:
              currentValue.set(prevValue.get() / currentValue.get());
              break;
            }
          }
        });
      }
    }

    return newButton;
  }
}