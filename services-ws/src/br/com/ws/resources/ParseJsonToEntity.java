/**
 * 
 */
package br.com.ws.resources;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author totvs_esantos
 *
 */
public class ParseJsonToEntity<T>{
	Gson gson = new Gson();


	public <T> List<T> toObjectList(String json, Class<T> clazz) {
        if(json == null){
            return null;
        }

        JsonParser parser = new JsonParser();
        JsonArray array = parser.parse(json).getAsJsonArray();

        List<T> list = new ArrayList<T>();
        for (final JsonElement jsonElement : array) {
            T entity = gson.fromJson(jsonElement, clazz);
            list.add(entity);
        }
        return list;
    }
	
	public <T> T toObject(String json, Class<T> clazz){
		return new Gson().fromJson(json, clazz);
	}

}
