def FirstReverse(strParam):
  ans: str = ""

  for i in range(1, len(strParam) + 1):
     ans += strParam[len(strParam) - i]
  return ans

# keep this function call here 
print(FirstReverse(input()))