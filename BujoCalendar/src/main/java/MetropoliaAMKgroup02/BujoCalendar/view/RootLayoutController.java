package MetropoliaAMKgroup02.BujoCalendar.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import MetropoliaAMKgroup02.BujoCalendar.controller.MainApp;
import MetropoliaAMKgroup02.BujoCalendar.model.MonthView;
import MetropoliaAMKgroup02.BujoCalendar.model.NoteEdit;


public class RootLayoutController {
	
	private MainApp mainApp;
	private MonthView monthView;
	private boolean boolCurrentDate = true;

	@FXML
	private MenuItem weekdayFonts ;

	public RootLayoutController() {
	}

	@FXML
	private void handleChangeWeekdayFonts() {
		System.out.println("Clicked!");

	}
	
	@FXML
	private void handleSelectDay() {
		monthView = new MonthView();
		monthView.setRootLayoutController(this);
		Stage s = new Stage();
		monthView.start(s);
	}
	
	@FXML
	private void handleCurrentDate() {
		boolCurrentDate = true;
		mainApp.handleCurrentDate(boolCurrentDate);
	}
	
	public void handleSelectedDateView(String date) {
		boolCurrentDate = false;
		mainApp.handleSelectedDateView(date, boolCurrentDate);
		
	}
	
	@FXML
	public void handleViewCurrentDate() {
		boolCurrentDate = true;
		mainApp.handleCurrentDate(boolCurrentDate);
	}
	
	@FXML
	public void handleNewNote() {
		boolean okClicked = mainApp.showNoteOverview();
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	

}
