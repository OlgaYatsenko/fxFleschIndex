package application;
	
import document.Document;
import document.EfficientDocument;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class Main extends Application implements EventHandler<ActionEvent>{
	
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TextProApp");
		
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("TextProApp");
				            
			//Nodes
			TextArea textArea=new TextArea();
			VBox vBox =new VBox();
			Button buttonFleschIndex=new Button("Flesch Index");
			buttonFleschIndex.setOnAction(e-> {
			Document docFleschScore=new EfficientDocument(textArea.getText()); 
			double flesch = docFleschScore.getFleschScore();

				
				
			Application app=new Application() {
			public void start(Stage window){ 
						try {
						window.setTitle("Flesch Index");
						Label l=new Label(" Flesch Score is " + flesch);
						Button ok=new Button("OK");
						ok.setOnAction(e-> window.close());
						BorderPane layout=new BorderPane();
						VBox vBox =new VBox();
						vBox.getChildren().addAll(l,ok);
						layout.setCenter(vBox);
						Scene scene=new Scene(layout, 300,200);
						window.setScene(scene);
						window.show();
						}
						catch(Exception e) {e.printStackTrace();}
						
					};
				
					};
					try {app.start(new Stage());} 
					catch (Exception a) {a.printStackTrace();};
				});
				 
			
			Button close=new Button("Exit");
			
			close.setOnAction(e -> primaryStage.close());
			vBox.getChildren().addAll(buttonFleschIndex, close);
			
			BorderPane borderPain=new BorderPane();
			borderPain.setLeft(vBox);
			borderPain.setCenter(textArea);

			Scene scene=new Scene(borderPain, 1000, 900);
			primaryStage.setScene(scene);
			primaryStage.show();
	            
	          
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
	public static void main(String[] args) {
		System.out.println("Running Flesch Index programm...");
		launch(args);
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
	