package cn.net.realloyal.core.util;

import java.util.ArrayList;
import java.util.List;

public class QueryHelper {

	public static final String CONSTR = " AND ";

	private String suffixSql;

	private boolean hasQueried = false;

	private StringBuffer querySql = new StringBuffer(512);

	private List params = new ArrayList();

	/* 两个构造函数 */
	public QueryHelper(String prefixSql) {
		this(prefixSql, null);
	}

	public QueryHelper(String prefixSql, String suffixSql) {
		querySql.append(prefixSql + " WHERE 1=1 ");
		if (suffixSql != null) {
			this.suffixSql = " " + suffixSql;
		} else {
			this.suffixSql = "";
		}
	}

	/* 三个设置参数方法 */
	public void setParam(boolean cond, String sql, Object[] paramArray) {
		if (cond) {
			querySql.append(CONSTR);
			querySql.append("(" + sql + ")");
			if (paramArray != null) {
				for (int i = 0; i < paramArray.length; i++) {
					params.add(paramArray[i]);
				}
			}
		}
	}

	public void setParam(boolean cond, String sql, Object param) {
		if (cond) {
			querySql.append(CONSTR);
			querySql.append("(" + sql + ")");
			if (param != null) {
				params.add(param);
			}
		}
	}

	public void setParam(boolean cond, String sql) {
		setParam(cond, sql, null);
	}

	/**
	 * 单独增加参数对象
	 */
	public void addObject(Object param) {
		params.add(param);
	}

	/**
	 * 获取参数对象数组
	 */
	public Object[] getParams() {
		return params.toArray();
	}

	/**
	 * 获取最终SQL
	 */
	public String getQuerySql() {
		if (!hasQueried) {
			hasQueried = true;
			querySql.append(suffixSql);
		}
		return querySql.toString();
	}

}
