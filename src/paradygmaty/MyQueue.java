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
public interface MyQueue<E>   {
public void enqueue(E x ) throws FullException; 
public void dequeue( );
public E first( ) throws EmptyException;      
public boolean isEmpty( );
public boolean isFull( );
}
