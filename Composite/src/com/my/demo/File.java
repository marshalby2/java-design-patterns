package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 3:24 PM
 */
public class File implements FileSystem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
