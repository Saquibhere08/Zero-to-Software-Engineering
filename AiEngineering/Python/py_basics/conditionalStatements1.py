#Check wheater a user input number is positive, negative or Zero

num=int(input("Enter value: "))

if(num>0):
    print("Positive")
elif(num<0):
    print("Negative")
elif(num==0):
    print("Zero")
else:
    print("Invalid input...")