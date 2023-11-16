def find_longest_word(word_list):
 longest_word=""
 for word in words_list:
  if len(word)>len(longest_word):
   longest_word=word
 return len(longest_word)
words_list=input("Enter the list of words seperated by spaces : ").split()
longest_word_length=find_longest_word(words_list)
print("LENGTH OF THE longest word : ",longest_word_length)
