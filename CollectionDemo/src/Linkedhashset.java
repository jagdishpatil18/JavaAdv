import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args)
	{
		
		LinkedHashSet set=new LinkedHashSet();
		set.add("Ram");
		set.add("Apple");
		set.add("Google");
		set.add("Amazon");
		 Iterator<String> itr=set.iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  

		set.add("WallMart");
		set.add("Amazon");
		
		System.out.println(set);
	}

}
