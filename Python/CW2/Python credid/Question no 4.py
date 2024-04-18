list1 = ["Pulp Fiction","$5","30"]
list2 = ["The lord of the kings","$2.5","10"]
list3= ["The Revenant","$4","20"]
list = []
list.append(list1)
list.append(list2)
list.append(list3)
id = ["M001","M002","M003"]

for i in range(len(id)):
    dict = {id[i]: list[i]}
    print(dict)
