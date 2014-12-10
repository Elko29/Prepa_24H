/*  
* To change this template, choose Tools | Templates  
* and open the template in the editor.  
*/  
package ihmgui;
 
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class Carao extends BasicGame
{
    public Carao(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
 
    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new Carao("toto"));
            app.setDisplayMode(1500, 400, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
 
    @Override
    public void init(GameContainer container) throws SlickException
    {
    }
 
    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    }
 
    public void render(GameContainer container, Graphics g) throws SlickException
    {
    }
}