/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.util.Callback;

/**
 *
 * @author izzai
 */
public class Main extends Application {
    private final TableView<Schedule> table = new TableView<>();
    private final ObservableList<Schedule> data = FXCollections.observableArrayList();
    final HBox hBox = new HBox();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Aplikasi Jadwal Kuliah");
        stage.setWidth(1050);
        stage.setHeight(650);

        final Label label = new Label("Jadwal Kuliah");
        label.setFont(Font.font("Poppins", FontWeight.BOLD, 50));

        table.setEditable(true);

        TableColumn nameCol = new TableColumn("Nama Dosen");
        nameCol.setMinWidth(200);
        nameCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Schedule, String>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Schedule, String> p) {
                return p.getValue().nameProperty();
            }
        });

        TableColumn courseCol = new TableColumn("Mata Kuliah");
        courseCol.setMinWidth(200);
        courseCol.setCellValueFactory(new PropertyValueFactory<Schedule, String>("Mata Kuliah"));
        courseCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Schedule, String>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Schedule, String> p) {
                return p.getValue().courseProperty();
            }
        });

        TableColumn gkbCol = new TableColumn("GKB");
        gkbCol.setMinWidth(200);
        gkbCol.setCellValueFactory(new PropertyValueFactory<Schedule, String>("GKB"));
        gkbCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Schedule, String>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Schedule, String> p) {
                return p.getValue().gkbProperty();
            }
        });

        TableColumn timeCol = new TableColumn("Waktu");
        timeCol.setMinWidth(200);
        timeCol.setCellValueFactory(new PropertyValueFactory<Schedule, String>("Waktu"));
        timeCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Schedule, String>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Schedule, String> p) {
                return p.getValue().timeProperty();
            }
        });

        TableColumn roomCol = new TableColumn("Ruangan");
        roomCol.setMinWidth(200);
        roomCol.setCellValueFactory(new PropertyValueFactory<Schedule, String>("Ruangan"));
        roomCol
                .setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Schedule, String>, ObservableValue>() {
                    @Override
                    public ObservableValue call(TableColumn.CellDataFeatures<Schedule, String> p) {
                        return p.getValue().roomProperty();
                    }
                });

        table.getColumns().add(nameCol);
        table.getColumns().add(courseCol);
        table.getColumns().add(gkbCol);
        table.getColumns().add(timeCol);
        table.getColumns().add(roomCol);
        table.setItems(data);

        final TextField addName = new TextField();
        addName.setPromptText("Nama Dosen");
        addName.setMaxWidth(nameCol.getPrefWidth());

        final TextField addCourse = new TextField();
        addCourse.setPromptText("Mata Kuliah");
        addCourse.setMaxWidth(courseCol.getPrefWidth());

        final TextField addGkb = new TextField();
        addGkb.setPromptText("GKB");
        addGkb.setMaxWidth(gkbCol.getPrefWidth());
        addGkb.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                    String newValue) {
                if (!newValue.matches("\\d*")) {
                    addGkb.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        final TextField addTime = new TextField();
        addTime.setPromptText("Waktu");
        addTime.setMaxWidth(timeCol.getPrefWidth());

        final TextField addRoom = new TextField();
        addRoom.setPromptText("Ruangan");
        addRoom.setMaxWidth(roomCol.getPrefWidth());

        final Button addButton = new Button("Add");
        addButton.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        addButton.setTextFill(Color.BLACK);
        addButton.setBorder(new Border(
                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        addButton.setOnAction((ActionEvent e) -> {
            String name = addName.getText();
            String course = addCourse.getText();
            String gkb = addGkb.getText();
            String time = addTime.getText();
            String room = addRoom.getText();

            if (name.isEmpty() || course.isEmpty() || gkb.isEmpty() || time.isEmpty() || room.isEmpty()) {
                Alert a = new Alert(Alert.AlertType.INFORMATION,
                        "Data Yang Di Input Harus Tidak Ada Yang Boleh Kosong");
                a.setTitle("Alert");
                a.showAndWait();
            } else {
                Alert a = new Alert(Alert.AlertType.INFORMATION, "Data Telah Di Tambahkan");
                a.setTitle("Success");
                a.showAndWait();
                data.add(new Schedule(
                        addName.getText(),
                        addCourse.getText(),
                        addGkb.getText(),
                        addTime.getText(),
                        addRoom.getText()));
                addName.clear();
                addCourse.clear();
                addGkb.clear();
                addTime.clear();
                addRoom.clear();
            }

        });

        Button updtButton = new Button("Update");
        updtButton.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        updtButton.setTextFill(Color.BLACK);
        updtButton.setBorder(new Border(
                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        updtButton.setOnAction((ActionEvent e) -> {
            Dialog d = new Alert(Alert.AlertType.INFORMATION, "Update Sucess!!!");
            d.show();
            table.getItems().remove(table.getSelectionModel().getSelectedIndex());
            data.add(new Schedule(addName.getText(), addCourse.getText(), addGkb.getText(), addTime.getText(),
                    addRoom.getText()));
            addName.clear();
            addCourse.clear();
            addGkb.clear();
            addTime.clear();
            addRoom.clear();

        });

        final Button delButton = new Button("Delete");
        delButton.setBackground(new Background(new BackgroundFill(Color.CADETBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        delButton.setTextFill(Color.BLACK);
        delButton.setBorder(new Border(
                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        delButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Dialog d = new Alert(Alert.AlertType.INFORMATION, "Delete Success!!!");
                d.show();
                table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
            }
        });

//        final Button exitButton = new Button("Exit");
//        exitButton.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
//        exitButton.setTextFill(Color.BLACK);
//        exitButton.setBorder(new Border(
//                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//        exitButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                Stage stage1 = (Stage) exitButton.getScene().getWindow();
//                stage1.close();
//            }
//        });

//        hBox.getChildren().addAll(addName, addCourse, addGkb, addTime, addRoom, addButton, updtButton, delButton,
//                exitButton);
        hBox.getChildren().addAll(addName, addCourse, addGkb, addTime, addRoom, addButton, updtButton, delButton);
        hBox.setSpacing(10);

        final VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(18);
        vBox.setPadding(new Insets(15, 15, 15, 15));
        vBox.getChildren().addAll(label, table, hBox);

        ((Group) scene.getRoot()).getChildren().addAll(vBox);

        stage.setScene(scene);
        stage.show();
    }

    public static class Schedule {

        private SimpleStringProperty name;
        private SimpleStringProperty course;
        private SimpleStringProperty gkb;
        private SimpleStringProperty time;
        private SimpleStringProperty room;

        private Schedule(String name, String course, String gkb, String time, String room) {
            this.name = new SimpleStringProperty(name);
            this.course = new SimpleStringProperty(course);
            this.gkb = new SimpleStringProperty(gkb);
            this.time = new SimpleStringProperty(time);
            this.room = new SimpleStringProperty(room);
        }

        public String getName() {
            return name.get();
        }

        public SimpleStringProperty nameProperty() {
            if (name == null)
                name = new SimpleStringProperty(this, "NamaDosen");
            return name;
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public String getCourse() {
            return course.get();
        }

        public SimpleStringProperty courseProperty() {
            return course;
        }

        public void setCourse(String course) {
            this.course.set(course);
        }

        public String getGkb() {
            return gkb.get();
        }

        public SimpleStringProperty gkbProperty() {
            return gkb;
        }

        public void setGkb(String gkb) {
            this.gkb.set(gkb);
        }

        public String getTime() {
            return time.get();
        }

        public SimpleStringProperty timeProperty() {
            return time;
        }

        public void setTime(String time) {
            this.time.set(time);
        }

        public String getRoom() {
            return room.get();
        }

        public SimpleStringProperty roomProperty() {
            return room;
        }

        public void setRoom(String room) {
            this.room.set(room);
        }
    }
}