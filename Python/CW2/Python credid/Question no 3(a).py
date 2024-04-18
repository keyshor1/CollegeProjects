marks = [['john',80, 90, 76, 82],['katy', 50, 55, 70, 65],['sydney',80, 72, 88, 90]]
marks_c = {}
for i in range(len(marks)):
    name = marks[i][0]
    l = []
    marks_c[name]=l#storing in list
    for j in range(1,len(marks[i])):
        l.append(marks[i][j])
        #print(marks[i][j])



print(marks_c)
