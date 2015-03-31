package TestingPackage;

import static com.jayway.restassured.RestAssured.*;
import org.junit.Test;
import com.jayway.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;


public class SearchByRadius {
		
	/*
	@Test
	public void Test00()
	{
		int result = getTotalRadius00();
		byRadiusTest00(result);
		byRadiusTest00(result);	
	}
	public int getTotalRadius00()
	{
		 int totalNumber;
		try {
		
			RestAssured.baseURI = "http://demo2.onboardis.us";
            RestAssured.urlEncodingEnabled = false;
            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
            
            totalNumber =
    		when().
                    get("/properties/summaries/radius?point={q}", query).
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
	public void byRadiusTest00(int result)
	{
		 try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(result)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}
	*/
	
	
	@Test
	public void byRadiusTest000()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20gt%202";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	 }   
	/*
	@Test
	public void byRadiusTest001()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=20&unit=mi&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=20&unit=mi&page=1&size=30";
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
	public void byRadiusTest002()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=20&unit=mi&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=20&unit=mi&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	*/
	@Test
	public void byRadiusTest003()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=20&unit=mi&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=20&unit=mi&page=1&size=30";
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
	public void byRadiusTest004()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=20&unit=mi&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=20&unit=mi&page=1&size=30";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	/*
	@Test
	public void byRadiusTest005()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=20&unit=mi&page=1&size=30";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=20&unit=mi&page=1&size=30";
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
	public void byRadiusTest006()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27ABSENTEE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27ABSENTEE%27)";
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
	public void byRadiusTest007()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20in%20(%27OWNER%20OCCUPIED%27,%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27)";
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
	public void byRadiusTest008()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20eq%20%27SITUS%20FROM%20SALE%20(OCCUPIED)%27";
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
	public void byRadiusTest009()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20eq%20%27OWNER%20OCCUPIED%27";
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
	public void byRadiusTest010()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20ne%20%27SITUS%20ADDRESS%20TAKEN%20FROM%20MAIL%27";
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
	public void byRadiusTest011()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=absenteeOwner%20ne%20%27OWNER%20OCCUPIED%27";
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
	public void byRadiusTest012()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20eq%20%27Equitable%20Building%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	public void byRadiusTest013()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20eq%20%27%27";
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
	public void byRadiusTest014()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20ne%20%27Equitable%20Building%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	public void byRadiusTest015()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=addrBldgName%20ne%20%27%27";
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
	public void byRadiusTest016()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=addrCountrySubd%20eq%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=addrCountrySubd%20eq%20DE";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   

	
	public void byRadiusTest017()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=addrCountrySubd%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=addrCountrySubd%20eq%20%27%27";
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
	public void byRadiusTest018()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=addrCountrySubd%20ne%20DE";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=addrCountrySubd%20ne%20DE";
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
	public void byRadiusTest019()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20in%20(19939,19934)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20in%20(19939,19934)";
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
	public void byRadiusTest020()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20in%20(19936,19938,19939)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20in%20(19936,19938,19939)";
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
	public void byRadiusTest021()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20eq%2019711";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20eq%2019711";
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
	public void byRadiusTest022()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20eq%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20eq%2019938";
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
	public void byRadiusTest023()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20ne%2019938";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20ne%2019938";
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
	public void byRadiusTest024()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20ne%2019934";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=addrPostal1%20ne%2019934";
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
	public void byRadiusTest025()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20in%20(R001,R006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20in%20(R001,R006)";
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
	public void byRadiusTest026()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20in%20(C004,C001,C003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20in%20(C004,C001,C003)";
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
	public void byRadiusTest027()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20eq%20R005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20eq%20R005";
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
	public void byRadiusTest028()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20eq%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20eq%20%27%27";
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
	public void byRadiusTest029()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20ne%20R007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20ne%20R007";
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
	public void byRadiusTest030()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20ne%20%27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=addrPostal3%20ne%20%27%27";
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
	public void byRadiusTest031()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=apn%20in%20(1300300053300,0699999026)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=apn%20in%20(1300300053300,0699999026)";
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
	public void byRadiusTest032()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=apn%20in%20(60077777010300000,0699999023,0699999027)";
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
	public void byRadiusTest033()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=apn%20eq%2060077777010200000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=apn%20eq%2060077777010200000";
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
	public void byRadiusTest034()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=apn%20eq%200699999004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=apn%20eq%200699999004";
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
	public void byRadiusTest035()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=apn%20ne%200699999013";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=apn%20ne%200699999013";
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
	public void byRadiusTest036()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=apn%20ne%201099999007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=apn%20ne%201099999007";
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
	public void byRadiusTest037()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2018.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2018.35";
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
	public void byRadiusTest038()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2022.03";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20eq%2022.03";
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
	public void byRadiusTest039()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2022.79";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2022.79";
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
	public void byRadiusTest040()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ne%2024";
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
	public void byRadiusTest041()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2021.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2021.14";
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
	public void byRadiusTest042()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2023.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20gt%2023.81";
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
	public void byRadiusTest043()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ge%209.12";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ge%209.12";
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
	public void byRadiusTest044()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ge%2018.78";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20ge%2018.78";
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
	public void byRadiusTest045()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2017.95";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2017.95";
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
	public void byRadiusTest046()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2018.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20lt%2018.14";
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
	public void byRadiusTest047()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20le%2025.35";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20le%2025.35";
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
	public void byRadiusTest048()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20le%2024.56";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdImprPerSizeUnit%20le%2024.56";
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
	public void byRadiusTest049()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20eq%20349800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20eq%20349800";
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
	public void byRadiusTest050()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20eq%201331000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20eq%201331000";
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
	public void byRadiusTest051()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ne%20314400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ne%20314400";
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
	public void byRadiusTest052()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ne%20712100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ne%20712100";
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
	public void byRadiusTest053()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20gt%202882100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20gt%202882100";
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
	public void byRadiusTest054()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20gt%203562800";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20gt%203562800";
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
	public void byRadiusTest055()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ge%2055000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ge%2055000";
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
	public void byRadiusTest056()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ge%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20ge%201000";
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
	public void byRadiusTest057()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20lt%209158900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20lt%209158900";
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
	public void byRadiusTest058()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20lt%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20lt%204625300";
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
	public void byRadiusTest059()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20le%201750";
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
	public void byRadiusTest060()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20le%204625300";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=assdImprValue%20le%204625300";
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
	public void byRadiusTest061()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.09";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.09";
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
	public void byRadiusTest062()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.15";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20eq%200.15";
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
	public void byRadiusTest063()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.39";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.39";
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
	public void byRadiusTest064()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ne%200.27";
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
	public void byRadiusTest065()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.18";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.18";
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
	public void byRadiusTest066()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.20";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20gt%200.20";
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
	public void byRadiusTest067()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.06";
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
	public void byRadiusTest068()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.14";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20ge%200.14";
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
	public void byRadiusTest069()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.31";
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
	public void byRadiusTest070()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20lt%200.29";
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
	public void byRadiusTest071()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.57";
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
	public void byRadiusTest072()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.58";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdLandPerSizeUnit%20le%200.58";
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
	public void byRadiusTest073()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20eq%201250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20eq%201250";
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
	public void byRadiusTest074()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20eq%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20eq%201500";
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
	public void byRadiusTest075()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ne%20550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ne%20550";
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
	public void byRadiusTest076()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ne%20350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ne%20350";
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
	public void byRadiusTest077()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20gt%2011500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20gt%2011500";
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
	public void byRadiusTest078()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20gt%203750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20gt%203750";
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
	public void byRadiusTest079()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ge%201400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ge%201400";
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
	public void byRadiusTest080()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ge%202250";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20ge%202250";
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
	public void byRadiusTest081()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20lt%20180000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20lt%20180000";
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
	public void byRadiusTest082()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20lt%204000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20lt%204000";
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
	public void byRadiusTest083()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20le%201750";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20le%201750";
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
	public void byRadiusTest084()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20le%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdLandValue%20le%202100";
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
	public void byRadiusTest085()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.55";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.55";
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
	public void byRadiusTest086()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	}   
	
	
	public void byRadiusTest088()
	{
		//This will fail.
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20eq%206.48";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
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
	public void byRadiusTest087()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%204.93";
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
	public void byRadiusTest089()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%203.87";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ne%203.87";
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
	public void byRadiusTest090()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%208.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%208.13";
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
	public void byRadiusTest091()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%204.69";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20gt%204.69";
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
	public void byRadiusTest092()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%206.47";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%206.47";
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
	public void byRadiusTest093()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%205.06";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20ge%205.06";
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
	public void byRadiusTest094()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%2010.71";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%2010.71";
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
	public void byRadiusTest095()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%201.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20lt%201.46";
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
	public void byRadiusTest096()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20le%206.01";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20le%206.01";
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
	public void byRadiusTest097()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20le%204.57";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=assdTtlPerSizeUnit%20le%204.57";
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
	public void byRadiusTest098()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20eq%201350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20eq%201350";
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
	public void byRadiusTest099()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20eq%20950";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20eq%20950";
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
	public void byRadiusTest100()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ne%201500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ne%201500";
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
	public void byRadiusTest101()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ne%203150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ne%203150";
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
	public void byRadiusTest102()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20gt%206350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20gt%206350";
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
	public void byRadiusTest103()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20gt%2010100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20gt%2010100";
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
	public void byRadiusTest104()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ge%2011350";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ge%2011350";
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
	public void byRadiusTest105()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ge%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20ge%2042872";
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
	public void byRadiusTest106()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20lt%2050514";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20lt%2050514";
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
	public void byRadiusTest107()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20lt%2042872";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20lt%2042872";
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
	public void byRadiusTest108()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20le%202200";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20le%202200";
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
	public void byRadiusTest109()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20le%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=assdTtlValue%20le%201700";
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
	public void byRadiusTest110()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20eq%20282783";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20eq%20282783";
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
	public void byRadiusTest111()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20eq%20256143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20eq%20256143";
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
	public void byRadiusTest112()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ne%20308184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ne%20308184";
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
	public void byRadiusTest113()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ne%20284655";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ne%20284655";
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
	public void byRadiusTest114()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20gt%20146746";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20gt%20146746";
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
	public void byRadiusTest115()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20gt%20210985";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20gt%20210985";
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
	public void byRadiusTest116()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ge%20178941";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ge%20178941";
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
	public void byRadiusTest117()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ge%20183298";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20ge%20183298";
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
	public void byRadiusTest118()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20lt%20174434";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20lt%20174434";
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
	public void byRadiusTest119()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20lt%20292084";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20lt%20292084";
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
	public void byRadiusTest120()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20le%20319040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20le%20319040";
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
	public void byRadiusTest121()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20le%20217032";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=avmValue%20le%20217032";
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
	public void byRadiusTest122()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20eq%20202343";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20eq%20202343";
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
	public void byRadiusTest123()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20eq%20350393";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20eq%20350393";
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
	public void byRadiusTest124()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ne%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ne%20226577";
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
	public void byRadiusTest125()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ne%20209361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ne%20209361";
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
	public void byRadiusTest126()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20gt%20357325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20gt%20357325";
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
	public void byRadiusTest127()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20gt%20344503";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20gt%20344503";
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
	public void byRadiusTest128()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ge%20367949";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ge%20367949";
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
	public void byRadiusTest129()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ge%20214459";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20ge%20214459";
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
	public void byRadiusTest130()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20lt%20226577";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20lt%20226577";
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
	public void byRadiusTest131()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20lt%20209249";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20lt%20209249";
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
	public void byRadiusTest132()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20le%20333046";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20le%20333046";
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
	public void byRadiusTest133()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20le%20316717";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=avmValueHigh%20le%20316717";
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
	public void byRadiusTest134()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20eq%20218170";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20eq%20218170";
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
	public void byRadiusTest135()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20eq%20190325";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20eq%20190325";
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
	public void byRadiusTest136()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ne%20117881";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ne%20117881";
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
	public void byRadiusTest137()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ne%20128911";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ne%20128911";
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
	public void byRadiusTest138()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20gt%2062516";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20gt%2062516";
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
	public void byRadiusTest139()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20gt%2080338";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20gt%2080338";
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
	public void byRadiusTest140()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ge%20148136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ge%20148136";
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
	public void byRadiusTest141()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ge%20222536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20ge%20222536";
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
	public void byRadiusTest142()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20lt%20132135";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20lt%20132135";
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
	public void byRadiusTest143()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20lt%20171907";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20lt%20171907";
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
	public void byRadiusTest144()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20le%20148794";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20le%20148794";
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
	public void byRadiusTest145()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20le%2093896";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=avmValueLow%20le%2093896";
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
	public void byRadiusTest146()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20eq%204";
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
	public void byRadiusTest147()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20eq%202";
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
	public void byRadiusTest148()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ne%204";
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
	public void byRadiusTest149()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ne%201";
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
	public void byRadiusTest150()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20gt%202";
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
	public void byRadiusTest151()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20gt%203";
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
	public void byRadiusTest152()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ge%203";
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
	public void byRadiusTest153()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20ge%204";
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
	public void byRadiusTest154()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20lt%201";
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
	public void byRadiusTest155()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20lt%203";
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
	public void byRadiusTest156()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20le%202";
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
	public void byRadiusTest157()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=baths1Qtr%20le%204";
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
	public void byRadiusTest158()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20eq%204";
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
	public void byRadiusTest159()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20eq%202";
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
	public void byRadiusTest160()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ne%204";
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
	public void byRadiusTest161()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ne%203";
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
	public void byRadiusTest162()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20gt%202";
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
	public void byRadiusTest163()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20gt%201";
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
	public void byRadiusTest164()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ge%202";
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
	public void byRadiusTest165()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20ge%203";
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
	public void byRadiusTest166()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20lt%204";
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
	public void byRadiusTest167()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20lt%203";
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
	public void byRadiusTest168()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20le%202";
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
	public void byRadiusTest169()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=baths3Qtr%20le%203";
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
	public void byRadiusTest170()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20eq%204";
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
	public void byRadiusTest171()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20eq%203";
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
	public void byRadiusTest172()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ne%202";
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
	public void byRadiusTest173()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ne%203";
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
	public void byRadiusTest174()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20gt%202";
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
	public void byRadiusTest175()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20gt%201";
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
	public void byRadiusTest176()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ge%202";
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
	public void byRadiusTest177()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20ge%203";
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
	public void byRadiusTest178()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20lt%204";
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
	public void byRadiusTest179()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20lt%203";
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
	public void byRadiusTest180()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20le%202";
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
	public void byRadiusTest181()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bathsCalc%20le%203";
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
	public void byRadiusTest182()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20eq%202";
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
	public void byRadiusTest183()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20eq%203";
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
	public void byRadiusTest184()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ne%204";
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
	public void byRadiusTest185()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ne%202";
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
	public void byRadiusTest186()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20gt%202";
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
	public void byRadiusTest187()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20gt%203";
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
	public void byRadiusTest188()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ge%204";
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
	public void byRadiusTest189()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20ge%202";
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
	public void byRadiusTest190()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20lt%203";
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
	public void byRadiusTest191()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20lt%202";
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
	public void byRadiusTest192()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20le%204";
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
	public void byRadiusTest193()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bathsFull%20le%203";
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
	public void byRadiusTest194()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20eq%201";
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
	public void byRadiusTest195()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20eq%202";
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
	public void byRadiusTest196()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ne%201";
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
	public void byRadiusTest197()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ne%202";
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
	public void byRadiusTest198()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20gt%201";
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
	public void byRadiusTest199()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20gt%204";
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
	public void byRadiusTest200()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ge%201";
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
	public void byRadiusTest201()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20ge%202";
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
	public void byRadiusTest202()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20lt%201";
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
	public void byRadiusTest203()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20lt%204";
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
	public void byRadiusTest204()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20le%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20le%201";
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
	public void byRadiusTest205()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bathsHalf%20le%202";
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
	public void byRadiusTest206()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20eq%201";
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
	public void byRadiusTest207()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20eq%203";
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
	public void byRadiusTest208()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ne%202";
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
	public void byRadiusTest209()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ne%204";
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
	public void byRadiusTest210()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20gt%203";
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
	public void byRadiusTest211()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20gt%204";
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
	public void byRadiusTest212()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ge%201";
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
	public void byRadiusTest213()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20ge%202";
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
	public void byRadiusTest214()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20lt%201";
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
	public void byRadiusTest215()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20lt%203";
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
	public void byRadiusTest216()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20le%202";
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
	public void byRadiusTest217()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bathsTotal%20le%204";
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
	public void byRadiusTest218()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=beds%20eq%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=beds%20eq%204";
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
	public void byRadiusTest219()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=beds%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=beds%20eq%203";
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
	public void byRadiusTest220()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=beds%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=beds%20ne%202";
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
	public void byRadiusTest221()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=beds%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=beds%20ne%201";
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
	public void byRadiusTest222()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=beds%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=beds%20gt%203";
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
	public void byRadiusTest223()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=beds%20gt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=beds%20gt%204";
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
	public void byRadiusTest224()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=beds%20ge%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=beds%20ge%201";
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
	public void byRadiusTest225()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=beds%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=beds%20ge%202";
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
	public void byRadiusTest226()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=beds%20lt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=beds%20lt%201";
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
	public void byRadiusTest227()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=beds%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=beds%20lt%203";
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
	public void byRadiusTest228()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=beds%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=beds%20le%202";
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
	public void byRadiusTest229()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=beds%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=beds%20le%204";
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
	public void byRadiusTest230()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20eq%203500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20eq%203500";
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
	public void byRadiusTest231()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20eq%201150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20eq%201150";
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
	public void byRadiusTest232()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ne%202650";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ne%202650";
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
	public void byRadiusTest233()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ne%201125";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ne%201125";
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
	public void byRadiusTest234()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20gt%201700";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20gt%201700";
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
	public void byRadiusTest235()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20gt%202675";
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
	public void byRadiusTest236()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ge%202425";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ge%202425";
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
	public void byRadiusTest237()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ge%201525";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20ge%201525";
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
	public void byRadiusTest238()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20lt%201850";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20lt%201850";
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
	public void byRadiusTest239()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20lt%203675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20lt%203675";
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
	public void byRadiusTest240()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20le%202550";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20le%202550";
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
	public void byRadiusTest241()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20le%201630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bldgSize%20le%201630";
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
	public void byRadiusTest242()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20eq%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20eq%201";
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
	public void byRadiusTest243()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20eq%202";
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
	public void byRadiusTest244()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ne%203";
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
	public void byRadiusTest245()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ne%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ne%202";
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
	public void byRadiusTest246()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20gt%201";
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
	public void byRadiusTest247()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20gt%202";
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
	public void byRadiusTest248()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ge%203";
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
	public void byRadiusTest249()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ge%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20ge%204";
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
	public void byRadiusTest250()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20lt%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20lt%204";
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
	public void byRadiusTest251()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20lt%202";
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
	public void byRadiusTest252()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20le%204";
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
	public void byRadiusTest253()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20le%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bldgsNum%20le%203";
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
	public void byRadiusTest254()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20in%20(%27SINGLE%20FAMILY%27,%27RESIDENTIAL%27,%27MOBILE%20HOME%27)";
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
	public void byRadiusTest255()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20in%20(%27AGRICULTURAL%27,%27COMMERCIAL%27,%27MANUFACTURED%20HOME%27)";
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
	public void byRadiusTest256()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20eq%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20eq%20%27%27";
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
	public void byRadiusTest257()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20eq%20%27MOBILE%20HOME%27";
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
	public void byRadiusTest258()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20ne%20%27COMMERCIAL%27";
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
	public void byRadiusTest259()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bldgType%20ne%20%27SINGLE%20FAMILY%27";
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
	public void byRadiusTest260()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=block%20in%20(E,Y)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=block%20in%20(E,Y)";
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
	public void byRadiusTest261()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=block%20in%20(D,T,F)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=block%20in%20(D,T,F)";
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
	public void byRadiusTest262()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=block%20eq%20A";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=block%20eq%20A";
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
	public void byRadiusTest263()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=block%20eq%20B";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=block%20eq%20B";
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
	public void byRadiusTest264()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=block%20ne%20C";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=block%20ne%20C";
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
	public void byRadiusTest265()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=block%20ne%20D";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=block%20ne%20D";
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
	public void byRadiusTest266()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20eq%201000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20eq%201000";
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
	public void byRadiusTest267()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20eq%201040";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20eq%201040";
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
	public void byRadiusTest268()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ne%201240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ne%201240";
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
	public void byRadiusTest269()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ne%201251";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ne%201251";
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
	public void byRadiusTest270()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20gt%201419";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20gt%201419";
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
	public void byRadiusTest271()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20gt%202675";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20gt%202675";
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
	public void byRadiusTest272()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ge%201930";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ge%201930";
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
	public void byRadiusTest273()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ge%201092";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20ge%201092";
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
	public void byRadiusTest274()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20lt%201766";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20lt%201766";
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
	public void byRadiusTest275()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20lt%201551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20lt%201551";
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
	public void byRadiusTest276()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20le%201839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20le%201839";
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
	public void byRadiusTest277()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20le%201073";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=bsmtSize%20le%201073";
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
	public void byRadiusTest278()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=bsmtType%20eq%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest279()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=bsmtType%20ne%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest280()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=censusId%20in%20(100010410001069,100010401001010)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=censusId%20in%20(100010410001069,100010401001010)";
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
	public void byRadiusTest281()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=censusId%20in%20(100010413001033,100050512031012,100010407001002)";
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
	public void byRadiusTest282()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=censusId%20eq%20100010410001069";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=censusId%20eq%20100010410001069";
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
	public void byRadiusTest283()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=censusId%20eq%20100050512031012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=censusId%20eq%20100050512031012";
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
	public void byRadiusTest284()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=censusId%20ne%20100010401001010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=censusId%20ne%20100010401001010";
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
	public void byRadiusTest285()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=censusId%20ne%20100010413001033";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=censusId%20ne%20100010413001033";
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
	public void byRadiusTest286()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27,%27FRAME%27)";
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
	public void byRadiusTest287()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20in%20(%27BRICK/STONE%27,%27BRICK/FRAME%27)";
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
	public void byRadiusTest288()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20eq%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20eq%20%27BRICK/STONE%27";
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
	public void byRadiusTest289()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20eq%20%27FRAME%27";
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
	public void byRadiusTest290()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20ne%20%27BRICK/STONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20ne%20%27BRICK/STONE%27";
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
	public void byRadiusTest291()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20ne%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=constructionType%20ne%20%27FRAME%27";
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
	public void byRadiusTest292()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20in%20(%27CENTRAL%27,%27TYPE%20UNKNOWN%27)";
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
	public void byRadiusTest293()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20eq%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20eq%20%27CENTRAL%27";
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
	public void byRadiusTest294()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20eq%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest295()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20ne%20%27CENTRAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20ne%20%27CENTRAL%27";
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
	public void byRadiusTest296()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=coolingType%20ne%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest297()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20eq%20%272014-07-08%27";
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
	public void byRadiusTest298()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20eq%20%272015-01-01%27";
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
	public void byRadiusTest299()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ne%20%272014-07-23%27";
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
	public void byRadiusTest300()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ne%20%272014-08-08%27";
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
	public void byRadiusTest301()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20gt%20%272014-11-12%27";
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
	public void byRadiusTest302()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20gt%20%272014-08-16%27";
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
	public void byRadiusTest303()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ge%20%272014-11-07%27";
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
	public void byRadiusTest304()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20ge%20%272014-03-11%27";
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
	public void byRadiusTest305()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20lt%20%272014-09-11%27";
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
	public void byRadiusTest306()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20lt%20%272014-02-14%27";
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
	public void byRadiusTest307()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20le%20%272015-01-14%27";
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
	public void byRadiusTest308()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=dateValuation%20le%20%272014-08-07%27";
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
	public void byRadiusTest309()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=depth%20eq%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=depth%20eq%20120";
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
	public void byRadiusTest310()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=depth%20eq%20180";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=depth%20eq%20180";
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
	public void byRadiusTest311()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=depth%20ne%20140";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=depth%20ne%20140";
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
	public void byRadiusTest312()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=depth%20ne%20160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=depth%20ne%20160";
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
	public void byRadiusTest313()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=depth%20gt%20142";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=depth%20gt%20142";
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
	public void byRadiusTest314()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=depth%20gt%20130";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=depth%20gt%20130";
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
	public void byRadiusTest315()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=depth%20ge%20167";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=depth%20ge%20167";
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
	public void byRadiusTest316()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=depth%20ge%20145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=depth%20ge%20145";
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
	public void byRadiusTest317()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=depth%20lt%20136";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=depth%20lt%20136";
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
	public void byRadiusTest318()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=depth%20lt%20106";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=depth%20lt%20106";
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
	public void byRadiusTest319()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=depth%20le%20119";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=depth%20le%20119";
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
	public void byRadiusTest320()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=depth%20le%20231";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=depth%20le%20231";
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
	public void byRadiusTest321()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20in%20(%27AVERAGE%20WIRING%27,%27CONNECTED%27)";
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
	public void byRadiusTest322()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20in%20(%27UNDERGROUND%20WIRES%27,%27PRIVATE%20SOURCE%27,%27MINIMAL%20WIRING%27)";
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
	public void byRadiusTest323()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20eq%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest324()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20eq%20%27BELOW%20AVERAGE%20WIRING%27";
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
	public void byRadiusTest325()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20ne%20%27EXTENSIVE%20WIRING%27";
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
	public void byRadiusTest326()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=electricEnergy%20ne%20%27PRIVATE%20SOURCE%27";
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
	public void byRadiusTest327()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20in%20(%27SHINGLE%27,%27STUCCO%27)";
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
	public void byRadiusTest328()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20in%20(%27WOOD%27,%27ALUMINUM%27,%27BRICK%27)";
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
	public void byRadiusTest329()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20eq%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20eq%20%27SHINGLE%27";
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
	public void byRadiusTest330()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20eq%20%27ALUMINUM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20eq%20%27ALUMINUM%27";
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
	public void byRadiusTest331()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20ne%20%27BRICK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20ne%20%27BRICK%27";
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
	public void byRadiusTest332()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20ne%20%27SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=extWalls%20ne%20%27SHINGLE%27";
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
	public void byRadiusTest333()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=fips%20in%20(10001,10003)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=fips%20in%20(10001,10003)";
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
	public void byRadiusTest334()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=fips%20in%20(10002,10004,10006)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=fips%20in%20(10002,10004,10006)";
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
	public void byRadiusTest335()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=fips%20eq%2010002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=fips%20eq%2010002";
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
	public void byRadiusTest336()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=fips%20eq%2010004";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=fips%20eq%2010004";
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
	public void byRadiusTest337()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=fips%20ne%2010003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=fips%20ne%2010003";
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
	public void byRadiusTest338()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=fips%20ne%2010001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=fips%20ne%2010001";
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
	public void byRadiusTest339()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%20BLOCK%27,%27SLAB%27,%27MASONRY%27,%27PILINGS%27)";
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
	public void byRadiusTest340()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20in%20(%27CONCRETE%27,%27SLAB%27,%27PIER%27,%27PILINGS%27)";
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
	public void byRadiusTest341()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20eq%20%27PILINGS%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20eq%20%27PILINGS%27";
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
	public void byRadiusTest342()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20eq%20%27SLAB%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20eq%20%27SLAB%27";
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
	public void byRadiusTest343()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20ne%20%27CONCRETE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20ne%20%27CONCRETE%27";
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
	public void byRadiusTest344()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20ne%20%27MASONRY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=foundationType%20ne%20%27MASONRY%27";
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
	public void byRadiusTest345()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20eq%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20eq%202";
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
	public void byRadiusTest346()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20eq%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20eq%203";
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
	public void byRadiusTest347()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ne%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ne%204";
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
	public void byRadiusTest348()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ne%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ne%203";
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
	public void byRadiusTest349()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20gt%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20gt%201";
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
	public void byRadiusTest350()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20gt%202";
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
	public void byRadiusTest351()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ge%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ge%202";
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
	public void byRadiusTest352()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ge%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20ge%203";
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
	public void byRadiusTest353()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20lt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20lt%202";
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
	public void byRadiusTest354()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20lt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20lt%203";
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
	public void byRadiusTest355()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20le%204";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20le%204";
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
	public void byRadiusTest356()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=fplcCount%20le%202";
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
	public void byRadiusTest357()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20eq%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20eq%20%27Y%27";
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
	public void byRadiusTest358()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20eq%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20eq%20%27N%27";
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
	public void byRadiusTest359()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20ne%20%27N%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20ne%20%27N%27";
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
	public void byRadiusTest360()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20ne%20%27Y%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=fplcInd%20ne%20%27Y%27";
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
	public void byRadiusTest361()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=fplcType%20eq%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest362()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=fplcType%20ne%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest363()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=frame%20in%20(%27METAL%27,%27WOOD%27)";
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
	public void byRadiusTest364()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=frame%20eq%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=frame%20eq%20%27METAL%27";
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
	public void byRadiusTest365()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=frame%20eq%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=frame%20eq%20%27WOOD%27";
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
	public void byRadiusTest366()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=frame%20ne%20%27METAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=frame%20ne%20%27METAL%27";
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
	public void byRadiusTest367()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=frame%20ne%20%27WOOD%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=frame%20ne%20%27WOOD%27";
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
	public void byRadiusTest368()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=frontage%20eq%2019";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=frontage%20eq%2019";
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
	public void byRadiusTest369()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=frontage%20eq%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=frontage%20eq%2012";
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
	public void byRadiusTest370()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ne%2001";
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
	public void byRadiusTest371()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ne%2016";
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
	public void byRadiusTest372()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=frontage%20gt%20214";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=frontage%20gt%20214";
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
	public void byRadiusTest373()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=frontage%20gt%20143";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=frontage%20gt%20143";
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
	public void byRadiusTest374()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ge%20150";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ge%20150";
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
	public void byRadiusTest375()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ge%20120";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=frontage%20ge%20120";
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
	public void byRadiusTest376()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=frontage%20lt%2024";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=frontage%20lt%2024";
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
	public void byRadiusTest377()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=frontage%20lt%2036";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=frontage%20lt%2036";
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
	public void byRadiusTest378()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=frontage%20le%2055";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=frontage%20le%2055";
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
	public void byRadiusTest379()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=frontage%20le%20105";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=frontage%20le%20105";
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
	public void byRadiusTest380()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20eq%20242";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20eq%20242";
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
	public void byRadiusTest381()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20eq%20483";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20eq%20483";
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
	public void byRadiusTest382()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ne%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ne%20440";
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
	public void byRadiusTest383()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ne%20511";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ne%20511";
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
	public void byRadiusTest384()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20gt%20630";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20gt%20630";
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
	public void byRadiusTest385()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20gt%20600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20gt%20600";
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
	public void byRadiusTest386()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ge%20840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ge%20840";
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
	public void byRadiusTest387()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ge%20480";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20ge%20480";
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
	public void byRadiusTest388()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20lt%20440";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20lt%20440";
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
	public void byRadiusTest389()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20lt%20441";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20lt%20441";
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
	public void byRadiusTest390()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20le%20206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20le%20206";
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
	public void byRadiusTest391()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20le%20454";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=garageSize%20le%20454";
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
	public void byRadiusTest392()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20GARAGE%27,%27BASEMENT%20GARAGE%27,%27WOOD%20GARAGE%27)";
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
	public void byRadiusTest393()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=garageType%20in%20(%27DETACHED%20CARPORT%27,%27CARPORT%27,%27ALUMINUM%20GARAGE%27)";
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
	public void byRadiusTest394()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=garageType%20eq%20%27GARAGE/CARPORT%27";
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
	public void byRadiusTest395()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=garageType%20eq%20%27BUILT-IN%20GARAGE%27";
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
	public void byRadiusTest396()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=garageType%20ne%20%27ALUMINUM%20GARAGE%27";
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
	public void byRadiusTest397()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=garageType%20ne%20%27DETACHED%20METAL%20GARAGE%27";
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
	public void byRadiusTest398()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20eq%202347";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20eq%202347";
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
	public void byRadiusTest399()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20eq%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20eq%204063";
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
	public void byRadiusTest400()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ne%201090";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ne%201090";
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
	public void byRadiusTest401()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ne%202571";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ne%202571";
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
	public void byRadiusTest402()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20gt%201664";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20gt%201664";
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
	public void byRadiusTest403()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20gt%204063";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20gt%204063";
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
	public void byRadiusTest404()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ge%201388";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ge%201388";
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
	public void byRadiusTest405()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ge%20912";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20ge%20912";
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
	public void byRadiusTest406()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20lt%201160";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20lt%201160";
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
	public void byRadiusTest407()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20lt%202868";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20lt%202868";
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
	public void byRadiusTest408()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20le%201753";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20le%201753";
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
	public void byRadiusTest409()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20le%201560";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=groundFloorSize%20le%201560";
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
	public void byRadiusTest410()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20in%20(%27STEAM%20HOT%20WATER%27,%27FORCED%20AIR%20SPACE%27,%27HEAT%20PUMP%27,%27HOT%20WATER%27)";
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
	public void byRadiusTest411()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20in%20(%27STEAM%27,%27BASEBOARD%20HOT%20WATER%27,%27BASEBOARD%20ELECTRIC%20STEAM%27,%27HOT%20WATER%27)";
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
	public void byRadiusTest412()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20HOT%20WATER%27";
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
	public void byRadiusTest413()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20eq%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
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
	public void byRadiusTest414()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20ne%20%27OIL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20ne%20%27OIL%27";
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
	public void byRadiusTest415()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=heatingType%20ne%20%27BASEBOARD%20ELECTRIC%20STEAM%27";
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
	public void byRadiusTest416()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=landUse%20in%20(%27TOWNHOUSE/ROWHOUSE%27,%27APARTMENT/HOTEL%27,%27FRAT/SORORITY%20HOUSE%27)";
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
	public void byRadiusTest417()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=landUse%20in%20(%27CABIN%27,%27HIGH%20RISE%20CONDO%27,%27HOTEL%27,%27RESORT%20HOTEL%27,%27MOBILE%20HOME%27)";
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
	public void byRadiusTest418()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=landUse%20eq%20%27TOWNHOUSE/ROWHOUSE%27";
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
	public void byRadiusTest419()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=landUse%20eq%20%27HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=landUse%20eq%20%27HOTEL%27";
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
	public void byRadiusTest420()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=landUse%20ne%20%27RESORT%20HOTEL%27";
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
	public void byRadiusTest421()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=landUse%20ne%20%27DUPLEX%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=landUse%20ne%20%27DUPLEX%27";
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
	public void byRadiusTest422()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20eq%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20eq%20%272014-09-08%27";
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
	public void byRadiusTest423()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20eq%20%272014-11-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20eq%20%272014-11-16%27";
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
	public void byRadiusTest424()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ne%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ne%20%272014-09-08%27";
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
	public void byRadiusTest425()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ne%20%272014-10-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ne%20%272014-10-16%27";
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
	public void byRadiusTest426()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20gt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20gt%20%272014-09-08%27";
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
	public void byRadiusTest427()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20gt%20%272014-11-12%27";
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
	public void byRadiusTest428()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ge%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ge%20%272014-09-08%27";
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
	public void byRadiusTest429()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ge%20%272014-12-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20ge%20%272014-12-31%27";
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
	public void byRadiusTest430()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20lt%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20lt%20%272014-09-08%27";
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
	public void byRadiusTest431()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20lt%20%272014-09-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20lt%20%272014-09-16%27";
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
	public void byRadiusTest432()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20le%20%272014-09-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20le%20%272014-09-08%27";
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
	public void byRadiusTest433()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20le%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=lastModified%20le%20%272015-01-01%27";
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
	public void byRadiusTest434()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20eq%202307";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20eq%202307";
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
	public void byRadiusTest435()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20eq%201172";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20eq%201172";
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
	public void byRadiusTest436()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ne%203023";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ne%203023";
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
	public void byRadiusTest437()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ne%201396";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ne%201396";
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
	public void byRadiusTest438()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20gt%202597";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20gt%202597";
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
	public void byRadiusTest439()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20gt%201344";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20gt%201344";
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
	public void byRadiusTest440()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ge%201771";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ge%201771";
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
	public void byRadiusTest441()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ge%201420";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20ge%201420";
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
	public void byRadiusTest442()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20lt%202240";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20lt%202240";
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
	public void byRadiusTest443()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20lt%201452";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20lt%201452";
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
	public void byRadiusTest444()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20le%202145";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20le%202145";
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
	public void byRadiusTest445()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20le%202000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=livingSize%20le%202000";
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
	public void byRadiusTest446()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20in%20(112,116)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20in%20(112,116)";
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
	public void byRadiusTest447()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20in%20(108,114,16)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20in%20(108,114,16)";
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
	public void byRadiusTest448()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20eq%2039";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20eq%2039";
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
	public void byRadiusTest449()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20eq%20110";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20eq%20110";
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
	public void byRadiusTest450()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20ne%2015";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20ne%2015";
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
	public void byRadiusTest451()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20ne%20118";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=lotNum%20ne%20118";
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
	public void byRadiusTest452()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20eq%200.0523";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20eq%200.0523";
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
	public void byRadiusTest453()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20eq%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20eq%200.0262";
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
	public void byRadiusTest454()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ne%200.0262";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ne%200.0262";
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
	public void byRadiusTest455()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ne%200.1436";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ne%200.1436";
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
	public void byRadiusTest456()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20gt%200.1047";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20gt%200.1047";
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
	public void byRadiusTest457()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20gt%200.4017";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20gt%200.4017";
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
	public void byRadiusTest458()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ge%200.0551";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ge%200.0551";
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
	public void byRadiusTest459()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ge%200.7576";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20ge%200.7576";
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
	public void byRadiusTest460()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20lt%201.13";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20lt%201.13";
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
	public void byRadiusTest461()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20lt%200.6061";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20lt%200.6061";
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
	public void byRadiusTest462()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20le%200.0892";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20le%200.0892";
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
	public void byRadiusTest463()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20le%200.11";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=lotSize1%20le%200.11";
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
	public void byRadiusTest464()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20eq%2012632";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20eq%2012632";
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
	public void byRadiusTest465()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20eq%2017860";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20eq%2017860";
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
	public void byRadiusTest466()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ne%208712";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ne%208712";
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
	public void byRadiusTest467()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ne%202100";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ne%202100";
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
	public void byRadiusTest468()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20gt%2010890";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20gt%2010890";
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
	public void byRadiusTest469()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20gt%203885";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20gt%203885";
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
	public void byRadiusTest470()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ge%2010000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ge%2010000";
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
	public void byRadiusTest471()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ge%2051401";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20ge%2051401";
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
	public void byRadiusTest472()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20lt%204830";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20lt%204830";
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
	public void byRadiusTest473()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20lt%2051660";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20lt%2051660";
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
	public void byRadiusTest474()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20le%2020230";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20le%2020230";
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
	public void byRadiusTest475()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20le%205500";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=lotSize2%20le%205500";
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
	public void byRadiusTest476()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=lotType%20in%20(I,IRR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=lotType%20in%20(I,IRR)";
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
	public void byRadiusTest477()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=lotType%20eq%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=lotType%20eq%20IRR";
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
	public void byRadiusTest478()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=lotType%20eq%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=lotType%20eq%20I";
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
	public void byRadiusTest479()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=lotType%20ne%20I";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=lotType%20ne%20I";
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
	public void byRadiusTest480()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=lotType%20ne%20IRR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=lotType%20ne%20IRR";
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
	public void byRadiusTest481()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20eq%200.4031";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20eq%200.4031";
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
	public void byRadiusTest482()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20eq%201.0371";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20eq%201.0371";
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
	public void byRadiusTest483()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ne%2081.1657";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ne%2081.1657";
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
	public void byRadiusTest484()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ne%20-0.4787";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ne%20-0.4787";
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
	public void byRadiusTest485()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20gt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20gt%200.6411";
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
	public void byRadiusTest486()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20gt%200.3615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20gt%200.3615";
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
	public void byRadiusTest487()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ge%200.2557";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ge%200.2557";
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
	public void byRadiusTest488()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ge%200.0869";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20ge%200.0869";
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
	public void byRadiusTest489()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20lt%200.1245";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20lt%200.1245";
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
	public void byRadiusTest490()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20lt%200.6411";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20lt%200.6411";
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
	public void byRadiusTest491()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20le%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20le%200.44";
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
	public void byRadiusTest492()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20le%200.0925";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgPct%20le%200.0925";
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
	public void byRadiusTest493()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20eq%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20eq%203048";
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
	public void byRadiusTest494()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20eq%20155";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20eq%20155";
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
	public void byRadiusTest495()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ne%20-839";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ne%20-839";
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
	public void byRadiusTest496()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ne%202217";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ne%202217";
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
	public void byRadiusTest497()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20gt%203048";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20gt%203048";
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
	public void byRadiusTest498()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20gt%201281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20gt%201281";
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
	public void byRadiusTest499()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ge%20822";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ge%20822";
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
	public void byRadiusTest500()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ge%201914";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20ge%201914";
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
	public void byRadiusTest501()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20lt%201977";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20lt%201977";
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
	public void byRadiusTest502()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20lt%20758";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20lt%20758";
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
	public void byRadiusTest503()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20le%2065745";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20le%2065745";
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
	public void byRadiusTest504()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20le%20-21";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=monthlyChgValue%20le%20-21";
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
	public void byRadiusTest505()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=munName%20in%20(%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
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
	public void byRadiusTest506()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=munName%20in%20(%27BRANDYWINE%20HUNDRED%27,%27WHITE%20CLAY%20CREEK%20HUNDRED%27,%27MILL%20CREEK%20HUNDRED%27)";
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
	public void byRadiusTest507()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=munName%20eq%20%27DELAWARE%20CITY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=munName%20eq%20%27DELAWARE%20CITY%27";
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
	public void byRadiusTest508()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=munName%20eq%20%27NEW%20CASTLE%20HUNDRED%27";
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
	public void byRadiusTest509()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=munName%20ne%20%27WHITE%20CLAY%20CREEK%20HUNDRED%27";
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
	public void byRadiusTest510()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=munName%20ne%20%27MILL%20CREEK%20HUNDRED%27";
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
	public void byRadiusTest511()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20in%20(10003164371,10003164573)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20in%20(10003164371,10003164573)";
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
	public void byRadiusTest512()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20in%20(10003177976,10003207172,10005293276)";
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
	public void byRadiusTest513()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20eq%2010005293290";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20eq%2010005293290";
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
	public void byRadiusTest514()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20eq%2010005293302";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20eq%2010005293302";
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
	public void byRadiusTest515()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20ne%2010005293281";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20ne%2010005293281";
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
	public void byRadiusTest516()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20ne%2010003177976";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=obPropId%20ne%2010003177976";
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
	public void byRadiusTest517()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20in%20(%27BASEMENT%20SINGLE%27,%27GARAGE%27)";
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
	public void byRadiusTest518()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20in%20(%27UNDERGROUND%27,%27BLOCK%27,%27LOG%27)";
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
	public void byRadiusTest519()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20eq%20%27CEDAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20eq%20%27CEDAR%27";
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
	public void byRadiusTest520()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20eq%20%27ALUM%20GAR%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20eq%20%27ALUM%20GAR%27";
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
	public void byRadiusTest521()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20ne%20%27ATT%20GARAGE%20FIN%27";
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
	public void byRadiusTest522()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20ne%20%27UNCOVERED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=parkingType%20ne%20%27UNCOVERED%27";
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
	public void byRadiusTest523()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20eq%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20eq%20Y";
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
	public void byRadiusTest524()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20eq%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20eq%20N";
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
	public void byRadiusTest525()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20ne%20Y";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20ne%20Y";
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
	public void byRadiusTest526()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20ne%20N";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=poolInd%20ne%20N";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	

	public void byRadiusTest527()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=poolType%20in%20(%27POOL%20&%20HOT%20TUB/SPA%27,%278%20POOLS%27)";
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
	public void byRadiusTest528()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=poolType%20in%20(%27BYPASS%27,%27KIDNEY%20SHAPE%27,%27BUMPER%20BOAT%27)";
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
	public void byRadiusTest529()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=poolType%20eq%20%27PREFAB%20VINYL%27";
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
	public void byRadiusTest530()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=poolType%20eq%20%27POOL%20HOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=poolType%20eq%20%27POOL%20HOUSE%27";
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
	public void byRadiusTest531()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=poolType%20ne%20%27FISH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=poolType%20ne%20%27FISH%27";
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
	public void byRadiusTest532()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=poolType%20ne%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest533()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=propInd%20in%20(%27HOTEL%27,%27MOTEL%27,%27RESIDENTIAL%27,%27COMMERCIAL%27,%27APARTMENT%27)";
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
	public void byRadiusTest534()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=propInd%20in%20(%27INDUSTRIAL%20HEAVY%27,%27PARKING%27,%27INDUSTRIAL%27,%27WAREHOUSE%27,%27AGRICULTURAL%27)";
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
	public void byRadiusTest535()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=propInd%20eq%20%27HOSPITAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=propInd%20eq%20%27HOSPITAL%27";
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
	public void byRadiusTest536()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=propInd%20eq%20%27AGRICULTURAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=propInd%20eq%20%27AGRICULTURAL%27";
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
	public void byRadiusTest537()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=propInd%20ne%20%27INDUSTRIAL%20HEAVY%27";
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
	public void byRadiusTest538()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=propInd%20ne%20%27WAREHOUSE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=propInd%20ne%20%27WAREHOUSE%27";
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
	public void byRadiusTest539()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20eq%2026.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20eq%2026.0002";
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
	public void byRadiusTest540()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20eq%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20eq%2020.0003";
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
	public void byRadiusTest541()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ne%2024.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ne%2024.0003";
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
	public void byRadiusTest542()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ne%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ne%2023.9998";
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
	public void byRadiusTest543()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20gt%2024.0001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20gt%2024.0001";
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
	public void byRadiusTest544()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20gt%2020.0003";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20gt%2020.0003";
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
	public void byRadiusTest545()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ge%2019.9999";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ge%2019.9999";
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
	public void byRadiusTest546()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ge%2024.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20ge%2024.0002";
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
	public void byRadiusTest547()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20lt%2023.9998";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20lt%2023.9998";
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
	public void byRadiusTest548()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20lt%2022.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20lt%2022.0002";
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
	public void byRadiusTest549()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20le%2020.0002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20le%2020.0002";
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
	public void byRadiusTest550()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20le%2015.9996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=rangePctOfValue%20le%2015.9996";
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
	public void byRadiusTest551()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20in%20(%27PRESTRESSED%20CONCRETE%27,%27GRAVEL%20AND%20ROCK%27)";
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
	public void byRadiusTest552()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20in%20(%27SHAKE%27,%27TIN%27,%27STONE/PEBBLES%27)";
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
	public void byRadiusTest553()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20eq%20%27ROCK%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20eq%20%27ROCK%27";
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
	public void byRadiusTest554()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20eq%20%27SLATE/TILE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20eq%20%27SLATE/TILE%27";
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
	public void byRadiusTest555()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20ne%20%27BERMUDA/CLAY%20TILE/WOOD%20SHINGLE%27";
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
	public void byRadiusTest556()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=roofCover%20ne%20%27ROLL%20TAR%20&%20GRAVEL%27";
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
	public void byRadiusTest557()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=roofType%20in%20(%27MANSARD%27,%27MONITOR%27)";
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
	public void byRadiusTest558()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=roofType%20in%20(%27BARREL%27,%27CONTEMPORARY%27,%27PYRAMID%27)";
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
	public void byRadiusTest559()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=roofType%20eq%20%27FRAME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=roofType%20eq%20%27FRAME%27";
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
	public void byRadiusTest560()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=roofType%20eq%20%27CANOPY%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=roofType%20eq%20%27CANOPY%27";
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
	public void byRadiusTest561()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=roofType%20ne%20%27SWISS%20CHALET/ALPINE%27";
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
	public void byRadiusTest562()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=roofType%20ne%20%27GABLE/HIP%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=roofType%20ne%20%27GABLE/HIP%27";
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
	public void byRadiusTest563()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20eq%20115000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20eq%20115000";
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
	public void byRadiusTest564()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20eq%20169900";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20eq%20169900";
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
	public void byRadiusTest565()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ne%20248000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ne%20248000";
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
	public void byRadiusTest566()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ne%20368474";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ne%20368474";
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
	public void byRadiusTest567()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20gt%2052000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20gt%2052000";
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
	public void byRadiusTest568()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20gt%20338400";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20gt%20338400";
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
	public void byRadiusTest569()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ge%20290000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ge%20290000";
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
	public void byRadiusTest570()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ge%20184565";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20ge%20184565";
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
	public void byRadiusTest571()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20lt%20149990";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20lt%20149990";
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
	public void byRadiusTest572()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20lt%20188615";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20lt%20188615";
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
	public void byRadiusTest573()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20le%20180840";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20le%20180840";
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
	public void byRadiusTest574()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20le%20170299";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleAmt%20le%20170299";
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
	public void byRadiusTest575()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20in%20(53005,121159)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20in%20(53005,121159)";
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
	public void byRadiusTest576()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20in%20(43221,145144,40031)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20in%20(43221,145144,40031)";
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
	public void byRadiusTest577()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20eq%20108301";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20eq%20108301";
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
	public void byRadiusTest578()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20eq%2063918";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20eq%2063918";
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
	public void byRadiusTest579()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20ne%202944000082";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20ne%202944000082";
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
	public void byRadiusTest580()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20ne%2027361";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=saleDocNum%20ne%2027361";
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
	public void byRadiusTest581()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20eq%20%272014-07-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20eq%20%272014-07-08%27";
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
	public void byRadiusTest582()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20eq%20%272015-01-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20eq%20%272015-01-01%27";
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
	public void byRadiusTest583()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ne%20%272014-07-23%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ne%20%272014-07-23%27";
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
	public void byRadiusTest584()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ne%20%272014-08-08%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ne%20%272014-08-08%27";
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
	public void byRadiusTest585()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20gt%20%272014-11-12%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20gt%20%272014-11-12%27";
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
	public void byRadiusTest586()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20gt%20%272014-08-16%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20gt%20%272014-08-16%27";
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
	public void byRadiusTest587()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ge%20%272014-11-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ge%20%272014-11-07%27";
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
	public void byRadiusTest588()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ge%20%272014-03-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20ge%20%272014-03-11%27";
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
	public void byRadiusTest589()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20lt%20%272014-09-11%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20lt%20%272014-09-11%27";
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
	public void byRadiusTest590()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20lt%20%272014-02-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20lt%20%272014-02-14%27";
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
	public void byRadiusTest591()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20le%20%272015-01-14%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20le%20%272015-01-14%27";
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
	public void byRadiusTest592()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20le%20%272014-08-07%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=saleTransDate%20le%20%272014-08-07%27";
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
	public void byRadiusTest593()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20eq%20%272004-12-30%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20eq%20%272004-12-30%27";
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
	public void byRadiusTest594()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20eq%20%272010-05-21%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20eq%20%272010-05-21%27";
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
	public void byRadiusTest595()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ne%20%272005-07-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ne%20%272005-07-19%27";
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
	public void byRadiusTest596()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ne%20%272000-11-01%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ne%20%272000-11-01%27";
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
	public void byRadiusTest597()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20gt%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20gt%20%272010-05-27%27";
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
	public void byRadiusTest598()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20gt%20%272013-12-13%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20gt%20%272013-12-13%27";
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
	public void byRadiusTest599()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ge%20%272009-10-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ge%20%272009-10-02%27";
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
	public void byRadiusTest600()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ge%20%272010-05-27%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20ge%20%272010-05-27%27";
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
	public void byRadiusTest601()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20lt%20%272013-02-15%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20lt%20%272013-02-15%27";
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
	public void byRadiusTest602()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20lt%20%272006-07-31%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20lt%20%272006-07-31%27";
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
	public void byRadiusTest603()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20le%20%272013-08-19%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20le%20%272013-08-19%27";
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
	public void byRadiusTest604()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20le%20%272006-05-02%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=saleSearchDate%20le%20%272006-05-02%27";
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
	public void byRadiusTest605()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20in%20(%27RESALE%27,%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27CONSTRUCTION%20LOAN%27)";
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
	public void byRadiusTest606()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20in%20(%27SUBDIVISION/NEW%20CONSTRUCTION%27,%27SELLER%20CARRYBACK%27)";
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
	public void byRadiusTest607()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20eq%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20eq%20%27RESALE%27";
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
	public void byRadiusTest608()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20eq%20%27CONSTRUCTION%20LOAN%27";
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
	public void byRadiusTest609()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20ne%20%27RESALE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20ne%20%27RESALE%27";
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
	public void byRadiusTest610()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=saleTransType%20ne%20%27SUBDIVISION/NEW%20CONSTRUCTION%27";
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
	public void byRadiusTest611()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=saleType%20eq%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=saleType%20eq%20%27Full%20Value%27";
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
	public void byRadiusTest612()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=saleType%20ne%20%27Full%20Value%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=saleType%20ne%20%27Full%20Value%27";
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
	public void byRadiusTest613()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20in%20(%27PUBLIC%27,%27COMMERCIAL%27,%27PRIVATE%27)";
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
	public void byRadiusTest614()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20in%20(%27TYPE%20UNKNOWN%27,%27SEPTIC%27,%27PUBLIC%27,%27COMMERCIAL%27)";
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
	public void byRadiusTest615()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20eq%20%27SEPTIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20eq%20%27SEPTIC%27";
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
	public void byRadiusTest616()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20eq%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20eq%20%27NONE%27";
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
	public void byRadiusTest617()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20ne%20%27TYPE%20UNKNOWN%27";
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
	public void byRadiusTest618()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20ne%20%27COMMERCIAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=sewerType%20ne%20%27COMMERCIAL%27";
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
	public void byRadiusTest619()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=style%20in%20(%27ROW%20HOUSE%27,%27MOBILE%20HOME%27,%27GARAGE%20APARTMENT%27)";
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
	public void byRadiusTest620()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=style%20in%20(%27MANSION%27,%27CONDOMINIUM%27,%27RAISED%20RANCH%27,%27TUDOR%27,%27CABIN%27)";
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
	public void byRadiusTest621()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=style%20eq%20%27COTTAGE/BUNGALOW%27";
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
	public void byRadiusTest622()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=style%20eq%20%27RAISED%20RANCH%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=style%20eq%20%27RAISED%20RANCH%27";
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
	public void byRadiusTest623()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=style%20ne%20%27MANSION%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=style%20ne%20%27MANSION%27";
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
	public void byRadiusTest624()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=style%20ne%20%27MOBILE%20HOME%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=style%20ne%20%27MOBILE%20HOME%27";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	

	public void byRadiusTest625()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=subdName%20in%20(%27BROOKSTONE%20TRACE%27,%27CABLE%20&%20CONDUIT%27)";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	

	public void byRadiusTest626()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=subdName%20in%20(%27PIER%27,%27PIPELINE%27,%27CABLE%20&%20CONDUIT%27,%27MILFORD%27)";
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
	public void byRadiusTest627()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=subdName%20eq%20%27GAS%20SERVICE%20&%20MAIN%27";
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
	public void byRadiusTest628()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=subdName%20eq%20%27LAKELAWN%20ESTATES%27";
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
	public void byRadiusTest629()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=subdName%20ne%20%27MERESTONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=subdName%20ne%20%27MERESTONE%27";
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
	public void byRadiusTest630()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=subdName%20ne%20%27CEDAR%20CRK%20HUNDRED%27";
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
	public void byRadiusTest631()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20in%20(1-A,1-B)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20in%20(1-A,1-B)";
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
	public void byRadiusTest632()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20in%20(A,B,C,D)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20in%20(A,B,C,D)";
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
	public void byRadiusTest633()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20eq%20323";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20eq%20323";
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
	public void byRadiusTest634()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20eq%2050";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20eq%2050";
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
	public void byRadiusTest635()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20ne%2001";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20ne%2001";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	*/
	@Test
	public void byRadiusTest636()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=subdTractNum%20ne%2016";
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
	public void byRadiusTest637()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20eq%2023778.31";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20eq%2023778.31";
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
	public void byRadiusTest638()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20eq%201952.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20eq%201952.07";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	/*
	@Test
	public void byRadiusTest639()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ne%207217.81";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ne%207217.81";
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
	public void byRadiusTest640()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ne%201676.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ne%201676.44";
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
	public void byRadiusTest641()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20gt%20108596.29";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20gt%20108596.29";
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
	public void byRadiusTest642()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20gt%20865880.7";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20gt%20865880.7";
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
	public void byRadiusTest643()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ge%20343074.19";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ge%20343074.19";
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
	public void byRadiusTest644()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ge%201009.04";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20ge%201009.04";
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
	public void byRadiusTest645()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20lt%20279168.77";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20lt%20279168.77";
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
	public void byRadiusTest646()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20lt%2032139.73";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20lt%2032139.73";
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
	public void byRadiusTest647()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20le%2010840.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20le%2010840.59";
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
	public void byRadiusTest648()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20le%20503848.67";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=taxAmt%20le%20503848.67";
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
	public void byRadiusTest649()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20in%20(04,08)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20in%20(04,08)";
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
	public void byRadiusTest650()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20in%20(20,10,18)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20in%20(20,10,18)";
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
	public void byRadiusTest651()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20eq%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20eq%2011";
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
	public void byRadiusTest652()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20eq%2006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20eq%2006";
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
	public void byRadiusTest653()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20ne%2000";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20ne%2000";
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
	public void byRadiusTest654()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20ne%2021";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=taxCodeArea%20ne%2021";
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
	public void byRadiusTest655()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20eq%200.43";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20eq%200.43";
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
	public void byRadiusTest656()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20eq%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20eq%200.25";
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
	public void byRadiusTest657()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ne%200.07";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ne%200.07";
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
	public void byRadiusTest658()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ne%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ne%200.42";
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
	public void byRadiusTest659()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20gt%200.46";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20gt%200.46";
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
	public void byRadiusTest660()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20gt%200.25";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20gt%200.25";
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
	public void byRadiusTest661()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ge%200.44";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ge%200.44";
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
	public void byRadiusTest662()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ge%200.53";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20ge%200.53";
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
	public void byRadiusTest663()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20lt%200.59";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20lt%200.59";
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
	public void byRadiusTest664()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20lt%200.37";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20lt%200.37";
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
	public void byRadiusTest665()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20le%200.52";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20le%200.52";
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
	public void byRadiusTest666()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20le%200.42";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=taxPerSizeUnit%20le%200.42";
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
	public void byRadiusTest667()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20eq%208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20eq%208";
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
	public void byRadiusTest668()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20eq%2010";
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
	public void byRadiusTest669()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ne%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ne%207";
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
	public void byRadiusTest670()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ne%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ne%206";
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
	public void byRadiusTest671()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20gt%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20gt%202";
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
	public void byRadiusTest672()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20gt%203";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20gt%203";
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
	public void byRadiusTest673()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ge%209";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ge%209";
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
	public void byRadiusTest674()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ge%207";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20ge%207";
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
	public void byRadiusTest675()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20lt%205";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20lt%205";
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
	public void byRadiusTest676()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20lt%206";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20lt%206";
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
	public void byRadiusTest677()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20le%2011";
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
	public void byRadiusTest678()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20le%202";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=totalRooms%20le%202";
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
	public void byRadiusTest679()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20eq%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20eq%2018";
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
	public void byRadiusTest680()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20eq%2010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20eq%2010";
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
	public void byRadiusTest681()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ne%201";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ne%201";
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
	public void byRadiusTest682()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ne%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ne%2016";
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
	public void byRadiusTest683()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20gt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20gt%2018";
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
	public void byRadiusTest684()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20gt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20gt%2012";
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
	public void byRadiusTest685()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ge%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ge%2018";
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
	public void byRadiusTest686()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ge%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20ge%2012";
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
	public void byRadiusTest687()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20lt%2018";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20lt%2018";
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
	public void byRadiusTest688()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20lt%2012";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20lt%2012";
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
	public void byRadiusTest689()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20le%2011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20le%2011";
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
	public void byRadiusTest690()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20le%2016";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=unitsCount%20le%2016";
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
	public void byRadiusTest691()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20eq%204124";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20eq%204124";
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
	public void byRadiusTest692()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20eq%201600";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20eq%201600";
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
	public void byRadiusTest693()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ne%202644";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ne%202644";
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
	public void byRadiusTest694()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ne%204208";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ne%204208";
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
	public void byRadiusTest695()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20gt%201768";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20gt%201768";
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
	public void byRadiusTest696()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20gt%202043";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20gt%202043";
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
	public void byRadiusTest697()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ge%202151";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ge%202151";
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
	public void byRadiusTest698()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ge%204184";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20ge%204184";
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
	public void byRadiusTest699()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20lt%203076";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20lt%203076";
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
	public void byRadiusTest700()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20lt%201871";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20lt%201871";
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
	public void byRadiusTest701()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20le%202967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20le%202967";
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
	public void byRadiusTest702()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20le%201536";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=universalSize%20le%201536";
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
	public void byRadiusTest703()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=view%20in%20(%27GOOD%27,%27CANAL%27)";
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
	public void byRadiusTest704()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=view%20in%20(%27GULF%27,%27FAIR%27,%27OBSTRUCTED%27)";
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
	public void byRadiusTest705()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=view%20eq%20%27RECREATIONAL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=view%20eq%20%27RECREATIONAL%27";
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
	public void byRadiusTest706()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=view%20eq%20%27STREET%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=view%20eq%20%27STREET%27";
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
	public void byRadiusTest707()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=view%20ne%20%27WATER%20VIEW%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=view%20ne%20%27WATER%20VIEW%27";
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
	public void byRadiusTest708()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=view%20ne%20%27SUBURBAN%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=view%20ne%20%27SUBURBAN%27";
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
	public void byRadiusTest709()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27PUBLIC%27)";
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
	public void byRadiusTest710()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=waterType%20in%20(%27WELL%27,%27NONE%27)";
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
	public void byRadiusTest711()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=waterType%20eq%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=waterType%20eq%20%27WELL%27";
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
	public void byRadiusTest712()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=waterType%20eq%20%27PUBLIC%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=waterType%20eq%20%27PUBLIC%27";
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
	public void byRadiusTest713()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=waterType%20ne%20%27NONE%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=waterType%20ne%20%27NONE%27";
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
	public void byRadiusTest714()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=waterType%20ne%20%27WELL%27";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=waterType%20ne%20%27WELL%27";
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
	public void byRadiusTest715()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(2001,2005)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(2001,2005)";
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
	public void byRadiusTest716()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20in%20(1950,1972,1969)";
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
	public void byRadiusTest717()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20eq%202010";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20eq%202010";
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
	public void byRadiusTest718()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20eq%202007";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20eq%202007";
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
	public void byRadiusTest719()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ne%201967";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ne%201967";
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
	public void byRadiusTest720()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ne%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ne%202006";
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
	public void byRadiusTest721()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20gt%202008";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20gt%202008";
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
	public void byRadiusTest722()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20gt%202011";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20gt%202011";
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
	public void byRadiusTest723()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ge%202005";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ge%202005";
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
	public void byRadiusTest724()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ge%202009";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5532620000,38.4606560000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20ge%202009";
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
	public void byRadiusTest725()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20lt%202006";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5533720000,38.4609360000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20lt%202006";
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
	public void byRadiusTest726()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20lt%201997";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5510660000,38.4645560000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20lt%201997";
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
	public void byRadiusTest727()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20le%202002";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5727100000,38.4772600000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20le%202002";
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
	public void byRadiusTest728()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20le%201983";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=yearBuilt%20le%201983";
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
	public void byRadiusTest729()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20in%20(1996,1978)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20in%20(1996,1978)";
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
	public void byRadiusTest730()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20in%20(1997,1992,1990)";
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
	public void byRadiusTest731()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20eq%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20eq%201994";
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
	public void byRadiusTest732()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20eq%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20eq%201991";
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
	public void byRadiusTest733()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ne%201982";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2569530000,38.5442830000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ne%201982";
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
	public void byRadiusTest734()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ne%201988";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.4599180000,38.5447760000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ne%201988";
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
	public void byRadiusTest735()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20gt%201989";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5398800000,38.5454000000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20gt%201989";
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
	public void byRadiusTest736()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20gt%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.6665390000,38.5491510000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20gt%201996";
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
	public void byRadiusTest737()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ge%201994";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0517300000,38.4514870000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ge%201994";
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
	public void byRadiusTest738()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ge%201993";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0512560000,38.4529550000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20ge%201993";
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
	public void byRadiusTest739()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20lt%201991";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0513030000,38.4533120000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20lt%201991";
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
	public void byRadiusTest740()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20lt%201980";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5768340000,38.4561980000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20lt%201980";
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
	public void byRadiusTest741()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20le%201996";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.3976530000,38.4568170000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20le%201996";
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
	public void byRadiusTest742()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20le%201992";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.5654670000,38.4577730000&radius=10&unit=mi&page=1&size=30&filter=yearBuiltEffective%20le%201992";
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
	public void byRadiusTest743()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=zoning%20in%20(TN,MR)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1719090000,38.4987780000&radius=10&unit=mi&page=1&size=30&filter=zoning%20in%20(TN,MR)";
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
	public void byRadiusTest744()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=zoning%20in%20(AR1,NC40,ON)";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.2294100000,38.5010500000&radius=10&unit=mi&page=1&size=30&filter=zoning%20in%20(AR1,NC40,ON)";
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
	public void byRadiusTest745()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=zoning%20eq%20R1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.1007770000,38.5210000000&radius=10&unit=mi&page=1&size=30&filter=zoning%20eq%20R1";
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
	public void byRadiusTest746()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=zoning%20eq%20AR1";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0543020000,38.5224860000&radius=10&unit=mi&page=1&size=30&filter=zoning%20eq%20AR1";
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
	public void byRadiusTest747()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=zoning%20ne%20MR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0763920000,38.5383060000&radius=10&unit=mi&page=1&size=30&filter=zoning%20ne%20MR";
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
	
	public void byRadiusTest748()
	{
		 int totalNumber;
			try {
			
				RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=zoning%20ne%20CR";
	            
	            totalNumber =
	    		when().
	                    get("/properties/summaries/radius?point={q}", query).
	            then().
	            		body("status.msg", equalTo("OK")).
	            extract().
	            		path("status.total");
	            	;
	        } finally {
	            RestAssured.reset();    
	        }
			
			try {
	            RestAssured.baseURI = "http://demo2.onboardis.us";
	            RestAssured.urlEncodingEnabled = false;
	            final String query = "-75.0775580000,38.5402610000&radius=10&unit=mi&page=1&size=30&filter=zoning%20ne%20CR";
	            expect().
	            	body("status.msg", equalTo("OK")).
	            	body("status.total", equalTo(totalNumber)).
	    		when().
	                    get("/properties/summaries/radius?point={q}", query);
	        } finally {
	            RestAssured.reset();
	        }
	} 
	
	*/
}



