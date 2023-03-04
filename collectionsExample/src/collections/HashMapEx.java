package collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args)
	{
		HashMap <Integer , String> h=new HashMap<Integer,String>();// it create a hashmap
        h.put(1, "Jayashri");// put the value in the hashmap
        h.put(2, "pooja");
        h.put(3, "kaveri");
        h.put(4, "priti");
        
        for(Map.Entry m: h.entrySet())
        {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}

