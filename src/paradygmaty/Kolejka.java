/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradygmaty;

import java.util.ArrayList;

/**
 *
 * @author lukasz
 */
public class Kolejka<E> implements MyQueue<E>
{
    private ArrayList<E> list = new ArrayList<>();
    int dequeueIndex = -1;
    int enqueueIndex = 0;
    
    int size;
    
    public Kolejka(int size)
    {
        this.size = size;
    }

    @Override
    public void enqueue(E x) throws FullException
    {
        if(enqueueIndex < size)
        {
            list.add(enqueueIndex++, x);
            dequeueIndex++;
        }
        else throw new FullException();
    }

    @Override
    public void dequeue()
    {
        dequeueIndex--;
        enqueueIndex--;
    }

    @Override
    public E first() throws EmptyException
    {
        if(dequeueIndex>=0) return list.get(dequeueIndex);
        else throw new EmptyException();
    }

    @Override
    public boolean isEmpty()
    {
        return enqueueIndex == 0 && dequeueIndex == -1;
    }

    @Override
    public boolean isFull()
    {
        return enqueueIndex == size;
    }

    
    
}
