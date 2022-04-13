package com.company.creation_design.singleton.destroy_singleton;

import java.io.*;

/**
 * 序列化与反序列化破坏单例模式
 * 解决方式：实现Serializble接口，重写readResolve方法
 *
 * 反射破坏单例模式的解决方式：在私有构造方法中加if判断单例是否为null，不为null抛出异常，防止实例被创建
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class SerializableDestroy {
    public static void main(String[] args) throws Exception {
        Singleton4 instance = Singleton4.getInstance();
        // IO流读写
        // 1，创建一个字节数组输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // 2，创建一个对象输出流，并将对象写入字节数组流
        writeObject(instance, byteArrayOutputStream);
        // 3，创建一个对象输入流，从字节数组输入流中读取对象
        Singleton4 instance2 = readObject(byteArrayOutputStream);
        Singleton4 instance3 = readObject(byteArrayOutputStream);
        // 4，比较
        System.out.println(instance == instance2); // 单例类重写readResolve方法前false，后true
        System.out.println(instance2 == instance3); // 单例类重写readResolve方法前false，后true

    }

    private static Singleton4 readObject(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Singleton4 instance2 = (Singleton4) objectInputStream.readObject();
        objectInputStream.close();
        return instance2;
    }

    private static void writeObject(Singleton4 instance, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(instance);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
