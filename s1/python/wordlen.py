def w(words):
    wordslist=" "
    for word in words:
        if len(word)>len(wordslist):
            wordslist=Word
        return len(wordslist)
words=input("enter the word ::  ").split()

print("the longest word count ",w(words))