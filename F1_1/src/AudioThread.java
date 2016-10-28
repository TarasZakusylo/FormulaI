import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class AudioThread implements Runnable {

	 
	public void run() {
		 
		try {
			Player p = null;
			Random rand = new Random () ;
			int ra ;
			ra=rand.nextInt(3);
			//JOptionPane.showMessageDialog(null, ra);
			 switch(ra){
			 case 0:
				   p = new  Player( new FileInputStream("res/z1.mp3"));
				 break;
			 case 1:
				   p = new  Player( new FileInputStream("res/z2.mp3"));
				 break;
			 case 2:
				   p = new  Player( new FileInputStream("res/z3.mp3"));
				 break;	
				// default;
			 }
			
			p.play();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 

}
