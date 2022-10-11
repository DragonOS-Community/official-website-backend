package com.dragonos.website.utils;

public class ContextHolder {
    private static ThreadLocal<Object> holder = new ThreadLocal<>();

    public static void setHolder(Object obj) {
        holder.set(obj);
    }

    public static Object getHolder() {
        return holder.get();
    }
}
