package com.yuanjue.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame
{

	private static final long serialVersionUID = 1L;
	public void launchFrame()
	{
		setSize(Constant.WIDTH, Constant.HEIGHT);
		setLocation(100, 100);
		setVisible(true);
		
		new PaintThread().start();
		
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	class PaintThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				repaint();
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
