import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import com.qburst.marks.Result;


public class TestGen {
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		TreeSet<Integer> listOFIds = new TreeSet<Integer>();
		listOFIds.add(2);
		listOFIds.add(6);
		listOFIds.add(67);
		NavigableSet<Integer> rev;
		rev=((NavigableSet<Integer>)(listOFIds)).descendingSet();
		System.out.println(rev);
		
		List<String> lisSt = new ArrayList<String>();
		lisSt.add("NImish");
		lisSt.add("Vineeth");
		lisSt.add("Vineeth");
		System.out.println(lisSt);
		
		ArrayList<Result> results = new ArrayList<Result>();
		results.add(new Result());
		results.add(new Result());
		results.add(new Result());
		results.add(new Result());
		
		System.out.println(results);
		
		Map<Integer, Result> data = new HashMap<>();
		data.put(1, new Result());
		data.put(2, new Result());
		data.put(3, new Result());
		System.out.println(data);
		
		DAO<Integer> dao = new DAO<>();
		dao.save(10);
		
		DAO<Result> dao1 = new DAO<>();
		dao1.save(new Result());
	}
}

