def factorial(n):
  if n == 0 or n == 1:
    return 1
  else:
    result = n * factorial(n-1)
  return result
