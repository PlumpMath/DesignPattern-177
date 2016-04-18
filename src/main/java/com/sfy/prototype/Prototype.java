package com.sfy.prototype;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * 描述：原形模式
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @Description: Prototype.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Prototype implements Cloneable,Serializable {

    @Setter @Getter
    private String protoTypeString;
    @Setter @Getter
    private Student student;

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Object simpleClone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深拷贝
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
