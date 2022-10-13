package com.course.buildings;

public class School extends Building
{
    private int numClassrooms;
    private String gradeLevel;

    public int getClassrooms()
      {
         return numClassrooms;
      }
    public String getGradeLevel()
      {
         return gradeLevel;
      }

    public void setClassrooms(int room)
       {
           numClassrooms = room;
       }
    public void setGradeLevel(String level)
       {
           gradeLevel = level;
       }
}