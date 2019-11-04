package MetropoliaAMKgroup02.BujoCalendar.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import MetropoliaAMKgroup02.BujoCalendar.view.NoteOverviewController;
import MetropoliaAMKgroup02.Common.model.Merkinta;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NoteEdit {
	
	private NoteOverviewController noteController;
	private Merkinta note;

	public String newNoteTitle(TextField title) {
		//note.setNimi(title.getText());
		return title.getText();
	}
	
	public String newNoteMoreInfo(TextArea text) {
		//note.setSisalto(text.getText());
		return text.getText();
	}
	
	public String noteStartDay(Label day) {
		return day.getText();
	}
	
	public String[] noteDayandTime(Label startDay, Label endDay, Label startTime, Label endTime) {
		
		String[] noteDaysTimes = new String[4];
		noteDaysTimes[0] = startDay.getText();
		noteDaysTimes[1] = endDay.getText();
		noteDaysTimes[2] = startTime.getText();
		noteDaysTimes[3] = endTime.getText();
		
		return noteDaysTimes;
	}
	
	public void setNoteOverviewController(NoteOverviewController controller) {
		this.noteController = controller;
	}

}
