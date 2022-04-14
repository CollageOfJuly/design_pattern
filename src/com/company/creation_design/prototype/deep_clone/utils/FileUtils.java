package com.company.creation_design.prototype.deep_clone.utils;

import java.io.*;

/**
 * 创建一个工具类
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class FileUtils {
    public static  <T> T deepCopy(T t) throws IOException, ClassNotFoundException {
        // 通过对象流实现深拷贝
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(t);
        objectOutputStream.flush();
        byteArrayOutputStream.close();
        objectOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        T copy = (T) objectInputStream.readObject();
        byteArrayInputStream.close();
        objectInputStream.close();
        return copy;
    }
}
