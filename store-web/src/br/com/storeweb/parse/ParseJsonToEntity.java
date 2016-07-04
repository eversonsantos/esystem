/**
 * 
 */
package br.com.storeweb.parse;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @author totvs_esantos
 *
 */
public class ParseJsonToEntity<T> {

	public T fromJsonToEntity(String json){
		Type listType = new TypeToken<T>() {}.getType();
		return new Gson().fromJson(json, listType);
	}
	
	public List<T> fromJsonToListEntity(String json){
		Type listType = new TypeToken<List<T>>() {}.getType();
		return new Gson().fromJson(json, listType);
	}
	
}
