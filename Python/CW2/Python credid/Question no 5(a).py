number = input(" write  number: ")
def sum_digit(number):
    return sum([int(a) for a in number])

def max_digit(number):
    return max([int(a) for a in number])
def min_digit(number):
    return min ([int(a)for a in number])
print(sum_digit(number))
print(max_digit(number))
print(min_digit(number))
