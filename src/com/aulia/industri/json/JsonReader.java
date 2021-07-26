package com.aulia.industri.json;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.aulia.industri.bean.Product;
import com.aulia.industri.utils.TagName;
public class JsonReader {
	public static List<Product> getHome(JSONObject jsonObject)
			throws JSONException {
		List<Product> products = new ArrayList<Product>();

		JSONArray jsonArray = jsonObject.getJSONArray(TagName.TAG_PRODUCTS);
		Product product;
		for (int i = 0; i < jsonArray.length(); i++) {
			product = new Product();
			JSONObject productObj = jsonArray.getJSONObject(i);
			product.setId(productObj.getInt(TagName.KEY_ID));
			product.setName(productObj.getString(TagName.KEY_NAME));
			product.setImageUrl(productObj.getString(TagName.KEY_IMAGE_URL));

			products.add(product);
		}
		return products;
	}
}

