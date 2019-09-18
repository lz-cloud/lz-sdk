package com.wkclz.sdk.helper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponeHelper {


    /**
     * 返回通知
     * @param rep
     * @param body
     * @param charset
     */
    public static void printBack(HttpServletResponse rep, String body, String charset){
        try {
            rep.setContentType("text/html;charset=" + charset);
            rep.getWriter().write(body);
            rep.getWriter().flush();
            rep.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
