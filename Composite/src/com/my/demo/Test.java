package com.my.demo;

import org.w3c.dom.ls.LSOutput;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 3:33 PM
 */
public class Test {
    public static void main(String[] args) {

        var home = new Directory("~");
        var code = new Directory("code");
        var java = new File("Test.java");
        var c = new File("file.c");
        var documents = new Directory("documents");
        var javaBook = new File("Think in Java.pdf");
        var cBook = new File("C Primer Plus.pdf");

        code.add(java);
        code.add(c);

        documents.add(javaBook);
        documents.add(cBook);

        home.add(code);
        home.add(documents);


        System.out.println("home :");
        display(home);

    }

    private static void display(Directory d) {
        for (FileSystem f : d.getChild()) {
            if (f instanceof File) { // file
                System.out.println("\t" + f.getName());
            } else { // directory
                System.out.println("\n" + f.getName());
                display((Directory) f);
            }
        }
    }
}
