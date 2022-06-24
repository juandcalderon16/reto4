
package com.mycompany.reto4;

import java.time.LocalDateTime;

public class Empresa {

    public static void main(String[] args) {
        // TODO code application logic here
        Seguro seguro = new Seguro("seguros", "bueno", "1234");
        Panel panel1 = new Panel("123","1234","monocristalino", "use122","bonito", 2018, 5000000);
        seguro.cobertura();
        System.out.println(seguro.cobertura());
        System.out.println(seguro.toString());
        System.out.println(panel1.calcularUso());
    }
    
}
