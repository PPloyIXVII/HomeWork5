/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerevent;

import java.util.EventObject;

/**
 *
 * @author benjawan
 */
public class ScoreEvent extends EventObject {
    private String someScore;
    public ScoreEvent(Object o, String score) {
        super(o);
        someScore = score;
    }
    public String getsomeScore() {
        return someScore;
    }
}
