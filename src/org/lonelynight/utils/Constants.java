package org.spf.utils;

import java.util.EnumSet;

abstract public interface Constants {

	abstract public interface CLUSTERS {
	    final public static String Airport_Patrol = "1001";
	    final public static String Ang_Mo_Kio_North = "1022";
	    final public static String Ang_Mo_Kio_South = "1012";
	    final public static String Bedok_North = "1026";
	    final public static String Bedok_South = "1016";
	    final public static String Bishan = "1035";
	    final public static String Bukit_Batok = "1031";
	    final public static String Bukit_Merah_East = "1007";
	    final public static String Bukit_Merah_West = "1011";
	    final public static String Bukit_Panjang = "1029";
	    final public static String Bukit_Timah = "1028";
	    final public static String Changi = "1015";
	    final public static String Choa_Chu_Kang = "1013";
	    final public static String Clementi = "1030";
	    final public static String Geylang = "1033";
	    final public static String Hougang = "1003";
	    final public static String Jurong_East = "1024";
	    final public static String Jurong_West = "1008";
	    final public static String Kampong_Java = "1021";
	    final public static String Marina_Bay = "1025";
	    final public static String Marine_Parade = "1004";
	    final public static String Nanyang = "1018";
	    final public static String Orchard = "1034";
	    final public static String Pasi_ris = "1027";
	    final public static String Punggol = "1102";
	    final public static String Queenstown = "1010";
	    final public static String Rochor = "1014";
	    final public static String Sembawang = "1006";
	    final public static String SengKang = "1009";
	    final public static String Serangoon = "1002";
	    final public static String Tampines = "1005";
	    final public static String Toa_Payoh = "1032";
	    final public static String Woodlands_East = "1101";
	    final public static String Woodlands_West = "1019";
	    final public static String Yishun_North = "1023";
	    final public static String Yishun_South = "1020";
	}
	
	abstract public interface COMMON {
	    final public static String BASE_URL = "https://www.spfiphone.gov.sg/";
	    final public static String CLUSTER_ID = "CLUSTER_ID";
	    final public static int DLG_EMPTY_REQ = 3;
	    final public static int DLG_LOAD_DATA = 2;
	    final public static String LAYOUT_ID = "LAYOUT_ID";
	    final public static String LOCATION_ID = "LOCATION_ID";
	    final public static String LOG_TAG = "SPF";
	    final public static String PASSING_URL = "PASSING_URL";
	    final public static String SCREEN_ID = "SCREEN_ID";
	    final public static String TITLE_NAME = "TITLE_NAME";
	    final public static String ZONE_ID = "ZONE_ID";
	    final public static String ZONE_NAME = "ZONE_NAME";
	}
	
	abstract public interface CRIME_INFO {
	public enum URL {
		CRIME_APPEAL, CRIME_MISSING, CRIME_NEWS, CRIME_STATISTICS
		}
	}
	
	public enum ERROR{
		NO_CONNECTION
		
	}
	public enum FROM{
		FACEBOOK_LOGIN, FACEBOOK_POST, TWITTER_LOGIN, TWITTER_POST
	}
	
	abstract public interface FACEBOOK {
	    final public static String APP_ID = "514442595f0ef8805a7ed9ad51c94c6c";
	}
	
	abstract public class HOME {
	    final public static String BannerURL = "https://www.spfiphone.gov.sg/SPFService/list_banner.spf";
	    final public static String FULL_PREFIX = "F";
	    final public static int IMAGE_HEIGHT = 100;
	    final public static int IMAGE_WIDTH = 130;
	    final public static int[] RIDS;
	    final public static int[] RIDS1;
	    final public static String THUMP_PREFIX = "T";
	    
	    static
	    {
	        int[] a = new int[6];
	        a[0] = 2130837582;
	        a[1] = 2130837586;
	        a[2] = 2130837588;
	        a[3] = 2130837584;
	        a[4] = 2130837589;
	        a[5] = 2130837597;
	        RIDS = a;
	        int[] a0 = new int[3];
	        a0[0] = 2130837591;
	        a0[1] = 2130837590;
	        a0[2] = 2130837585;
	        RIDS1 = a0;
	    }
	}
	
	public enum IMAGE_TYPE {
		FOOTER, FULL, THUMB
	}
	
	abstract public interface MAP_CONSTANTS {
	    final public static int DLG_NEXT = 1;
	    final public static String FORWARD_DETAIL = "DETAIL_ID";
	    final public static String FORWARD_LOCATION = "FORWARD_LOCATION";
	    
	    public enum MAP_COLOR {
	    	BLUE, DARK_PINK, GREEN, LIGHT_PINK, ORANGE, PINK, TINT, UNKNOWN
	    }
	}
	
	public enum MESSAGE {
		CANCELLED, DUPLICATE, FAILED, SUCCESS
	}
	
	abstract public interface MISSING_PERSON_INFO {
	    final public static int DLG_ERROR = 1;
	    final public static int DLG_LOAD_DATA = 0;
	    final public static String ERROR = "ERROR";
	    final public static String LAYOUT_ID = "LAYOUT_ID";
	    final public static String PASSING_URL = "PASSING_URL";
	    
	    public enum URL {
	    	DISPLAY_BY_DATE, LOCATION, MISSING_ID;
	    	
	    	public static String getUrl(URL paramURL)
	    	{
	    		String str = null;
	    		
	    		switch(paramURL)
	    		{
	    		case DISPLAY_BY_DATE:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_missing.spf";
	    			break;
	    		case LOCATION:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_missing_locaton.spf?location=";
	    			break;
	    		case MISSING_ID:
	    			str = "https://www.spfiphone.gov.sg/SPFService/missing.spf?id=";
	    			break;
	    		}
	    		
	    		return str;
	    	}
	    }
	}
	
	abstract public interface NEWS_CRIME_INFO {
	    final public static int DLG_ERROR = 1;
	    final public static int DLG_LOAD_DATA = 0;
	    final public static int DLG_OPTIONS = 2;
	    final public static String ERROR = "ERROR";
	    final public static String LAYOUT_ID = "LAYOUT_ID";
	    final public static String PASSING_URL = "PASSING_URL";
	
	    public enum URL {
	    	CRIME_ID, CRIME_TYPE_LIST, DISPLAY_BY_DATE, DISPLAY_BY_TYPE, LOCATION;
	    
	    	public static String getUrl(URL paramURL)
	    	{
	    		String str = null;
	    		
	    		switch(paramURL)
	    		{
	    		case DISPLAY_BY_DATE:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_crime.spf";
	    			break;
	    		case LOCATION:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_crime_locaton.spf?location=";
	    			break;
	    		case DISPLAY_BY_TYPE:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_crime_category.spf?cat=";
	    			break;
	    		case CRIME_ID:
	    			str = "https://www.spfiphone.gov.sg/SPFService/crime.spf?id=";
	    			break;
	    		case CRIME_TYPE_LIST:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_category.spf?type=0";
	    			break;
	    		
	    		}
	    		return str;
	    	}
	    }
	}
	
	abstract public interface POLICE_APPEAL {
	    final public static int DLG_ERROR = 1;
	    final public static int DLG_LOAD_DATA = 0;
	    final public static int DLG_OPTIONS = 2;
	    final public static String ERROR = "ERROR";
	    final public static String LAYOUT_ID = "LAYOUT_ID";
	    final public static String PASSING_URL = "PASSING_URL";
	
	    public enum URL {
	    	APPEAL_ID, APPEAL_TYPE_LIST, DISPLAY_BY_DATE, DISPLAY_BY_TYPE, LOCATION;
	    	
	    	public static String getUrl(URL paramURL)
	    	{
	    		String str = null;
	    		
	    		switch(paramURL)
	    		{
	    		case DISPLAY_BY_DATE:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_appeal.spf";
	    			break;
	    		case LOCATION:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_appeal_locaton.spf?location=";
	    			break;
	    		case DISPLAY_BY_TYPE:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_appeal_category.spf?cat=";
	    			break;
	    		case APPEAL_ID:
	    			str = "https://www.spfiphone.gov.sg/SPFService/appeal.spf?id=";
	    			break;
	    		case APPEAL_TYPE_LIST:
	    			str = "https://www.spfiphone.gov.sg/SPFService/list_category.spf?type=1";
	    			break;
	    		}
	    		
	    		return str;
	    	}
	    }
	}
	
	abstract public interface POLICE_STATION_LOCATOR {
	    final public static String ADDRESS = "ADDRESS";
	    final public static String CLOSING_HOURS = "CLOSING_HOURS";
	    final public static String CONTACT_NUMBER = "CONTACT_NUMBER";
	    final public static int DLG_LOAD_DATA = 2;
	    final public static int DLG_LOCATION_ERROR = 1;
	    final public static int DLG_LOCATION_PROGRESS = 0;
	    final public static String ERROR = "ERROR";
	    final public static String FORWARD_LATITUDE = "FORWARD_LATITUDE";
	    final public static String FORWARD_LONGITUDE = "FORWARD_LONGITUDE";
	    final public static String OPENING_HOURS = "OPENING_HOURS";
	    final public static String TITLE = "TITLE";
	
	    public enum URL {
	    	LOCATION, NEARBY
	    }
	}
	
	public enum SCREENS {
		APPEAL, CONTACT, HOME, JOINUS, LOCATOR, MAP, MISSING, NEWS, NO_SCREEN, VIDEOS, WEB;
		
		private static SCREENS[] vals;
		static { for(SCREENS s:EnumSet.allOf(SCREENS.class)){ vals[s.ordinal()]=s; }}
		public static SCREENS valueAt(int paramInt)
		  {
			try{
			       return vals[paramInt];
			    }catch(ArrayIndexOutOfBoundsException e){
			       return NO_SCREEN;
			    }
		  }
	}
	
	abstract public interface TWITTER {
	    final public static String TWITTER_ACCESS_TOKEN_URL = "https://api.twitter.com/oauth/access_token";
	    final public static String TWITTER_APPKEY = "EM3GgStqXGCYMarnxx5eP4R05FkFWwq31XQTD85dOSE";
	    final public static String TWITTER_AUTHORZE_URL = "https://api.twitter.com/oauth/authorize";
	    final public static String TWITTER_CONSUMERKEY = "kx2OWGCvacdg0d4RUqrtmw";
	    final public static String TWITTER_REQUEST_URL = "https://api.twitter.com/oauth/request_token";
	}
	
	abstract public interface WEB_LINKS {
		
		public enum URL{
			COURAGE_YOUTUBE, FAIRNESS_YOUTUBE, HOME_YOUTUBE, INTEGRITY_YOUTUBE, JOIN_US, LOYALTY_YOUTUBE, SPF_FB, SPF_HANDPHONE_ID, SPF_TWITTER, SPF_WEBSITE;
		
			public static String getUrl(URL paramURL)
			{
			    String str= null;
			    
			    switch (paramURL)
			    {
			    default:
			    case SPF_WEBSITE:
			    	str = "http://www.spf.gov.sg";
			    case SPF_FB:
			    	str = "http://www.facebook.com/singaporepoliceforce";
			    case SPF_TWITTER:
			    	str = "http://twitter.com/singaporepolice";
			    case SPF_HANDPHONE_ID:
			    	str = "https://www.psi.gov.sg/NASApp/tmf/TMFServlet?app=SPF-HITS-SCREENING&isNew=true&Reload=true";
			    case COURAGE_YOUTUBE:
			    	str = "http://www.youtube.com/watch?v=N5wNSKsh6fI&sns=em";
			    case LOYALTY_YOUTUBE:
			    	str = "http://www.youtube.com/watch?v=_x0KK18bgv0&sns=em";
			    case INTEGRITY_YOUTUBE:
			    	str = "http://www.youtube.com/watch?v=LhaxSu2bcmo&sns=em";
			    case FAIRNESS_YOUTUBE:
			    	str = "http://www.youtube.com/watch?v=jbBc0zX_FGQ&sns=em";
			    case HOME_YOUTUBE:
			    	str = "http://www.youtube.com/SpfCommunityOutreach";
			    case JOIN_US:
			    	str = "http://careers-gov-search.jobstreet.com.sg/VOG/job-opening.php?src=3&organization=37&mode=org";
			    }
			    
			    return str;
			}
		}
	}
	
	abstract public interface WEB_VIDEOS {
	    final public static String SPF_WEB_VIDEOS = "http://www.youtube.com/user/SpfCommunityOutreach";
	}
	
	abstract public interface XML {
	    final public static String ADDRESS = "ADDRESS";
	    final public static String AGE = "AGE";
	    final public static String APPEAL = "APPEAL";
	    final public static String CATEGEORY_TYPE = "CATEGEORY_TYPE";
	    final public static String CATEGORY = "CATEGORY";
	    final public static String CLOSE_HOUR = "CLOSE_HOUR";
	    final public static String CLOSE_MIN = "CLOSE_MIN";
	    final public static String CLUSTER = "CLUSTER";
	    final public static String CLUSTERID = "CLUSTERID";
	    final public static String CLUSTER_NAME = "CLUSTER_NAME";
	    final public static String COMPLEXION = "COMPLEXION";
	    final public static String CONTACT_NUMBER = "CONTACT_NUMBER";
	    final public static String COUNTRY = "COUNTRY";
	    final public static String CRIME = "CRIME";
	    final public static String CRIME_DATE_STR = "CRIME_DATE_STR";
	    final public static String DESCRIPTION = "DESCRIPTION";
	    final public static String DETAILED_DESCRIPTION = "DETAILED_DESCRIPTION";
	    final public static String DISTANCE = "DISTANCE";
	    final public static String DOB_STR = "DOB_STR";
	    final public static String FOOTER = "FOOTER";
	    final public static String FOOTER_DESCRIPTION = "FOOTER_DESCRIPTION";
	    final public static String FOOTER_IMAGE = "FOOTER_IMAGE";
	    final public static String FULL = "FULL";
	    final public static String GENDER = "GENDER";
	    final public static String HAIR_TYPE = "HAIR_TYPE";
	    final public static String HEIGHT = "HEIGHT";
	    final public static String IMAGEURL = "IMAGEURL";
	    final public static String IMAGE_PATH = "IMAGE_PATH";
	    final public static String LATTITUDE = "LATTITUDE";
	    final public static String LOCATION = "LOCATION";
	    final public static String LONGITUDE = "LONGITUDE";
	    final public static String LONG_DESCRIPTION = "LONG_DESCRIPTION";
	    final public static String MISSING_DATE_STR = "MISSING_DATE_STR";
	    final public static String MISSING_DETAILS = "MISSING_DETAILS";
	    final public static String NAME = "NAME";
	    final public static String NPPNPC = "NPPNPC";
	    final public static String OPEN_HOUR = "OPEN_HOUR";
	    final public static String OPEN_MIN = "OPEN_MIN";
	    final public static String ORIGINAL_NAME = "ORIGINAL_NAME";
	    final public static String RACE = "RACE";
	    final public static String SHORT_DESCRIPTION = "SHORT_DESCRIPTION";
	    final public static String STATUS = "STATUS";
	    final public static String THUMB = "THUMB";
	    final public static String THUMBURL = "THUMBURL";
	    final public static String TITLE = "TITLE";
	    final public static String URL = "URL";
	    final public static String ZIP = "ZIP";
	    final public static String ZONE = "ZONE";
	    final public static String ZONEID = "ZONEID";
	    final public static String ZONE_NAME = "ZONE_NAME";
	
	    abstract public interface BANNERS {
	        final public static String BANNER = "BANNER";
	        final public static String BANNER_IMAGE_PATH = "BANNER_IMAGE_PATH";
	        final public static String BASE_IMAGE = "FULL";
	        final public static String BASE_THUMB = "THUMB";
	        final public static String IMAGEURL = "IMAGEURL";
	        final public static String STATUS = "STATUS";
	        final public static String THUMBURL = "THUMBURL";
	        final public static String TITLE = "TITLE";
	    }
	    
	    abstract public interface STATISTICS {
	        final public static String CATEGEORY_TYPE = "CATEGEORY_TYPE";
	        final public static String CATEGORY = "CATEGORY";
	        final public static String COUNT = "COUNT";
	        final public static String DESCRIPTION = "DESCRIPTION";
	        final public static String FROM = "FROM";
	        final public static String MONTH = "MONTH";
	        final public static String NAME = "NAME";
	        final public static String STATISTICS = "STATISTICS";
	        final public static String STATISTICS_LIST = "STATISTICSLIST";
	        final public static String STATUS = "STATUS";
	        final public static String TIME_PERIOD = "TIMEPERIOD";
	        final public static String TO = "TO";
	        final public static String YEAR = "YEAR";
	    }
	}
	
	
}