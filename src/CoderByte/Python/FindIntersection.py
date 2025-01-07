def FindIntersection(strArr):
  arr_1 = strArr[0].split(", ")
  arr_2 = strArr[1].split(", ")

  ans = [i for i in arr_1 if i in arr_2]

  return ",".join(ans)
  
# keep this function call here 
print(FindIntersection(input()))