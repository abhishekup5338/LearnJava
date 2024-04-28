package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadExcelinMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Map<String,String>> data = getData();  //all the excel data will store in this "data".
		//System.out.println(data.get(2).get("Fname")); //This will give us specific data from excel.
		
		
		
		Map<String,Map<String,String>> MapData = getDataMap();
		System.out.println(MapData.get("TC06").get("Password"));
		
	}
	

	public static List<Map<String,String>> getData() //We have to create a new function for specific data
	{
		Xls_Reader xr = new Xls_Reader(System.getProperty("user.dir")+"/src/CollectionFramework/book1.xlsx");
		int rowcount = xr.getRowCount("Sheet1");
		int columncount = xr.getColumnCount("Sheet1");
		//System.out.println(rowcount);
		//System.out.println(columncount);
		List<Map<String,String>> ls = new ArrayList<Map<String,String>>();
		for(int i=2;i<=rowcount;i++)
		{
			Map<String, String> rowMap = new LinkedHashMap<String, String>();
			for(int j=0;j<=columncount;j++)
			{
				String Key = xr.getCellData("Sheet1", j, 1);
				String celldata = xr.getCellData("Sheet1", j, i);
				//System.out.println(celldata);
				rowMap.put(Key, celldata);
			}
			ls.add(rowMap);
			System.out.println(rowMap);
		}
		
		return ls;
	}
	
	
	public static Map<String,Map<String,String>> getDataMap() //We have to create Map in between Map for specific data
	{
		Xls_Reader xr = new Xls_Reader(System.getProperty("user.dir")+"/src/CollectionFramework/book1.xlsx");
		int rowcount = xr.getRowCount("Sheet1");
		int columncount = xr.getColumnCount("Sheet1");
		//System.out.println(rowcount);
		//System.out.println(columncount);
		//List<Map<String,String>> ls = new ArrayList<Map<String,String>>();
		Map<String,Map<String,String>> ls = new LinkedHashMap<String,Map<String,String>>();
		for(int i=2;i<=rowcount;i++)
		{
			Map<String, String> rowMap = new LinkedHashMap<String, String>();
			for(int j=1;j<=columncount;j++)
			{
				String Key = xr.getCellData("Sheet1", j, 1); 
				String celldata = xr.getCellData("Sheet1", j, i);
				//System.out.println(celldata);
				rowMap.put(Key, celldata);
			}
			//ls.add(rowMap);
			System.out.println(rowMap);
			//ls.put(xr.getCellData("Sheet1", 0, i), rowMap);
		}
		return ls;
		
		
	}

}
