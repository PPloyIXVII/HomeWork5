/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerevent;

import java.util.ArrayList;

/**
 *
 * @author benjawan
 */
public class ScoreSoure 
{
    private final ArrayList<ScoreListener> listeners;
	public ScoreSoure() 
        {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String score) 
        {
		fireScoreEvent(new ScoreEvent(this, score));
	}

	public void addScoreListener(ScoreListener l) {
		listeners.add(l);
	}
	public void removeScoreListener(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireScoreEvent(ScoreEvent e) {
                for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
			l.scoreChange(e);
		}
	}
}
