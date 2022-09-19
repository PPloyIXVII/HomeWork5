/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerevent;

/**
 *
 * @author benjawan
 */
public class Subscriber02 implements ScoreListener {

    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("live result " + 
               e.getsomeScore());
    }
    
}
