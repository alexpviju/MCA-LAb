def wordcount(str):
    counts=dict()
    words=str.split()
    for word in words:
        if word in counts:
            counts[word]=counts[word]+1
        else:
            counts[word]=1
    return counts
print(wordcount("hello hello happy christmas."))