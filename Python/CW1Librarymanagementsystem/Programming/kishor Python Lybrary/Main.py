import Return
import ListSplit
import dt
import Borrow

def start():
    while(True):
        print(" Hello and thank you for visiting the library management system.    ")
        print("------------------------------------------------------")
        print("Register 1. To Display")
        print("Register 2. To Borrow a book")
        print("Register 3. To return a book")
        print("Register 4. To exit")
        try:
            a=int(input("Enter the correct choice  from 1 to 4: "))
            print()
            if(a==1):
                with open("stock.txt","r") as f:
                    lines=f.read()
                    print(lines)
                    print ()
   
            elif(a==2):
                ListSplit.listSplit()
                Borrow.borrowBook()
            elif(a==3):
                ListSplit.listSplit()
                Return.returnBook()
            elif(a==4):
                print("Thank you for making use of the library management system.")
                break
            else:
                print("Enter the correct choice  from 1 to 4")
        except ValueError:
            print("Please enter input as suggested above.")
start()
