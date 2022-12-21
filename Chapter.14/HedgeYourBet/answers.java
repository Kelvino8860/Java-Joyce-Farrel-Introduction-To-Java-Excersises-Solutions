
import java.util.*;
public class answers
{
	private ArrayList<String> answer = new ArrayList<String>();
	
	public void setAnswer(String ans)
	{
		answer.add(ans);
	}
	public void setRemove(String ans)
	{
		answer.remove(ans);
	}
	public int getSize()
	{
		int j = 0;
		return (j = answer.size());
	}
	public String getAnswers(int i)
	{
		return answer.get(i);
	}
}