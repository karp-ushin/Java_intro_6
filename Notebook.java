package javahomework6;

class Notebook{
    String name;
    int ram;
    int hdd;
    String operatingSystem;

    Notebook(String name, int ram, int hdd, String operatingSystem){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
    }
    @Override
    public String toString() {
        return String.format("%10s     RAM %3d GB,   SSD %5d GB, %8s", name, ram, hdd, operatingSystem);
    }
    @Override
    public boolean equals(Object o) {
        var t = (Notebook) o;
        return name == t.name && ram == t.ram && hdd == t.hdd && operatingSystem == t.operatingSystem;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    String getName(){
        return this.name;
    }
    int getRam(){
        return this.ram;
    }
    int getHdd(){
        return this.hdd;
    }
    String getOperatingSystem(){
        return this.operatingSystem;
    }
}
