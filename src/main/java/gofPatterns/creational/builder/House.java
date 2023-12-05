package gofPatterns.creational.builder;

public class House {
    private String name;
    private int storeysNum;
    private WindowsType windowsType;
    private int sellingPrice;

    public void setName(String name) {
        this.name = name;
    }

    public void setStoreysNum(int storeysNum) {
        this.storeysNum = storeysNum;
    }

    public void setWindowsType(WindowsType windowsType) {
        this.windowsType = windowsType;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", storeysNum=" + storeysNum +
                ", windowsType=" + windowsType +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
