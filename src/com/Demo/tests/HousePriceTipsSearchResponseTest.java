package com.Demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Demo.HousePriceTipsSearchResponse;

public class HousePriceTipsSearchResponseTest {

  @Test
  public void getHousePriceTipsResponse() {
	  String result = new HousePriceTipsSearchResponse().getHousePriceTipsResponse("2", "永和");
	  Assert.assertEquals(result.contains("永和二村"), true);
  }
}
