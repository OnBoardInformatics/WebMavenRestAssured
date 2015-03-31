package TestingPackage;
 
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class PostalSnapshot {
	
	/*
	@Test
	public void Test00()
	{
		int result = getTotalRadius00();
		byPostalSnapshotTest00(result);
		byPostalSnapshotTest00(result);	
	}
	public int getTotalRadius00()
	{
		 int totalNumber;
		try {
		
			RestAssured.baseURI = "http://demo2.onboardis.us";
            RestAssured.urlEncodingEnabled = false;
            final String query = "19701&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
            
            totalNumber =
    		when().
                    get("/properties/snapshots/postal?postal={q}", query).
            then().
            		body("status.msg", equalTo("OK")).
            extract().
            		path("status.total");
            	;
        } finally {
            RestAssured.reset();
        }   
		 return totalNumber;
	}
	public void byPostalSnapshotTest00(int result)
	{
		 try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(result)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	*/
	
	@Test
	public void byPostalSnapshotTest000()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	 }   	
	
	@Test
	public void byPostalSnapshotTest001()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest002()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	/*
	@Test
	public void byPostalSnapshotTest003()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest004()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest005()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19930&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19930&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}  
	*/ 
	
	@Test
	public void byPostalSnapshotTest006()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27ABSENTEE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27ABSENTEE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byPostalSnapshotTest007()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byPostalSnapshotTest008()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	/*
	@Test
	public void byPostalSnapshotTest009()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest010()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byPostalSnapshotTest011()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest012()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byPostalSnapshotTest013()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrBldgName%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrBldgName%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest014()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byPostalSnapshotTest015()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrBldgName%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrBldgName%20ne%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest016()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=addrCountrySubd%20eq%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=addrCountrySubd%20eq%20DE";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byPostalSnapshotTest017()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=addrCountrySubd%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=addrCountrySubd%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest018()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrCountrySubd%20ne%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrCountrySubd%20ne%20DE";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest019()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=addrPostal1%20in%20(19939,19934)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=addrPostal1%20in%20(19939,19934)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest020()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=addrPostal1%20in%20(19936,19938,19939)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=addrPostal1%20in%20(19936,19938,19939)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest021()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrPostal1%20eq%2019711";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrPostal1%20eq%2019711";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest022()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrPostal1%20eq%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrPostal1%20eq%2019938";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest023()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=addrPostal1%20ne%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=addrPostal1%20ne%2019938";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest024()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=addrPostal1%20ne%2019934";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=addrPostal1%20ne%2019934";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest025()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=addrPostal3%20in%20(R001,R006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=addrPostal3%20in%20(R001,R006)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest026()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=addrPostal3%20in%20(C004,C001,C003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=addrPostal3%20in%20(C004,C001,C003)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest027()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=addrPostal3%20eq%20R005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=addrPostal3%20eq%20R005";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest028()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=addrPostal3%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=addrPostal3%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest029()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=addrPostal3%20ne%20R007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=addrPostal3%20ne%20R007";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest030()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=addrPostal3%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=addrPostal3%20ne%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest031()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=apn%20in%20(1300300053300,0699999026)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=apn%20in%20(1300300053300,0699999026)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest032()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest033()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=apn%20eq%2060077777010200000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=apn%20eq%2060077777010200000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest034()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=apn%20eq%200699999004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=apn%20eq%200699999004";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest035()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=apn%20ne%200699999013";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=apn%20ne%200699999013";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest036()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=apn%20ne%201099999007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=apn%20ne%201099999007";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest037()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2018.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2018.35";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest038()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2022.03";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2022.03";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest039()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2022.79";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2022.79";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest040()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2024";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest041()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2021.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2021.14";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest042()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2023.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2023.81";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest043()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprPerSizeUnit%20ge%209.12";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprPerSizeUnit%20ge%209.12";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest044()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprPerSizeUnit%20ge%2018.78";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprPerSizeUnit%20ge%2018.78";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest045()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2017.95";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2017.95";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest046()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2018.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2018.14";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest047()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprPerSizeUnit%20le%2025.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprPerSizeUnit%20le%2025.35";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest048()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprPerSizeUnit%20le%2024.56";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprPerSizeUnit%20le%2024.56";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest049()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprValue%20eq%20349800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprValue%20eq%20349800";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest050()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprValue%20eq%201331000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprValue%20eq%201331000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest051()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprValue%20ne%20314400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprValue%20ne%20314400";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest052()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprValue%20ne%20712100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprValue%20ne%20712100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest053()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprValue%20gt%202882100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprValue%20gt%202882100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest054()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprValue%20gt%203562800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprValue%20gt%203562800";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest055()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprValue%20ge%2055000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprValue%20ge%2055000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest056()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprValue%20ge%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprValue%20ge%201000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest057()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprValue%20lt%209158900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprValue%20lt%209158900";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest058()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdImprValue%20lt%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdImprValue%20lt%204625300";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest059()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdImprValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdImprValue%20le%201750";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest060()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdImprValue%20le%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdImprValue%20le%204625300";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest061()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.09";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.09";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest062()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.15";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.15";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest063()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.39";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.39";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest064()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest065()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.18";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.18";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest066()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.20";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.20";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest067()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.06";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest068()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.14";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest069()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.31";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest070()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.29";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest071()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.57";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest072()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.58";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.58";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest073()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandValue%20eq%201250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandValue%20eq%201250";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest074()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandValue%20eq%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandValue%20eq%201500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest075()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdLandValue%20ne%20550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdLandValue%20ne%20550";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest076()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdLandValue%20ne%20350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdLandValue%20ne%20350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest077()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdLandValue%20gt%2011500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdLandValue%20gt%2011500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest078()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdLandValue%20gt%203750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdLandValue%20gt%203750";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest079()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdLandValue%20ge%201400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdLandValue%20ge%201400";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest080()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdLandValue%20ge%202250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdLandValue%20ge%202250";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest081()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdLandValue%20lt%20180000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdLandValue%20lt%20180000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest082()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdLandValue%20lt%204000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdLandValue%20lt%204000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest083()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdLandValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdLandValue%20le%201750";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest084()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandValue%20le%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandValue%20le%202100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest085()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.55";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.55";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest086()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byPostalSnapshotTest088()
	{
		//This will fail.
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}  
	
	@Test
	public void byPostalSnapshotTest087()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest089()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%203.87";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%203.87";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest090()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%208.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%208.13";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest091()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%204.69";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%204.69";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest092()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%206.47";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%206.47";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest093()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%205.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%205.06";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest094()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest095()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%201.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%201.46";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest096()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlPerSizeUnit%20le%206.01";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlPerSizeUnit%20le%206.01";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest097()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlPerSizeUnit%20le%204.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlPerSizeUnit%20le%204.57";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest098()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlValue%20eq%201350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlValue%20eq%201350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest099()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlValue%20eq%20950";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlValue%20eq%20950";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest100()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlValue%20ne%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlValue%20ne%201500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest101()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlValue%20ne%203150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlValue%20ne%203150";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest102()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlValue%20gt%206350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlValue%20gt%206350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest103()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdTtlValue%20gt%2010100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdTtlValue%20gt%2010100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest104()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdTtlValue%20ge%2011350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdTtlValue%20ge%2011350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest105()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdTtlValue%20ge%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdTtlValue%20ge%2042872";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest106()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdTtlValue%20lt%2050514";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdTtlValue%20lt%2050514";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest107()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdTtlValue%20lt%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdTtlValue%20lt%2042872";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest108()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdTtlValue%20le%202200";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdTtlValue%20le%202200";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest109()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdTtlValue%20le%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdTtlValue%20le%201700";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest110()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValue%20eq%20282783";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValue%20eq%20282783";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest111()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValue%20eq%20256143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValue%20eq%20256143";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest112()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=avmValue%20ne%20308184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=avmValue%20ne%20308184";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest113()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValue%20ne%20284655";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValue%20ne%20284655";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest114()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValue%20gt%20146746";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValue%20gt%20146746";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest115()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValue%20gt%20210985";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValue%20gt%20210985";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest116()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValue%20ge%20178941";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValue%20ge%20178941";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest117()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValue%20ge%20183298";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValue%20ge%20183298";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest118()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValue%20lt%20174434";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValue%20lt%20174434";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest119()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValue%20lt%20292084";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValue%20lt%20292084";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest120()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValue%20le%20319040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValue%20le%20319040";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest121()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValue%20le%20217032";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValue%20le%20217032";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest122()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueHigh%20eq%20202343";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueHigh%20eq%20202343";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest123()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueHigh%20eq%20350393";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueHigh%20eq%20350393";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest124()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueHigh%20ne%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueHigh%20ne%20226577";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest125()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueHighv%20ne%20209361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueHigh%20ne%20209361";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest126()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueHigh%20gt%20357325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueHigh%20gt%20357325";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest127()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=avmValueHigh%20gt%20344503";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=avmValueHigh%20gt%20344503";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest128()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=avmValueHigh%20ge%20367949";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=avmValueHigh%20ge%20367949";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest129()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=avmValueHigh%20ge%20214459";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=avmValueHigh%20ge%20214459";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest130()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=avmValueHigh%20lt%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=avmValueHigh%20lt%20226577";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest131()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=avmValueHigh%20lt%20209249";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=avmValueHigh%20lt%20209249";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest132()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValueHigh%20le%20333046";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValueHigh%20le%20333046";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest133()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValueHigh%20le%20316717";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValueHigh%20le%20316717";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest134()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValueLow%20eq%20218170";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValueLow%20eq%20218170";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest135()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValueLow%20eq%20190325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValueLow%20eq%20190325";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest136()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValueLow%20ne%20117881";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValueLow%20ne%20117881";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest137()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValueLow%20ne%20128911";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValueLow%20ne%20128911";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest138()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValueLow%20gt%2062516";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValueLow%20gt%2062516";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest139()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValueLow%20gt%2080338";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValueLow%20gt%2080338";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest140()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValueLow%20ge%20148136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValueLow%20ge%20148136";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest141()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueLow%20ge%20222536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueLow%20ge%20222536";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest142()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueLow%20lt%20132135";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueLow%20lt%20132135";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest143()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueLow%20lt%20171907";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueLow%20lt%20171907";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest144()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueLow%20le%20148794";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueLow%20le%20148794";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest145()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueLow%20le%2093896";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueLow%20le%2093896";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest146()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=baths1Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=baths1Qtr%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest147()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=baths1Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=baths1Qtr%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest148()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=baths1Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=baths1Qtr%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest149()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=baths1Qtr%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=baths1Qtr%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest150()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=baths1Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=baths1Qtr%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest151()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=baths1Qtr%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=baths1Qtr%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest152()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=baths1Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=baths1Qtr%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest153()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths1Qtr%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths1Qtr%20ge%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest154()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths1Qtr%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths1Qtr%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest155()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths1Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths1Qtr%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest156()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths1Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths1Qtr%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest157()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths1Qtr%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths1Qtr%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest158()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths3Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths3Qtr%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest159()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths3Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths3Qtr%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest160()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths3Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths3Qtr%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest161()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths3Qtr%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths3Qtr%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest162()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths3Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths3Qtr%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest163()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=baths3Qtr%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=baths3Qtr%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest164()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=baths3Qtr%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=baths3Qtr%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest165()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=baths3Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=baths3Qtr%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest166()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=baths3Qtr%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=baths3Qtr%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest167()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=baths3Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=baths3Qtr%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest168()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=baths3Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=baths3Qtr%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest169()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=baths3Qtr%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=baths3Qtr%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest170()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsCalc%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsCalc%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest171()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsCalc%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsCalc%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest172()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsCalc%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsCalc%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest173()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsCalc%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsCalc%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest174()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsCalc%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsCalc%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest175()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsCalc%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsCalc%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest176()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsCalc%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsCalc%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest177()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsCalc%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsCalc%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest178()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsCalc%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsCalc%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest179()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsCalc%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsCalc%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest180()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsCalc%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsCalc%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest181()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsCalc%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsCalc%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest182()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsFull%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsFull%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest183()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsFull%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsFull%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest184()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsFull%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsFull%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest185()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsFull%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsFull%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest186()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsFull%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsFull%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest187()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bathsFull%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bathsFull%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest188()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bathsFull%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bathsFull%20ge%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest189()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsFull%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsFull%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest190()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsFull%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsFull%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest191()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsFull%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsFull%20lt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest192()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsFull%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsFull%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest193()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsFull%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsFull%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest194()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsHalf%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsHalf%20eq%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest195()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsHalf%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsHalf%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest196()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsHalf%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsHalf%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest197()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsHalf%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsHalf%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest198()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsHalf%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsHalf%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest199()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsHalf%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsHalf%20gt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest200()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsHalf%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsHalf%20ge%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalSnapshotTest201()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsHalf%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsHalf%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest202()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsHalf%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsHalf%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest203()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsHalf%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsHalf%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest204()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsHalf%20le%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsHalf%20le%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest205()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsHalf%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsHalf%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest206()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsTotal%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsTotal%20eq%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest207()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsTotal%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsTotal%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest208()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsTotal%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsTotal%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest209()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsTotal%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsTotal%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest210()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsTotal%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsTotal%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest211()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsTotal%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsTotal%20gt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest212()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsTotal%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsTotal%20ge%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest213()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsTotal%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsTotal%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest214()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsTotal%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsTotal%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest215()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsTotal%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsTotal%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest216()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsTotal%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsTotal%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest217()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsTotal%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsTotal%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest218()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=beds%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=beds%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest219()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=beds%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=beds%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest220()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=beds%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=beds%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest221()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=beds%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=beds%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest222()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=beds%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=beds%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest223()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=beds%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=beds%20gt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest224()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=beds%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=beds%20ge%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest225()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=beds%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=beds%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest226()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=beds%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=beds%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest227()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=beds%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=beds%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest228()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=beds%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=beds%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest229()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=beds%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=beds%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest230()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bldgSize%20eq%203500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bldgSize%20eq%203500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest231()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bldgSize%20eq%201150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bldgSize%20eq%201150";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest232()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bldgSize%20ne%202650";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bldgSize%20ne%202650";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest233()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bldgSize%20ne%201125";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bldgSize%20ne%201125";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest234()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bldgSize%20gt%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bldgSize%20gt%201700";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest235()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bldgSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bldgSize%20gt%202675";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest236()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgSize%20ge%202425";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgSize%20ge%202425";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest237()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgSize%20ge%201525";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgSize%20ge%201525";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest238()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgSize%20lt%201850";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgSize%20lt%201850";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest239()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgSize%20lt%203675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgSize%20lt%203675";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest240()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgSize%20le%202550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgSize%20le%202550";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest241()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgSize%20le%201630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgSize%20le%201630";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest242()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgsNum%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgsNum%20eq%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest243()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgsNum%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgsNum%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest244()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgsNum%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgsNum%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest245()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgsNum%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgsNum%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest246()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgsNum%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgsNum%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest247()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgsNum%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgsNum%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest248()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgsNum%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgsNum%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest249()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgsNum%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgsNum%20ge%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest250()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgsNum%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgsNum%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest251()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bldgsNum%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bldgsNum%20lt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest252()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bldgsNum%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bldgsNum%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest253()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bldgsNum%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bldgsNum%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest254()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest255()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest256()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgType%20eq%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgType%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest257()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest258()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest259()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest260()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=block%20in%20(E,Y)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=block%20in%20(E,Y)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest261()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=block%20in%20(D,T,F)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=block%20in%20(D,T,F)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest262()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=block%20eq%20A";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=block%20eq%20A";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest263()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=block%20eq%20B";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=block%20eq%20B";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest264()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=block%20ne%20C";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=block%20ne%20C";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest265()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=block%20ne%20D";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=block%20ne%20D";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest266()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtSize%20eq%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtSize%20eq%201000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest267()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bsmtSize%20eq%201040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bsmtSize%20eq%201040";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest268()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtSize%20ne%201240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtSize%20ne%201240";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest269()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bsmtSize%20ne%201251";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bsmtSize%20ne%201251";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest270()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bsmtSize%20gt%201419";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bsmtSize%20gt%201419";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest271()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bsmtSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bsmtSize%20gt%202675";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest272()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bsmtSize%20ge%201930";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bsmtSize%20ge%201930";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest273()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bsmtSize%20ge%201092";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bsmtSize%20ge%201092";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest274()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bsmtSize%20lt%201766";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bsmtSize%20lt%201766";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest275()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bsmtSize%20lt%201551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bsmtSize%20lt%201551";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest276()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bsmtSize%20le%201839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bsmtSize%20le%201839";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest277()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bsmtSize%20le%201073";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bsmtSize%20le%201073";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest278()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest279()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest280()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=censusId%20in%20(100010410001069,100010401001010)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=censusId%20in%20(100010410001069,100010401001010)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest281()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest282()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=censusId%20eq%20100010410001069";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=censusId%20eq%20100010410001069";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest283()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=censusId%20eq%20100050512031012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=censusId%20eq%20100050512031012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest284()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=censusId%20ne%20100010401001010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=censusId%20ne%20100010401001010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest285()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=censusId%20ne%20100010413001033";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=censusId%20ne%20100010413001033";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest286()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest287()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest288()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest289()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=constructionType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=constructionType%20eq%20%27FRAME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalSnapshotTest290()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byRadiusTes291()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=constructionType%20ne%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=constructionType%20ne%20%27FRAME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalSnapshotTest292()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest293()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=coolingType%20eq%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=coolingType%20eq%20%27CENTRAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest294()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest295()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=coolingType%20ne%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=coolingType%20ne%20%27CENTRAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest296()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest297()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=dateValuation%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=dateValuation%20eq%20%272014-07-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest298()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=dateValuation%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=dateValuation%20eq%20%272015-01-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest299()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=dateValuation%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=dateValuation%20ne%20%272014-07-23%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest300()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=dateValuation%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=dateValuation%20ne%20%272014-08-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest301()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=dateValuation%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=dateValuation%20gt%20%272014-11-12%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest302()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=dateValuation%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=dateValuation%20gt%20%272014-08-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest303()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=dateValuation%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=dateValuation%20ge%20%272014-11-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest304()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=dateValuation%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=dateValuation%20ge%20%272014-03-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest305()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=dateValuation%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=dateValuation%20lt%20%272014-09-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest306()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=dateValuation%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=dateValuation%20lt%20%272014-02-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest307()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=dateValuation%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=dateValuation%20le%20%272015-01-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest308()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=dateValuation%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=dateValuation%20le%20%272014-08-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest309()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=depth%20eq%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=depth%20eq%20120";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest310()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=depth%20eq%20180";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=depth%20eq%20180";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest311()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=depth%20ne%20140";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=depth%20ne%20140";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest312()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=depth%20ne%20160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=depth%20ne%20160";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest313()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=depth%20gt%20142";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=depth%20gt%20142";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest314()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=depth%20gt%20130";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=depth%20gt%20130";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest315()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=depth%20ge%20167";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=depth%20ge%20167";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest316()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=depth%20ge%20145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=depth%20ge%20145";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest317()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=depth%20lt%20136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=depth%20lt%20136";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest318()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=depth%20lt%20106";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=depth%20lt%20106";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest319()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=depth%20le%20119";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=depth%20le%20119";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest320()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=depth%20le%20231";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=depth%20le%20231";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest321()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest322()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest323()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest324()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest325()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest326()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest327()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest328()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest329()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=extWalls%20eq%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=extWalls%20eq%20%27SHINGLE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest330()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=extWalls%20eq%20%27ALUMINUM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=extWalls%20eq%20%27ALUMINUM%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest331()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=extWalls%20ne%20%27BRICK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=extWalls%20ne%20%27BRICK%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest332()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=extWalls%20ne%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=extWalls%20ne%20%27SHINGLE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest333()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fips%20in%20(10001,10003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fips%20in%20(10001,10003)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest334()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fips%20in%20(10002,10004,10006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fips%20in%20(10002,10004,10006)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest335()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fips%20eq%2010002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fips%20eq%2010002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest336()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fips%20eq%2010004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fips%20eq%2010004";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest337()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fips%20ne%2010003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fips%20ne%2010003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest338()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fips%20ne%2010001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fips%20ne%2010001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest339()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest340()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest341()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=foundationType%20eq%20%27PILINGS%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=foundationType%20eq%20%27PILINGS%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest342()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=foundationType%20eq%20%27SLAB%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=foundationType%20eq%20%27SLAB%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest343()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=foundationType%20ne%20%27CONCRETE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=foundationType%20ne%20%27CONCRETE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest344()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=foundationType%20ne%20%27MASONRY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=foundationType%20ne%20%27MASONRY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest345()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcCount%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcCount%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest346()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fplcCount%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fplcCount%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest347()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fplcCount%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fplcCount%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest348()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fplcCount%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fplcCount%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalSnapshotTest349()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fplcCount%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fplcCount%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalSnapshotTest350()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fplcCount%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fplcCount%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalSnapshotTest351()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=fplcCount%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=fplcCount%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest352()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=fplcCount%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=fplcCount%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest353()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=fplcCount%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=fplcCount%20lt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest354()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=fplcCount%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=fplcCount%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest355()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcCount%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcCount%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest356()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcCount%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcCount%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest357()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcInd%20eq%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcInd%20eq%20%27Y%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest358()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcInd%20eq%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcInd%20eq%20%27N%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest359()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=fplcInd%20ne%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=fplcInd%20ne%20%27N%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest360()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=fplcInd%20ne%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=fplcInd%20ne%20%27Y%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest361()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest362()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest363()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest364()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=frame%20eq%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=frame%20eq%20%27METAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest365()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=frame%20eq%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=frame%20eq%20%27WOOD%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest366()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=frame%20ne%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=frame%20ne%20%27METAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest367()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=frame%20ne%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=frame%20ne%20%27WOOD%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest368()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=frontage%20eq%2019";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=frontage%20eq%2019";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest369()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=frontage%20eq%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=frontage%20eq%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest370()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=frontage%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=frontage%20ne%2001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest371()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=frontage%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=frontage%20ne%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest372()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=frontage%20gt%20214";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=frontage%20gt%20214";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest373()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=frontage%20gt%20143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=frontage%20gt%20143";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest374()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=frontage%20ge%20150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=frontage%20ge%20150";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest375()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=frontage%20ge%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=frontage%20ge%20120";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest376()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=frontage%20lt%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=frontage%20lt%2024";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest377()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=frontage%20lt%2036";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=frontage%20lt%2036";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest378()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=frontage%20le%2055";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=frontage%20le%2055";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest379()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=frontage%20le%20105";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=frontage%20le%20105";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest380()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=garageSize%20eq%20242";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=garageSize%20eq%20242";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest381()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageSize%20eq%20483";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageSize%20eq%20483";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest382()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageSize%20ne%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageSize%20ne%20440";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest383()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageSize%20ne%20511";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageSize%20ne%20511";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest384()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageSize%20gt%20630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageSize%20gt%20630";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest385()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageSize%20gt%20600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageSize%20gt%20600";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest386()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageSize%20ge%20840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageSize%20ge%20840";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest387()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=garageSize%20ge%20480";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=garageSize%20ge%20480";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest388()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=garageSize%20lt%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=garageSize%20lt%20440";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest389()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=garageSize%20lt%20441";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=garageSize%20lt%20441";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest390()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=garageSize%20le%20206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=garageSize%20le%20206";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest391()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=garageSize%20le%20454";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=garageSize%20le%20454";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest392()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest393()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest394()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest395()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest396()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest397()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest398()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=groundFloorSize%20eq%202347";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=groundFloorSize%20eq%202347";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest399()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=groundFloorSize%20eq%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=groundFloorSize%20eq%204063";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest400()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=groundFloorSize%20ne%201090";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=groundFloorSize%20ne%201090";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest401()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=groundFloorSize%20ne%202571";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=groundFloorSize%20ne%202571";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest402()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=groundFloorSize%20gt%201664";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=groundFloorSize%20gt%201664";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest403()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=groundFloorSize%20gt%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=groundFloorSize%20gt%204063";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest404()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=groundFloorSize%20ge%201388";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=groundFloorSize%20ge%201388";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest405()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=groundFloorSize%20ge%20912";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=groundFloorSize%20ge%20912";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest406()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=groundFloorSize%20lt%201160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=groundFloorSize%20lt%201160";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest407()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=groundFloorSize%20lt%202868";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=groundFloorSize%20lt%202868";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest408()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=groundFloorSize%20le%201753";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=groundFloorSize%20le%201753";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest409()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=groundFloorSize%20le%201560";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=groundFloorSize%20le%201560";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 

	@Test
	public void byPostalSnapshotTest410()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest411()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest412()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest413()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest414()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=heatingType%20ne%20%27OIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=heatingType%20ne%20%27OIL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest415()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest416()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest417()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest418()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest419()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=landUse%20eq%20%27HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=landUse%20eq%20%27HOTEL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest420()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest421()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=landUse%20ne%20%27DUPLEX%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=landUse%20ne%20%27DUPLEX%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest422()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lastModified%20eq%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lastModified%20eq%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest423()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lastModified%20eq%20%272014-11-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lastModified%20eq%20%272014-11-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest424()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lastModified%20ne%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lastModified%20ne%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest425()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lastModified%20ne%20%272014-10-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lastModified%20ne%20%272014-10-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest426()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lastModified%20gt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lastModified%20gt%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest427()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lastModified%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lastModified%20gt%20%272014-11-12%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest428()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lastModified%20ge%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lastModified%20ge%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest429()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=lastModified%20ge%20%272014-12-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=lastModified%20ge%20%272014-12-31%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest430()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lastModified%20lt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lastModified%20lt%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest431()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lastModified%20lt%20%272014-09-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lastModified%20lt%20%272014-09-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest432()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lastModified%20le%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lastModified%20le%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest433()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lastModified%20le%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lastModified%20le%20%272015-01-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest434()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=livingSize%20eq%202307";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=livingSize%20eq%202307";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest435()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=livingSize%20eq%201172";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=livingSize%20eq%201172";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest436()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=livingSize%20ne%203023";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=livingSize%20ne%203023";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest437()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=livingSize%20ne%201396";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=livingSize%20ne%201396";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest438()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=livingSize%20gt%202597";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=livingSize%20gt%202597";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest439()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=livingSize%20gt%201344";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=livingSize%20gt%201344";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest440()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=livingSize%20ge%201771";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=livingSize%20ge%201771";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest441()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=livingSize%20ge%201420";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=livingSize%20ge%201420";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest442()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=livingSize%20lt%202240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=livingSize%20lt%202240";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest443()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=livingSize%20lt%201452";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=livingSize%20lt%201452";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest444()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=livingSize%20le%202145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=livingSize%20le%202145";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest445()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=livingSize%20le%202000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=livingSize%20le%202000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest446()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotNum%20in%20(112,116)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotNum%20in%20(112,116)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest447()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotNum%20in%20(108,114,16)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotNum%20in%20(108,114,16)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest448()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotNum%20eq%2039";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotNum%20eq%2039";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest449()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotNum%20eq%20110";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotNum%20eq%20110";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest450()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotNum%20ne%2015";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotNum%20ne%2015";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest451()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotNum%20ne%20118";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotNum%20ne%20118";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest452()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize1%20eq%200.0523";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize1%20eq%200.0523";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest453()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize1%20eq%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize1%20eq%200.0262";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest454()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize1%20ne%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize1%20ne%200.0262";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest455()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize1%20ne%200.1436";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize1%20ne%200.1436";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest456()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize1%20gt%200.1047";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize1%20gt%200.1047";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest457()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotSize1%20gt%200.4017";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotSize1%20gt%200.4017";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest458()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lotSize1%20ge%200.0551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lotSize1%20ge%200.0551";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest459()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lotSize1%20ge%200.7576";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lotSize1%20ge%200.7576";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest460()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lotSize1%20lt%201.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lotSize1%20lt%201.13";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest461()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lotSize1%20lt%200.6061";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lotSize1%20lt%200.6061";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest462()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lotSize1%20le%200.0892";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lotSize1%20le%200.0892";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest463()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotSize1%20le%200.11";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotSize1%20le%200.11";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest464()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotSize2%20eq%2012632";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotSize2%20eq%2012632";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest465()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotSize2%20eq%2017860";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotSize2%20eq%2017860";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest466()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotSize2%20ne%208712";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotSize2%20ne%208712";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest467()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotSize2%20ne%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotSize2%20ne%202100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest468()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=lotSize2%20gt%2010890";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=lotSize2%20gt%2010890";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest469()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=lotSize2%20gt%203885";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=lotSize2%20gt%203885";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest470()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=lotSize2%20ge%2010000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=lotSize2%20ge%2010000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest471()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize2%20ge%2051401";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize2%20ge%2051401";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest472()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize2%20lt%204830";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize2%20lt%204830";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest473()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize2%20lt%2051660";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize2%20lt%2051660";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest474()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize2%20le%2020230";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize2%20le%2020230";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest475()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize2%20le%205500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize2%20le%205500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest476()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotType%20in%20(I,IRR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotType%20in%20(I,IRR)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest477()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotType%20eq%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotType%20eq%20IRR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest478()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotType%20eq%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotType%20eq%20I";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest479()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotType%20ne%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotType%20ne%20I";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest480()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotType%20ne%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotType%20ne%20IRR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest481()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgPct%20eq%200.4031";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgPct%20eq%200.4031";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest482()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgPct%20eq%201.0371";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgPct%20eq%201.0371";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest483()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgPct%20ne%2081.1657";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgPct%20ne%2081.1657";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest484()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgPct%20ne%20-0.4787";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgPct%20ne%20-0.4787";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest485()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgPct%20gt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgPct%20gt%200.6411";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest486()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=monthlyChgPct%20gt%200.3615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=monthlyChgPct%20gt%200.3615";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest487()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=monthlyChgPct%20ge%200.2557";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=monthlyChgPct%20ge%200.2557";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest488()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=monthlyChgPct%20ge%200.0869";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=monthlyChgPct%20ge%200.0869";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest489()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=monthlyChgPct%20lt%200.1245";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=monthlyChgPct%20lt%200.1245";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest490()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=monthlyChgPct%20lt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=monthlyChgPct%20lt%200.6411";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest491()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=monthlyChgPct%20le%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=monthlyChgPct%20le%200.44";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest492()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=monthlyChgPct%20le%200.0925";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=monthlyChgPct%20le%200.0925";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest493()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=monthlyChgValue%20eq%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=monthlyChgValue%20eq%203048";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest494()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=monthlyChgValue%20eq%20155";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=monthlyChgValue%20eq%20155";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest495()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=monthlyChgValue%20ne%20-839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=monthlyChgValue%20ne%20-839";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest496()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=monthlyChgValue%20ne%202217";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=monthlyChgValue%20ne%202217";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest497()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=monthlyChgValue%20gt%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=monthlyChgValue%20gt%203048";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest498()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=monthlyChgValue%20gt%201281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=monthlyChgValue%20gt%201281";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest499()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=monthlyChgValue%20ge%20822";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=monthlyChgValue%20ge%20822";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest500()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgValue%20ge%201914";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgValue%20ge%201914";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest501()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgValue%20lt%201977";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgValue%20lt%201977";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest502()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgValue%20lt%20758";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgValue%20lt%20758";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest503()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgValue%20le%2065745";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgValue%20le%2065745";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest504()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgValue%20le%20-21";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgValue%20le%20-21";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest505()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest506()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest507()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest508()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest509()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest510()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest511()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=obPropId%20in%20(10003164371,10003164573)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=obPropId%20in%20(10003164371,10003164573)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest512()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest513()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=obPropId%20eq%2010005293290";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=obPropId%20eq%2010005293290";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest514()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=obPropId%20eq%2010005293302";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=obPropId%20eq%2010005293302";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest515()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=obPropId%20ne%2010005293281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=obPropId%20ne%2010005293281";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest516()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=obPropId%20ne%2010003177976";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=obPropId%20ne%2010003177976";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest517()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest518()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest519()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=parkingType%20eq%20%27CEDAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=parkingType%20eq%20%27CEDAR%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest520()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest521()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest522()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=parkingType%20ne%20%27UNCOVERED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=parkingType%20ne%20%27UNCOVERED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest523()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=poolInd%20eq%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=poolInd%20eq%20Y";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest524()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolInd%20eq%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolInd%20eq%20N";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest525()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolInd%20ne%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolInd%20ne%20Y";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest526()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolInd%20ne%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolInd%20ne%20N";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest527()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest528()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest529()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest530()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest531()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=poolType%20ne%20%27FISH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=poolType%20ne%20%27FISH%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest532()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest533()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest534()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest535()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=propInd%20eq%20%27HOSPITAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=propInd%20eq%20%27HOSPITAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest536()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest537()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest538()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=propInd%20ne%20%27WAREHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=propInd%20ne%20%27WAREHOUSE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest539()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=rangePctOfValue%20eq%2026.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=rangePctOfValue%20eq%2026.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest540()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=rangePctOfValue%20eq%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=rangePctOfValue%20eq%2020.0003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest541()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=rangePctOfValue%20ne%2024.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=rangePctOfValue%20ne%2024.0003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest542()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=rangePctOfValue%20ne%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=rangePctOfValue%20ne%2023.9998";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest543()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=rangePctOfValue%20gt%2024.0001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=rangePctOfValue%20gt%2024.0001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest544()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=rangePctOfValue%20gt%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=rangePctOfValue%20gt%2020.0003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest545()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=rangePctOfValue%20ge%2019.9999";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=rangePctOfValue%20ge%2019.9999";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest546()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=rangePctOfValue%20ge%2024.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=rangePctOfValue%20ge%2024.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest547()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=rangePctOfValue%20lt%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=rangePctOfValue%20lt%2023.9998";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest548()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=rangePctOfValue%20lt%2022.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=rangePctOfValue%20lt%2022.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest549()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=rangePctOfValue%20le%2020.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=rangePctOfValue%20le%2020.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest550()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=rangePctOfValue%20le%2015.9996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=rangePctOfValue%20le%2015.9996";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest551()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest552()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest553()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofCover%20eq%20%27ROCK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofCover%20eq%20%27ROCK%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest554()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest555()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest556()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest557()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest558()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest559()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofType%20eq%20%27FRAME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest560()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofType%20eq%20%27CANOPY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofType%20eq%20%27CANOPY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest561()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest562()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=roofType%20ne%20%27GABLE/HIP%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=roofType%20ne%20%27GABLE/HIP%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest563()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=saleAmt%20eq%20115000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=saleAmt%20eq%20115000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest564()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleAmt%20eq%20169900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleAmt%20eq%20169900";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest565()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleAmt%20ne%20248000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleAmt%20ne%20248000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest566()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleAmt%20ne%20368474";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleAmt%20ne%20368474";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest567()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleAmt%20gt%2052000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleAmt%20gt%2052000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest568()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleAmt%20gt%20338400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleAmt%20gt%20338400";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest569()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleAmt%20ge%20290000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleAmt%20ge%20290000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest570()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleAmt%20ge%20184565";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleAmt%20ge%20184565";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest571()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleAmt%20lt%20149990";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleAmt%20lt%20149990";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest572()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleAmt%20lt%20188615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleAmt%20lt%20188615";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest573()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleAmt%20le%20180840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleAmt%20le%20180840";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest574()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleAmt%20le%20170299";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleAmt%20le%20170299";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest575()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleDocNum%20in%20(53005,121159)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleDocNum%20in%20(53005,121159)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest576()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleDocNum%20in%20(43221,145144,40031)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleDocNum%20in%20(43221,145144,40031)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest577()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleDocNum%20eq%20108301";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleDocNum%20eq%20108301";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest578()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleDocNum%20eq%2063918";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleDocNum%20eq%2063918";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest579()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleDocNum%20ne%202944000082";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleDocNum%20ne%202944000082";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest580()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=saleDocNum%20ne%2027361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=saleDocNum%20ne%2027361";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest581()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleTransDate%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleTransDate%20eq%20%272014-07-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest582()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleTransDate%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleTransDate%20eq%20%272015-01-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest583()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleTransDate%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleTransDate%20ne%20%272014-07-23%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest584()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleTransDate%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleTransDate%20ne%20%272014-08-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest585()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransDate%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransDate%20gt%20%272014-11-12%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest586()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransDate%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransDate%20gt%20%272014-08-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest587()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransDate%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransDate%20ge%20%272014-11-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest588()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransDate%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransDate%20ge%20%272014-03-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest589()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransDate%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransDate%20lt%20%272014-09-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest590()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransDate%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransDate%20lt%20%272014-02-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest591()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleTransDate%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleTransDate%20le%20%272015-01-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest592()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleTransDate%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleTransDate%20le%20%272014-08-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest593()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest594()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest595()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest596()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest597()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest598()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest599()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest600()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	
	@Test
	public void byPostalSnapshotTest601()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest602()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest603()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleSearchDate%20le%20%272013-08-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleSearchDate%20le%20%272013-08-19%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest604()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleSearchDate%20le%20%272006-05-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleSearchDate%20le%20%272006-05-02%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest605()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest606()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest607()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransType%20eq%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransType%20eq%20%27RESALE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest608()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest609()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransType%20ne%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransType%20ne%20%27RESALE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest610()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest611()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleType%20eq%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleType%20eq%20%27Full%20Value%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest612()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleType%20ne%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleType%20ne%20%27Full%20Value%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest613()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest614()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest615()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=sewerType%20eq%20%27SEPTIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=sewerType%20eq%20%27SEPTIC%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest616()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=sewerType%20eq%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=sewerType%20eq%20%27NONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest617()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest618()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest619()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest620()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest621()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest622()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=style%20eq%20%27RAISED%20RANCH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=style%20eq%20%27RAISED%20RANCH%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest623()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=style%20ne%20%27MANSION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=style%20ne%20%27MANSION%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest624()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=style%20ne%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=style%20ne%20%27MOBILE%20HOME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest625()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&page=1&size=30&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&page=1&size=30&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest626()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest627()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest628()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest629()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=subdName%20ne%20%27MERESTONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=subdName%20ne%20%27MERESTONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest630()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest631()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=subdTractNum%20in%20(1-A,1-B)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=subdTractNum%20in%20(1-A,1-B)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest632()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=subdTractNum%20in%20(A,B,C,D)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=subdTractNum%20in%20(A,B,C,D)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest633()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=subdTractNum%20eq%20323";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=subdTractNum%20eq%20323";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest634()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=subdTractNum%20eq%2050";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=subdTractNum%20eq%2050";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest635()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdTractNum%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdTractNum%20ne%2001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest636()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdTractNum%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdTractNum%20ne%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest637()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=taxAmt%20eq%2023778.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=taxAmt%20eq%2023778.31";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest638()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=taxAmt%20eq%201952.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=taxAmt%20eq%201952.07";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest639()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=taxAmt%20ne%207217.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=taxAmt%20ne%207217.81";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest640()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=taxAmt%20ne%201676.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=taxAmt%20ne%201676.44";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest641()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=taxAmt%20gt%20108596.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=taxAmt%20gt%20108596.29";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest642()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxAmt%20gt%20865880.7";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxAmt%20gt%20865880.7";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest643()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxAmt%20ge%20343074.19";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxAmt%20ge%20343074.19";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest644()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxAmt%20ge%201009.04";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxAmt%20ge%201009.04";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest645()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxAmt%20lt%20279168.77";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxAmt%20lt%20279168.77";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest646()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxAmt%20lt%2032139.73";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxAmt%20lt%2032139.73";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest647()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxAmt%20le%2010840.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxAmt%20le%2010840.59";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest648()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxAmt%20le%20503848.67";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxAmt%20le%20503848.67";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest649()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxCodeArea%20in%20(04,08)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxCodeArea%20in%20(04,08)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest650()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxCodeArea%20in%20(20,10,18)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxCodeArea%20in%20(20,10,18)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest651()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxCodeArea%20eq%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxCodeArea%20eq%2011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest652()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxCodeArea%20eq%2006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxCodeArea%20eq%2006";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest653()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxCodeArea%20ne%2000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxCodeArea%20ne%2000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest654()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxCodeArea%20ne%2021";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxCodeArea%20ne%2021";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest655()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxPerSizeUnit%20eq%200.43";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxPerSizeUnit%20eq%200.43";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest656()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxPerSizeUnit%20eq%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxPerSizeUnit%20eq%200.25";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest657()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxPerSizeUnit%20ne%200.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxPerSizeUnit%20ne%200.07";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest658()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxPerSizeUnit%20ne%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxPerSizeUnit%20ne%200.42";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest659()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxPerSizeUnit%20gt%200.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxPerSizeUnit%20gt%200.46";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest660()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxPerSizeUnit%20gt%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxPerSizeUnit%20gt%200.25";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest661()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxPerSizeUnit%20ge%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxPerSizeUnit%20ge%200.44";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest662()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=taxPerSizeUnit%20ge%200.53";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=taxPerSizeUnit%20ge%200.53";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest663()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=taxPerSizeUnit%20lt%200.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=taxPerSizeUnit%20lt%200.59";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest664()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=taxPerSizeUnit%20lt%200.37";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=taxPerSizeUnit%20lt%200.37";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest665()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=taxPerSizeUnit%20le%200.52";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=taxPerSizeUnit%20le%200.52";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest666()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=taxPerSizeUnit%20le%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=taxPerSizeUnit%20le%200.42";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest667()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=totalRooms%20eq%208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=totalRooms%20eq%208";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest668()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=totalRooms%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=totalRooms%20eq%2010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest669()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=totalRooms%20ne%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=totalRooms%20ne%207";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest670()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=totalRooms%20ne%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=totalRooms%20ne%206";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest671()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=totalRooms%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest672()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=totalRooms%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=totalRooms%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest673()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=totalRooms%20ge%209";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=totalRooms%20ge%209";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest674()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=totalRooms%20ge%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=totalRooms%20ge%207";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest675()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=totalRooms%20lt%205";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=totalRooms%20lt%205";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest676()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=totalRooms%20lt%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=totalRooms%20lt%206";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest677()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=totalRooms%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=totalRooms%20le%2011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest678()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=totalRooms%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=totalRooms%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest679()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=unitsCount%20eq%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=unitsCount%20eq%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest680()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=unitsCount%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=unitsCount%20eq%2010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest681()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=unitsCount%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=unitsCount%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest682()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=unitsCount%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=unitsCount%20ne%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest683()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=unitsCount%20gt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=unitsCount%20gt%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest684()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=unitsCount%20gt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=unitsCount%20gt%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest685()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=unitsCount%20ge%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=unitsCount%20ge%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest686()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=unitsCount%20ge%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=unitsCount%20ge%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest687()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=unitsCount%20lt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=unitsCount%20lt%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest688()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=unitsCount%20lt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=unitsCount%20lt%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest689()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=unitsCount%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=unitsCount%20le%2011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest690()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=unitsCount%20le%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=unitsCount%20le%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest691()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=universalSize%20eq%204124";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=universalSize%20eq%204124";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest692()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=universalSize%20eq%201600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=universalSize%20eq%201600";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest693()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=universalSize%20ne%202644";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=universalSize%20ne%202644";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest694()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=universalSize%20ne%204208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=universalSize%20ne%204208";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest695()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=universalSize%20gt%201768";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=universalSize%20gt%201768";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest696()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=universalSize%20gt%202043";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=universalSize%20gt%202043";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest697()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=universalSize%20ge%202151";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=universalSize%20ge%202151";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest698()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=universalSize%20ge%204184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=universalSize%20ge%204184";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest699()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=universalSize%20lt%203076";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=universalSize%20lt%203076";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest700()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=universalSize%20lt%201871";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=universalSize%20lt%201871";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest701()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=universalSize%20le%202967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=universalSize%20le%202967";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest702()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=universalSize%20le%201536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=universalSize%20le%201536";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest703()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest704()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest705()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=view%20eq%20%27RECREATIONAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=view%20eq%20%27RECREATIONAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest706()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=view%20eq%20%27STREET%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=view%20eq%20%27STREET%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest707()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=view%20ne%20%27WATER%20VIEW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=view%20ne%20%27WATER%20VIEW%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest708()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=view%20ne%20%27SUBURBAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=view%20ne%20%27SUBURBAN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest709()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest710()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest711()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=waterType%20eq%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=waterType%20eq%20%27WELL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest712()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=waterType%20eq%20%27PUBLIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=waterType%20eq%20%27PUBLIC%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest713()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=waterType%20ne%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=waterType%20ne%20%27NONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest714()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=waterType%20ne%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=waterType%20ne%20%27WELL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest715()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuilt%20in%20(2001,2005)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuilt%20in%20(2001,2005)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest716()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest717()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuilt%20eq%202010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuilt%20eq%202010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest718()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20eq%202007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20eq%202007";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest719()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuilt%20ne%201967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuilt%20ne%201967";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest720()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuilt%20ne%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuilt%20ne%202006";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest721()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuilt%20gt%202008";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuilt%20gt%202008";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest722()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuilt%20gt%202011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuilt%20gt%202011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest723()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuilt%20ge%202005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuilt%20ge%202005";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest724()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=yearBuilt%20ge%202009";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=yearBuilt%20ge%202009";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest725()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=yearBuilt%20lt%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=yearBuilt%20lt%202006";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest726()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=yearBuilt%20lt%201997";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=yearBuilt%20lt%201997";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest727()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=yearBuilt%20le%202002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=yearBuilt%20le%202002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest728()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=yearBuilt%20le%201983";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=yearBuilt%20le%201983";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest729()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=yearBuiltEffective%20in%20(1996,1978)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=yearBuiltEffective%20in%20(1996,1978)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest730()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest731()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=yearBuiltEffective%20eq%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=yearBuiltEffective%20eq%201994";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest732()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=yearBuiltEffective%20eq%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=yearBuiltEffective%20eq%201991";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest733()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=yearBuiltEffective%20ne%201982";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=yearBuiltEffective%20ne%201982";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest734()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuiltEffective%20ne%201988";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuiltEffective%20ne%201988";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest735()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuiltEffective%20gt%201989";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuiltEffective%20gt%201989";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest736()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuiltEffective%20gt%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuiltEffective%20gt%201996";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest737()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuiltEffective%20ge%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuiltEffective%20ge%201994";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest738()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuiltEffective%20ge%201993";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuiltEffective%20ge%201993";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest739()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuiltEffective%20lt%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuiltEffective%20lt%201991";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest740()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuiltEffective%20lt%201980";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuiltEffective%20lt%201980";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest741()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuiltEffective%20le%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuiltEffective%20le%201996";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest742()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuiltEffective%20le%201992";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuiltEffective%20le%201992";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest743()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=zoning%20in%20(TN,MR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=zoning%20in%20(TN,MR)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest744()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=zoning%20in%20(AR1,NC40,ON)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=zoning%20in%20(AR1,NC40,ON)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest745()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=zoning%20eq%20R1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=zoning%20eq%20R1";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest746()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=zoning%20eq%20AR1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=zoning%20eq%20AR1";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest747()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=zoning%20ne%20MR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=zoning%20ne%20MR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalSnapshotTest748()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=zoning%20ne%20CR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=zoning%20ne%20CR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/snapshots/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	
}



