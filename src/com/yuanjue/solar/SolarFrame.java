package com.yuanjue.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.yuanjue.util.Constant;
import com.yuanjue.util.GameUtil;
import com.yuanjue.util.MyFrame;

public class SolarFrame extends MyFrame
{
	/**
	 * @author 路锦博
	 * 2015年10月23日上午9:39:18
	 */
	private static final long serialVersionUID = 1L;
	
	Image bg = getImage("image/bg.jpg");
	Image sunImg = getImage("image/sun.jpg");
	Image mercuryImg = getImage("image/Mercury.jpg");
	Image venusImg = getImage("image/venus.jpg");
	Image earthImg = getImage("image/Earth.jpg");
	Image moonImg = getImage("image/moon.jpg");
	Image marsImg = getImage("image/Mars.jpg");
	Image jupiterImg = getImage("image/jupiter.jpg");
	Image staturnImg = getImage("image/saturn.jpg");
	Image uranusImg = getImage("image/uranus.jpg");
	Image neptuneImg = getImage("image/neptune.jpg");
	
	Star sun = new Star(sunImg, Constant.WIDTH/2, Constant.HEIGHT/2);
	Planet mercury = new Planet(sun, mercuryImg, 0.39*Constant.earthX,0.39*Constant.earthY,0.8);
	Planet venus = new Planet(sun, venusImg, 0.72*Constant.earthX,0.72*Constant.earthY,0.6);
	Planet earth = new Planet(sun, earthImg, Constant.earthX,Constant.earthY,0.1);
	Planet moon = new Planet(earth, moonImg, 35,20,0.3,true);
	Planet mars = new Planet(sun, marsImg, 1.52*Constant.earthX,1.52*Constant.earthY,0.05);
	Planet jupiter = new Planet(sun, jupiterImg, 2.21*Constant.earthX,2.21*Constant.earthY,0.025);
	Planet staturn = new Planet(sun, staturnImg, 5.58*Constant.earthX,5.58*Constant.earthY,0.017);
	Planet uranus = new Planet(sun, uranusImg, 7.28*Constant.earthX,7.28*Constant.earthY,0.009);
	Planet neptune = new Planet(sun, neptuneImg, 10.13*Constant.earthX,10.13*Constant.earthY,0.0005);
	
	@Override
	public void paint(Graphics g)
	{
		g.drawImage(bg, 0, 0, null);
		g.drawImage(sunImg, Constant.WIDTH/2-15, Constant.HEIGHT/2-16, null);
		//sun.draw(g);
		mercury.draw(g);
		venus.draw(g);
		earth.draw(g);
		moon.draw(g);
		mars.draw(g);
		jupiter.draw(g);
		staturn.draw(g);
		uranus.draw(g);
		neptune.draw(g);
	}
	public Image getImage(String imgPath)
	{
		return GameUtil.getImage(imgPath);
	}
	public static void main(String[] args)
	{
		SolarFrame solar = new SolarFrame();
		solar.lauchFrame();
	}

}
