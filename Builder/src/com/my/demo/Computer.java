package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:39 AM
 */
public class Computer {

    private String band;
    private String cpu;
    private String memory;
    private String disk;
    private String size;

    public void setBand(String band) {
        this.band = band;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "band='" + band + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
