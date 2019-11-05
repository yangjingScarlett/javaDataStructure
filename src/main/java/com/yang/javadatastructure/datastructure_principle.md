# Learn about how to storage data in computer
In order to learn data structure, we need to know something about storing data in our computer.  
**1. Memory:** it's also called RAM, it saves some temporary data, and when your program attends to find data, it firstly 
search the memory.  
**2. Storage:** it's some places that can save persistent data, such as your disks in you computer, and the hard drive...
every time you restart your computer, the data saved in the disks is still there, but the data in memory is lost.  
**3. Data type:** all data(int, float, string...) stored in our memory are in the type of **'Binary'**,
that means 1 or 0, each 1 or each 0 is called **a bit** in computer.We all know that int is a 32-bit type data.  
>The Memory of computer actually is a long tape of bytes. and a byte = 8 bits

So you can think that an int number in memory took 4 bytes position, and each byte has a address in the memory

# Array
An array is a constant address in memory to save a fixed numbers data.
```
int a = 3;
int[] sampleArray = {0, 1, 2, 3}; // this will take constant 32 bytes in memory
int b = 10;
```
You cannot add two other elements to sampleArray, because at that address there is no available address for new elements.  
If you still want to add new elements, you need to create a new array has longer length, and copy the data in the first array,
then paste into new array, then add elements to new array, then delete the old array.

# Stack
Last in First Out: think of the plates in a box, the first one you can take is the last one you put in