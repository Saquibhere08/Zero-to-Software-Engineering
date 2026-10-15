#Lists
#List are mutable (changable)
list1=["apple","egg","chicken","Desi Vodka","Coke"]
print(list1)
print(len(list1))
print("First Value: ",list1[0])
print("Last Value: ",list1[len(list1)-1])

list2=[1,23,4,34,2,12,24,3,43,5,54,62]
print(list2)
print(len(list2))
list2.sort() #sort the list in ascending order
print(list2)
list2.pop() #eliminates the last item of the list
print(list2)
list2.insert(0,100)
print(list2)
