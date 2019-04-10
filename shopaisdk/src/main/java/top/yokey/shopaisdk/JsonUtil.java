package top.yokey.shopaisdk;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class JsonUtil {

    public static String toJson(Object bean) {

        Gson gson = new Gson();
        return gson.toJson(bean);

    }

    public static <T> T json2Object(String json, Class<T> cls) {

        return new Gson().fromJson(json, cls);

    }

    public static <T> ArrayList<T> json2ArrayList(String json, Class<T> cls) {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ArrayList<T>>() {
        }.getType());
    }

    public static int getInt(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getInt(name);
        } catch (JSONException e) {
            return 0;
        }
    }

    public static boolean has(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.has(name);
        } catch (JSONException e) {
            return false;
        }
    }

    public static long getLong(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getLong(name);
        } catch (JSONException e) {
            return 0;
        }
    }

    public static String getString(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getString(name);
        } catch (JSONException e) {
            return "";
        }
    }

    public static double getDouble(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getDouble(name);
        } catch (JSONException e) {
            return 0;
        }
    }

    public static boolean getBoolean(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getBoolean(name);
        } catch (JSONException e) {
            return false;
        }
    }

    public static String getArrayString(String json, int position) {
        try {
            JSONArray jsonArray = new JSONArray(json);
            return jsonArray.getString(position);
        } catch (JSONException e) {
            return "";
        }
    }

    public static JSONArray getJSONArray(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getJSONArray(name);
        } catch (JSONException e) {
            return null;
        }
    }

    public static JSONObject getJSONObject(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getJSONObject(name);
        } catch (JSONException e) {
            return null;
        }
    }

}
