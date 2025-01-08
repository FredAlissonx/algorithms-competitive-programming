def LongestWord(sen):
  word = ""
  for i in sen:
    if i.isdigit() or i.isalpha() or i == " ":
      word += i

  max_len = 0
  ans = ""
  for j in word.split():
    if len(j) > max_len:
      max_len = len(j)
      ans = j
  
  return ans