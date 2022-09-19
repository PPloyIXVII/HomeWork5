/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerevent;

import java.util.EventObject;
import java.util.Scanner;
/**
 *
 * @author benjawan
 */
public class ObserverEvent  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ScoreSoure soure = new ScoreSoure();
        Subscriber01  member01= new Subscriber01();
        Subscriber02 member02 = new Subscriber02();
        soure.addScoreListener(member01);
        soure.addScoreListener(member02);
        //soure.setScoreLine(5);
        //soure.setScoreLine(6);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String score = sc.nextLine();
            if(score.equals("")) {
                break;
            }
            soure.setScoreLine(score);
        }
    }
    
}
