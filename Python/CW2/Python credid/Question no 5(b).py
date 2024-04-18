word1 = input("Enter first word: ").lower()
word2 = input("Enter second word: ").lower()

commonLetter = (set(word1)).intersection(set(word2))

print("Common letters are:", list(commonLetter))
