def FirstFactorial(num):
  ans = 1
  for i in range(num):
    ans *= num - i
  return ans