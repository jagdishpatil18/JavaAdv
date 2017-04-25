import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Linkedhashmap {

	public static void main(String[] args) 
	{
		
		LinkedHashMap<Integer,Book> map=new LinkedHashMap<Integer,Book>();
		Book b1=new Book(1111,"Let us C","Yashwant Kanetkar",250);
		Book b2=new Book(1112,"Data Communications & Networking","Forouzan",550);
		Book b3=new Book(1113,"Software Engineeering","Pearson",350);
		Book b4=new Book(1114,"Operating System","Wiley",600);
		
		map.put(1,b1);
		map.put(25, b2);
		map.put(3, b4);
		map.put(4, b3);
	//	map.put(25, b1);
		
		Set<Integer> keym=map.keySet();
		 System.out.println("Isbn   \t\tName     \t\tAuther\t\tPrice");
	        for(Integer key:keym) 
	        {
	            System.out.print(map.get(key).isbn);
	            System.out.print("\t    "+map.get(key).name);
	            System.out.print("\t\t    "+map.get(key).auther);
	            System.out.println("\t    "+map.get(key).price);
	        }   ;

	}

}
