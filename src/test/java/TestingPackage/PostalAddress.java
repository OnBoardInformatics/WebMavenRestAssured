package TestingPackage;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class PostalAddress {
	
	/*
	@Test
	public void Test00()
	{
		int result = getTotalRadius00();
		byPostalAddressTest00(result);
		byPostalAddressTest00(result);	
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
                    get("/properties/addresses/postal?postal={q}", query).
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
	public void byPostalAddressTest00(int result)
	{
		 try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(result)).
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	*/
	

	@Test
	public void byPostalAddressTest000()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	 }   
	/*
	@Test
	public void byPostalAddressTest001()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest002()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest003()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	*/
	@Test
	public void byPostalAddressTest004()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest005()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19930&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	/*
	@Test
	public void byPostalAddressTest006()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=absenteeOwner%20in%20(%27OCCUPIED%27,%27ABSENTEE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byPostalAddressTest007()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byPostalAddressTest008()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	
	@Test
	public void byPostalAddressTest009()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest010()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byPostalAddressTest011()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest012()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byPostalAddressTest013()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrBldgName%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest014()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byPostalAddressTest015()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrBldgName%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest016()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=addrCountrySubd%20eq%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byPostalAddressTest017()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=addrCountrySubd%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest018()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=addrCountrySubd%20ne%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest019()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=addrPostal1%20in%20(19939,19934)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest020()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=addrPostal1%20in%20(19936,19938,19939)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest021()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=addrPostal1%20eq%2019711";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest022()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=addrPostal1%20eq%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest023()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=addrPostal1%20ne%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest024()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=addrPostal1%20ne%2019934";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest025()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=addrPostal3%20in%20(R001,R006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest026()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=addrPostal3%20in%20(C004,C001,C003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest027()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=addrPostal3%20eq%20R005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest028()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=addrPostal3%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest029()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=addrPostal3%20ne%20R007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest030()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=addrPostal3%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest031()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=apn%20in%20(1300300053300,0699999026)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest032()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest033()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=apn%20eq%2060077777010200000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest034()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=apn%20eq%200699999004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest035()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=apn%20ne%200699999013";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest036()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=apn%20ne%201099999007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest037()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2018.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest038()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2022.03";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest039()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2022.79";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest040()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest041()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2021.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest042()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2023.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest043()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprPerSizeUnit%20ge%209.12";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest044()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprPerSizeUnit%20ge%2018.78";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest045()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2017.95";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest046()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2018.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest047()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprPerSizeUnit%20le%2025.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest048()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprPerSizeUnit%20le%2024.56";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest049()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdImprValue%20eq%20349800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest050()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdImprValue%20eq%201331000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest051()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdImprValue%20ne%20314400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest052()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdImprValue%20ne%20712100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest053()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdImprValue%20gt%202882100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest054()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdImprValue%20gt%203562800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest055()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdImprValue%20ge%2055000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest056()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdImprValue%20ge%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest057()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdImprValue%20lt%209158900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest058()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdImprValue%20lt%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest059()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdImprValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest060()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdImprValue%20le%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest061()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.09";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest062()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.15";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest063()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.39";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest064()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest065()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.18";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest066()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.20";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest067()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest068()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest069()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest070()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest071()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest072()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.58";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest073()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdLandValue%20eq%201250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest074()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdLandValue%20eq%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest075()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdLandValue%20ne%20550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest076()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdLandValue%20ne%20350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest077()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdLandValue%20gt%2011500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest078()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdLandValue%20gt%203750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest079()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdLandValue%20ge%201400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest080()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdLandValue%20ge%202250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest081()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdLandValue%20lt%20180000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest082()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdLandValue%20lt%204000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest083()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdLandValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest084()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdLandValue%20le%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest085()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.55";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest086()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byPostalAddressTest088()
	{
		//This will fail.
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}  
	
	@Test
	public void byPostalAddressTest087()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest089()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%203.87";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest090()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%208.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest091()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%204.69";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest092()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%206.47";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest093()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%205.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest094()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest095()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%201.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest096()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlPerSizeUnit%20le%206.01";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest097()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlPerSizeUnit%20le%204.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest098()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=assdTtlValue%20eq%201350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest099()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=assdTtlValue%20eq%20950";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest100()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=assdTtlValue%20ne%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest101()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=assdTtlValue%20ne%203150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest102()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=assdTtlValue%20gt%206350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest103()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=assdTtlValue%20gt%2010100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest104()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=assdTtlValue%20ge%2011350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest105()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=assdTtlValue%20ge%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest106()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=assdTtlValue%20lt%2050514";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest107()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=assdTtlValue%20lt%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest108()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=assdTtlValue%20le%202200";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest109()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=assdTtlValue%20le%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest110()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValue%20eq%20282783";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest111()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValue%20eq%20256143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest112()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=avmValue%20ne%20308184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest113()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValue%20ne%20284655";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest114()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValue%20gt%20146746";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest115()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValue%20gt%20210985";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest116()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValue%20ge%20178941";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest117()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValue%20ge%20183298";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest118()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValue%20lt%20174434";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest119()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValue%20lt%20292084";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest120()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValue%20le%20319040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest121()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValue%20le%20217032";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest122()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueHigh%20eq%20202343";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest123()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueHigh%20eq%20350393";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest124()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueHigh%20ne%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest125()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueHighv%20ne%20209361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest126()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueHigh%20gt%20357325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest127()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=avmValueHigh%20gt%20344503";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest128()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=avmValueHigh%20ge%20367949";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest129()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=avmValueHigh%20ge%20214459";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest130()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=avmValueHigh%20lt%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest131()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=avmValueHigh%20lt%20209249";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest132()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=avmValueHigh%20le%20333046";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest133()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=avmValueHigh%20le%20316717";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest134()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=avmValueLow%20eq%20218170";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest135()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=avmValueLow%20eq%20190325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest136()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=avmValueLow%20ne%20117881";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest137()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=avmValueLow%20ne%20128911";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest138()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=avmValueLow%20gt%2062516";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest139()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=avmValueLow%20gt%2080338";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest140()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=avmValueLow%20ge%20148136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest141()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=avmValueLow%20ge%20222536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest142()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=avmValueLow%20lt%20132135";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest143()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=avmValueLow%20lt%20171907";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest144()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=avmValueLow%20le%20148794";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest145()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=avmValueLow%20le%2093896";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest146()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=baths1Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest147()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=baths1Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest148()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=baths1Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest149()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=baths1Qtr%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest150()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=baths1Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest151()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=baths1Qtr%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest152()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=baths1Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest153()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths1Qtr%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest154()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths1Qtr%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest155()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths1Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest156()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths1Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest157()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths1Qtr%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest158()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=baths3Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest159()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=baths3Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest160()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=baths3Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest161()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=baths3Qtr%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest162()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=baths3Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest163()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=baths3Qtr%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest164()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=baths3Qtr%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest165()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=baths3Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest166()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=baths3Qtr%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest167()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=baths3Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest168()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=baths3Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest169()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=baths3Qtr%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest170()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsCalc%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest171()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsCalc%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest172()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsCalc%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest173()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsCalc%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest174()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsCalc%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest175()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsCalc%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest176()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsCalc%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest177()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsCalc%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest178()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsCalc%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest179()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsCalc%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest180()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsCalc%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest181()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsCalc%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest182()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsFull%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest183()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsFull%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest184()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsFull%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest185()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsFull%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest186()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bathsFull%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest187()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bathsFull%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest188()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bathsFull%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest189()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsFull%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest190()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsFull%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest191()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsFull%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest192()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsFull%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest193()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsFull%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest194()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bathsHalf%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest195()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bathsHalf%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest196()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bathsHalf%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest197()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bathsHalf%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest198()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bathsHalf%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest199()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsHalf%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest200()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsHalf%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalAddressTest201()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsHalf%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest202()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsHalf%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest203()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsHalf%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest204()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsHalf%20le%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest205()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsHalf%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest206()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bathsTotal%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest207()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bathsTotal%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest208()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bathsTotal%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest209()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bathsTotal%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest210()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bathsTotal%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest211()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bathsTotal%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest212()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bathsTotal%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest213()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bathsTotal%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest214()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bathsTotal%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest215()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bathsTotal%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest216()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bathsTotal%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest217()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bathsTotal%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest218()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=beds%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest219()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=beds%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest220()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=beds%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest221()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=beds%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest222()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=beds%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest223()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=beds%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest224()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=beds%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest225()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=beds%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest226()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=beds%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest227()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=beds%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest228()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=beds%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest229()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=beds%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest230()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bldgSize%20eq%203500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest231()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bldgSize%20eq%201150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest232()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bldgSize%20ne%202650";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest233()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bldgSize%20ne%201125";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest234()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bldgSize%20gt%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest235()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=bldgSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest236()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgSize%20ge%202425";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest237()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgSize%20ge%201525";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest238()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgSize%20lt%201850";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest239()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgSize%20lt%203675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest240()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgSize%20le%202550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest241()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgSize%20le%201630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest242()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=bldgsNum%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest243()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=bldgsNum%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest244()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=bldgsNum%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest245()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgsNum%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest246()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgsNum%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest247()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgsNum%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest248()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgsNum%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest249()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgsNum%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest250()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgsNum%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest251()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bldgsNum%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest252()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bldgsNum%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest253()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bldgsNum%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest254()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest255()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest256()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=bldgType%20eq%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest257()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest258()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest259()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest260()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=block%20in%20(E,Y)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest261()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=block%20in%20(D,T,F)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest262()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=block%20eq%20A";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest263()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=block%20eq%20B";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest264()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=block%20ne%20C";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest265()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=block%20ne%20D";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest266()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtSize%20eq%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest267()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=bsmtSize%20eq%201040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest268()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtSize%20ne%201240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest269()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=bsmtSize%20ne%201251";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest270()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=bsmtSize%20gt%201419";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest271()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=bsmtSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest272()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=bsmtSize%20ge%201930";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest273()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=bsmtSize%20ge%201092";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest274()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=bsmtSize%20lt%201766";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest275()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=bsmtSize%20lt%201551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest276()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=bsmtSize%20le%201839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest277()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=bsmtSize%20le%201073";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest278()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest279()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest280()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=censusId%20in%20(100010410001069,100010401001010)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest281()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest282()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=censusId%20eq%20100010410001069";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest283()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=censusId%20eq%20100050512031012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest284()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=censusId%20ne%20100010401001010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest285()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=censusId%20ne%20100010413001033";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest286()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest287()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest288()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest289()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=constructionType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalAddressTest290()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
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
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalAddressTest292()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest293()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=coolingType%20eq%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest294()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest295()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=coolingType%20ne%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest296()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest297()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=dateValuation%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest298()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=dateValuation%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest299()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=dateValuation%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest300()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=dateValuation%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest301()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=dateValuation%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest302()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=dateValuation%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest303()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=dateValuation%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest304()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=dateValuation%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest305()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=dateValuation%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest306()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=dateValuation%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest307()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=dateValuation%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest308()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=dateValuation%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest309()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=depth%20eq%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest310()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=depth%20eq%20180";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest311()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=depth%20ne%20140";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest312()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=depth%20ne%20160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest313()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=depth%20gt%20142";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest314()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=depth%20gt%20130";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest315()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=depth%20ge%20167";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest316()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=depth%20ge%20145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest317()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=depth%20lt%20136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest318()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=depth%20lt%20106";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest319()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=depth%20le%20119";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest320()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=depth%20le%20231";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest321()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest322()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest323()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest324()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest325()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest326()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest327()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest328()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest329()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=extWalls%20eq%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest330()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=extWalls%20eq%20%27ALUMINUM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest331()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=extWalls%20ne%20%27BRICK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest332()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=extWalls%20ne%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest333()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fips%20in%20(10001,10003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest334()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fips%20in%20(10002,10004,10006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest335()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fips%20eq%2010002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest336()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fips%20eq%2010004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest337()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fips%20ne%2010003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest338()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fips%20ne%2010001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest339()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest340()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest341()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=foundationType%20eq%20%27PILINGS%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest342()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=foundationType%20eq%20%27SLAB%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest343()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=foundationType%20ne%20%27CONCRETE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest344()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=foundationType%20ne%20%27MASONRY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest345()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcCount%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest346()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=fplcCount%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest347()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=fplcCount%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest348()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=fplcCount%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byPostalAddressTest349()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=fplcCount%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byPostalAddressTest350()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=fplcCount%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byPostalAddressTest351()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=fplcCount%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest352()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=fplcCount%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest353()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=fplcCount%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest354()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=fplcCount%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest355()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcCount%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest356()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcCount%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest357()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=fplcInd%20eq%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest358()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=fplcInd%20eq%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest359()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=fplcInd%20ne%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest360()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=fplcInd%20ne%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest361()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest362()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest363()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest364()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=frame%20eq%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest365()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=frame%20eq%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest366()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=frame%20ne%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest367()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=frame%20ne%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest368()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=frontage%20eq%2019";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest369()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=frontage%20eq%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest370()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=frontage%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest371()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=frontage%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest372()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=frontage%20gt%20214";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest373()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=frontage%20gt%20143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest374()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=frontage%20ge%20150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	@Test
	public void byPostalAddressTest375()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=frontage%20ge%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest376()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=frontage%20lt%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest377()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=frontage%20lt%2036";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	/*
	@Test
	public void byPostalAddressTest378()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=frontage%20le%2055";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest379()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=frontage%20le%20105";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest380()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=garageSize%20eq%20242";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest381()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageSize%20eq%20483";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest382()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageSize%20ne%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest383()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageSize%20ne%20511";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest384()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageSize%20gt%20630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest385()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageSize%20gt%20600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest386()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageSize%20ge%20840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest387()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=garageSize%20ge%20480";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest388()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=garageSize%20lt%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest389()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=garageSize%20lt%20441";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest390()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=garageSize%20le%20206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest391()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=garageSize%20le%20454";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest392()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest393()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest394()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest395()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest396()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest397()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest398()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=groundFloorSize%20eq%202347";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest399()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=groundFloorSize%20eq%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest400()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=groundFloorSize%20ne%201090";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest401()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=groundFloorSize%20ne%202571";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest402()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=groundFloorSize%20gt%201664";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest403()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=groundFloorSize%20gt%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest404()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=groundFloorSize%20ge%201388";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest405()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=groundFloorSize%20ge%20912";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest406()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=groundFloorSize%20lt%201160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest407()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=groundFloorSize%20lt%202868";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest408()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=groundFloorSize%20le%201753";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest409()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=groundFloorSize%20le%201560";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 

	@Test
	public void byPostalAddressTest410()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest411()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest412()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest413()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest414()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=heatingType%20ne%20%27OIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest415()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest416()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest417()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest418()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest419()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=landUse%20eq%20%27HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest420()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest421()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=landUse%20ne%20%27DUPLEX%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest422()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lastModified%20eq%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest423()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lastModified%20eq%20%272014-11-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest424()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lastModified%20ne%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest425()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lastModified%20ne%20%272014-10-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest426()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lastModified%20gt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest427()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lastModified%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest428()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lastModified%20ge%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest429()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=lastModified%20ge%20%272014-12-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest430()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lastModified%20lt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest431()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lastModified%20lt%20%272014-09-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest432()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lastModified%20le%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest433()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lastModified%20le%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest434()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=livingSize%20eq%202307";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest435()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=livingSize%20eq%201172";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest436()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=livingSize%20ne%203023";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest437()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=livingSize%20ne%201396";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest438()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=livingSize%20gt%202597";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest439()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=livingSize%20gt%201344";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest440()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=livingSize%20ge%201771";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest441()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=livingSize%20ge%201420";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest442()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=livingSize%20lt%202240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest443()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=livingSize%20lt%201452";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest444()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=livingSize%20le%202145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest445()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=livingSize%20le%202000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest446()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotNum%20in%20(112,116)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest447()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotNum%20in%20(108,114,16)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest448()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotNum%20eq%2039";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest449()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotNum%20eq%20110";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest450()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotNum%20ne%2015";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest451()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotNum%20ne%20118";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest452()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize1%20eq%200.0523";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest453()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize1%20eq%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest454()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize1%20ne%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest455()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize1%20ne%200.1436";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest456()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize1%20gt%200.1047";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest457()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=lotSize1%20gt%200.4017";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest458()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=lotSize1%20ge%200.0551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest459()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=lotSize1%20ge%200.7576";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest460()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=lotSize1%20lt%201.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest461()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=lotSize1%20lt%200.6061";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest462()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=lotSize1%20le%200.0892";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest463()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotSize1%20le%200.11";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest464()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotSize2%20eq%2012632";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest465()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotSize2%20eq%2017860";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest466()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotSize2%20ne%208712";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest467()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotSize2%20ne%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest468()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=lotSize2%20gt%2010890";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest469()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=lotSize2%20gt%203885";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest470()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=lotSize2%20ge%2010000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest471()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=lotSize2%20ge%2051401";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest472()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=lotSize2%20lt%204830";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest473()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=lotSize2%20lt%2051660";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest474()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=lotSize2%20le%2020230";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest475()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=lotSize2%20le%205500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest476()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=lotType%20in%20(I,IRR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest477()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=lotType%20eq%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest478()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=lotType%20eq%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest479()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=lotType%20ne%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest480()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=lotType%20ne%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest481()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgPct%20eq%200.4031";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest482()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgPct%20eq%201.0371";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest483()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgPct%20ne%2081.1657";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest484()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgPct%20ne%20-0.4787";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest485()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgPct%20gt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest486()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=monthlyChgPct%20gt%200.3615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest487()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=monthlyChgPct%20ge%200.2557";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest488()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=monthlyChgPct%20ge%200.0869";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest489()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=monthlyChgPct%20lt%200.1245";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest490()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=monthlyChgPct%20lt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest491()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=monthlyChgPct%20le%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest492()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=monthlyChgPct%20le%200.0925";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest493()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=monthlyChgValue%20eq%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest494()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=monthlyChgValue%20eq%20155";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest495()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=monthlyChgValue%20ne%20-839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest496()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=monthlyChgValue%20ne%202217";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest497()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=monthlyChgValue%20gt%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest498()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=monthlyChgValue%20gt%201281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest499()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=monthlyChgValue%20ge%20822";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest500()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=monthlyChgValue%20ge%201914";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest501()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=monthlyChgValue%20lt%201977";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest502()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=monthlyChgValue%20lt%20758";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest503()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=monthlyChgValue%20le%2065745";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest504()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=monthlyChgValue%20le%20-21";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest505()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest506()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest507()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest508()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest509()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest510()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest511()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=obPropId%20in%20(10003164371,10003164573)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest512()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest513()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=obPropId%20eq%2010005293290";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest514()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=obPropId%20eq%2010005293302";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest515()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=obPropId%20ne%2010005293281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest516()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=obPropId%20ne%2010003177976";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest517()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest518()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest519()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=parkingType%20eq%20%27CEDAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest520()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest521()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest522()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=parkingType%20ne%20%27UNCOVERED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest523()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=poolInd%20eq%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest524()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolInd%20eq%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest525()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolInd%20ne%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest526()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolInd%20ne%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest527()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest528()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest529()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest530()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest531()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=poolType%20ne%20%27FISH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest532()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest533()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest534()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest535()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=propInd%20eq%20%27HOSPITAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest536()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest537()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest538()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=propInd%20ne%20%27WAREHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest539()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=rangePctOfValue%20eq%2026.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest540()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=rangePctOfValue%20eq%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest541()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=rangePctOfValue%20ne%2024.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest542()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=rangePctOfValue%20ne%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest543()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=rangePctOfValue%20gt%2024.0001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest544()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=rangePctOfValue%20gt%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest545()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=rangePctOfValue%20ge%2019.9999";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest546()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=rangePctOfValue%20ge%2024.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest547()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=rangePctOfValue%20lt%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest548()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=rangePctOfValue%20lt%2022.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest549()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=rangePctOfValue%20le%2020.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest550()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=rangePctOfValue%20le%2015.9996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest551()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest552()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest553()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofCover%20eq%20%27ROCK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest554()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest555()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest556()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest557()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest558()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest559()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=roofType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest560()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=roofType%20eq%20%27CANOPY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest561()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest562()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=roofType%20ne%20%27GABLE/HIP%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest563()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=saleAmt%20eq%20115000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest564()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleAmt%20eq%20169900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest565()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleAmt%20ne%20248000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest566()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleAmt%20ne%20368474";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest567()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleAmt%20gt%2052000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest568()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleAmt%20gt%20338400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest569()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleAmt%20ge%20290000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest570()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleAmt%20ge%20184565";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest571()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleAmt%20lt%20149990";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest572()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleAmt%20lt%20188615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest573()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleAmt%20le%20180840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest574()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleAmt%20le%20170299";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest575()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleDocNum%20in%20(53005,121159)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest576()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleDocNum%20in%20(43221,145144,40031)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest577()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleDocNum%20eq%20108301";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest578()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleDocNum%20eq%2063918";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest579()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleDocNum%20ne%202944000082";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest580()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=saleDocNum%20ne%2027361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest581()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=saleTransDate%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest582()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleTransDate%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest583()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=saleTransDate%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest584()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=saleTransDate%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest585()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransDate%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest586()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransDate%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest587()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransDate%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest588()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransDate%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest589()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransDate%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest590()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransDate%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest591()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleTransDate%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest592()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleTransDate%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest593()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest594()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest595()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest596()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest597()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest598()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest599()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest600()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	
	@Test
	public void byPostalAddressTest601()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest602()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest603()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=saleSearchDate%20le%20%272013-08-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest604()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=saleSearchDate%20le%20%272006-05-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest605()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest606()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest607()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=saleTransType%20eq%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest608()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest609()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=saleTransType%20ne%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest610()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest611()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=saleType%20eq%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest612()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=saleType%20ne%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest613()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest614()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest615()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=sewerType%20eq%20%27SEPTIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest616()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=sewerType%20eq%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest617()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest618()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest619()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest620()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest621()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest622()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=style%20eq%20%27RAISED%20RANCH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest623()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=style%20ne%20%27MANSION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest624()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=style%20ne%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest625()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&page=1&size=30&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest626()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest627()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest628()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest629()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=subdName%20ne%20%27MERESTONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest630()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest631()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=subdTractNum%20in%20(1-A,1-B)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest632()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=subdTractNum%20in%20(A,B,C,D)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest633()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=subdTractNum%20eq%20323";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest634()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=subdTractNum%20eq%2050";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest635()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=subdTractNum%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest636()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=subdTractNum%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest637()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=taxAmt%20eq%2023778.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest638()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=taxAmt%20eq%201952.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest639()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=taxAmt%20ne%207217.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest640()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=taxAmt%20ne%201676.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest641()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=taxAmt%20gt%20108596.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest642()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxAmt%20gt%20865880.7";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest643()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxAmt%20ge%20343074.19";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest644()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxAmt%20ge%201009.04";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest645()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxAmt%20lt%20279168.77";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest646()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxAmt%20lt%2032139.73";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest647()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxAmt%20le%2010840.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest648()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxAmt%20le%20503848.67";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest649()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxCodeArea%20in%20(04,08)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest650()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxCodeArea%20in%20(20,10,18)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest651()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxCodeArea%20eq%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest652()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxCodeArea%20eq%2006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest653()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxCodeArea%20ne%2000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest654()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxCodeArea%20ne%2021";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest655()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=taxPerSizeUnit%20eq%200.43";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest656()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=taxPerSizeUnit%20eq%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest657()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=taxPerSizeUnit%20ne%200.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest658()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=taxPerSizeUnit%20ne%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest659()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=taxPerSizeUnit%20gt%200.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest660()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=taxPerSizeUnit%20gt%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest661()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=taxPerSizeUnit%20ge%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest662()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=taxPerSizeUnit%20ge%200.53";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest663()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=taxPerSizeUnit%20lt%200.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest664()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=taxPerSizeUnit%20lt%200.37";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest665()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=taxPerSizeUnit%20le%200.52";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest666()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=taxPerSizeUnit%20le%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest667()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=totalRooms%20eq%208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest668()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=totalRooms%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest669()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=totalRooms%20ne%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest670()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=totalRooms%20ne%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest671()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=totalRooms%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest672()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=totalRooms%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest673()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=totalRooms%20ge%209";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest674()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=totalRooms%20ge%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest675()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=totalRooms%20lt%205";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest676()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=totalRooms%20lt%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest677()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=totalRooms%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest678()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=totalRooms%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest679()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=unitsCount%20eq%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest680()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=unitsCount%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest681()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=unitsCount%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest682()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=unitsCount%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest683()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=unitsCount%20gt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest684()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=unitsCount%20gt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest685()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=unitsCount%20ge%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest686()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=unitsCount%20ge%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest687()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=unitsCount%20lt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest688()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=unitsCount%20lt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest689()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=unitsCount%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest690()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=unitsCount%20le%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest691()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=universalSize%20eq%204124";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest692()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=universalSize%20eq%201600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest693()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=universalSize%20ne%202644";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest694()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=universalSize%20ne%204208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest695()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=universalSize%20gt%201768";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest696()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=universalSize%20gt%202043";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest697()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=universalSize%20ge%202151";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest698()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=universalSize%20ge%204184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest699()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=universalSize%20lt%203076";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest700()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=universalSize%20lt%201871";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest701()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=universalSize%20le%202967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest702()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=universalSize%20le%201536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest703()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest704()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest705()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=view%20eq%20%27RECREATIONAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest706()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=view%20eq%20%27STREET%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest707()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=view%20ne%20%27WATER%20VIEW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest708()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=view%20ne%20%27SUBURBAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest709()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest710()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest711()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=waterType%20eq%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest712()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=waterType%20eq%20%27PUBLIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest713()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=waterType%20ne%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest714()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=waterType%20ne%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest715()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuilt%20in%20(2001,2005)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest716()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest717()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuilt%20eq%202010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest718()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuilt%20eq%202007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest719()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuilt%20ne%201967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest720()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuilt%20ne%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest721()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuilt%20gt%202008";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest722()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuilt%20gt%202011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest723()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuilt%20ge%202005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest724()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19730&page=1&size=30&filter=yearBuilt%20ge%202009";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest725()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19801&page=1&size=30&filter=yearBuilt%20lt%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest726()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19802&page=1&size=30&filter=yearBuilt%20lt%201997";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest727()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19943&page=1&size=30&filter=yearBuilt%20le%202002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest728()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=yearBuilt%20le%201983";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest729()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=yearBuiltEffective%20in%20(1996,1978)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest730()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest731()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=yearBuiltEffective%20eq%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest732()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=yearBuiltEffective%20eq%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest733()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19968&page=1&size=30&filter=yearBuiltEffective%20ne%201982";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest734()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19970&page=1&size=30&filter=yearBuiltEffective%20ne%201988";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest735()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19971&page=1&size=30&filter=yearBuiltEffective%20gt%201989";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest736()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19973&page=1&size=30&filter=yearBuiltEffective%20gt%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest737()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19701&page=1&size=30&filter=yearBuiltEffective%20ge%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest738()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19702&page=1&size=30&filter=yearBuiltEffective%20ge%201993";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest739()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19703&page=1&size=30&filter=yearBuiltEffective%20lt%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest740()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19706&page=1&size=30&filter=yearBuiltEffective%20lt%201980";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest741()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19707&page=1&size=30&filter=yearBuiltEffective%20le%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest742()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19734&page=1&size=30&filter=yearBuiltEffective%20le%201992";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest743()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19962&page=1&size=30&filter=zoning%20in%20(TN,MR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest744()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19940&page=1&size=30&filter=zoning%20in%20(AR1,NC40,ON)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest745()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19941&page=1&size=30&filter=zoning%20eq%20R1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest746()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19980&page=1&size=30&filter=zoning%20eq%20AR1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest747()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19964&page=1&size=30&filter=zoning%20ne%20MR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byPostalAddressTest748()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "19967&page=1&size=30&filter=zoning%20ne%20CR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/addresses/postal?postal={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
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
	                    get("/properties/addresses/postal?postal={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	
}



