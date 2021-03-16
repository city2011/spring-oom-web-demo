package hcity.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/*
 * SerializerFeature
 *
 * QuoteFieldNames          输出key时是否使用双引号,默认为true
 * WriteMapNullValue        是否输出值为null的字段,默认为false
 * WriteNullNumberAsZero    数值字段如果为null,输出为0,而非null
 * WriteNullListAsEmpty     List字段如果为null,输出为[],而非null
 * WriteNullStringAsEmpty   字符类型字段如果为null,输出为"",而非null
 * WriteNullBooleanAsFalse  Boolean字段如果为null,输出为false,而非null
 */
public class FastJsonUtil {

    public static String serialize(Object src) {
        return JSON.toJSONString(src, SerializerFeature.PrettyFormat);
    }

    public static String serializeWithNulls(Object src) {
        return JSON.toJSONString(src,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.PrettyFormat);
    }

    public static <T> T deserialize(String src, Class<T> type) {
        return JSON.parseObject(src, type);
    }
}
