import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;

public class MyKeyListener implements KeyListener, Serializable
{
	
	private User user;
	public MyKeyListener(User user)
	{
		super();
		this.user=user;
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		user.keyEvent(e);	
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
