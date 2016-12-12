/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradygmaty;

/**
 *
 * @author lukasz
 */
public class Paradygmaty
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FullException, EmptyException
    {
        Kolejka k = new Kolejka<String>(5);
        k.enqueue("a");
        k.enqueue("b");
        System.out.println(k.first());
        k.dequeue();
        System.out.println(k.first());
        k.dequeue();
        k.dequeue();
    }
    
}
