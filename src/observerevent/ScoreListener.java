/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observerevent;

import java.util.EventListener;

/**
 *
 * @author benjawan
 */
public interface ScoreListener extends EventListener{
    public void scoreChange(ScoreEvent e);
}
