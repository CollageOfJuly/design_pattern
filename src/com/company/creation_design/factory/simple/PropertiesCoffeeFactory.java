package com.company.creation_design.factory.simple;

import com.company.creation_design.factory.constants.CoffeeConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 咖啡工厂类
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class PropertiesCoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    static {
        // 加载咖啡产品类到缓存集合中
        // 读取配置文件中的信息
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/com/company/creation_design/factory/simple/coffeeproperties.properties"));
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                // 通过反射加载类
                Class clazz = Class.forName((String) entry.getValue());
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) entry.getKey(), coffee);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static Coffee getCoffee(String name) throws Exception {
        Coffee coffee = map.get(name);
        if (coffee == null) {
            throw new Exception("未找到所要的咖啡产品");
        }
        return coffee;
    }
}
