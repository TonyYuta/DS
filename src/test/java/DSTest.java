import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.MapHashMap;

/**
 * Created by Yutaka on 6/18/17.
 */
public class DSTest {
	
	MapHashMap mapHashMap;
	HashMap<String, String> hashMap;


	@BeforeClass
    public void setUp() throws Exception {
		mapHashMap = new MapHashMap(); 
		hashMap = new HashMap<>();
	}
	
    @AfterClass
    	public void tearDown() throws IOException {
    }
    
    @Test(enabled = true, groups = {"HashMap", "Map", "all"}) 
    	public void populateHashMapTest01() {
    		String ind = "String_ind_";
    		String val = "String_val_";
    		int hashMapSize = 10;

    		for (int i = 0; i < hashMapSize; i++) {
    			mapHashMap.hashMapPutElementIndexIntValueString(hashMap, ind + i, val + i);
    		}
    		Assert.assertEquals(hashMap.size(), hashMapSize);
    	}
    
}
