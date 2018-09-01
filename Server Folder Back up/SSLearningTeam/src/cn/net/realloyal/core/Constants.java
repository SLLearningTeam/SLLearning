package cn.net.realloyal.core;

public class Constants {
	public static final String LOGIN_ERR = "登录失败";
	public static final String LOGIN_PROMPT = "请先登录";
	public static final String HOME_PAGE = "/task/list";
	public static final String INDEX_PAGE = "/";
	public static final String LOGIN_URL="/login";
	public static final String ADMIN_LOGIN_URL="/admin";

	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	
	/* 订单状态 */
	public static final int ORDER_WAITING=0;//等待付款
	public static final int ORDER_PAID=1;//未发货
	public static final int ORDER_ASKREFUND=2;//申请退款中
	public static final int ORDER_REFUNDSUCCEED=3;//退款成功
	public static final int ORDER_SENDING=4;//已发货
	public static final int ORDER_SUCCEED=5;//交易成功
	public static final int ORDER_ASKRETURN=6;//申请退货中
	public static final int ORDER_RETURNING=7;//退货中
	public static final int ORDER_RETURNSUCEED=8;//退货成功
	public static final int ORDER_CLOSED=9;//交易关闭
	
	public static final String[] ORDER_STATUS_DISC=new String[]{"等待付款","未发货","申请退款中","退款成功","已发货","交易成功","申请退货中","退货中","退货成功","交易关闭"};	
	/* 系统内部编码 */
	public static final String ENCODING = "UTF-8";

	/* 通用操作结果页面返回值 */
	public static final String EXECUTE_RESULT = "/common/execute_result";
	public static final String EXECUTE_RESULT_NAME = "execute_result";

	/* 异常结果返回值 */
	public static final String EXCEPTION = "exception";

	/* 异常信息在上下文中的存储值 */
	public static final String CONTEXT_EXCEPTION = "_exception_";
	public static final String CONTEXT_EXCEPTION_INFO = "_exception_info_";

	/* 默认分页尺寸及分页标记 */
	public static final int DEFAULT_PAGE_SIZE = 2;
	public static final int MAX_PAGE_SIZE = 1000;
	public static final String NORMAL_MARK = "?";
	public static final String START_MARK = ":_START_INDEX_";
	public static final String END_MARK = ":_END_INDEX_";

	/* 记录返回页面地址用的session key */
	public static final String REFER_URL = "_REFER_URL_";
	public static final String REFER_URL_DEFAULT_KEY = "_REFER_URL_DEFAULT_KEY_";

	/* 登录后用户信息在Session中的Key */
	public static final String LOGIN_USER = "_LOGIN_USER_";

	/* 记录用户登录前想要访问的地址在Session中的Key */
	public static final String ORIGINAL_URL = "_ORIGINAL_URL_";

	/* 缓存相关 */
	public static final String CACHE_BASE_PATH = "/cache"; //文件缓存目录
	public static final int COMMON_PERIOD = 60; //内存缓存有效时间，单位为秒，-1表示缓存不失效
	public static final String SEPSTR = "_sEpStR_"; //分隔字符串
	
	/* JSON操作结果页面返回值 */
	public static final String JSON_RESULT = "jsonResult";
	
	


}