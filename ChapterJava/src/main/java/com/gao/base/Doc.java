package com.gao.base;

/**
 * @author  gaofei
 * @version  1.0
 * @since 1.8
 *
 */
public class Doc {
    String name1;

    /**
     * @author  gaofei
     * @param name 作用
     * @return name1
     * @throws Exception 报错
     */
    public String test(String name) throws Exception{
        return name1;
    }
}

//Terminal中执行命令 javadoc -encoding UTF-8 -charset UTF-8 Doc.java 为了避免转码问题