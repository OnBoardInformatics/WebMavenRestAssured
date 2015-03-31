package TestingPackage;
 
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class ZipSummaries {
	
	/*
	@Test
	public void Test00()
	{
		int result = getTotalRadius00();
		byZipSummariesTest00(result);
		byZipSummariesTest00(result);	
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
                    get("/properties/summaries/zip?zip={q}", query).
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
	public void byZipSummariesTest00(int result)
	{
		 try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(result)).
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	*/
	
	@Test
	public void byZipSummariesTest000()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	 }   	
	/*
	@Test
	public void byZipSummariesTest001()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest002()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest003()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	*/
	@Test
	public void byZipSummariesTest004()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest005()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19930&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	/*
	@Test
	public void byZipSummariesTest006()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=absenteeOwner%20in%20(%27OCCUPIED%27,%27ABSENTEE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byZipSummariesTest007()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byZipSummariesTest008()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest009()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest010()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byZipSummariesTest011()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest012()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byZipSummariesTest013()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrBldgName%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest014()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byZipSummariesTest015()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrBldgName%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest016()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=addrCountrySubd%20eq%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byZipSummariesTest017()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=addrCountrySubd%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest018()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrCountrySubd%20ne%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest019()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=addrPostal1%20in%20(19939,19934)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest020()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=addrPostal1%20in%20(19936,19938,19939)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest021()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrPostal1%20eq%2019711";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest022()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrPostal1%20eq%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest023()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=addrPostal1%20ne%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest024()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=addrPostal1%20ne%2019934";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest025()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=addrPostal3%20in%20(R001,R006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest026()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=addrPostal3%20in%20(C004,C001,C003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest027()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=addrPostal3%20eq%20R005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest028()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=addrPostal3%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest029()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=addrPostal3%20ne%20R007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest030()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=addrPostal3%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest031()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=apn%20in%20(1300300053300,0699999026)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest032()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest033()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=apn%20eq%2060077777010200000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest034()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=apn%20eq%200699999004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest035()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=apn%20ne%200699999013";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest036()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=apn%20ne%201099999007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest037()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2018.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest038()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2022.03";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest039()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2022.79";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest040()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest041()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2021.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest042()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2023.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest043()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprPerSizeUnit%20ge%209.12";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest044()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprPerSizeUnit%20ge%2018.78";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest045()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2017.95";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest046()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2018.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest047()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprPerSizeUnit%20le%2025.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest048()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprPerSizeUnit%20le%2024.56";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest049()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprValue%20eq%20349800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest050()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprValue%20eq%201331000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest051()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprValue%20ne%20314400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest052()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprValue%20ne%20712100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest053()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprValue%20gt%202882100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest054()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprValue%20gt%203562800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest055()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprValue%20ge%2055000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest056()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprValue%20ge%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest057()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprValue%20lt%209158900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest058()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdImprValue%20lt%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest059()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdImprValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest060()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdImprValue%20le%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest061()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.09";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest062()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.15";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest063()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.39";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest064()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest065()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.18";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest066()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.20";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest067()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest068()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest069()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest070()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest071()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest072()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.58";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest073()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandValue%20eq%201250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest074()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandValue%20eq%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest075()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdLandValue%20ne%20550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest076()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdLandValue%20ne%20350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest077()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdLandValue%20gt%2011500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest078()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdLandValue%20gt%203750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest079()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdLandValue%20ge%201400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest080()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdLandValue%20ge%202250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest081()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdLandValue%20lt%20180000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest082()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdLandValue%20lt%204000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest083()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdLandValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest084()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandValue%20le%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest085()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.55";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest086()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byZipSummariesTest088()
	{
		//This will fail.
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}  
	
	@Test
	public void byZipSummariesTest087()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest089()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%203.87";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest090()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%208.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest091()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%204.69";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest092()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%206.47";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest093()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%205.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest094()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest095()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%201.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest096()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlPerSizeUnit%20le%206.01";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest097()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlPerSizeUnit%20le%204.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest098()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlValue%20eq%201350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest099()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlValue%20eq%20950";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest100()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlValue%20ne%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest101()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlValue%20ne%203150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest102()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlValue%20gt%206350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest103()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdTtlValue%20gt%2010100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest104()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdTtlValue%20ge%2011350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest105()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdTtlValue%20ge%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest106()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdTtlValue%20lt%2050514";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest107()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdTtlValue%20lt%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest108()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdTtlValue%20le%202200";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest109()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdTtlValue%20le%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest110()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValue%20eq%20282783";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest111()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValue%20eq%20256143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest112()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=avmValue%20ne%20308184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest113()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValue%20ne%20284655";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest114()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValue%20gt%20146746";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest115()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValue%20gt%20210985";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest116()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValue%20ge%20178941";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest117()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValue%20ge%20183298";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest118()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValue%20lt%20174434";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest119()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValue%20lt%20292084";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest120()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValue%20le%20319040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest121()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValue%20le%20217032";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest122()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueHigh%20eq%20202343";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest123()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueHigh%20eq%20350393";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest124()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueHigh%20ne%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest125()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueHighv%20ne%20209361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest126()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueHigh%20gt%20357325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest127()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=avmValueHigh%20gt%20344503";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest128()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=avmValueHigh%20ge%20367949";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest129()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=avmValueHigh%20ge%20214459";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest130()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=avmValueHigh%20lt%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest131()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=avmValueHigh%20lt%20209249";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest132()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValueHigh%20le%20333046";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest133()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValueHigh%20le%20316717";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest134()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValueLow%20eq%20218170";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest135()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValueLow%20eq%20190325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest136()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValueLow%20ne%20117881";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest137()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValueLow%20ne%20128911";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest138()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValueLow%20gt%2062516";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest139()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValueLow%20gt%2080338";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest140()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValueLow%20ge%20148136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest141()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueLow%20ge%20222536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest142()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueLow%20lt%20132135";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest143()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueLow%20lt%20171907";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest144()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueLow%20le%20148794";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest145()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueLow%20le%2093896";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest146()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=baths1Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest147()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=baths1Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest148()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=baths1Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest149()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=baths1Qtr%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest150()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=baths1Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest151()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=baths1Qtr%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest152()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=baths1Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest153()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths1Qtr%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest154()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths1Qtr%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest155()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths1Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest156()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths1Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest157()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths1Qtr%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest158()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths3Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest159()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths3Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest160()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths3Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest161()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths3Qtr%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest162()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths3Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest163()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=baths3Qtr%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest164()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=baths3Qtr%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest165()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=baths3Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest166()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=baths3Qtr%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest167()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=baths3Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest168()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=baths3Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest169()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=baths3Qtr%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest170()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsCalc%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest171()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsCalc%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest172()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsCalc%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest173()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsCalc%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest174()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsCalc%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest175()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsCalc%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest176()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsCalc%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest177()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsCalc%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest178()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsCalc%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest179()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsCalc%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest180()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsCalc%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest181()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsCalc%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest182()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsFull%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest183()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsFull%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest184()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsFull%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest185()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsFull%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest186()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsFull%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest187()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bathsFull%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest188()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bathsFull%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest189()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsFull%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest190()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsFull%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest191()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsFull%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest192()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsFull%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest193()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsFull%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest194()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsHalf%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest195()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsHalf%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest196()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsHalf%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest197()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsHalf%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest198()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsHalf%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest199()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsHalf%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest200()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsHalf%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byZipSummariesTest201()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsHalf%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest202()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsHalf%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest203()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsHalf%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest204()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsHalf%20le%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest205()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsHalf%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest206()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsTotal%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest207()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsTotal%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest208()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsTotal%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest209()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsTotal%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest210()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsTotal%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest211()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsTotal%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest212()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsTotal%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest213()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsTotal%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest214()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsTotal%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest215()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsTotal%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest216()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsTotal%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest217()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsTotal%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest218()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=beds%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest219()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=beds%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest220()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=beds%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest221()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=beds%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest222()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=beds%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest223()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=beds%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest224()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=beds%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest225()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=beds%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest226()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=beds%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest227()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=beds%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest228()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=beds%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest229()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=beds%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest230()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bldgSize%20eq%203500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest231()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bldgSize%20eq%201150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest232()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bldgSize%20ne%202650";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest233()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bldgSize%20ne%201125";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest234()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bldgSize%20gt%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest235()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bldgSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest236()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgSize%20ge%202425";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest237()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgSize%20ge%201525";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest238()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgSize%20lt%201850";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest239()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgSize%20lt%203675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest240()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgSize%20le%202550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest241()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgSize%20le%201630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest242()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgsNum%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest243()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgsNum%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest244()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgsNum%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest245()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgsNum%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest246()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgsNum%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest247()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgsNum%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest248()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgsNum%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest249()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgsNum%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest250()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgsNum%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest251()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bldgsNum%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest252()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bldgsNum%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest253()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bldgsNum%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest254()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest255()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest256()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgType%20eq%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest257()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest258()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest259()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest260()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=block%20in%20(E,Y)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest261()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=block%20in%20(D,T,F)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest262()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=block%20eq%20A";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest263()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=block%20eq%20B";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest264()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=block%20ne%20C";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest265()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=block%20ne%20D";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest266()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtSize%20eq%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest267()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bsmtSize%20eq%201040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest268()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtSize%20ne%201240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest269()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bsmtSize%20ne%201251";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest270()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bsmtSize%20gt%201419";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest271()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bsmtSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest272()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bsmtSize%20ge%201930";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest273()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bsmtSize%20ge%201092";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest274()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bsmtSize%20lt%201766";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest275()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bsmtSize%20lt%201551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest276()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bsmtSize%20le%201839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest277()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bsmtSize%20le%201073";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest278()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest279()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest280()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=censusId%20in%20(100010410001069,100010401001010)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest281()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest282()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=censusId%20eq%20100010410001069";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest283()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=censusId%20eq%20100050512031012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest284()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=censusId%20ne%20100010401001010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest285()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=censusId%20ne%20100010413001033";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest286()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest287()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest288()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest289()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=constructionType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byZipSummariesTest290()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
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
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byZipSummariesTest292()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest293()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=coolingType%20eq%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest294()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest295()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=coolingType%20ne%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest296()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest297()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=dateValuation%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest298()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=dateValuation%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest299()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=dateValuation%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest300()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=dateValuation%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest301()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=dateValuation%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest302()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=dateValuation%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest303()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=dateValuation%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest304()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=dateValuation%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest305()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=dateValuation%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest306()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=dateValuation%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest307()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=dateValuation%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest308()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=dateValuation%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest309()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=depth%20eq%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest310()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=depth%20eq%20180";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest311()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=depth%20ne%20140";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest312()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=depth%20ne%20160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest313()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=depth%20gt%20142";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest314()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=depth%20gt%20130";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest315()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=depth%20ge%20167";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest316()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=depth%20ge%20145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest317()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=depth%20lt%20136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest318()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=depth%20lt%20106";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest319()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=depth%20le%20119";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest320()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=depth%20le%20231";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest321()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest322()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest323()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest324()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest325()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest326()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest327()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest328()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest329()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=extWalls%20eq%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest330()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=extWalls%20eq%20%27ALUMINUM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest331()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=extWalls%20ne%20%27BRICK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest332()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=extWalls%20ne%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest333()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fips%20in%20(10001,10003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest334()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fips%20in%20(10002,10004,10006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest335()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fips%20eq%2010002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest336()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fips%20eq%2010004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest337()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fips%20ne%2010003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest338()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fips%20ne%2010001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest339()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest340()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest341()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=foundationType%20eq%20%27PILINGS%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest342()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=foundationType%20eq%20%27SLAB%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest343()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=foundationType%20ne%20%27CONCRETE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest344()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=foundationType%20ne%20%27MASONRY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest345()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcCount%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest346()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fplcCount%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest347()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fplcCount%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest348()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fplcCount%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byZipSummariesTest349()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fplcCount%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byZipSummariesTest350()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fplcCount%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byZipSummariesTest351()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=fplcCount%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest352()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=fplcCount%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest353()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=fplcCount%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest354()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=fplcCount%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest355()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcCount%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest356()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcCount%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest357()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcInd%20eq%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest358()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcInd%20eq%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest359()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=fplcInd%20ne%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest360()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=fplcInd%20ne%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest361()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest362()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest363()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest364()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=frame%20eq%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest365()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=frame%20eq%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest366()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=frame%20ne%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest367()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=frame%20ne%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest368()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=frontage%20eq%2019";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest369()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=frontage%20eq%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest370()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=frontage%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest371()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=frontage%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest372()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=frontage%20gt%20214";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest373()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=frontage%20gt%20143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest374()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=frontage%20ge%20150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest375()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=frontage%20ge%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest376()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=frontage%20lt%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest377()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=frontage%20lt%2036";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest378()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=frontage%20le%2055";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest379()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=frontage%20le%20105";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest380()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=garageSize%20eq%20242";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest381()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageSize%20eq%20483";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest382()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageSize%20ne%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest383()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageSize%20ne%20511";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest384()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageSize%20gt%20630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest385()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageSize%20gt%20600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest386()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageSize%20ge%20840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest387()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=garageSize%20ge%20480";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest388()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=garageSize%20lt%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest389()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=garageSize%20lt%20441";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest390()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=garageSize%20le%20206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest391()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=garageSize%20le%20454";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest392()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest393()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest394()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest395()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest396()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest397()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest398()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=groundFloorSize%20eq%202347";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest399()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=groundFloorSize%20eq%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest400()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=groundFloorSize%20ne%201090";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest401()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=groundFloorSize%20ne%202571";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest402()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=groundFloorSize%20gt%201664";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest403()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=groundFloorSize%20gt%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest404()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=groundFloorSize%20ge%201388";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest405()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=groundFloorSize%20ge%20912";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest406()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=groundFloorSize%20lt%201160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest407()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=groundFloorSize%20lt%202868";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest408()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=groundFloorSize%20le%201753";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest409()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=groundFloorSize%20le%201560";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 

	@Test
	public void byZipSummariesTest410()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest411()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest412()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest413()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest414()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=heatingType%20ne%20%27OIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest415()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest416()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest417()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest418()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest419()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=landUse%20eq%20%27HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest420()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest421()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=landUse%20ne%20%27DUPLEX%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest422()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lastModified%20eq%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest423()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lastModified%20eq%20%272014-11-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest424()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lastModified%20ne%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest425()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lastModified%20ne%20%272014-10-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest426()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lastModified%20gt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest427()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lastModified%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest428()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lastModified%20ge%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest429()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=lastModified%20ge%20%272014-12-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest430()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lastModified%20lt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest431()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lastModified%20lt%20%272014-09-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest432()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lastModified%20le%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest433()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lastModified%20le%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest434()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=livingSize%20eq%202307";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest435()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=livingSize%20eq%201172";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest436()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=livingSize%20ne%203023";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest437()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=livingSize%20ne%201396";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest438()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=livingSize%20gt%202597";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest439()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=livingSize%20gt%201344";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest440()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=livingSize%20ge%201771";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest441()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=livingSize%20ge%201420";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest442()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=livingSize%20lt%202240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest443()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=livingSize%20lt%201452";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest444()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=livingSize%20le%202145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest445()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=livingSize%20le%202000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest446()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotNum%20in%20(112,116)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest447()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotNum%20in%20(108,114,16)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest448()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotNum%20eq%2039";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest449()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotNum%20eq%20110";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest450()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotNum%20ne%2015";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest451()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotNum%20ne%20118";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest452()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize1%20eq%200.0523";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest453()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize1%20eq%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest454()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize1%20ne%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest455()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize1%20ne%200.1436";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest456()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize1%20gt%200.1047";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest457()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotSize1%20gt%200.4017";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest458()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lotSize1%20ge%200.0551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest459()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lotSize1%20ge%200.7576";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest460()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lotSize1%20lt%201.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest461()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lotSize1%20lt%200.6061";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest462()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lotSize1%20le%200.0892";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest463()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotSize1%20le%200.11";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest464()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotSize2%20eq%2012632";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest465()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotSize2%20eq%2017860";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest466()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotSize2%20ne%208712";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest467()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotSize2%20ne%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest468()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=lotSize2%20gt%2010890";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest469()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=lotSize2%20gt%203885";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest470()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=lotSize2%20ge%2010000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest471()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize2%20ge%2051401";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest472()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize2%20lt%204830";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest473()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize2%20lt%2051660";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest474()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize2%20le%2020230";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest475()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize2%20le%205500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest476()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotType%20in%20(I,IRR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest477()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotType%20eq%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest478()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotType%20eq%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest479()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotType%20ne%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest480()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotType%20ne%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest481()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgPct%20eq%200.4031";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest482()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgPct%20eq%201.0371";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest483()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgPct%20ne%2081.1657";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest484()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgPct%20ne%20-0.4787";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest485()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgPct%20gt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest486()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=monthlyChgPct%20gt%200.3615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest487()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=monthlyChgPct%20ge%200.2557";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest488()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=monthlyChgPct%20ge%200.0869";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest489()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=monthlyChgPct%20lt%200.1245";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest490()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=monthlyChgPct%20lt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest491()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=monthlyChgPct%20le%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest492()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=monthlyChgPct%20le%200.0925";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest493()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=monthlyChgValue%20eq%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest494()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=monthlyChgValue%20eq%20155";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest495()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=monthlyChgValue%20ne%20-839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest496()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=monthlyChgValue%20ne%202217";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest497()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=monthlyChgValue%20gt%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest498()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=monthlyChgValue%20gt%201281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest499()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=monthlyChgValue%20ge%20822";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest500()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgValue%20ge%201914";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest501()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgValue%20lt%201977";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest502()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgValue%20lt%20758";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest503()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgValue%20le%2065745";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest504()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgValue%20le%20-21";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest505()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest506()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest507()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest508()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest509()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest510()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest511()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=obPropId%20in%20(10003164371,10003164573)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest512()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest513()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=obPropId%20eq%2010005293290";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest514()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=obPropId%20eq%2010005293302";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest515()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=obPropId%20ne%2010005293281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	@Test
	public void byZipSummariesTest516()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=obPropId%20ne%2010003177976";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest517()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest518()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	/*
	@Test
	public void byZipSummariesTest519()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=parkingType%20eq%20%27CEDAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest520()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest521()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest522()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=parkingType%20ne%20%27UNCOVERED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest523()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=poolInd%20eq%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest524()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolInd%20eq%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest525()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolInd%20ne%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest526()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolInd%20ne%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest527()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest528()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest529()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest530()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest531()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=poolType%20ne%20%27FISH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest532()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest533()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest534()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest535()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=propInd%20eq%20%27HOSPITAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest536()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest537()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest538()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=propInd%20ne%20%27WAREHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest539()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=rangePctOfValue%20eq%2026.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest540()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=rangePctOfValue%20eq%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest541()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=rangePctOfValue%20ne%2024.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest542()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=rangePctOfValue%20ne%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest543()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=rangePctOfValue%20gt%2024.0001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest544()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=rangePctOfValue%20gt%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest545()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=rangePctOfValue%20ge%2019.9999";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest546()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=rangePctOfValue%20ge%2024.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest547()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=rangePctOfValue%20lt%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest548()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=rangePctOfValue%20lt%2022.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest549()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=rangePctOfValue%20le%2020.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest550()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=rangePctOfValue%20le%2015.9996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest551()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest552()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest553()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofCover%20eq%20%27ROCK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest554()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest555()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest556()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest557()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest558()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest559()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest560()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofType%20eq%20%27CANOPY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest561()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest562()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=roofType%20ne%20%27GABLE/HIP%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest563()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=saleAmt%20eq%20115000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest564()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleAmt%20eq%20169900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest565()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleAmt%20ne%20248000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest566()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleAmt%20ne%20368474";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest567()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleAmt%20gt%2052000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest568()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleAmt%20gt%20338400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest569()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleAmt%20ge%20290000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest570()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleAmt%20ge%20184565";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest571()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleAmt%20lt%20149990";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest572()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleAmt%20lt%20188615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest573()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleAmt%20le%20180840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest574()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleAmt%20le%20170299";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest575()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleDocNum%20in%20(53005,121159)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest576()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleDocNum%20in%20(43221,145144,40031)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest577()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleDocNum%20eq%20108301";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest578()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleDocNum%20eq%2063918";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest579()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleDocNum%20ne%202944000082";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest580()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=saleDocNum%20ne%2027361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest581()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleTransDate%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest582()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleTransDate%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest583()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleTransDate%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest584()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleTransDate%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest585()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransDate%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest586()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransDate%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest587()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransDate%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest588()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransDate%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest589()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransDate%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest590()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransDate%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest591()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleTransDate%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest592()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleTransDate%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest593()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest594()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest595()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest596()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest597()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest598()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest599()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest600()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	
	@Test
	public void byZipSummariesTest601()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest602()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest603()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleSearchDate%20le%20%272013-08-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest604()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleSearchDate%20le%20%272006-05-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest605()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest606()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest607()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransType%20eq%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest608()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest609()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransType%20ne%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest610()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest611()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleType%20eq%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest612()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleType%20ne%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest613()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest614()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest615()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=sewerType%20eq%20%27SEPTIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest616()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=sewerType%20eq%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest617()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest618()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest619()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest620()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest621()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest622()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=style%20eq%20%27RAISED%20RANCH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest623()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=style%20ne%20%27MANSION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest624()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=style%20ne%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest625()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&page=1&size=30&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest626()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest627()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest628()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest629()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=subdName%20ne%20%27MERESTONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest630()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest631()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=subdTractNum%20in%20(1-A,1-B)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest632()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=subdTractNum%20in%20(A,B,C,D)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest633()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=subdTractNum%20eq%20323";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest634()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=subdTractNum%20eq%2050";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest635()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdTractNum%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest636()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdTractNum%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest637()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=taxAmt%20eq%2023778.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest638()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=taxAmt%20eq%201952.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest639()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=taxAmt%20ne%207217.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest640()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=taxAmt%20ne%201676.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest641()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=taxAmt%20gt%20108596.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest642()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxAmt%20gt%20865880.7";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest643()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxAmt%20ge%20343074.19";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest644()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxAmt%20ge%201009.04";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest645()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxAmt%20lt%20279168.77";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest646()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxAmt%20lt%2032139.73";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest647()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxAmt%20le%2010840.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest648()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxAmt%20le%20503848.67";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest649()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxCodeArea%20in%20(04,08)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest650()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxCodeArea%20in%20(20,10,18)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest651()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxCodeArea%20eq%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest652()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxCodeArea%20eq%2006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest653()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxCodeArea%20ne%2000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest654()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxCodeArea%20ne%2021";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest655()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxPerSizeUnit%20eq%200.43";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest656()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxPerSizeUnit%20eq%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest657()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxPerSizeUnit%20ne%200.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest658()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxPerSizeUnit%20ne%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest659()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxPerSizeUnit%20gt%200.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest660()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxPerSizeUnit%20gt%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest661()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxPerSizeUnit%20ge%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest662()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=taxPerSizeUnit%20ge%200.53";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest663()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=taxPerSizeUnit%20lt%200.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest664()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=taxPerSizeUnit%20lt%200.37";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest665()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=taxPerSizeUnit%20le%200.52";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest666()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=taxPerSizeUnit%20le%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest667()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=totalRooms%20eq%208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest668()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=totalRooms%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest669()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=totalRooms%20ne%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest670()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=totalRooms%20ne%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest671()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=totalRooms%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest672()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=totalRooms%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest673()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=totalRooms%20ge%209";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest674()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=totalRooms%20ge%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest675()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=totalRooms%20lt%205";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest676()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=totalRooms%20lt%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest677()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=totalRooms%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest678()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=totalRooms%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest679()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=unitsCount%20eq%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest680()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=unitsCount%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest681()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=unitsCount%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest682()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=unitsCount%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest683()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=unitsCount%20gt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest684()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=unitsCount%20gt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest685()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=unitsCount%20ge%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest686()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=unitsCount%20ge%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest687()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=unitsCount%20lt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest688()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=unitsCount%20lt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest689()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=unitsCount%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest690()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=unitsCount%20le%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest691()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=universalSize%20eq%204124";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest692()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=universalSize%20eq%201600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest693()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=universalSize%20ne%202644";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest694()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=universalSize%20ne%204208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest695()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=universalSize%20gt%201768";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest696()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=universalSize%20gt%202043";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest697()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=universalSize%20ge%202151";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest698()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=universalSize%20ge%204184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest699()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=universalSize%20lt%203076";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest700()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=universalSize%20lt%201871";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest701()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=universalSize%20le%202967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest702()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=universalSize%20le%201536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest703()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest704()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest705()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=view%20eq%20%27RECREATIONAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest706()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=view%20eq%20%27STREET%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest707()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=view%20ne%20%27WATER%20VIEW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest708()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=view%20ne%20%27SUBURBAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest709()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest710()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest711()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=waterType%20eq%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest712()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=waterType%20eq%20%27PUBLIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest713()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=waterType%20ne%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest714()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=waterType%20ne%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest715()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuilt%20in%20(2001,2005)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest716()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest717()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuilt%20eq%202010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest718()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20eq%202007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest719()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuilt%20ne%201967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest720()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuilt%20ne%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest721()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuilt%20gt%202008";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest722()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuilt%20gt%202011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest723()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuilt%20ge%202005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest724()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=yearBuilt%20ge%202009";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest725()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=yearBuilt%20lt%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest726()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=yearBuilt%20lt%201997";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest727()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=yearBuilt%20le%202002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest728()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=yearBuilt%20le%201983";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest729()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=yearBuiltEffective%20in%20(1996,1978)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest730()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest731()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=yearBuiltEffective%20eq%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest732()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=yearBuiltEffective%20eq%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest733()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=yearBuiltEffective%20ne%201982";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest734()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuiltEffective%20ne%201988";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest735()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuiltEffective%20gt%201989";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest736()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuiltEffective%20gt%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest737()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuiltEffective%20ge%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest738()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuiltEffective%20ge%201993";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest739()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuiltEffective%20lt%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest740()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuiltEffective%20lt%201980";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest741()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuiltEffective%20le%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest742()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuiltEffective%20le%201992";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest743()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=zoning%20in%20(TN,MR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest744()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=zoning%20in%20(AR1,NC40,ON)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest745()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=zoning%20eq%20R1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest746()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=zoning%20eq%20AR1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest747()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=zoning%20ne%20MR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byZipSummariesTest748()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=zoning%20ne%20CR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/zip?zip={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/summaries/zip?zip={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	
}



