public class Students{
      private int studId;
      private CollegeCourse[] course = new CollegeCourse[5];

  public Students(){
      }

  public int getStudId(){
         return studId;
      }
  public void setStudId(int studId){
         this.studId = studId;
      }

  public CollegeCourse getCourse(int post){
         return course[post];
      }
  public void setCourse(CollegeCourse course, int position){
         this.course[position] = course;
      }
}