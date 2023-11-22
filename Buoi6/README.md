# Buổi 7

## Abstract class và Interface trong Java OOP

Interface:
1. Định nghĩa: Giao diện (Interface) là một khái niệm trong lập trình hướng đối tượng (OOP) cho phép bạn định nghĩa một tập hợp các phương thức trừu tượng (abstract methods) mà các lớp khác phải triển khai. Nó chỉ định giao diện (contracts) mà các lớp khác phải tuân theo, nhưng không cung cấp bất kỳ triển khai cụ thể nào.
2. Sử dụng: 

       • Giao diện (Interface) là một khái niệm trong Java cho phép định nghĩa các phương thức mà các lớp khác phải triển khai. 
       
       • Giao diện chỉ định giao tiếp mà các lớp con phải tuân theo, nhưng không cung cấp triển khai cụ thể. 	
       
       • Một lớp có thể triển khai nhiều giao diện, cho phép đa kế thừa (multiple inheritance) cho các phương thức giao diện. 

       • Ví dụ: Giao diện Runnable định nghĩa phương thức run(), và các lớp khác (ví dụ: Thread) triển khai phương thức này theo cách riêng.

```java
// Định nghĩa một giao diện Speakable
interface Speakable {
    void speak();
}

// Lớp Dog triển khai giao diện Speakable
class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
```


Abstract Class:
1. Định nghĩa: Lớp trừu tượng (Abstract Class) là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó có thể chứa phương thức trừu tượng (abstract methods) cũng như phương thức không trừu tượng (concrete methods) và thuộc tính.
2. Sử dụng:

- Lớp trừu tượng (Abstract Class) là một lớp mà không thể tạo một đối tượng cụ thể từ nó. 

- Lớp trừu tượng có thể chứa các phương thức trừu tượng (abstract methods) và các phương thức không trừu tượng (concrete methods) cùng với các thuộc tính. 

- Một lớp con kế thừa từ lớp trừu tượng phải triển khai tất cả các phương thức trừu tượng. 

- Một lớp con có thể kế thừa từ một lớp trừu tượng và triển khai giao diện cùng lúc. 

- Ví dụ: Lớp trừu tượng Shape có phương thức trừu tượng calculateArea(), và các lớp con (ví dụ: Circle, Rectangle) triển khai phương thức này theo cách riêng.


```java
// Lớp trừu tượng Animal
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng speak
    public abstract void speak();

    // Phương thức không trừu tượng
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Lớp Dog kế thừa từ lớp trừu tượng Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}
```

- So sánh Interface và Abstract Class: 
    - Đa kế thừa: Interface cho phép một lớp triển khai nhiều giao diện, trong khi một lớp chỉ có thể kế thừa từ một lớp trừu tượng. Điều này cho phép tính đa kế thừa (multiple inheritance) trong trường hợp của giao diện. 

    - Triển khai: Giao diện chỉ định các phương thức trừu tượng mà lớp con phải triển khai, trong khi lớp trừu tượng có thể cung cấp một phần triển khai cơ bản của các phương thức. 

    - Sự linh hoạt: Lớp trừu tượng cung cấp sự linh hoạt hơn vì bạn có thể triển khai phần nào đó của một phương thức và để phần khác là trừu tượng. Giao diện không cung cấp tính năng này. 

    - Mục đích: Sử dụng giao diện khi bạn muốn định nghĩa một hợp đồng giao tiếp cho các lớp không có sự kế thừa chung. Sử dụng lớp trừu tượng khi bạn muốn chia sẻ mã nguồn chung cho các lớp con và định nghĩa các phương thức cơ bản.



## Tính trừu tượng và đa hình trong Java OOP

Tài liệu đọc thêm:
- [Trừu tượng](https://freetuts.net/tinh-truu-tuong-abstraction-trong-java-1138.html)
- [Đa hình](https://viettuts.vn/java/tinh-da-hinh-trong-java)

1.Trừu tượng (Abstraction) 
- Tính trừu tượng là một khái niệm trong lập trình hướng đối tượng (OOP) cho phép bạn ẩn đi các chi tiết phức tạp của một đối tượng và chỉ tập trung vào các tính chất hoặc hành vi quan trọng. Mục tiêu chính của tính trừu tượng là đơn giản hóa việc sử dụng đối tượng và giảm độ phức tạp của mã nguồn.

Các cách để thực hiện tính trừu tượng bao gồm:
- Giao diện (Interface): Một giao diện là một tập hợp các phương thức mà các lớp khác phải triển khai. Nó chỉ định "các giao diện" của một đối tượng mà không quan tâm đến cách nó được triển khai. Điều này giúp loại bỏ các chi tiết cụ thể của một đối tượng và chỉ quan tâm đến cách sử dụng nó.

- Lớp trừu tượng (Abstract class): Một lớp trừu tượng là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó thường chứa một số phương thức trừu tượng (có thể hoặc không được triển khai trong các lớp con) và các thuộc tính chung cho các lớp con. Lớp trừu tượng cung cấp một cơ chế để định nghĩa các phương thức cơ bản mà các lớp con cần triển khai.



Giao diện(Interface)

```java
// Định nghĩa một giao diện Speakable
public interface Speakable {
    void speak();
}

// Lớp Dog triển khai giao diện Speakable
public class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

// Lớp Cat triển khai giao diện Speakable
public class Cat implements Speakable {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class KiemTra.Bai2.Main {
    public static void main(String[] args) {
        Speakable dog = new Dog();
        Speakable cat = new Cat();

        dog.speak(); // Output: Woof!
        cat.speak(); // Output: Meow!
    }
}
```

Trong ví dụ trên, Speakable là giao diện định nghĩa một phương thức speak, và Animal là lớp trừu tượng chứa một trường name và định nghĩa một phương thức trừu tượng speak. Các lớp con Dog và Cat triển khai phương thức speak theo cách của riêng họ.

2. Đa hình(Polymorphism):

- Đa hình là khả năng của các đối tượng của các lớp khác nhau để đáp ứng một phương thức cụ thể theo cách riêng của họ.

Lớp trừu tượng (Abstract class): 
Lớp trừu tượng trong Java là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó thường chứa một hoặc nhiều phương thức trừu tượng và có thể có phương thức không trừu tượng. Dưới đây là ví dụ:

```java
// Lớp trừu tượng Animal
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng speak
    public abstract void speak();
}

// Lớp Dog kế thừa từ lớp trừu tượng Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}

// Lớp Cat kế thừa từ lớp trừu tượng Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Meow!");
    }
}

public class KiemTra.Bai2.Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.speak(); // Output: Buddy says Woof!
        cat.speak(); // Output: Whiskers says Meow!
    }
} 
```

Trong ví dụ này, Animal là lớp trừu tượng với một phương thức trừu tượng speak. Dog và Cat là các lớp con kế thừa từ Animal và triển khai phương thức speak theo cách của riêng họ. Trong hàm main, chúng ta tạo đối tượng Dog và Cat thông qua lớp cơ sở Animal, và sau đó gọi phương thức speak để in ra tiếng kêu của chúng.

## Upcasting và downcasting trong java
![alt-text](https://codelearnstorage.s3.amazonaws.com/Media/Default/Users/linhdk13_40fpt_2Ecom/linhdk13/865161-1.png)

- Khi biến của lớp cha tham chiếu tới đối tượng của lớp con (đối tượng của lớp con bị chuyển kiểu dữ liệu về lớp cha), thì đó được gọi là up-casting

```java
class Animal {
	public void sound() {
		System.out.println("some sound");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("meow meow");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("woof woof");
	}
}

public class Entry {
	public static void main(String[] args) {
		// Up-casting
		Animal animal1 = new Cat();
		animal1.sound();
		// Up-casting
		Animal animal2 = new Dog();
		animal2.sound();
	}
}
```

- Lưu ý: khi biến của lớp cha tham chiếu tới đối tượng của lớp con thì biến này chỉ có thể gọi tới các thuộc tính và phương thức có ở lớp cha và nếu lớp con ghi đè thì phương thức được gọi sẽ ở lớp con