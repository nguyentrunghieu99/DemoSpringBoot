package com.example.sellphone.Model;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long price;
    private String image;
    private String resolution;
    private String memoryRoom;
    private String memoryRam;
    private String cpu;
    private String speedcpu;
    private String battery;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(){}

    public Product(String name, long price, String image, String resolution, String memoryRoom, String memoryRam, String cpu, String speedcpu, String battery) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.resolution = resolution;
        this.memoryRoom = memoryRoom;
        this.memoryRam = memoryRam;
        this.cpu = cpu;
        this.speedcpu = speedcpu;
        this.battery = battery;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getMemoryRoom() {
        return memoryRoom;
    }

    public void setMemoryRoom(String memoryRoom) {
        this.memoryRoom = memoryRoom;
    }

    public String getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(String memoryRam) {
        this.memoryRam = memoryRam;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSpeedcpu() {
        return speedcpu;
    }

    public void setSpeedcpu(String speedcpu) {
        this.speedcpu = speedcpu;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
