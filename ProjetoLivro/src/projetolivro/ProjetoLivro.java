/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package projetolivro;

/**
 *
 * @author luisg
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa ("Sante", 22, "M");
        p[1] = new Pessoa ("Driana", 23, "F");
        
        l[0] = new Livro ("A guerra dos tronos", "G. R. R. Martin", 300, p[0]);
        l[1] = new Livro ("A fúria dos reis", "G. R. R. Martin", 300, p[1]);
        l[2] = new Livro ("A tormenta de espadas", "G. R. R. Martin", 300, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(194);
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
    
}
