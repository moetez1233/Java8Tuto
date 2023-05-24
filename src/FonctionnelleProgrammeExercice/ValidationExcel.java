package FonctionnelleProgrammeExercice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.x500.X500Principal;

public class ValidationExcel implements ValidationRep {

	@Override
	public List<ColumnExcel> getListColumn() {
		/*  read column excel */
		Map<Integer,String> map= new HashMap<>();
		for(int i=0 ;i<10;i++) {
			map.put(i, "column "+i);
		}
		/* ent read column excel */
		ValidtionColumn validtionColumn = m -> m%2 ==0 ? true : false ;
		
		Map<Integer, ValidtionColumn> map2 = new HashMap<>();
		List<ColumnExcel> list=new ArrayList<>();
	for(int x =0;x<map.size();x++) {
		map2.put(x, 
				m -> {
					if(m %2 == 0) return true;
					return false;
				}
				
				);
		ColumnExcel columnExcel = new ColumnExcel(map.get(x),map2.get(x).Validate(x));
		list.add(columnExcel);
	}
		return list;
	
	}
	
}
	

