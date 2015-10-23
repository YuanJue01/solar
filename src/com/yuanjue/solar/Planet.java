package com.yuanjue.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class Planet extends Star
{
	Star center;
	double longAxis, shortAxis;
	double degree;
	double speed;
	boolean satellite;
	
	public Planet(Image img)
	{
		super(img);
	}
	public Planet(Image img, double x, double y)
	{
		super(img, x, y);
	}
	public Planet(String imgPath, double x, double y)
	{
		super(imgPath, x, y);
	}
	public Planet(Star center, Image img, double longAxis, double shortAxis, double speed)
	{
		this(img);
		this.center = center;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.x = center.x + longAxis;
		this.y = center.y + shortAxis;
		this.speed = speed;
	}
	public Planet(Star center, Image img, double longAxis,
			double shortAxis, double speed, boolean satellite)
	{
		this(center, img, longAxis, shortAxis, speed);
		this.satellite = satellite;
	}
	
	public void draw(Graphics g)
	{
		super.draw(g);
		move();
		if(!satellite)
		{
			drawTrace(g);
		}
	}

	
	public void drawTrace(Graphics g)
	{
		double ovalX, ovalY;
		double ovalWidth, ovalHeight;
		
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		ovalX = (center.x+center.width/2)-longAxis;
		ovalY = (center.y+center.height/2)-shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
	}
	public void move()
	{
		x = (center.x + center.width/2) + longAxis * Math.cos(degree);
		y = (center.y + center.height/2) + shortAxis * Math.sin(degree);
		degree += speed;
	}
}
