package colleacation_Example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 class Vicale {
   private  int id ;
   private  String name;
   private  String vicaleType ;
   private  String vicalName;
    Vicale(){
    }
    Vicale(int id,String name, String vicaleType,String vicalName){
    this.id = id;   
    this.name = name;
    this.vicaleType = vicaleType;   
    this.vicalName = vicalName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

     public String getName() {
        return name;
     }
     public void setName(String name) {
        this.name = name;
     }
        public String getVicaleType() {
            return vicaleType;
        }   
        public void setVicaleType(String vicaleType) {
            this.vicaleType = vicaleType;
        }
        public String getVicalName() {
            return vicalName;
        }
        public void setVicalName(String vicalName) {
            this.vicalName = vicalName;
        }   
        
}
class Bike extends Vicale{
    private String bikeOnerName;
    private String bikeOnerAddress;
    private String bikeOnerPhoneNumber;
    private String bikenumber;

    Bike(){
    }
    Bike(int id,String name,String vicaleType,String vicalName,String bikeOnerName,String bikeOnerAddress,String bikeOnerPhoneNumber,String bikenumber){
        super(id, name, vicaleType, vicalName);
        this.bikeOnerName = bikeOnerName;
        this.bikeOnerAddress = bikeOnerAddress;
        this.bikeOnerPhoneNumber = bikeOnerPhoneNumber;
        this.bikenumber = bikenumber;
    }
    public String getBikeOnerName() {
        return bikeOnerName;
    }   
    public void setBikeOnerName(String bikeOnerName) {
        this.bikeOnerName = bikeOnerName;
    }
    public String getBikeOnerAddress() {
        return bikeOnerAddress;
    }
    public void setBikeOnerAddress(String bikeOnerAddress) {
        this.bikeOnerAddress = bikeOnerAddress;
    }
    public String getBikeOnerPhoneNumber() {
        return bikeOnerPhoneNumber;
    }
    public void setBikeOnerPhoneNumber(String bikeOnerPhoneNumber) {
        this.bikeOnerPhoneNumber = bikeOnerPhoneNumber;
    }
    public String getBikenumber() {
        return bikenumber;
    }
    public void setBikenumber(String bikenumber) {
        this.bikenumber = bikenumber;
    }
    @Override
    public String toString() {
        return "Bike [bikeOnerName=" + bikeOnerName + ", bikeOnerAddress=" + bikeOnerAddress + ", bikeOnerPhoneNumber="
                + bikeOnerPhoneNumber + ", bikenumber=" + bikenumber + ", id=" + getId() + ", name=" + getName()
                + ", vicaleType=" + getVicaleType() + ", vicalName=" + getVicalName() + "]";
    }
    public void display() {
        System.out.println("Bike ID: " + getId());
        System.out.println("Bike Name: " + getName());
        System.out.println("Bike Type: " + getVicaleType());
        System.out.println("Bike Owner Name: " + bikeOnerName);
        System.out.println("Bike Owner Address: " + bikeOnerAddress);
        System.out.println("Bike Owner Phone Number: " + bikeOnerPhoneNumber);
        System.out.println("Bike Number: " + bikenumber);
    }
    public void displayBikeDetails() {
        System.out.println("Bike ID: " + getId());
        System.out.println("Bike Name: " + getName());
        System.out.println("Bike Type: " + getVicaleType());
        System.out.println("Bike Owner Name: " + bikeOnerName);
        System.out.println("Bike Owner Address: " + bikeOnerAddress);
        System.out.println("Bike Owner Phone Number: " + bikeOnerPhoneNumber);
        System.out.println("Bike Number: " + bikenumber);
    }

   
    
}
 class Care extends Vicale{
    private String carOnerName;
    private String carOnerAddress;
    private String carOnerPhoneNumber;
    private String carnumber;

    Care(){
    }
    Care(int id,String name,String vicaleType,String vicalName,String carOnerName,String carOnerAddress,String carOnerPhoneNumber,String carnumber){
        super(id, name, vicaleType, vicalName);
        this.carOnerName = carOnerName;
        this.carOnerAddress = carOnerAddress;
        this.carOnerPhoneNumber = carOnerPhoneNumber;
        this.carnumber = carnumber;
    }
    public String getCarOnerName() {
        return carOnerName;
    }   
    public void setCarOnerName(String carOnerName) {
        this.carOnerName = carOnerName;
    }
    public String getCarOnerAddress() {
        return carOnerAddress;
    }
    public void setCarOnerAddress(String carOnerAddress) {
        this.carOnerAddress = carOnerAddress;
    }
    public String getCarOnerPhoneNumber() {
        return carOnerPhoneNumber;
    }
    public void setCarOnerPhoneNumber(String carOnerPhoneNumber) {
        this.carOnerPhoneNumber = carOnerPhoneNumber;
    }
    public String getCarnumber() {
        return carnumber;
    }
    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }
    @Override
    public String toString() {
        return "Car [carOnerName=" + carOnerName + ", carOnerAddress=" + carOnerAddress + ", carOnerPhoneNumber="
                + carOnerPhoneNumber + ", carnumber=" + carnumber + ", id=" + getId() + ", name=" + getName()
                + ", vicaleType=" + getVicaleType() + ", vicalName=" + getVicalName() + "]";
    }
    public void display() {
        System.out.println("Car ID: " + getId());
        System.out.println("Car Name: " + getName());
        System.out.println("Car Type: " + getVicaleType());
        System.out.println("Car Owner Name: " + carOnerName);
        System.out.println("Car Owner Address: " + carOnerAddress);
        System.out.println("Car Owner Phone Number: " + carOnerPhoneNumber);
        System.out.println("Car Number: " + carnumber);
    }
    
}
    
public class Inheritance {
    public static void main(String []ags){
        Vicale v1 = new Bike( 101, "Hero", "Bike", "Splendor", "John Doe", "123 Main St", "1234567890", "MH12AB1234");
        Vicale v2 = new Bike(102, "Hoda", "two", "HF Delese", "Hrutik", "124 Main St ", "34324353543", "MH12AB1234");
        Vicale v3 = new Bike(103, "Yamaha", "Bike", "FZ", "Alice", "789 Oak St", "9876543210", "MH12EF5678");
        Vicale v4 = new Bike(104, "Honda", "Bike", "CBR", "Bob", "321 Pine St", "4567891230", "MH12GH9012");
        Vicale v5 = new Bike(105, "Kawasaki", "Bike", "Ninja", "Charlie", "654 Maple St", "3216549870", "MH12IJ3456");
        Vicale v6 = new Bike(106, "Suzuki", "Bike", "Gixxer", "David", "987 Birch St", "6543217890", "MH12KL7890");
        Vicale v7 = new Bike(107, "Bajaj", "Bike", "Pulsar", "Eve", "159 Cedar St", "7891234560", "MH12MN1234");

        Care c1 = new Care( 102, "Toyota", "Car", "Corolla", "Jane Smith", "456 Elm St", "0987654321", "MH12CD5678");
        Care c2 = new Care(103, "Honda", "Car", "Civic", "Frank", "753 Willow St", "3219876540", "MH12OP9012");     
        Care c3 = new Care(104, "Ford", "Car", "Mustang", "Grace", "852 Spruce St", "6547893210", "MH12QR3456");
        Care c4 = new Care(105, "Chevrolet", "Car", "Camaro", "Heidi", "963 Fir St", "7894561230", "MH12ST7890");
       
       List<Vicale> vicaleList = new ArrayList<>();
         vicaleList.add(v1);
         vicaleList.add(v2); 
         vicaleList.add(v3);
         vicaleList.add(v4);    
         vicaleList.add(v5);
         vicaleList.add(v6);
         vicaleList.add(v7);


            vicaleList.add(c1); 
            vicaleList.add(c2); 
            vicaleList.add(c3); 
            vicaleList.add(c4);
            
        System.out.println(vicaleList);
                
        vicaleList .sort(Comparator.comparing(Vicale :: getId).reversed().thenComparing(Vicale :: getName));
        System.out.println("After sorting by ID and Name: ");        
        for (Vicale v : vicaleList){
            if (v instanceof Bike) {
                ((Bike) v).displayBikeDetails();
            } else if (v instanceof Care) {
                ((Care) v).display();
            }   
        }

        System.out.println("vicale details are : "+ v1.toString());
        System.out.println("Car details are : "+c1.toString());
     
    }
  
    
}
