package StringTest;

public class ThisReturn {
	private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
    	ThisReturn example = new ThisReturn();
    	example.setName("John");
        example.setAge(30);
        
        ThisReturn newOb = new ThisReturn();
        newOb.setName("Ruban");
        newOb.setAge(29);
        
        
        
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());
        
        
        
        System.out.println(newOb.getName());
        System.out.println(newOb.getAge());
    }
}
