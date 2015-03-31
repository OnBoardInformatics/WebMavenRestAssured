package TestingPackage;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class SearchByAddress {


	/*
	@Test
	public void Test00()
	{
		int result = getTotalAddress00();
		byAddressTest00(result);
		byAddressTest00(result);	
	}
	public int getTotalAddress00()
	{
		 int totalNumber;
		try {
		
			RestAssured.baseURI = "http://demo2.onboardis.us";
            RestAssured.urlEncodingEnabled = false;
            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=yearBuilt%20in%20(1950,1972,1969)";
            
            totalNumber =
    		when().
                    get("/property/address?address={q}", query).
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
	public void byAddressTest00(int result)
	{
		 try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(result)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	*/
	
	
	@Test
	public void byAddressTest000()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=frontage%20ge%20120";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	 }   

	@Test
	public void byAddressTest001()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest002()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	/*
	@Test
	public void byAddressTest003()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest004()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest005()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	*/
	/*
	@Test
	public void byAddressTest006()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27ABSENTEE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query ="address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27ABSENTEE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byAddressTest007()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	@Test
	public void byAddressTest008()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest009()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest010()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest011()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest012()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byAddressTest013()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=addrBldgName%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=addrBldgName%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest014()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byAddressTest015()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=addrBldgName%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=addrBldgName%20ne%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest016()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=addrCountrySubd%20eq%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=addrCountrySubd%20eq%20DE";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byAddressTest017()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=addrCountrySubd%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=addrCountrySubd%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest018()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=addrCountrySubd%20ne%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=addrCountrySubd%20ne%20DE";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest019()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=addrPostal1%20in%20(19939,19934)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=addrPostal1%20in%20(19939,19934)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest020()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=addrPostal1%20in%20(19936,19938,19939)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=addrPostal1%20in%20(19936,19938,19939)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest021()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=addrPostal1%20eq%2019711";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=addrPostal1%20eq%2019711";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest022()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=addrPostal1%20eq%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=addrPostal1%20eq%2019938";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest023()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=addrPostal1%20ne%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=addrPostal1%20ne%2019938";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest024()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=addrPostal1%20ne%2019934";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=addrPostal1%20ne%2019934";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest025()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=addrPostal3%20in%20(R001,R006)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=addrPostal3%20in%20(R001,R006)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest026()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=addrPostal3%20in%20(C004,C001,C003)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=addrPostal3%20in%20(C004,C001,C003)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest027()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=addrPostal3%20eq%20R005";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=addrPostal3%20eq%20R005";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest028()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=addrPostal3%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=addrPostal3%20eq%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest029()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=addrPostal3%20ne%20R007";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=addrPostal3%20ne%20R007";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest030()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=addrPostal3%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=addrPostal3%20ne%20%27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest031()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=apn%20in%20(1300300053300,0699999026)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=apn%20in%20(1300300053300,0699999026)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest032()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest033()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=apn%20eq%2060077777010200000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=apn%20eq%2060077777010200000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest034()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=apn%20eq%200699999004";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=apn%20eq%200699999004";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest035()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=apn%20ne%200699999013";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=apn%20ne%200699999013";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest036()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=apn%20ne%201099999007";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=apn%20ne%201099999007";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest037()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdImprPerSizeUnit%20eq%2018.35";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdImprPerSizeUnit%20eq%2018.35";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest038()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdImprPerSizeUnit%20eq%2022.03";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdImprPerSizeUnit%20eq%2022.03";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest039()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprPerSizeUnit%20ne%2022.79";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprPerSizeUnit%20ne%2022.79";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest040()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdImprPerSizeUnit%20ne%2024";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdImprPerSizeUnit%20ne%2024";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest041()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprPerSizeUnit%20gt%2021.14";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprPerSizeUnit%20gt%2021.14";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest042()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdImprPerSizeUnit%20gt%2023.81";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdImprPerSizeUnit%20gt%2023.81";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest043()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdImprPerSizeUnit%20ge%209.12";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdImprPerSizeUnit%20ge%209.12";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest044()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdImprPerSizeUnit%20ge%2018.78";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdImprPerSizeUnit%20ge%2018.78";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest045()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprPerSizeUnit%20lt%2017.95";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprPerSizeUnit%20lt%2017.95";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest046()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdImprPerSizeUnit%20lt%2018.14";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdImprPerSizeUnit%20lt%2018.14";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest047()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdImprPerSizeUnit%20le%2025.35";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdImprPerSizeUnit%20le%2025.35";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest048()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdImprPerSizeUnit%20le%2024.56";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdImprPerSizeUnit%20le%2024.56";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest049()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdImprValue%20eq%20349800";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdImprValue%20eq%20349800";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest050()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprValue%20eq%201331000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprValue%20eq%201331000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest051()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdImprValue%20ne%20314400";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdImprValue%20ne%20314400";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest052()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdImprValue%20ne%20712100";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdImprValue%20ne%20712100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest053()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdImprValue%20gt%202882100";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdImprValue%20gt%202882100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest054()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprValue%20gt%203562800";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdImprValue%20gt%203562800";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest055()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdImprValue%20ge%2055000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdImprValue%20ge%2055000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest056()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdImprValue%20ge%201000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdImprValue%20ge%201000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest057()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdImprValue%20lt%209158900";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdImprValue%20lt%209158900";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest058()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdImprValue%20lt%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdImprValue%20lt%204625300";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest059()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdImprValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdImprValue%20le%201750";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest060()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=assdImprValue%20le%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=assdImprValue%20le%204625300";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest061()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdLandPerSizeUnit%20eq%200.09";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdLandPerSizeUnit%20eq%200.09";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest062()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdLandPerSizeUnit%20eq%200.15";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdLandPerSizeUnit%20eq%200.15";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest063()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdLandPerSizeUnit%20ne%200.39";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdLandPerSizeUnit%20ne%200.39";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest064()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdLandPerSizeUnit%20ne%200.27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdLandPerSizeUnit%20ne%200.27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest065()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdLandPerSizeUnit%20gt%200.18";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdLandPerSizeUnit%20gt%200.18";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest066()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdLandPerSizeUnit%20gt%200.20";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=assdLandPerSizeUnit%20gt%200.20";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest067()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdLandPerSizeUnit%20ge%200.06";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdLandPerSizeUnit%20ge%200.06";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest068()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdLandPerSizeUnit%20ge%200.14";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdLandPerSizeUnit%20ge%200.14";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest069()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdLandPerSizeUnit%20lt%200.31";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdLandPerSizeUnit%20lt%200.31";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest070()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdLandPerSizeUnit%20lt%200.29";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdLandPerSizeUnit%20lt%200.29";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest071()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdLandPerSizeUnit%20le%200.57";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdLandPerSizeUnit%20le%200.57";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest072()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdLandPerSizeUnit%20le%200.58";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdLandPerSizeUnit%20le%200.58";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest073()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdLandValue%20eq%201250";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdLandValue%20eq%201250";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest074()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdLandValue%20eq%201500";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdLandValue%20eq%201500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest075()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=assdLandValue%20ne%20550";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=assdLandValue%20ne%20550";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest076()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=assdLandValue%20ne%20350";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=assdLandValue%20ne%20350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest077()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=assdLandValue%20gt%2011500";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=assdLandValue%20gt%2011500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest078()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=assdLandValue%20gt%203750";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=assdLandValue%20gt%203750";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest079()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=assdLandValue%20ge%201400";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=assdLandValue%20ge%201400";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest080()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=assdLandValue%20ge%202250";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=assdLandValue%20ge%202250";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest081()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdLandValue%20lt%20180000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdLandValue%20lt%20180000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest082()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdLandValue%20lt%204000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdLandValue%20lt%204000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest083()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdLandValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdLandValue%20le%201750";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest084()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdLandValue%20le%202100";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdLandValue%20le%202100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest085()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdTtlPerSizeUnit%20eq%206.55";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdTtlPerSizeUnit%20eq%206.55";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest086()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdTtlPerSizeUnit%20eq%206.48";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byAddressTest088()
	{
		//This will fail.
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdTtlPerSizeUnit%20ne%204.93";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}  
	
	@Test
	public void byAddressTest087()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdTtlPerSizeUnit%20ne%204.93";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=assdTtlPerSizeUnit%20ne%204.93";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest089()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdTtlPerSizeUnit%20ne%203.87";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=assdTtlPerSizeUnit%20ne%203.87";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest090()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdTtlPerSizeUnit%20gt%208.13";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=assdTtlPerSizeUnit%20gt%208.13";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest091()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdTtlPerSizeUnit%20gt%204.69";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=assdTtlPerSizeUnit%20gt%204.69";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest092()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=assdTtlPerSizeUnit%20ge%206.47";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=assdTtlPerSizeUnit%20ge%206.47";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest093()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=assdTtlPerSizeUnit%20ge%205.06";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=assdTtlPerSizeUnit%20ge%205.06";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest094()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest095()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=assdTtlPerSizeUnit%20lt%201.46";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=assdTtlPerSizeUnit%20lt%201.46";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest096()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=assdTtlPerSizeUnit%20le%206.01";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=assdTtlPerSizeUnit%20le%206.01";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest097()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=assdTtlPerSizeUnit%20le%204.57";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=assdTtlPerSizeUnit%20le%204.57";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest098()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=assdTtlValue%20eq%201350";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=assdTtlValue%20eq%201350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest099()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=assdTtlValue%20eq%20950";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=assdTtlValue%20eq%20950";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest100()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=assdTtlValue%20ne%201500";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=assdTtlValue%20ne%201500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest101()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=assdTtlValue%20ne%203150";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=assdTtlValue%20ne%203150";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest102()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=assdTtlValue%20gt%206350";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=assdTtlValue%20gt%206350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest103()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdTtlValue%20gt%2010100";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdTtlValue%20gt%2010100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest104()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdTtlValue%20ge%2011350";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=assdTtlValue%20ge%2011350";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest105()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdTtlValue%20ge%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdTtlValue%20ge%2042872";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest106()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdTtlValue%20lt%2050514";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=assdTtlValue%20lt%2050514";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest107()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdTtlValue%20lt%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=assdTtlValue%20lt%2042872";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest108()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdTtlValue%20le%202200";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=assdTtlValue%20le%202200";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest109()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdTtlValue%20le%201700";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=assdTtlValue%20le%201700";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest110()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValue%20eq%20282783";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValue%20eq%20282783";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest111()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=avmValue%20eq%20256143";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=avmValue%20eq%20256143";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest112()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=avmValue%20ne%20308184";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=avmValue%20ne%20308184";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest113()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=avmValue%20ne%20284655";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=avmValue%20ne%20284655";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest114()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValue%20gt%20146746";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValue%20gt%20146746";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest115()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=avmValue%20gt%20210985";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=avmValue%20gt%20210985";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest116()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=avmValue%20ge%20178941";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=avmValue%20ge%20178941";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest117()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=avmValue%20ge%20183298";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=avmValue%20ge%20183298";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest118()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=avmValue%20lt%20174434";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=avmValue%20lt%20174434";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest119()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=avmValue%20lt%20292084";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=avmValue%20lt%20292084";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest120()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=avmValue%20le%20319040";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=avmValue%20le%20319040";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest121()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=avmValue%20le%20217032";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=avmValue%20le%20217032";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest122()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=avmValueHigh%20eq%20202343";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=avmValueHigh%20eq%20202343";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest123()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=avmValueHigh%20eq%20350393";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=avmValueHigh%20eq%20350393";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest124()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=avmValueHigh%20ne%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=avmValueHigh%20ne%20226577";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest125()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=avmValueHigh%20ne%20209361";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=avmValueHigh%20ne%20209361";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest126()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=avmValueHigh%20gt%20357325";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=avmValueHigh%20gt%20357325";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest127()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=avmValueHigh%20gt%20344503";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=avmValueHigh%20gt%20344503";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest128()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=avmValueHigh%20ge%20367949";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=avmValueHigh%20ge%20367949";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest129()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=avmValueHigh%20ge%20214459";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=avmValueHigh%20ge%20214459";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest130()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValueHigh%20lt%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValueHigh%20lt%20226577";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest131()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=avmValueHigh%20lt%20209249";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=avmValueHigh%20lt%20209249";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest132()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValueHigh%20le%20333046";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValueHigh%20le%20333046";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest133()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=avmValueHigh%20le%20316717";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=avmValueHigh%20le%20316717";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest134()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=avmValueLow%20eq%20218170";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=avmValueLow%20eq%20218170";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest135()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValueLow%20eq%20190325";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=avmValueLow%20eq%20190325";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest136()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=avmValueLow%20ne%20117881";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=avmValueLow%20ne%20117881";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest137()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=avmValueLow%20ne%20128911";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=avmValueLow%20ne%20128911";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest138()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=avmValueLow%20gt%2062516";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=avmValueLow%20gt%2062516";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest139()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=avmValueLow%20gt%2080338";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=avmValueLow%20gt%2080338";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest140()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=avmValueLow%20ge%20148136";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=avmValueLow%20ge%20148136";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest141()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=avmValueLow%20ge%20222536";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=avmValueLow%20ge%20222536";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest142()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=avmValueLow%20lt%20132135";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=avmValueLow%20lt%20132135";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest143()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=avmValueLow%20lt%20171907";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=avmValueLow%20lt%20171907";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest144()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=avmValueLow%20le%20148794";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=avmValueLow%20le%20148794";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest145()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=avmValueLow%20le%2093896";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=avmValueLow%20le%2093896";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest146()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=baths1Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=baths1Qtr%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest147()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=baths1Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=baths1Qtr%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest148()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=baths1Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=baths1Qtr%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest149()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=baths1Qtr%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=baths1Qtr%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest150()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=baths1Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=baths1Qtr%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest151()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=baths1Qtr%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=baths1Qtr%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest152()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=baths1Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=baths1Qtr%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest153()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths1Qtr%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths1Qtr%20ge%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest154()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=baths1Qtr%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=baths1Qtr%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest155()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths1Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths1Qtr%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest156()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=baths1Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=baths1Qtr%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest157()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=baths1Qtr%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=baths1Qtr%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest158()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths3Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths3Qtr%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest159()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=baths3Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=baths3Qtr%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest160()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths3Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths3Qtr%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest161()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=baths3Qtr%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=baths3Qtr%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest162()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=baths3Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=baths3Qtr%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest163()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=baths3Qtr%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=baths3Qtr%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest164()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths3Qtr%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=baths3Qtr%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest165()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=baths3Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=baths3Qtr%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest166()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=baths3Qtr%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=baths3Qtr%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest167()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=baths3Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=baths3Qtr%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest168()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=baths3Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=baths3Qtr%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest169()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=baths3Qtr%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=baths3Qtr%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest170()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bathsCalc%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bathsCalc%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest171()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bathsCalc%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bathsCalc%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest172()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bathsCalc%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bathsCalc%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest173()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bathsCalc%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bathsCalc%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest174()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bathsCalc%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bathsCalc%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest175()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bathsCalc%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bathsCalc%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest176()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=bathsCalc%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=bathsCalc%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest177()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bathsCalc%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bathsCalc%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest178()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bathsCalc%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bathsCalc%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest179()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bathsCalc%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bathsCalc%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest180()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bathsCalc%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bathsCalc%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest181()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bathsCalc%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bathsCalc%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest182()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bathsFull%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bathsFull%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest183()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bathsFull%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bathsFull%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest184()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bathsFull%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bathsFull%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest185()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bathsFull%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bathsFull%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest186()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bathsFull%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bathsFull%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest187()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bathsFull%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bathsFull%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest188()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsFull%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsFull%20ge%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest189()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bathsFull%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bathsFull%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest190()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsFull%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsFull%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest191()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bathsFull%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bathsFull%20lt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest192()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bathsFull%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bathsFull%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest193()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bathsFull%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bathsFull%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest194()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bathsHalf%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bathsHalf%20eq%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest195()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsHalf%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsHalf%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest196()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bathsHalf%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bathsHalf%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest197()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bathsHalf%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bathsHalf%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest198()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bathsHalf%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bathsHalf%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest199()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsHalf%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsHalf%20gt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest200()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bathsHalf%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bathsHalf%20ge%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byAddressTest201()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bathsHalf%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bathsHalf%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest202()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bathsHalf%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bathsHalf%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest203()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bathsHalf%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bathsHalf%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest204()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bathsHalf%20le%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bathsHalf%20le%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest205()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bathsHalf%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bathsHalf%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest206()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsTotal%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bathsTotal%20eq%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest207()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bathsTotal%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bathsTotal%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest208()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bathsTotal%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bathsTotal%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest209()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bathsTotal%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bathsTotal%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest210()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bathsTotal%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bathsTotal%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest211()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bathsTotal%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bathsTotal%20gt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest212()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bathsTotal%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bathsTotal%20ge%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest213()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=bathsTotal%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=bathsTotal%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest214()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bathsTotal%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bathsTotal%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest215()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bathsTotal%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bathsTotal%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest216()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bathsTotal%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bathsTotal%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest217()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bathsTotal%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bathsTotal%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest218()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=beds%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=beds%20eq%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest219()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=beds%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=beds%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest220()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=beds%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=beds%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest221()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=beds%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=beds%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest222()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=beds%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=beds%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest223()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=beds%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=beds%20gt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest224()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=beds%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=beds%20ge%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest225()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=beds%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=beds%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest226()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=beds%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=beds%20lt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest227()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=beds%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=beds%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest228()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=beds%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=beds%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest229()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=beds%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=beds%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest230()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bldgSize%20eq%203500";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bldgSize%20eq%203500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest231()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bldgSize%20eq%201150";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bldgSize%20eq%201150";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest232()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bldgSize%20ne%202650";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bldgSize%20ne%202650";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest233()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bldgSize%20ne%201125";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bldgSize%20ne%201125";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest234()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bldgSize%20gt%201700";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bldgSize%20gt%201700";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest235()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=bldgSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=bldgSize%20gt%202675";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest236()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bldgSize%20ge%202425";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bldgSize%20ge%202425";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest237()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bldgSize%20ge%201525";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bldgSize%20ge%201525";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest238()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bldgSize%20lt%201850";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bldgSize%20lt%201850";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest239()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bldgSize%20lt%203675";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bldgSize%20lt%203675";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest240()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgSize%20le%202550";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgSize%20le%202550";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest241()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgSize%20le%201630";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgSize%20le%201630";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest242()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bldgsNum%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=bldgsNum%20eq%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest243()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bldgsNum%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=bldgsNum%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest244()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bldgsNum%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=bldgsNum%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest245()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bldgsNum%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bldgsNum%20ne%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest246()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgsNum%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgsNum%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest247()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgsNum%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgsNum%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest248()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgsNum%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgsNum%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest249()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bldgsNum%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bldgsNum%20ge%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest250()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgsNum%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgsNum%20lt%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest251()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bldgsNum%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bldgsNum%20lt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest252()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bldgsNum%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bldgsNum%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest253()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bldgsNum%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bldgsNum%20le%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest254()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest255()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest256()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgType%20eq%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=bldgType%20eq%20%27SINGLE%20FAMILY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest257()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest258()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest259()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest260()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=block%20in%20(E,Y)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=block%20in%20(E,Y)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest261()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=block%20in%20(D,T,F)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=block%20in%20(D,T,F)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest262()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=block%20eq%20A";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=block%20eq%20A";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest263()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=block%20eq%20B";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=block%20eq%20B";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest264()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=block%20ne%20C";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=block%20ne%20C";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest265()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=block%20ne%20D";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=block%20ne%20D";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest266()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bsmtSize%20eq%201000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bsmtSize%20eq%201000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest267()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bsmtSize%20eq%201040";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bsmtSize%20eq%201040";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest268()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bsmtSize%20ne%201240";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bsmtSize%20ne%201240";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest269()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bsmtSize%20ne%201251";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=bsmtSize%20ne%201251";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest270()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bsmtSize%20gt%201419";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=bsmtSize%20gt%201419";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest271()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bsmtSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=bsmtSize%20gt%202675";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest272()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bsmtSize%20ge%201930";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=bsmtSize%20ge%201930";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest273()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bsmtSize%20ge%201092";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=bsmtSize%20ge%201092";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest274()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bsmtSize%20lt%201766";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=bsmtSize%20lt%201766";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest275()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bsmtSize%20lt%201551";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=bsmtSize%20lt%201551";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest276()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bsmtSize%20le%201839";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=bsmtSize%20le%201839";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest277()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bsmtSize%20le%201073";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=bsmtSize%20le%201073";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest278()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest279()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest280()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=censusId%20in%20(100010410001069,100010401001010)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=censusId%20in%20(100010410001069,100010401001010)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest281()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest282()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=censusId%20eq%20100010410001069";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=censusId%20eq%20100010410001069";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest283()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=censusId%20eq%20100050512031012";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=censusId%20eq%20100050512031012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest284()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=censusId%20ne%20100010401001010";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=censusId%20ne%20100010401001010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest285()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=censusId%20ne%20100010413001033";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=censusId%20ne%20100010413001033";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest286()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest287()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest288()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest289()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=constructionType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=constructionType%20eq%20%27FRAME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byAddressTest290()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest291()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=constructionType%20ne%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=constructionType%20ne%20%27FRAME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byAddressTest292()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest293()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=coolingType%20eq%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=coolingType%20eq%20%27CENTRAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest294()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest295()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=coolingType%20ne%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=coolingType%20ne%20%27CENTRAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest296()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest297()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=dateValuation%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=dateValuation%20eq%20%272014-07-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest298()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=dateValuation%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=dateValuation%20eq%20%272015-01-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest299()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=dateValuation%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=dateValuation%20ne%20%272014-07-23%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest300()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=dateValuation%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=dateValuation%20ne%20%272014-08-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest301()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=dateValuation%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=dateValuation%20gt%20%272014-11-12%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest302()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=dateValuation%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=dateValuation%20gt%20%272014-08-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest303()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=dateValuation%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=dateValuation%20ge%20%272014-11-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest304()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=dateValuation%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=dateValuation%20ge%20%272014-03-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest305()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=dateValuation%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=dateValuation%20lt%20%272014-09-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest306()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=dateValuation%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=dateValuation%20lt%20%272014-02-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest307()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=dateValuation%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=dateValuation%20le%20%272015-01-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest308()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=dateValuation%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=dateValuation%20le%20%272014-08-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest309()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=depth%20eq%20120";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=depth%20eq%20120";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest310()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=depth%20eq%20180";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=depth%20eq%20180";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest311()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=depth%20ne%20140";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=depth%20ne%20140";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest312()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=depth%20ne%20160";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=depth%20ne%20160";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest313()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=depth%20gt%20142";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=depth%20gt%20142";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest314()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=depth%20gt%20130";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=depth%20gt%20130";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest315()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=depth%20ge%20167";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=depth%20ge%20167";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest316()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=depth%20ge%20145";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=depth%20ge%20145";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest317()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=depth%20lt%20136";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=depth%20lt%20136";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest318()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=depth%20lt%20106";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=depth%20lt%20106";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest319()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=depth%20le%20119";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=depth%20le%20119";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest320()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=depth%20le%20231";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=depth%20le%20231";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest321()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest322()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest323()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest324()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest325()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest326()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest327()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest328()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest329()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=extWalls%20eq%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=extWalls%20eq%20%27SHINGLE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest330()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=extWalls%20eq%20%27ALUMINUM%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=extWalls%20eq%20%27ALUMINUM%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest331()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=extWalls%20ne%20%27BRICK%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=extWalls%20ne%20%27BRICK%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest332()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=extWalls%20ne%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=extWalls%20ne%20%27SHINGLE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest333()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=fips%20in%20(10001,10003)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=fips%20in%20(10001,10003)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest334()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=fips%20in%20(10002,10004,10006)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=fips%20in%20(10002,10004,10006)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest335()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=fips%20eq%2010002";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=fips%20eq%2010002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest336()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=fips%20eq%2010004";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=fips%20eq%2010004";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest337()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=fips%20ne%2010003";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=fips%20ne%2010003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest338()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=fips%20ne%2010001";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=fips%20ne%2010001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest339()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest340()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest341()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=foundationType%20eq%20%27PILINGS%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=foundationType%20eq%20%27PILINGS%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest342()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=foundationType%20eq%20%27SLAB%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=foundationType%20eq%20%27SLAB%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest343()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=foundationType%20ne%20%27CONCRETE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=foundationType%20ne%20%27CONCRETE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest344()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=foundationType%20ne%20%27MASONRY%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=foundationType%20ne%20%27MASONRY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest345()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=fplcCount%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=fplcCount%20eq%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest346()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=fplcCount%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=fplcCount%20eq%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest347()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=fplcCount%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=fplcCount%20ne%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest348()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=fplcCount%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=fplcCount%20ne%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	@Test
	public void byAddressTest349()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=fplcCount%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=fplcCount%20gt%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
		
	@Test
	public void byAddressTest350()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=fplcCount%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=fplcCount%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	@Test
	public void byAddressTest351()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=fplcCount%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=fplcCount%20ge%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest352()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=fplcCount%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=fplcCount%20ge%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest353()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=fplcCount%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=fplcCount%20lt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest354()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=fplcCount%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=fplcCount%20lt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest355()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=fplcCount%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=fplcCount%20le%204";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest356()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=fplcCount%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=fplcCount%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest357()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=fplcInd%20eq%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=fplcInd%20eq%20%27Y%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest358()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=fplcInd%20eq%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=fplcInd%20eq%20%27N%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest359()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=fplcInd%20ne%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=fplcInd%20ne%20%27N%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest360()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=fplcInd%20ne%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=fplcInd%20ne%20%27Y%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest361()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest362()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest363()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest364()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=frame%20eq%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=frame%20eq%20%27METAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest365()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=frame%20eq%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=frame%20eq%20%27WOOD%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest366()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=frame%20ne%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=frame%20ne%20%27METAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest367()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=frame%20ne%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=frame%20ne%20%27WOOD%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest368()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=frontage%20eq%2019";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=frontage%20eq%2019";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest369()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=frontage%20eq%2012";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=frontage%20eq%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest370()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=frontage%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=frontage%20ne%2001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest371()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=frontage%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=frontage%20ne%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest372()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=frontage%20gt%20214";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=frontage%20gt%20214";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest373()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=frontage%20gt%20143";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=frontage%20gt%20143";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest374()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=frontage%20ge%20150";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=frontage%20ge%20150";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest375()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=frontage%20ge%20120";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=frontage%20ge%20120";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest376()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=frontage%20lt%2024";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=frontage%20lt%2024";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest377()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=frontage%20lt%2036";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=frontage%20lt%2036";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest378()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=frontage%20le%2055";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=frontage%20le%2055";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest379()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=frontage%20le%20105";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=frontage%20le%20105";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest380()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageSize%20eq%20242";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageSize%20eq%20242";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest381()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=garageSize%20eq%20483";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=garageSize%20eq%20483";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest382()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageSize%20ne%20440";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageSize%20ne%20440";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest383()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=garageSize%20ne%20511";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=garageSize%20ne%20511";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest384()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=garageSize%20gt%20630";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=garageSize%20gt%20630";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest385()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=garageSize%20gt%20600";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=garageSize%20gt%20600";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest386()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageSize%20ge%20840";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageSize%20ge%20840";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest387()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=garageSize%20ge%20480";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=garageSize%20ge%20480";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest388()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=garageSize%20lt%20440";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=garageSize%20lt%20440";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest389()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=garageSize%20lt%20441";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=garageSize%20lt%20441";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest390()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=garageSize%20le%20206";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=garageSize%20le%20206";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest391()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=garageSize%20le%20454";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=garageSize%20le%20454";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest392()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest393()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest394()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest395()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest396()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest397()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest398()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=groundFloorSize%20eq%202347";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=groundFloorSize%20eq%202347";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest399()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=groundFloorSize%20eq%204063";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=groundFloorSize%20eq%204063";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest400()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=groundFloorSize%20ne%201090";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=groundFloorSize%20ne%201090";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	@Test
	public void byAddressTest401()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=groundFloorSize%20ne%202571";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=groundFloorSize%20ne%202571";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest402()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=groundFloorSize%20gt%201664";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=groundFloorSize%20gt%201664";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest403()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=groundFloorSize%20gt%204063";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=groundFloorSize%20gt%204063";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	/*
	@Test
	public void byAddressTest404()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=groundFloorSize%20ge%201388";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=groundFloorSize%20ge%201388";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest405()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=groundFloorSize%20ge%20912";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=groundFloorSize%20ge%20912";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest406()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=groundFloorSize%20lt%201160";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=groundFloorSize%20lt%201160";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest407()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=groundFloorSize%20lt%202868";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=groundFloorSize%20lt%202868";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest408()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=groundFloorSize%20le%201753";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=groundFloorSize%20le%201753";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest409()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=groundFloorSize%20le%201560";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=groundFloorSize%20le%201560";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 

	@Test
	public void byAddressTest410()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest411()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest412()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest413()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest414()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=heatingType%20ne%20%27OIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=heatingType%20ne%20%27OIL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest415()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest416()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest417()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest418()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest419()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=landUse%20eq%20%27HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=landUse%20eq%20%27HOTEL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest420()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest421()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=landUse%20ne%20%27DUPLEX%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=landUse%20ne%20%27DUPLEX%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest422()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lastModified%20eq%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lastModified%20eq%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest423()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=lastModified%20eq%20%272014-11-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=lastModified%20eq%20%272014-11-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest424()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=lastModified%20ne%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=lastModified%20ne%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest425()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=lastModified%20ne%20%272014-10-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=lastModified%20ne%20%272014-10-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest426()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=lastModified%20gt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=lastModified%20gt%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest427()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=lastModified%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=lastModified%20gt%20%272014-11-12%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest428()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=lastModified%20ge%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=lastModified%20ge%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest429()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=lastModified%20ge%20%272014-12-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=lastModified%20ge%20%272014-12-31%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest430()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=lastModified%20lt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=lastModified%20lt%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest431()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=lastModified%20lt%20%272014-09-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=lastModified%20lt%20%272014-09-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest432()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=lastModified%20le%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=lastModified%20le%20%272014-09-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest433()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=lastModified%20le%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=lastModified%20le%20%272015-01-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest434()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=livingSize%20eq%202307";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=livingSize%20eq%202307";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest435()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=livingSize%20eq%201172";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=livingSize%20eq%201172";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest436()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=livingSize%20ne%203023";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=livingSize%20ne%203023";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest437()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=livingSize%20ne%201396";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=livingSize%20ne%201396";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest438()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=livingSize%20gt%202597";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=livingSize%20gt%202597";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest439()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=livingSize%20gt%201344";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=livingSize%20gt%201344";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest440()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=livingSize%20ge%201771";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=livingSize%20ge%201771";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest441()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=livingSize%20ge%201420";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=livingSize%20ge%201420";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest442()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=livingSize%20lt%202240";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=livingSize%20lt%202240";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest443()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=livingSize%20lt%201452";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=livingSize%20lt%201452";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest444()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=livingSize%20le%202145";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=livingSize%20le%202145";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest445()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=livingSize%20le%202000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=livingSize%20le%202000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest446()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=lotNum%20in%20(112,116)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=lotNum%20in%20(112,116)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest447()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotNum%20in%20(108,114,16)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotNum%20in%20(108,114,16)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest448()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=lotNum%20eq%2039";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=lotNum%20eq%2039";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest449()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=lotNum%20eq%20110";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=lotNum%20eq%20110";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest450()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=lotNum%20ne%2015";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=lotNum%20ne%2015";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest451()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotNum%20ne%20118";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotNum%20ne%20118";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest452()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=lotSize1%20eq%200.0523";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=lotSize1%20eq%200.0523";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest453()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize1%20eq%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize1%20eq%200.0262";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest454()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=lotSize1%20ne%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=lotSize1%20ne%200.0262";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest455()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=lotSize1%20ne%200.1436";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=lotSize1%20ne%200.1436";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest456()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=lotSize1%20gt%200.1047";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=lotSize1%20gt%200.1047";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest457()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize1%20gt%200.4017";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize1%20gt%200.4017";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest458()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=lotSize1%20ge%200.0551";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=lotSize1%20ge%200.0551";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest459()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=lotSize1%20ge%200.7576";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=lotSize1%20ge%200.7576";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest460()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=lotSize1%20lt%201.13";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=lotSize1%20lt%201.13";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest461()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=lotSize1%20lt%200.6061";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=lotSize1%20lt%200.6061";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest462()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=lotSize1%20le%200.0892";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=lotSize1%20le%200.0892";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest463()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=lotSize1%20le%200.11";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=lotSize1%20le%200.11";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest464()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=lotSize2%20eq%2012632";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=lotSize2%20eq%2012632";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest465()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=lotSize2%20eq%2017860";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=lotSize2%20eq%2017860";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest466()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=lotSize2%20ne%208712";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=lotSize2%20ne%208712";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest467()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=lotSize2%20ne%202100";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=lotSize2%20ne%202100";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest468()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=lotSize2%20gt%2010890";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=lotSize2%20gt%2010890";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest469()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=lotSize2%20gt%203885";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=lotSize2%20gt%203885";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest470()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize2%20ge%2010000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize2%20ge%2010000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest471()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=lotSize2%20ge%2051401";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=lotSize2%20ge%2051401";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest472()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize2%20lt%204830";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=lotSize2%20lt%204830";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest473()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=lotSize2%20lt%2051660";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=lotSize2%20lt%2051660";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest474()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=lotSize2%20le%2020230";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=lotSize2%20le%2020230";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest475()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=lotSize2%20le%205500";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=lotSize2%20le%205500";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest476()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=lotType%20in%20(I,IRR)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=lotType%20in%20(I,IRR)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest477()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=lotType%20eq%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=lotType%20eq%20IRR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest478()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=lotType%20eq%20I";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=lotType%20eq%20I";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest479()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=lotType%20ne%20I";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=lotType%20ne%20I";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest480()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=lotType%20ne%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=lotType%20ne%20IRR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest481()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=monthlyChgPct%20eq%200.4031";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=monthlyChgPct%20eq%200.4031";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest482()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgPct%20eq%201.0371";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgPct%20eq%201.0371";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest483()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=monthlyChgPct%20ne%2081.1657";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=monthlyChgPct%20ne%2081.1657";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest484()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgPct%20ne%20-0.4787";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgPct%20ne%20-0.4787";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest485()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=monthlyChgPct%20gt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=monthlyChgPct%20gt%200.6411";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest486()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=monthlyChgPct%20gt%200.3615";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=monthlyChgPct%20gt%200.3615";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest487()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=monthlyChgPct%20ge%200.2557";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=monthlyChgPct%20ge%200.2557";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest488()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgPct%20ge%200.0869";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgPct%20ge%200.0869";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest489()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=monthlyChgPct%20lt%200.1245";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=monthlyChgPct%20lt%200.1245";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest490()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=monthlyChgPct%20lt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=monthlyChgPct%20lt%200.6411";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest491()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=monthlyChgPct%20le%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=monthlyChgPct%20le%200.44";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest492()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=monthlyChgPct%20le%200.0925";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=monthlyChgPct%20le%200.0925";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest493()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=monthlyChgValue%20eq%203048";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=monthlyChgValue%20eq%203048";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest494()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=monthlyChgValue%20eq%20155";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=monthlyChgValue%20eq%20155";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest495()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=monthlyChgValue%20ne%20-839";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=monthlyChgValue%20ne%20-839";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest496()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=monthlyChgValue%20ne%202217";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=monthlyChgValue%20ne%202217";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest497()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=monthlyChgValue%20gt%203048";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=monthlyChgValue%20gt%203048";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest498()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=monthlyChgValue%20gt%201281";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=monthlyChgValue%20gt%201281";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest499()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=monthlyChgValue%20ge%20822";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=monthlyChgValue%20ge%20822";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest500()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=monthlyChgValue%20ge%201914";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=monthlyChgValue%20ge%201914";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest501()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgValue%20lt%201977";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgValue%20lt%201977";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest502()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=monthlyChgValue%20lt%20758";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=monthlyChgValue%20lt%20758";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest503()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgValue%20le%2065745";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=monthlyChgValue%20le%2065745";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest504()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=monthlyChgValue%20le%20-21";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=monthlyChgValue%20le%20-21";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest505()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest506()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest507()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest508()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest509()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest510()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest511()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=obPropId%20in%20(10003164371,10003164573)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=obPropId%20in%20(10003164371,10003164573)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest512()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest513()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=obPropId%20eq%2010005293290";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=obPropId%20eq%2010005293290";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest514()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=obPropId%20eq%2010005293302";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=obPropId%20eq%2010005293302";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest515()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=obPropId%20ne%2010005293281";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=obPropId%20ne%2010005293281";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest516()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=obPropId%20ne%2010003177976";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=obPropId%20ne%2010003177976";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest517()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest518()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest519()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=parkingType%20eq%20%27CEDAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=parkingType%20eq%20%27CEDAR%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest520()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest521()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest522()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=parkingType%20ne%20%27UNCOVERED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=parkingType%20ne%20%27UNCOVERED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest523()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=poolInd%20eq%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=poolInd%20eq%20Y";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest524()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolInd%20eq%20N";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolInd%20eq%20N";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest525()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolInd%20ne%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolInd%20ne%20Y";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest526()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=poolInd%20ne%20N";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=poolInd%20ne%20N";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest527()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest528()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest529()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest530()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest531()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=poolType%20ne%20%27FISH%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=poolType%20ne%20%27FISH%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest532()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest533()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest534()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest535()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=propInd%20eq%20%27HOSPITAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=propInd%20eq%20%27HOSPITAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest536()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest537()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest538()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=propInd%20ne%20%27WAREHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=propInd%20ne%20%27WAREHOUSE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest539()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=rangePctOfValue%20eq%2026.0002";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=rangePctOfValue%20eq%2026.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest540()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=rangePctOfValue%20eq%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=rangePctOfValue%20eq%2020.0003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest541()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=rangePctOfValue%20ne%2024.0003";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=rangePctOfValue%20ne%2024.0003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest542()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=rangePctOfValue%20ne%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=rangePctOfValue%20ne%2023.9998";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest543()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=rangePctOfValue%20gt%2024.0001";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=rangePctOfValue%20gt%2024.0001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest544()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=rangePctOfValue%20gt%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=rangePctOfValue%20gt%2020.0003";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest545()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=rangePctOfValue%20ge%2019.9999";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=rangePctOfValue%20ge%2019.9999";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest546()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=rangePctOfValue%20ge%2024.0002";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=rangePctOfValue%20ge%2024.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest547()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=rangePctOfValue%20lt%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=rangePctOfValue%20lt%2023.9998";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest548()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=rangePctOfValue%20lt%2022.0002";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=rangePctOfValue%20lt%2022.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest549()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=rangePctOfValue%20le%2020.0002";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=rangePctOfValue%20le%2020.0002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest550()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=rangePctOfValue%20le%2015.9996";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=rangePctOfValue%20le%2015.9996";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest551()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest552()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest553()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=roofCover%20eq%20%27ROCK%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=roofCover%20eq%20%27ROCK%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest554()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest555()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest556()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest557()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest558()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest559()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=roofType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=roofType%20eq%20%27FRAME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest560()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=roofType%20eq%20%27CANOPY%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=roofType%20eq%20%27CANOPY%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest561()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest562()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=roofType%20ne%20%27GABLE/HIP%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=roofType%20ne%20%27GABLE/HIP%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest563()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=saleAmt%20eq%20115000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=saleAmt%20eq%20115000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest564()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleAmt%20eq%20169900";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleAmt%20eq%20169900";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest565()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=saleAmt%20ne%20248000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=saleAmt%20ne%20248000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest566()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=saleAmt%20ne%20368474";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=saleAmt%20ne%20368474";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest567()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=saleAmt%20gt%2052000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=saleAmt%20gt%2052000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest568()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=saleAmt%20gt%20338400";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=saleAmt%20gt%20338400";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest569()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleAmt%20ge%20290000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleAmt%20ge%20290000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest570()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleAmt%20ge%20184565";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleAmt%20ge%20184565";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest571()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleAmt%20lt%20149990";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleAmt%20lt%20149990";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest572()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleAmt%20lt%20188615";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleAmt%20lt%20188615";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest573()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleAmt%20le%20180840";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleAmt%20le%20180840";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest574()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleAmt%20le%20170299";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleAmt%20le%20170299";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest575()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleDocNum%20in%20(53005,121159)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleDocNum%20in%20(53005,121159)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest576()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleDocNum%20in%20(43221,145144,40031)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleDocNum%20in%20(43221,145144,40031)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest577()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleDocNum%20eq%20108301";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleDocNum%20eq%20108301";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest578()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=saleDocNum%20eq%2063918";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=saleDocNum%20eq%2063918";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest579()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleDocNum%20ne%202944000082";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleDocNum%20ne%202944000082";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest580()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=saleDocNum%20ne%2027361";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=saleDocNum%20ne%2027361";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest581()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=saleTransDate%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=saleTransDate%20eq%20%272014-07-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest582()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=saleTransDate%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=saleTransDate%20eq%20%272015-01-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest583()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=saleTransDate%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=saleTransDate%20ne%20%272014-07-23%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest584()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=saleTransDate%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=saleTransDate%20ne%20%272014-08-08%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest585()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleTransDate%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleTransDate%20gt%20%272014-11-12%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest586()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleTransDate%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleTransDate%20gt%20%272014-08-16%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest587()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleTransDate%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleTransDate%20ge%20%272014-11-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest588()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleTransDate%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleTransDate%20ge%20%272014-03-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest589()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleTransDate%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleTransDate%20lt%20%272014-09-11%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest590()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleTransDate%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleTransDate%20lt%20%272014-02-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest591()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=saleTransDate%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=saleTransDate%20le%20%272015-01-14%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest592()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleTransDate%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleTransDate%20le%20%272014-08-07%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest593()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest594()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest595()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest596()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest597()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest598()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest599()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest600()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	
	@Test
	public void byAddressTest601()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest602()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest603()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=saleSearchDate%20le%20%272013-08-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=saleSearchDate%20le%20%272013-08-19%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest604()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleSearchDate%20le%20%272006-05-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleSearchDate%20le%20%272006-05-02%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest605()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest606()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest607()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleTransType%20eq%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=saleTransType%20eq%20%27RESALE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest608()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest609()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleTransType%20ne%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=saleTransType%20ne%20%27RESALE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest610()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest611()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleType%20eq%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=saleType%20eq%20%27Full%20Value%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest612()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=saleType%20ne%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=saleType%20ne%20%27Full%20Value%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest613()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest614()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest615()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=sewerType%20eq%20%27SEPTIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=sewerType%20eq%20%27SEPTIC%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest616()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=sewerType%20eq%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=sewerType%20eq%20%27NONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest617()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest618()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest619()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest620()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest621()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest622()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=style%20eq%20%27RAISED%20RANCH%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=style%20eq%20%27RAISED%20RANCH%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest623()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=style%20ne%20%27MANSION%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=style%20ne%20%27MANSION%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest624()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=style%20ne%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=style%20ne%20%27MOBILE%20HOME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest625()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest626()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest627()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest628()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest629()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=subdName%20ne%20%27MERESTONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=subdName%20ne%20%27MERESTONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest630()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest631()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=subdTractNum%20in%20(1-A,1-B)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=subdTractNum%20in%20(1-A,1-B)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest632()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=subdTractNum%20in%20(A,B,C,D)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=subdTractNum%20in%20(A,B,C,D)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest633()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=subdTractNum%20eq%20323";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=subdTractNum%20eq%20323";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest634()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=subdTractNum%20eq%2050";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=subdTractNum%20eq%2050";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest635()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=subdTractNum%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=subdTractNum%20ne%2001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest636()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=subdTractNum%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=subdTractNum%20ne%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest637()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=taxAmt%20eq%2023778.31";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=taxAmt%20eq%2023778.31";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest638()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=taxAmt%20eq%201952.07";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=taxAmt%20eq%201952.07";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest639()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=taxAmt%20ne%207217.81";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=taxAmt%20ne%207217.81";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest640()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=taxAmt%20ne%201676.44";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=taxAmt%20ne%201676.44";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest641()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxAmt%20gt%20108596.29";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxAmt%20gt%20108596.29";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest642()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxAmt%20gt%20865880.7";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxAmt%20gt%20865880.7";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest643()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxAmt%20ge%20343074.19";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxAmt%20ge%20343074.19";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest644()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=taxAmt%20ge%201009.04";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=taxAmt%20ge%201009.04";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest645()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxAmt%20lt%20279168.77";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxAmt%20lt%20279168.77";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest646()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=taxAmt%20lt%2032139.73";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=taxAmt%20lt%2032139.73";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest647()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=taxAmt%20le%2010840.59";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=taxAmt%20le%2010840.59";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest648()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=taxAmt%20le%20503848.67";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=taxAmt%20le%20503848.67";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest649()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxCodeArea%20in%20(04,08)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxCodeArea%20in%20(04,08)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest650()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxCodeArea%20in%20(20,10,18)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxCodeArea%20in%20(20,10,18)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest651()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=taxCodeArea%20eq%2011";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=taxCodeArea%20eq%2011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest652()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxCodeArea%20eq%2006";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxCodeArea%20eq%2006";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest653()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=taxCodeArea%20ne%2000";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=taxCodeArea%20ne%2000";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest654()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=taxCodeArea%20ne%2021";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=taxCodeArea%20ne%2021";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest655()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxPerSizeUnit%20eq%200.43";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=taxPerSizeUnit%20eq%200.43";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest656()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxPerSizeUnit%20eq%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxPerSizeUnit%20eq%200.25";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest657()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=taxPerSizeUnit%20ne%200.07";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=taxPerSizeUnit%20ne%200.07";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest658()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxPerSizeUnit%20ne%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxPerSizeUnit%20ne%200.42";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest659()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=taxPerSizeUnit%20gt%200.46";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=taxPerSizeUnit%20gt%200.46";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest660()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=taxPerSizeUnit%20gt%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=taxPerSizeUnit%20gt%200.25";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest661()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=taxPerSizeUnit%20ge%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=taxPerSizeUnit%20ge%200.44";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest662()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxPerSizeUnit%20ge%200.53";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=taxPerSizeUnit%20ge%200.53";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest663()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=taxPerSizeUnit%20lt%200.59";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=taxPerSizeUnit%20lt%200.59";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest664()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=taxPerSizeUnit%20lt%200.37";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=taxPerSizeUnit%20lt%200.37";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest665()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=taxPerSizeUnit%20le%200.52";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=taxPerSizeUnit%20le%200.52";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest666()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=taxPerSizeUnit%20le%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=taxPerSizeUnit%20le%200.42";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest667()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=totalRooms%20eq%208";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=totalRooms%20eq%208";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest668()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=totalRooms%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=totalRooms%20eq%2010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest669()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=totalRooms%20ne%207";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=totalRooms%20ne%207";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest670()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=totalRooms%20ne%206";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=totalRooms%20ne%206";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest671()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=totalRooms%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest672()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=totalRooms%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=totalRooms%20gt%203";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest673()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=totalRooms%20ge%209";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=totalRooms%20ge%209";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest674()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=totalRooms%20ge%207";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=totalRooms%20ge%207";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest675()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=totalRooms%20lt%205";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=totalRooms%20lt%205";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest676()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=totalRooms%20lt%206";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=totalRooms%20lt%206";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest677()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=totalRooms%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=totalRooms%20le%2011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest678()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=totalRooms%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=totalRooms%20le%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest679()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=unitsCount%20eq%2018";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=unitsCount%20eq%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest680()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=unitsCount%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=unitsCount%20eq%2010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest681()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=unitsCount%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=unitsCount%20ne%201";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest682()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=unitsCount%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=unitsCount%20ne%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest683()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=unitsCount%20gt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=unitsCount%20gt%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest684()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=unitsCount%20gt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=unitsCount%20gt%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest685()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=unitsCount%20ge%2018";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=unitsCount%20ge%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest686()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=unitsCount%20ge%2012";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=unitsCount%20ge%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest687()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=unitsCount%20lt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=unitsCount%20lt%2018";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest688()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=unitsCount%20lt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=unitsCount%20lt%2012";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest689()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=unitsCount%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=unitsCount%20le%2011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest690()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=unitsCount%20le%2016";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=unitsCount%20le%2016";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest691()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=universalSize%20eq%204124";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=universalSize%20eq%204124";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest692()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=universalSize%20eq%201600";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=universalSize%20eq%201600";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest693()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=universalSize%20ne%202644";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=universalSize%20ne%202644";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest694()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=universalSize%20ne%204208";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=universalSize%20ne%204208";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest695()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=universalSize%20gt%201768";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=universalSize%20gt%201768";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest696()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=universalSize%20gt%202043";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=universalSize%20gt%202043";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest697()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=universalSize%20ge%202151";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=universalSize%20ge%202151";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest698()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=universalSize%20ge%204184";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=universalSize%20ge%204184";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest699()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=universalSize%20lt%203076";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=universalSize%20lt%203076";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest700()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=universalSize%20lt%201871";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=universalSize%20lt%201871";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest701()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=universalSize%20le%202967";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=universalSize%20le%202967";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest702()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=universalSize%20le%201536";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=universalSize%20le%201536";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest703()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest704()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest705()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=view%20eq%20%27RECREATIONAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=view%20eq%20%27RECREATIONAL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest706()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=view%20eq%20%27STREET%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=view%20eq%20%27STREET%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest707()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=view%20ne%20%27WATER%20VIEW%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=view%20ne%20%27WATER%20VIEW%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest708()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=view%20ne%20%27SUBURBAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=view%20ne%20%27SUBURBAN%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest709()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest710()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest711()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=waterType%20eq%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=waterType%20eq%20%27WELL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest712()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=waterType%20eq%20%27PUBLIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=waterType%20eq%20%27PUBLIC%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest713()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=waterType%20ne%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=waterType%20ne%20%27NONE%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest714()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=waterType%20ne%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=waterType%20ne%20%27WELL%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest715()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuilt%20in%20(2001,2005)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuilt%20in%20(2001,2005)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest716()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuilt%20in%20(1950,1972,1969)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest717()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuilt%20eq%202010";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuilt%20eq%202010";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest718()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=yearBuilt%20eq%202007";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=yearBuilt%20eq%202007";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest719()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuilt%20ne%201967";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuilt%20ne%201967";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest720()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=yearBuilt%20ne%202006";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=yearBuilt%20ne%202006";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest721()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=yearBuilt%20gt%202008";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=yearBuilt%20gt%202008";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest722()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=yearBuilt%20gt%202011";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=yearBuilt%20gt%202011";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest723()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuilt%20ge%202005";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuilt%20ge%202005";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest724()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=yearBuilt%20ge%202009";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:26002+River+Seaford+DE+19973&filter=yearBuilt%20ge%202009";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest725()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=yearBuilt%20lt%202006";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:12405+Mirey+Branch+Laurel+DE+19956&filter=yearBuilt%20lt%202006";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest726()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=yearBuilt%20lt%201997";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:806+Front+Milford+DE+19963&filter=yearBuilt%20lt%201997";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest727()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=yearBuilt%20le%202002";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:49+Harlequin+Bridgeville+DE+19933&filter=yearBuilt%20le%202002";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest728()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=yearBuilt%20le%201983";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=yearBuilt%20le%201983";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest729()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=yearBuiltEffective%20in%20(1996,1978)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=yearBuiltEffective%20in%20(1996,1978)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest730()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest731()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=yearBuiltEffective%20eq%201994";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=yearBuiltEffective%20eq%201994";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest732()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=yearBuiltEffective%20eq%201991";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=yearBuiltEffective%20eq%201991";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest733()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=yearBuiltEffective%20ne%201982";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:14812+Adamsville+Greenwood+DE+19950&filter=yearBuiltEffective%20ne%201982";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest734()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuiltEffective%20ne%201988";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuiltEffective%20ne%201988";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest735()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuiltEffective%20gt%201989";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20394+Spangler+Milford+DE+19960&filter=yearBuiltEffective%20gt%201989";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest736()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuiltEffective%20gt%201996";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuiltEffective%20gt%201996";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest737()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=yearBuiltEffective%20ge%201994";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:35025+Pyle+Center+FRANKFORD+DE+19945&filter=yearBuiltEffective%20ge%201994";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest738()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuiltEffective%20ge%201993";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuiltEffective%20ge%201993";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest739()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=yearBuiltEffective%20lt%201991";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:20139+Lowes+Millsboro+DE+19966&filter=yearBuiltEffective%20lt%201991";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest740()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=yearBuiltEffective%20lt%201980";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:202+Hantwerker+Delmar+DE+19940&filter=yearBuiltEffective%20lt%201980";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest741()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=yearBuiltEffective%20le%201996";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:28667+Sussex+Laurel+DE+19956&filter=yearBuiltEffective%20le%201996";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest742()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuiltEffective%20le%201992";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:40202+Maryland+Fenwick+Island+DE+19944&filter=yearBuiltEffective%20le%201992";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest743()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=zoning%20in%20(TN,MR)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:1114+Bancroft+Wilmington+DE+19805&filter=zoning%20in%20(TN,MR)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest744()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=zoning%20in%20(AR1,NC40,ON)";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33214+Main+Dagsboro+DE+19939&filter=zoning%20in%20(AR1,NC40,ON)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest745()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=zoning%20eq%20R1";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:108+Pinewater+Harbeson+DE+19951&filter=zoning%20eq%20R1";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest746()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=zoning%20eq%20AR1";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:33+Lakeshore+Lewes+DE+19958&filter=zoning%20eq%20AR1";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest747()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=zoning%20ne%20MR";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:15+Bay+Reach+Rehoboth+Beach+DE+19971&filter=zoning%20ne%20MR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	@Test
	public void byAddressTest748()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=zoning%20ne%20CR";
	            
	            totalNumber =
	    		when().
	                    get("/property/address?address={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "address:637+Bedford+Georgetown+DE+19947&filter=zoning%20ne%20CR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/property/address?address={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	
}
