package com.course.buildings;

public class Building
{
    private double squareFootage;
    private int stories;

    public double getFootage()
       {
           return squareFootage;
       }
    public int getStories()
       {
           return stories;
       }

    public void setFootage(double footage)
       {
           squareFootage = footage;   
       }
    public void setStories(int stories)
       {
           this.stories = stories;
       }
}