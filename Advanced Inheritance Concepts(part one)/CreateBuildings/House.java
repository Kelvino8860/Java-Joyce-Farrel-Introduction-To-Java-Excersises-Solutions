package com.course.buildings;

public class House extends Building
{
   private int numBedrooms;
   private int numBaths;

   public int getBedrooms()
      {
         return numBedrooms;
      }
   public int getBaths()
      {
         return numBaths;
      }

   public void setBedrooms(int bed)
      {
         numBedrooms = bed;
      }
   public void setBaths(int baths)
      {
         numBaths = baths;
      }
}