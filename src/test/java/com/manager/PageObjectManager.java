package com.manager;

import com.pom.BookHotelPOJO;
import com.pom.ConfiramtionPOJO;
import com.pom.LoginPOJO;
import com.pom.SearchHotelPOJO;
import com.pom.SelectHotelPOJO;

public class PageObjectManager {
	private LoginPOJO loginPOJO;
	private SearchHotelPOJO searchHotelPOJO;
	private SelectHotelPOJO selectHotelPOJO;
	private BookHotelPOJO bookHotelPOJO;
	private ConfiramtionPOJO confiramtionPOJO;

	public LoginPOJO getLoginPOJO() {
		return (loginPOJO == null) ? loginPOJO = new LoginPOJO() : loginPOJO;
	}

	public SearchHotelPOJO getSearchHotelPOJO() {
		return (searchHotelPOJO == null) ? searchHotelPOJO = new SearchHotelPOJO() : searchHotelPOJO;
	}

	public SelectHotelPOJO getSelectHotelPOJO() {
		return (selectHotelPOJO == null) ? selectHotelPOJO = new SelectHotelPOJO() : selectHotelPOJO;
	}

	public BookHotelPOJO getBookHotelPOJO() {
		return (bookHotelPOJO == null) ? bookHotelPOJO = new BookHotelPOJO() : bookHotelPOJO;
	}

	public ConfiramtionPOJO getConfiramtionPOJO() {
		return (confiramtionPOJO == null) ? confiramtionPOJO = new ConfiramtionPOJO() : confiramtionPOJO;
	}
}
