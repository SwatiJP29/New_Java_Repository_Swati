package com.swati;

public class ImplementInterface {
    HardDisk HD = new HardDisk();
    Monitor MD = new Monitor();

    Computer c = new Computer(HD, MD);

}
