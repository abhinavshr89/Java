# Packages in Java

### creating a Package
```java
package Mypackage;

public class toolbar{
    public void show(){
        System.out.println("toolbar");
    }
}
```

* This file is named `toolbar.java` which is inside a folder named `Mypackage`



### using a package

```java
import Mypackage.toolbar;

public class Main {
    public static void main(String[] args) {
        toolbar obj = new toolbar();
        obj.show();
    }
}

```

