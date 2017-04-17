package com.Demo.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Common.UserCommon;
import com.Demo.PopupPayRentRequest;
import com.qiang.utils.UseProperties;

public class PopupPayRentRequestTest {
	String mobile ;
	String url = new UserCommon().getHost();
	String uticket;
	String userId;
	@BeforeClass
	public void getPorperties() {
		mobile = UseProperties.GetValueByKey("config.properties", "mobile");
		uticket = UseProperties.GetValueByKey("config.properties", "uticket");
		userId = UseProperties.GetValueByKey("config.properties", "userId");
		}
  @Test
  public void getPopupPayRentResponse() {
	  String result = new PopupPayRentRequest().getPopupPayRentResponse(uticket);
    System.out.println(result);
  }
}
