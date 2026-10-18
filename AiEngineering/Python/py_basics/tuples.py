#tuples: a tuple is a collection used to store multiple items in a single variable, just like a list. The main difference is that a tuple cannot be changed after it is created.

studentTuple=("Saquib","Jimmy","Jack","Robin","Keisha")
print(studentTuple)
print(type(studentTuple))

#it will throw an error


#empty tuples
emptyTuples=()
print(emptyTuples)
print(type(emptyTuples))

#single Tuple
singleTuples=(1,)
print(singleTuples)
print(type(singleTuples))

singleTupleError=(1) #interpreter will think of it as int
print(singleTupleError)
print(type(singleTupleError))
