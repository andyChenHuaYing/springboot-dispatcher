package com.ztesoft.dispatcher.springboot.utils;

import java.util.Map;
import java.util.Properties;

/**
 * Description:
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/11
 */
public class PropertiesMapConvertUtil {


    /**
     * 将Map<K, V>转换成Properties<K, V>
     *
     * @param map 需要转换的Map
     * @param <K> Key
     * @param <V> Value
     * @return 转换后的Properties
     */
    public static <K, V> Properties mapConvertToProperties(Map<K, V> map) {
        Properties properties = new Properties();
        for (K key : map.keySet()) {
            properties.put(key, map.get(key));
        }
        return properties;
    }


}
