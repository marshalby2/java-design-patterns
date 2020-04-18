package com.my.demo;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 3:24 PM
 */
public class Directory implements FileSystem {

    private String name;

    private ArrayList<FileSystem> list = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }


    public void add(FileSystem fileSystem) {
        this.list.add(fileSystem);
    }

    public void remove(FileSystem fileSystem) {
        this.list.remove(fileSystem);
    }

    public ArrayList<FileSystem> getChild() {
        return this.list;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
