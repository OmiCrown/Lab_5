package org.kudryavtsev;

/**
 * @author Omicrown
 * @version 0.01
 */
public class MyArrayList {
    
    //- Constructs an empty list with an initial capacity of ten (10)
    public MyArrayList(){
        MyArrayList myArrayList = new MyArrayList(10);
    }
 
    /**
     * Constructs an empty list with the specified initial capacity
     * @param initialCapacity
     */
    public MyArrayList(int initialCapacity){
        MyArrayList myArrayList = new MyArrayList(initialCapacity);
    }

    /**- вставляет элемент в конец списка
     * В случае если начального размера массива становится недостаточно, то массив автоматически должен 
     *  вырасти, что бы вместить все данные. 
     */
    public void add(Object e){
        //
    }
    
    /**- вставляет элемент на указанную позицию, сдвигая остальные элементы
    */
    public void add(int index, Object element){
        //
    } 
    
    /**
     * - Appends all of the elements to the end of this list
     */
    public void addAll(Object[] c){
        //
    }
    
    /**
     *  - Inserts all of the elements into this list, starting at the specified position
     */
    public void addAll(int index, Object[] c){
        //
    }
    
    /**
     *- Increases the capacity of this ArrayList instance, if necessary, to
     * ensure that it can hold at least the number of elements specified by the minimum capacity argument.
     */
    public void ensureCapacity(int minCapacity){
        //
    }

    /**
     *
     */
    public Object get(int index){
        return null;
        //
    }
            
    /**
     *- при удалении размер массива должен уменьшаться
     */
    public Object remove(int index){
        return null;
        //
    }

    /**
     * - изменяет значение элемента
     */
    public void set(int index, Object element){
        //
    }

    /**
     *- размер списка
     */
    public int size(){
        return 0;
        //
    } 

}
