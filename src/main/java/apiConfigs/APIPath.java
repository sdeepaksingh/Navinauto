package apiConfigs;

public class APIPath {
	
	public static final class apiPath{
		
		//GET
		public static final String GET_LIST_OF_POSTS ="posts";
		public static final String GET_SINGLE_POST="posts/";
		
		//POST
		public static final String CREATE_POST="posts";
		
		
		//update post 
		public static final String UPDATE_POST="posts";
	}
	
	
	//Manage role  API POST
	public static  String GET_LIST_OF_ROLES ="/core/rolemaster/getrole/data";
	public static  String GET_SUB_MODULE_DATA="/rolemaster/getsubmodule/data/908/";
	public static  String GET_MODULE_DATA="/core/rolemaster/module/data";
	public static  String CHECK_ROLE="/core/rolemaster/rolemodule/role/check";
	public static  String CREATE_ROLE="/core/rolemaster/rolemodule/role/create";
	public static  String UPDATE_ROLE="/core/rolemaster/rolemodule/role/update";
	
	
	//Administration module 
	public static  String GET_LIST_OF_USRE="/core/user/get/all";
	
	public static  String LIST_OF_ROLE="/core/role/get/all";
	
	public static  String ADD_USER="/core/user/create";
	
	//update post 
	public static  String UPDATE_USER="/core/user/update";
	public static  String UPDATE_USER_STATUS="/core/user/update/status";
	
	public static  String LIST_OF_ORGANISATION_DETAILS="/core/org/all/organisation/details";
}
