# Collections
Gatering data into group is a common notion in computer science. The group of data is called a collection while the individual pieces of information is called an item or element.

Collections are supported by Collection types in Java. These are types that provides ways to access the elements in the collection and ways to sequence through the entire collection by either iteration or indexing. Iteration differs indexing in that iteration sequences through the collection in order while indexing provides arbitrary access (random access).

## Collection types
Collection types are special objects that contains other objects. We have seen two examples so far. A Picture object is a collection of Pixel objects and a Sound object is a collection of Sample objects.

### Iteration
Since iterate through the elements in a collection is very common, Collection types provide a special mechanism called iterator that automatically sequences through the collection.

Each Collection type must have a method called `iterator()` that returns an `java.util.Iterator` object. This `java.util.Iterator` object has two methods that work together to iterate through the collection, `hasNext()` and `next()`. `hasNext()` checks if there is another unaccessed elements in the collection while `next()` returns the next unaccessed element.

Note that we need to import `java.util` to use the iterator. The reason why we can use the `hasNext()` and `next()` methods directly from the `Picture` and `Sound` objects is that these two objects have a built-in iterator and these methods to make the students' lives easier.

The for-each loop saves us from explicitly managing the iterator. It creates the iterator, tests for terminatino and advancing the loop for us. Using a for-each loop does not require the import of `java.util`.

The following two loops are equivalent.
For each loop:
```Java
for (Sample s : Sound){
    amp = abs(s.getAmp());
    if (amp > maxAmp){
        maxAmp = amp;
    }
}
```
and a while loop with `java.util` imported:
```Java
Iterator it = aSound.iterator();
Sample s;
while (it.hasNext()){
    s = it.next();
    amp = abs(s.getAmp());
    .
    .
    .
}
```
An Iterator guarantees that the entire collection is visited in some order but there is no guarantee that the order stays unchanged.

### Indexing
If the items in a collection are aligned along some dimensions, then we can index them along each dimension through 0 based index. This way, the programmers are responsible of indexing through the collection but they would have complete control of the order the items are accessed.

Technically speaking, not all Collection types are indexable. An indexable collection is called a List.

The Sound and Picture objects are one-dimension and two-dimension collections respectively. So we can index through them with the following code easily.

```Java
Sample s;
for (int i = 0; i < aSound.getNumSamples(); i++){
    ... // Same loop body as before.
}
```
For two-dimension collection type, there is row-major iteration that goes left-to-right, top-to-bottom as follows:
```Java
Pixel p;
for (int r = 0; r < aPic.getHeight(); r++){
    for (int c = 0; c < aPic.getHeight(); c++){
        p = aPic.getPixel(c,r);
        ...// Same manipulations as before.
    }
}
```
and column-major iteration that goes top-to-bottom, left-to-right as follows:
```Java
Pixel p;
for (int c = 0; c < aPic.getHeight(); c++){
    for (int r = 0; r < aPic.getHeight(); r++){
        p = aPic.getPixel(c,r);
        ...// Same manipulations as before.
    }
}
```
## Processing A One-Dimensional Collection
### Raising the pitch of a sound
See `src/lectures/chapter8/RaiseFreq.java` for an example of doubling the frequency of a sound.
Here I used a coding trick called cascading method call. Care should be taken with cascading method calls before trading readability for convinence.
### Reversing A Sound
See `` for an example of reversing a sound.
## Processing A Two-Dimensional Collection
### Random Paint
See `` for an example of random paint
### Rotating a Picture
See `` for an example of rotating a picture