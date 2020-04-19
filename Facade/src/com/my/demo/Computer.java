package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/4/20 7:46 PM
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer...");
        this.cpu.startup();
        this.memory.startup();
        this.disk.startup();
        System.out.println("start computer finished.");
    }

    public void shutdown() {
        System.out.println("begin to shutdown computer...");
        this.cpu.shutdown();
        this.memory.shutdown();
        this.disk.shutdown();
        System.out.println("computer shutdown finished.");
    }

}
